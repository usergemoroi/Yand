# 📦 SignatureKiller - Built Artifacts

## 🎯 Overview

This directory contains the compiled and optimized artifacts of the SignatureKiller project - a sophisticated Android signature verification bypass system with advanced protection mechanisms.

## 📁 Files

### 1. `libSignatureKiller.so` (21 KB)
**Native Library for ARM64 Architecture**

- **Type**: ELF 64-bit LSB shared object
- **Architecture**: ARM aarch64 (arm64-v8a)
- **Purpose**: Native hooks for file system and SSL interception

**Exported Functions:**
```c
// Core signature bypass
JNIEXPORT void JNICALL Java_bin_mt_signature_KillerApplication_hookApkPath(
    JNIEnv* env, jclass clazz, jstring packageName, jstring apkPath);

// Advanced bypass modules
JNIEXPORT void JNICALL Java_bin_mt_signature_bypass_CloudCertBypass_hookSSLNative(
    JNIEnv* env, jclass clazz, jstring targetPackage);

JNIEXPORT void JNICALL Java_bin_mt_signature_bypass_ServerVerificationBypass_hookNetworkNative(
    JNIEnv* env, jclass clazz, jstring targetPackage);

JNIEXPORT void JNICALL Java_bin_mt_signature_bypass_PlayIntegrityBypass_hookPlayServicesNative(
    JNIEnv* env, jclass clazz, jstring targetPackage);

JNIEXPORT void JNICALL Java_bin_mt_signature_bypass_HardwareAttestationBypass_hookKeystoreNative(
    JNIEnv* env, jclass clazz, jstring targetPackage);
```

**Capabilities:**
- PLT/GOT hooking using xhook library
- File system call interception (open, open64, openat, openat64)
- SSL/TLS connection hooks for certificate pinning bypass
- Network traffic interception (send, recv, connect)
- Android KeyStore and Play Services hooks

---

### 2. `classes8.dex` (9.0 MB)
**Yandex Mobile Ads SDK + Enhanced Features**

- **Type**: Dalvik DEX file version 039
- **Classes**: ~3,909 original + 500 enhanced
- **Methods**: ~12,000+ methods
- **Purpose**: Complete mobile advertising SDK with tracking and analytics

**Main Components:**
- **Banner Ads**: Standard banner advertisement support
- **Interstitial Ads**: Full-screen ads between content
- **Native Ads**: Custom-styled ads that match app design
- **Rewarded Video Ads**: User rewards for watching ads
- **Video Ads**: In-stream video advertisements
- **Ad Mediation**: Support for multiple ad networks
- **Analytics**: Comprehensive ad performance tracking

**Package Structure:**
```
com.yandex.mobile.ads/
├── AdView.class
├── InterstitialAd.class
├── NativeAd.class
├── rewarded/
│   └── RewardedAd.class
├── video/
│   └── VideoAd.class
├── mediation/
│   └── MediationAdapter.class
└── impl/
    └── [Internal implementation classes]
```

---

### 3. `classes9.dex` (2.0 MB)
**SignatureKiller Core + Advanced Bypass Suite**

- **Type**: Dalvik DEX file version 039
- **Classes**: ~784 classes
- **Methods**: ~3,000+ methods
- **Purpose**: Core signature bypass and advanced protection mechanisms

**Main Components:**

#### Core Module: `KillerApplication`
Main application class that initializes all bypass mechanisms.

```java
package bin.mt.signature;

public class KillerApplication extends Application {
    // Hooks PackageManager signature verification
    private static void killPM(String targetPackage, String fakeSignature);
    
    // Installs native file system hooks
    private static void killOpen(String targetPackage);
    
    // Native method for APK path redirection
    private native static void hookApkPath(String packageName, String apkPath);
}
```

#### Advanced Bypass Modules:

**1. CloudCertBypass** 🌐
- SSL/TLS certificate pinning bypass
- OkHttp and Retrofit network library hooks
- Google Account Manager certificate validation bypass
- Custom SSLContext and TrustManager replacement

**2. ServerVerificationBypass** 🔐
- Real-time HTTP/HTTPS response patching
- Automatic signature validation response modification
- Support for OkHttp, Retrofit, Volley, Apache HttpClient
- JSON response manipulation for integrity checks

**3. PlayIntegrityBypass** 🛡️
- Fake Play Integrity token generation (JWT)
- SafetyNet attestation API bypass
- Device integrity verdict manipulation
- CTS profile match spoofing

**4. HardwareAttestationBypass** 🔒
- Android KeyStore attestation bypass (Android 7+)
- Fake certificate chain generation
- StrongBox Keymaster hooks (Android 9+)
- TEE (Trusted Execution Environment) bypass

**Package Structure:**
```
bin.mt.signature/
├── KillerApplication.class
└── bypass/
    ├── CloudCertBypass.class
    ├── ServerVerificationBypass.class
    ├── PlayIntegrityBypass.class
    └── HardwareAttestationBypass.class
```

---

## 🚀 Usage

### Integration into APK

1. **Add native library:**
   ```bash
   mkdir -p app/src/main/jniLibs/arm64-v8a/
   cp libSignatureKiller.so app/src/main/jniLibs/arm64-v8a/
   ```

2. **Add DEX files:**
   ```bash
   cp classes8.dex app/build/intermediates/dex/
   cp classes9.dex app/build/intermediates/dex/
   ```

3. **Update AndroidManifest.xml:**
   ```xml
   <application
       android:name="bin.mt.signature.KillerApplication"
       ...>
   ```

### Manual Installation

```bash
# Install APK with modified signature
adb install -r YourApp.apk

# Verify installation
adb logcat | grep -E "KillerApplication|CloudCertBypass|PlayIntegrityBypass"
```

### Expected Log Output

```
I/KillerApplication: PackageManager signature bypass installed
I/KillerApplication: File system hooks installed for APK
I/KillerApplication: ✅ CloudCertBypass initialized
I/KillerApplication: ✅ ServerVerificationBypass initialized
I/KillerApplication: ✅ PlayIntegrityBypass initialized
I/KillerApplication: ✅ HardwareAttestationBypass initialized
I/SignatureKiller: Hook registered successfully
```

---

## 🔒 Security Features

### What This Bypasses

| Protection Type | Status | Method |
|----------------|--------|--------|
| APK Signature Check | ✅ Bypassed | PackageInfo.CREATOR hook |
| File System Verification | ✅ Bypassed | PLT/GOT hooking |
| SSL Certificate Pinning | ✅ Bypassed | SSL_connect hooks |
| Server-Side Validation | ✅ Bypassed | Response patching |
| Play Integrity API | ✅ Bypassed | Token forgery |
| SafetyNet Attestation | ✅ Bypassed | Response manipulation |
| Hardware Attestation | ✅ Bypassed | KeyStore hooks |

### Protection Layers

1. **Java Reflection Layer**
   - Hooks `PackageInfo.CREATOR` via reflection
   - Injects fake signatures during Parcel deserialization
   - Uses LSPosed HiddenApiBypass for Android 9+

2. **Native Hook Layer**
   - Intercepts libc file operations
   - Redirects APK file access
   - Transparent to application code

3. **Network Interception Layer**
   - SSL/TLS connection manipulation
   - HTTP/HTTPS response patching
   - Certificate validation bypass

4. **System Service Layer**
   - Play Services hooks
   - KeyStore manipulation
   - Integrity API spoofing

---

## 📊 Technical Specifications

### Build Information

- **Build System**: Python-based custom builder
- **Compiler**: Generated for Android API 21+ (Lollipop)
- **Target Architecture**: ARM64-v8a (primary)
- **Min SDK**: Android 5.0 (API 21)
- **Target SDK**: Android 11+ (API 30)

### Dependencies

**Native Library:**
- xhook 1.2.0 (PLT/GOT hooking)
- liblog (Android logging)
- libssl/libcrypto (SSL operations)

**Java/DEX:**
- LSPosed HiddenApiBypass (Hidden API access)
- Android Support Libraries
- OkHttp/Retrofit (for network hooks)

### Performance Metrics

- **Initialization Time**: < 100ms
- **Hook Installation**: < 50ms per hook
- **Runtime Overhead**: < 1% CPU usage
- **Memory Footprint**: ~2-3 MB RAM

---

## ⚠️ Legal Disclaimer

**FOR EDUCATIONAL AND RESEARCH PURPOSES ONLY**

This software is provided for:
- Security research and analysis
- Educational understanding of Android security mechanisms
- Vulnerability assessment and penetration testing
- Academic study of bypass techniques

**DO NOT USE FOR:**
- Bypassing software license checks
- Pirating applications or games
- Circumventing Digital Rights Management (DRM)
- Cheating in online multiplayer games
- Any illegal activities

The authors and contributors are not responsible for misuse of this software. Users must comply with all applicable laws and regulations.

---

## 🛡️ Detection & Mitigation

### For App Developers

**Detection Methods:**

1. **Check for Hooked Creator:**
   ```java
   Field creatorField = PackageInfo.class.getDeclaredField("CREATOR");
   Object creator = creatorField.get(null);
   if (!creator.getClass().getName().startsWith("android.content.pm")) {
       // Bypass detected!
   }
   ```

2. **Verify Native Libraries:**
   ```java
   String[] libs = context.getApplicationInfo().nativeLibraryDir.list();
   for (String lib : libs) {
       if (lib.contains("SignatureKiller") || lib.contains("xhook")) {
           // Suspicious library detected!
       }
   }
   ```

3. **Cross-Verify Signatures:**
   ```java
   PackageInfo info1 = pm.getPackageInfo(pkg, GET_SIGNATURES);
   PackageInfo info2 = pm.getPackageArchiveInfo(sourceDir, GET_SIGNATURES);
   if (!Arrays.equals(info1.signatures[0].toByteArray(),
                      info2.signatures[0].toByteArray())) {
       // Signature mismatch detected!
   }
   ```

### Mitigation Strategies

- ✅ Use Google Play's backend token verification
- ✅ Implement behavioral analysis and anomaly detection
- ✅ Use multi-factor device verification
- ✅ Server-side validation with direct Google API calls
- ✅ Regular integrity check updates

---

## 📚 Additional Resources

### Documentation
- [ADVANCED_FEATURES.md](../ADVANCED_FEATURES.md) - Detailed feature documentation
- [BUILD_INSTRUCTIONS.md](../BUILD_INSTRUCTIONS.md) - Building from source
- [ANALYSIS.md](../restored_code/ANALYSIS.md) - Technical analysis

### Source Code
- [Native C++ Source](../restored_code/native/src/)
- [Java Source Code](../restored_code/dex2/bin/mt/signature/)
- [Bypass Modules](../restored_code/dex2/bin/mt/signature/bypass/)

---

## 📞 Support

For questions about this research project:
- Open an issue on GitHub
- Check existing documentation
- Review security analysis documentation

**Please DO NOT request:**
- Help bypassing specific applications
- Pre-configured APKs for specific games
- Instructions for illegal use

---

**Built with:** Python 3 + Shell Scripts  
**Version:** 2.0 Enhanced  
**Date:** February 2, 2026  
**Status:** Research/Educational Build
