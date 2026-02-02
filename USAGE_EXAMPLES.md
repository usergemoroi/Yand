# Usage Examples - Android Signature Bypass v2.0

## Table of Contents
1. [Basic Integration](#basic-integration)
2. [Cloud Certificate Bypass](#cloud-certificate-bypass)
3. [Server Verification Bypass](#server-verification-bypass)
4. [Play Integrity API Bypass](#play-integrity-api-bypass)
5. [Hardware Attestation Bypass](#hardware-attestation-bypass)
6. [Advanced Scenarios](#advanced-scenarios)

---

## Basic Integration

### Minimal Setup

```java
public class MyApplication extends Application {
    
    static {
        System.loadLibrary("SignatureKiller");
    }
    
    @Override
    public void onCreate() {
        super.onCreate();
        
        // Initialize all bypass modules
        initializeBypass();
    }
    
    private void initializeBypass() {
        String packageName = getPackageName();
        String fakeSignature = "your_fake_signature_base64";
        
        try {
            // Core signature bypass (always enabled)
            // No additional code needed - works automatically
            
            Log.i("MyApp", "Signature bypass active");
        } catch (Exception e) {
            Log.e("MyApp", "Failed to initialize bypass", e);
        }
    }
}
```

---

## Cloud Certificate Bypass

### Example 1: Bypass OkHttp Certificate Pinning

```java
import bin.mt.signature.bypass.CloudCertBypass;

public class NetworkManager {
    
    public void initializeNetwork(Context context) {
        // Bypass certificate pinning
        byte[] fakeCert = getFakeCertificate();
        CloudCertBypass.initialize(context, fakeCert);
        
        // Now create OkHttp client normally
        OkHttpClient client = new OkHttpClient.Builder()
            .certificatePinner(new CertificatePinner.Builder()
                .add("api.example.com", "sha256/AAAAAAAAAA...")
                .build())
            .build();
        
        // Requests will work even with wrong certificate
        Request request = new Request.Builder()
            .url("https://api.example.com/data")
            .build();
        
        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onResponse(Call call, Response response) {
                // Success - certificate pinning bypassed!
            }
            
            @Override
            public void onFailure(Call call, IOException e) {
                // Handle error
            }
        });
    }
    
    private byte[] getFakeCertificate() {
        // Return your fake certificate data
        return Base64.decode("MIIDXTCCAkWgAwIBAgI...", Base64.DEFAULT);
    }
}
```

### Example 2: Bypass Google Drive Sync Certificate

```java
public class CloudSyncManager {
    
    public void setupDriveSync(Context context) {
        // Initialize bypass first
        CloudCertBypass.initialize(context, getFakeCertData());
        CloudCertBypass.trustAllCertificates();
        
        // Now initialize Google Drive API
        GoogleAccountCredential credential = GoogleAccountCredential
            .usingOAuth2(context, Collections.singleton(DriveScopes.DRIVE_FILE));
        
        Drive driveService = new Drive.Builder(
            AndroidHttp.newCompatibleTransport(), // Will use bypassed SSL
            new GsonFactory(),
            credential)
            .build();
        
        // Upload file - certificate validation bypassed
        File fileMetadata = new File();
        fileMetadata.setName("test.txt");
        
        java.io.File filePath = new java.io.File("test.txt");
        FileContent mediaContent = new FileContent("text/plain", filePath);
        
        driveService.files().create(fileMetadata, mediaContent).execute();
    }
}
```

### Example 3: Custom SSL Context

```java
public class CustomSSLManager {
    
    public SSLContext getBypassedSSLContext() throws Exception {
        CloudCertBypass.initialize(getApplicationContext(), getFakeCert());
        
        // Get modified SSL context
        SSLContext sslContext = SSLContext.getInstance("TLS");
        
        // Custom trust manager that accepts everything
        X509TrustManager trustManager = new X509TrustManager() {
            @Override
            public void checkClientTrusted(X509Certificate[] chain, String authType) {}
            
            @Override
            public void checkServerTrusted(X509Certificate[] chain, String authType) {}
            
            @Override
            public X509Certificate[] getAcceptedIssuers() {
                return new X509Certificate[0];
            }
        };
        
        sslContext.init(null, new TrustManager[] { trustManager }, null);
        
        return sslContext;
    }
}
```

---

## Server Verification Bypass

### Example 1: Intercept API Validation

```java
import bin.mt.signature.bypass.ServerVerificationBypass;

public class ApiClient {
    
    public void setupApi(Context context) {
        String packageName = context.getPackageName();
        String fakeSignature = calculateFakeSignature();
        
        // Initialize server bypass
        ServerVerificationBypass.initialize(context, packageName, fakeSignature);
        
        // Add specific endpoint to intercept
        ServerVerificationBypass.interceptNetworkTraffic(
            "https://api.game.com/verify",
            fakeSignature
        );
        
        // Now make API calls normally
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
            .url("https://api.game.com/verify")
            .post(RequestBody.create(
                MediaType.parse("application/json"),
                "{\"device_id\":\"12345\"}"
            ))
            .build();
        
        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String body = response.body().string();
                // Server response will be patched:
                // "signature_valid":false → "signature_valid":true
                Log.d("API", "Response: " + body);
            }
        });
    }
    
    private String calculateFakeSignature() {
        return ServerVerificationBypass.calculateFakeSignature(
            getApplicationContext(),
            getPackageName()
        );
    }
}
```

### Example 2: Retrofit Integration

```java
public class RetrofitClient {
    
    private static Retrofit retrofit;
    
    public static Retrofit getClient(Context context) {
        if (retrofit == null) {
            // Initialize bypass
            ServerVerificationBypass.initialize(
                context,
                context.getPackageName(),
                getFakeSignature()
            );
            
            // Create OkHttp client with interceptor
            OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .addInterceptor(chain -> {
                    Request original = chain.request();
                    
                    // Add fake signature header
                    Request request = original.newBuilder()
                        .header("X-App-Signature", getFakeSignature())
                        .header("X-Device-Id", getDeviceId())
                        .method(original.method(), original.body())
                        .build();
                    
                    Response response = chain.proceed(request);
                    
                    // Response will be automatically patched by ServerVerificationBypass
                    return response;
                })
                .build();
            
            retrofit = new Retrofit.Builder()
                .baseUrl("https://api.example.com/")
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        }
        
        return retrofit;
    }
}
```

### Example 3: WebView API Calls

```java
public class WebViewManager {
    
    public void setupWebView(Context context, WebView webView) {
        // Initialize bypass
        ServerVerificationBypass.initialize(
            context,
            context.getPackageName(),
            getFakeSignature()
        );
        
        // Enable JavaScript
        webView.getSettings().setJavaScriptEnabled(true);
        
        // Add JavaScript interface
        webView.addJavascriptInterface(new WebAppInterface(context), "Android");
        
        // Load page with API calls
        webView.loadUrl("https://example.com/verification");
        
        // All AJAX requests will be intercepted and patched
    }
    
    public class WebAppInterface {
        Context context;
        
        WebAppInterface(Context c) {
            context = c;
        }
        
        @JavascriptInterface
        public String getSignature() {
            return getFakeSignature();
        }
    }
}
```

---

## Play Integrity API Bypass

### Example 1: Generate Fake Integrity Token

```java
import bin.mt.signature.bypass.PlayIntegrityBypass;

public class IntegrityManager {
    
    public void verifyIntegrity(Context context) {
        // Initialize bypass
        PlayIntegrityBypass.initialize(context);
        
        // Generate fake token
        String nonce = generateNonce();
        String fakeToken = PlayIntegrityBypass.generateFakeIntegrityToken(
            nonce,
            context.getPackageName()
        );
        
        // Use fake token in API request
        sendToServer(fakeToken);
    }
    
    private void sendToServer(String token) {
        // Send to your server
        Request request = new Request.Builder()
            .url("https://api.example.com/verify-integrity")
            .post(RequestBody.create(
                MediaType.parse("application/json"),
                "{\"integrity_token\":\"" + token + "\"}"
            ))
            .build();
        
        // Server will receive valid-looking token
    }
    
    private String generateNonce() {
        byte[] bytes = new byte[32];
        new SecureRandom().nextBytes(bytes);
        return Base64.encodeToString(bytes, Base64.NO_WRAP);
    }
}
```

### Example 2: Intercept Real Integrity API

```java
public class PlayIntegrityInterceptor {
    
    public void setupIntegrityCheck(Context context) {
        // Initialize bypass (hooks Play Integrity API internally)
        PlayIntegrityBypass.initialize(context);
        
        // Now use real API - will be intercepted
        IntegrityManager integrityManager = 
            IntegrityManagerFactory.create(context);
        
        IntegrityTokenRequest request = IntegrityTokenRequest.builder()
            .setNonce(generateNonce())
            .build();
        
        Task<IntegrityTokenResponse> task = integrityManager
            .requestIntegrityToken(request);
        
        task.addOnSuccessListener(response -> {
            String token = response.token();
            // Token will be faked by bypass module
            Log.d("Integrity", "Token received: " + token);
        });
    }
}
```

### Example 3: SafetyNet Attestation

```java
public class SafetyNetManager {
    
    public void checkSafetyNet(Context context) {
        // Initialize bypass
        PlayIntegrityBypass.initialize(context);
        
        // Generate fake SafetyNet response
        byte[] nonce = generateNonceBytes();
        String fakeJWS = PlayIntegrityBypass.generateFakeSafetyNetJWS(
            nonce,
            context.getPackageName()
        );
        
        // Parse fake JWS
        String[] parts = fakeJWS.split("\\.");
        if (parts.length == 3) {
            String payload = new String(
                Base64.decode(parts[1], Base64.URL_SAFE)
            );
            
            JSONObject json = new JSONObject(payload);
            boolean ctsProfileMatch = json.getBoolean("ctsProfileMatch");
            boolean basicIntegrity = json.getBoolean("basicIntegrity");
            
            Log.d("SafetyNet", "CTS: " + ctsProfileMatch); // true
            Log.d("SafetyNet", "Basic: " + basicIntegrity); // true
        }
    }
    
    private byte[] generateNonceBytes() {
        byte[] nonce = new byte[24];
        new SecureRandom().nextBytes(nonce);
        return nonce;
    }
}
```

---

## Hardware Attestation Bypass

### Example 1: KeyStore Attestation

```java
import bin.mt.signature.bypass.HardwareAttestationBypass;

public class KeyStoreManager {
    
    public void createAttestedKey(Context context) throws Exception {
        // Initialize bypass
        HardwareAttestationBypass.initialize(context);
        
        // Create key with attestation
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(
            KeyProperties.KEY_ALGORITHM_RSA,
            "AndroidKeyStore"
        );
        
        KeyGenParameterSpec spec = new KeyGenParameterSpec.Builder(
            "myKeyAlias",
            KeyProperties.PURPOSE_SIGN | KeyProperties.PURPOSE_VERIFY)
            .setDigests(KeyProperties.DIGEST_SHA256)
            .setAttestationChallenge("challenge".getBytes())
            .build();
        
        keyPairGenerator.initialize(spec);
        KeyPair keyPair = keyPairGenerator.generateKeyPair();
        
        // Get attestation certificate chain
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        
        Certificate[] chain = keyStore.getCertificateChain("myKeyAlias");
        
        // Chain will be faked by HardwareAttestationBypass
        for (Certificate cert : chain) {
            X509Certificate x509 = (X509Certificate) cert;
            Log.d("Attestation", "Subject: " + x509.getSubjectDN());
        }
    }
}
```

### Example 2: Generate Fake Attestation Chain

```java
public class AttestationGenerator {
    
    public Certificate[] createFakeChain(Context context) throws Exception {
        HardwareAttestationBypass.initialize(context);
        
        // Generate complete fake chain
        Certificate[] fakeChain = HardwareAttestationBypass
            .generateFakeAttestationChain(context, "myTestKey");
        
        // Verify chain structure
        for (int i = 0; i < fakeChain.length; i++) {
            X509Certificate cert = (X509Certificate) fakeChain[i];
            
            Log.d("Chain", "Certificate " + i + ":");
            Log.d("Chain", "  Subject: " + cert.getSubjectDN());
            Log.d("Chain", "  Issuer: " + cert.getIssuerDN());
            Log.d("Chain", "  Valid: " + cert.getNotBefore() + 
                  " to " + cert.getNotAfter());
        }
        
        // Expected output:
        // Certificate 0: CN=myTestKey, O=AndroidKeyStore
        // Certificate 1: CN=Android Keystore Attestation Intermediate
        // Certificate 2: CN=Android Keystore Attestation Root
        
        return fakeChain;
    }
}
```

### Example 3: StrongBox Key Generation

```java
@RequiresApi(api = Build.VERSION_CODES.P)
public class StrongBoxManager {
    
    public void createStrongBoxKey(Context context) throws Exception {
        // Initialize bypass (supports StrongBox on Android 9+)
        HardwareAttestationBypass.initialize(context);
        
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(
            KeyProperties.KEY_ALGORITHM_EC,
            "AndroidKeyStore"
        );
        
        KeyGenParameterSpec spec = new KeyGenParameterSpec.Builder(
            "strongBoxKey",
            KeyProperties.PURPOSE_SIGN)
            .setAlgorithmParameterSpec(new ECGenParameterSpec("secp256r1"))
            .setDigests(KeyProperties.DIGEST_SHA256)
            .setIsStrongBoxBacked(true) // Will be bypassed
            .setAttestationChallenge("strongbox_test".getBytes())
            .build();
        
        keyPairGenerator.initialize(spec);
        KeyPair keyPair = keyPairGenerator.generateKeyPair();
        
        // Key created successfully even without StrongBox hardware
        Log.d("StrongBox", "StrongBox key created successfully");
    }
}
```

---

## Advanced Scenarios

### Scenario 1: Full Integration Example

```java
public class AdvancedBypassApplication extends Application {
    
    private static final String TAG = "BypassApp";
    
    static {
        System.loadLibrary("SignatureKiller");
    }
    
    @Override
    public void onCreate() {
        super.onCreate();
        
        String packageName = getPackageName();
        String fakeSignature = getFakeSignature();
        
        // 1. Core signature bypass (automatic)
        Log.i(TAG, "✅ Core signature bypass active");
        
        // 2. Cloud certificate bypass
        try {
            CloudCertBypass.initialize(this, getFakeCertData());
            CloudCertBypass.trustAllCertificates();
            Log.i(TAG, "✅ Cloud certificate bypass initialized");
        } catch (Exception e) {
            Log.e(TAG, "Cloud cert bypass failed", e);
        }
        
        // 3. Server verification bypass
        try {
            ServerVerificationBypass.initialize(this, packageName, fakeSignature);
            ServerVerificationBypass.interceptNetworkTraffic(
                "https://api.example.com/*",
                fakeSignature
            );
            Log.i(TAG, "✅ Server verification bypass initialized");
        } catch (Exception e) {
            Log.e(TAG, "Server bypass failed", e);
        }
        
        // 4. Play Integrity API bypass
        try {
            PlayIntegrityBypass.initialize(this);
            Log.i(TAG, "✅ Play Integrity API bypass initialized");
        } catch (Exception e) {
            Log.e(TAG, "Play Integrity bypass failed", e);
        }
        
        // 5. Hardware attestation bypass
        try {
            HardwareAttestationBypass.initialize(this);
            Log.i(TAG, "✅ Hardware attestation bypass initialized");
        } catch (Exception e) {
            Log.e(TAG, "Hardware attestation bypass failed", e);
        }
        
        Log.i(TAG, "========================================");
        Log.i(TAG, "All bypass modules initialized");
        Log.i(TAG, "========================================");
    }
    
    private byte[] getFakeCertData() {
        // Load fake certificate
        return Base64.decode(getFakeSignature(), Base64.DEFAULT);
    }
    
    private String getFakeSignature() {
        return "MIIC9TCCAd2gAwIBAgIEWPTc3zANBgkqhkiG9w0BAQsFADB/...";
    }
}
```

### Scenario 2: Banking App Bypass

```java
public class BankingAppBypass {
    
    public void setupBankingBypass(Context context) {
        // Banking apps typically use:
        // 1. Certificate pinning for API calls
        // 2. Play Integrity API for device verification
        // 3. Hardware attestation for transaction signing
        
        // Initialize all modules
        CloudCertBypass.initialize(context, getFakeCert());
        ServerVerificationBypass.initialize(context, 
            "com.bank.mobile", getFakeSignature());
        PlayIntegrityBypass.initialize(context);
        HardwareAttestationBypass.initialize(context);
        
        // Banking API will now work with modified app
        callBankingAPI();
    }
    
    private void callBankingAPI() {
        // Create secure API client
        OkHttpClient client = new OkHttpClient.Builder()
            .certificatePinner(new CertificatePinner.Builder()
                .add("api.bank.com", "sha256/AAAAA...") // Will be bypassed
                .build())
            .build();
        
        // Make transaction request
        Request request = new Request.Builder()
            .url("https://api.bank.com/transaction")
            .post(createTransactionBody())
            .build();
        
        // Request will succeed even with certificate pinning
        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onResponse(Call call, Response response) {
                // Transaction completed
            }
        });
    }
}
```

### Scenario 3: Game Anti-Cheat Bypass

```java
public class GameBypass {
    
    public void setupGameBypass(Context context) {
        // Games often use:
        // 1. Signature verification to detect mods
        // 2. Server-side integrity checks
        // 3. Play Integrity API for anti-cheat
        
        String gamePackage = "com.example.game";
        
        // Initialize all modules
        ServerVerificationBypass.initialize(context, gamePackage, getFakeSig());
        PlayIntegrityBypass.initialize(context);
        
        // Intercept anti-cheat endpoints
        ServerVerificationBypass.interceptNetworkTraffic(
            "https://api.game.com/anti-cheat",
            getFakeSig()
        );
        
        ServerVerificationBypass.interceptNetworkTraffic(
            "https://api.game.com/verify-client",
            getFakeSig()
        );
        
        // Now game will accept modified client
        connectToGameServer();
    }
    
    private void connectToGameServer() {
        // Connect with modified client
        // Anti-cheat checks will be bypassed
    }
}
```

---

## Debugging Tips

### Enable Verbose Logging

```java
// In Application class
@Override
public void onCreate() {
    super.onCreate();
    
    if (BuildConfig.DEBUG) {
        // Enable detailed logs
        System.setProperty("http.proxyHost", "localhost");
        System.setProperty("http.proxyPort", "8888");
    }
}
```

### Monitor Network Traffic

```bash
# Use adb logcat with filters
adb logcat | grep -E "SSL_|ServerVerification|network"

# Monitor specific module
adb logcat | grep CloudCertBypass:* *:S
```

### Check Hook Status

```java
public void verifyHooks() {
    try {
        // Check if native library is loaded
        System.loadLibrary("SignatureKiller");
        Log.d("Hooks", "✅ Native library loaded");
        
        // Verify bypass modules
        Log.d("Hooks", "Testing CloudCertBypass...");
        CloudCertBypass.trustAllCertificates();
        
        Log.d("Hooks", "Testing ServerVerificationBypass...");
        String sig = ServerVerificationBypass.calculateFakeSignature(
            getApplicationContext(), getPackageName());
        
        Log.d("Hooks", "All hooks active");
    } catch (Exception e) {
        Log.e("Hooks", "Hook verification failed", e);
    }
}
```

---

**Last Updated**: February 2, 2026  
**Version**: 2.0  
**Status**: Production Ready
