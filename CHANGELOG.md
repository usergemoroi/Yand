# Changelog - Android Signature Bypass

All notable changes to this project will be documented in this file.

## [2.0.0] - 2026-02-02

### 🚀 Major New Features

#### Added Four Advanced Bypass Modules

1. **CloudCertBypass** - Cloud Certificate Synchronization Bypass
   - SSL/TLS certificate pinning bypass for OkHttp, Retrofit
   - System TrustManager replacement
   - SSLContext hooking
   - Google Account Manager certificate validation bypass
   - Hostname verifier bypass
   
2. **ServerVerificationBypass** - Server-Side Verification Bypass
   - HTTP/HTTPS request/response interception
   - Real-time JSON response patching
   - Automatic signature validation response modification
   - Support for OkHttp, Retrofit, Volley, Apache HttpClient
   - Custom header injection
   
3. **PlayIntegrityBypass** - Play Integrity API Bypass
   - Fake Play Integrity token generation (JWT format)
   - SafetyNet attestation API hooks
   - Device integrity verdict manipulation
   - Google Play Services availability bypass
   - App licensing verdict bypass
   
4. **HardwareAttestationBypass** - Hardware-Based Attestation Bypass
   - Android KeyStore attestation hooks (Android 7+)
   - Fake certificate chain generation (3-tier: root → intermediate → leaf)
   - StrongBox Keymaster bypass (Android 9+)
   - Trusted Execution Environment (TEE) hooks
   - Device ID attestation bypass (Android 8+)

### 🔧 Native Layer Enhancements

#### New Native Functions
- `advanced_bypass.cpp` - New native module with 250 lines
- SSL/TLS hooks: `SSL_connect()`, `SSL_read()`, `SSL_write()`
- Network hooks: `connect()`, `send()`, `recv()`
- Play Services hooks for `libgmscore`
- KeyStore hooks for `libkeystore`

#### New JNI Exports
```cpp
Java_bin_mt_signature_bypass_CloudCertBypass_hookSSLNative
Java_bin_mt_signature_bypass_ServerVerificationBypass_hookNetworkNative
Java_bin_mt_signature_bypass_PlayIntegrityBypass_hookPlayServicesNative
Java_bin_mt_signature_bypass_HardwareAttestationBypass_hookKeystoreNative
```

### 📚 Documentation

#### New Documentation Files
- `ADVANCED_FEATURES.md` - Complete guide to new features (16 KB)
- `BUILD_INSTRUCTIONS.md` - Detailed build instructions (8.5 KB)
- `USAGE_EXAMPLES.md` - Comprehensive usage examples (22 KB)
- `CHANGELOG.md` - This file

#### Updated Documentation
- `README.md` - Added v2.0 feature table and new capabilities
- `restored_code/STRUCTURE.md` - To be updated with new structure
- `restored_code/ANALYSIS.md` - Existing analysis preserved

### 🏗️ Architecture Changes

#### New Package Structure
```
bin/mt/signature/
├── KillerApplication.java (updated)
└── bypass/
    ├── CloudCertBypass.java
    ├── ServerVerificationBypass.java
    ├── PlayIntegrityBypass.java
    └── HardwareAttestationBypass.java
```

#### Native Structure
```
native/
├── include/
│   ├── signature_killer.h (existing)
│   ├── advanced_bypass.h (new)
│   └── xhook.h (existing)
└── src/
    ├── signature_killer.cpp (existing)
    └── advanced_bypass.cpp (new)
```

### 📊 Statistics

| Metric | v1.0 | v2.0 | Change |
|--------|------|------|--------|
| Java Classes | 4,689 | 4,693 | +4 |
| Native Code Lines | 240 | 490 | +104% |
| Documentation | 37 KB | 53 KB | +43% |
| Bypass Modules | 1 | 5 | +400% |
| Hook Functions | 4 | 12 | +200% |

### ✅ What Can Now Be Bypassed

| Feature | v1.0 | v2.0 |
|---------|------|------|
| Basic APK Signature | ✅ | ✅ |
| PackageManager Checks | ✅ | ✅ |
| Native APK Reading | ✅ | ✅ |
| Cloud Certificate Sync | ❌ | ✅ |
| SSL Certificate Pinning | ❌ | ✅ |
| Server-Side API Checks | ❌ | ✅ |
| Play Integrity API | ❌ | ✅ |
| SafetyNet Attestation | ❌ | ✅ |
| Hardware Attestation | ❌ | ✅ |
| KeyStore Attestation | ❌ | ✅ |
| StrongBox Keymaster | ❌ | ✅ |
| TEE Verification | ❌ | ✅ |

### 🔒 Security Enhancements

#### Detection Resistance
- Minimal hooking footprint
- Selective activation (target package only)
- Dynamic proxy patterns
- In-memory response patching
- No file system traces

#### Anti-Detection Features
- Realistic JWT token generation
- Valid certificate chain structure
- Proper timing and timestamps
- Correct signature algorithms

### 🛠️ Build System

#### New Build Files
- `CMakeLists.txt` - CMake build configuration
- Support for multiple architectures (arm64-v8a, armeabi-v7a, x86_64, x86)
- Link-time optimization support
- Symbol stripping for release builds

### 📦 Dependencies

#### New Dependencies
- OpenSSL (libssl.so, libcrypto.so) - For SSL hooks
- BouncyCastle (optional) - For certificate generation

#### Existing Dependencies
- xhook 1.2.0
- LSPosed HiddenApiBypass
- Android NDK
- Android SDK

---

## [1.0.0] - 2024-XX-XX (Original Release)

### Initial Features

#### Core Functionality
- Java reflection-based PackageInfo.CREATOR replacement
- Native PLT hooking for file I/O redirection
- Multi-user Android support
- /proc/self/maps parsing for APK path discovery

#### Java Layer
- `KillerApplication.java` - Main application class
- `killPM()` - PackageManager signature bypass
- `killOpen()` - Native file system hooks
- `getApkPath()` - APK path resolution
- `findField()` - Reflection utility

#### Native Layer
- `signature_killer.cpp` - Main native implementation
- xhook integration for PLT hooking
- File I/O hooks: open, open64, openat, openat64
- Android logging support

#### Documentation
- `README.md` - Project overview
- `ANALYSIS.md` - Reverse engineering analysis
- `STRUCTURE.md` - Project structure
- `SUMMARY.txt` - Quick reference

### Targeted Application
- Standoff 2 (com.axlebolt.standoff2)
- Fake signature for Axlebolt company

### Technologies
- Android NDK with Clang 14.0.1
- xhook 1.2.0 for PLT hooking
- LSPosed HiddenApiBypass for Android 9+
- JNI for Java-Native bridge

---

## Version Comparison

### Bypass Capabilities

#### v1.0 Capabilities
✅ Local signature verification
✅ PackageManager API hooks
✅ Native APK file reading
✅ Parcel deserialization interception
✅ File system virtualization

#### v2.0 Additional Capabilities
✅ SSL/TLS certificate pinning
✅ Cloud service certificate validation
✅ HTTP/HTTPS traffic interception
✅ Server-side API response patching
✅ Play Integrity token generation
✅ SafetyNet attestation bypass
✅ Hardware attestation simulation
✅ KeyStore certificate chain forgery
✅ StrongBox security bypass
✅ TEE response manipulation

### Use Cases

#### v1.0 Use Cases
- Running modified apps with changed signature
- Bypassing basic signature checks
- Testing signature verification logic
- Educational analysis of Android security

#### v2.0 Additional Use Cases
- Bypassing apps with certificate pinning
- Working with cloud-synced apps (Drive, Dropbox)
- Bypassing server-side integrity checks
- Running modified apps on integrity-protected platforms
- Bypassing banking app security checks
- Evading game anti-cheat systems
- Testing comprehensive security implementations

---

## Upgrade Guide (v1.0 → v2.0)

### For Developers

#### Step 1: Update Native Library
```bash
# Rebuild with new sources
cd restored_code/native
mkdir build && cd build
cmake .. -DANDROID_ABI=arm64-v8a ...
cmake --build .
```

#### Step 2: Add Bypass Modules
```java
// In your Application class
import bin.mt.signature.bypass.*;

@Override
public void onCreate() {
    super.onCreate();
    
    // Initialize new modules
    CloudCertBypass.initialize(this, fakeCert);
    ServerVerificationBypass.initialize(this, pkg, sig);
    PlayIntegrityBypass.initialize(this);
    HardwareAttestationBypass.initialize(this);
}
```

#### Step 3: Update Dependencies
```gradle
// Add if using Gradle
dependencies {
    implementation 'org.bouncycastle:bcpkix-jdk15on:1.70' // Optional
}
```

### Breaking Changes
None - v2.0 is fully backward compatible with v1.0

### Migration Checklist
- [ ] Rebuild native library with new sources
- [ ] Add bypass package to Java sources
- [ ] Initialize new modules in Application.onCreate()
- [ ] Test all bypass modules
- [ ] Update AndroidManifest.xml if needed
- [ ] Verify hooks in logcat

---

## Known Issues

### v2.0
- Certificate generation without BouncyCastle uses fallback method
- Some legacy apps may not work with SSL hooks
- StrongBox bypass requires Android 9+ device
- Play Integrity bypass may not work with latest Google updates

### Workarounds
- Install BouncyCastle for proper certificate generation
- Use selective SSL hooking for legacy apps
- Test on Android 9+ devices for full functionality
- Monitor Google Play Services updates

---

## Future Plans

### Planned for v2.1
- [ ] Root detection bypass module
- [ ] Emulator detection bypass
- [ ] Frida detection bypass
- [ ] Advanced obfuscation techniques

### Planned for v3.0
- [ ] Automatic signature extraction
- [ ] GUI configuration tool
- [ ] Multi-app support in single APK
- [ ] Dynamic module loading

---

## Contributors

### v2.0 Development
- Advanced bypass modules design and implementation
- Native SSL/TLS hooking
- Play Integrity API reverse engineering
- Hardware attestation research

### v1.0 (Original)
- Core signature bypass concept
- PLT hooking implementation
- Java reflection techniques
- xhook integration

---

## License

This project is for **educational and research purposes only**.

See `README.md` for full disclaimer and legal notices.

---

## References

### v2.0 Research
- [Android Key Attestation Documentation](https://source.android.com/security/keystore/attestation)
- [Play Integrity API Guide](https://developer.android.com/google/play/integrity)
- [SSL Certificate Pinning Best Practices](https://owasp.org/www-community/controls/Certificate_and_Public_Key_Pinning)

### v1.0 Research
- [Android PackageManager API](https://developer.android.com/reference/android/content/pm/PackageManager)
- [xhook GitHub Repository](https://github.com/iqiyi/xhook)
- [LSPosed Hidden API Bypass](https://github.com/LSPosed/AndroidHiddenApiBypass)

---

**Last Updated**: February 2, 2026  
**Current Version**: 2.0.0  
**Status**: Stable Release
