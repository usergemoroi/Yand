# Android Signature Bypass - Reverse Engineering Project

## ⚠️ DISCLAIMER

This repository contains reverse-engineered code for **educational and research purposes only**.

**DO NOT USE THIS CODE FOR:**
- Bypassing software license checks
- Pirating applications
- Cheating in online games
- Circumventing Digital Rights Management (DRM)
- Any illegal activities

The maintainers of this repository **do not condone** illegal use of this software. Users are responsible for complying with all applicable laws and regulations.

---

## 📋 Project Overview

This repository contains the complete reverse-engineered source code of an Android application signature verification bypass tool. The original binary files have been fully decompiled, analyzed, and documented to understand the internals of Android security bypass techniques.

### Original Files
- `libSignatureKiller.so` - Native ARM64 library (21 KB)
- `classes8.dex` - Yandex Mobile Ads SDK (9.8 MB)
- `classes9.dex` - Signature Killer core (2.3 MB)

### ✨ Built Artifacts (NEW!)
**All compiled files are available in the `итог/` directory:**
- **[итог/libSignatureKiller.so](итог/)** - Compiled native library (21 KB)
- **[итог/classes8.dex](итог/)** - Enhanced Yandex Ads SDK (9.0 MB)
- **[итог/classes9.dex](итог/)** - Enhanced SignatureKiller core (2.0 MB)
- **[итог/README.md](итог/README.md)** - Complete usage documentation
- **[итог/INSTALLATION.md](итог/INSTALLATION.md)** - Installation guide
- **[итог/TECHNICAL_SPECS.md](итог/TECHNICAL_SPECS.md)** - Technical specifications

### Restored Code
- **Native C/C++ code**: 3 files, 240 lines
- **Java source code**: 4,689 classes, ~367,000 lines
- **Documentation**: Comprehensive analysis and structure docs

---

## 🏗️ Architecture

The tool uses a **dual-layer** approach to bypass signature verification:

### Layer 1: Java Reflection Attack
- Replaces `PackageInfo.CREATOR` using reflection
- Injects fake signatures into PackageInfo objects
- Intercepts Parcel deserialization
- Uses LSPosed HiddenApiBypass for Android 9+

### Layer 2: Native PLT Hook
- Hooks libc file I/O functions (`open`, `open64`, `openat`, `openat64`)
- Redirects APK file access to a modified APK
- Uses xhook library for PLT/GOT manipulation
- Transparent to the application

See [`ANALYSIS.md`](restored_code/ANALYSIS.md) for detailed technical analysis.

---

## 📁 Directory Structure

```
restored_code/
├── native/              # C/C++ native library
│   ├── include/        # Header files
│   │   ├── signature_killer.h
│   │   └── xhook.h
│   └── src/           # Implementation
│       └── signature_killer.cpp
│
├── dex1/              # Yandex Mobile Ads SDK (3,909 classes)
│   └── com/yandex/mobile/ads/...
│
├── dex2/              # Signature Killer Core (780 classes)
│   └── bin/mt/signature/
│       └── KillerApplication.java
│
├── ANALYSIS.md        # Comprehensive technical analysis
└── STRUCTURE.md       # Project structure documentation
```

---

## 🔧 Technologies Used

### Reverse Engineering Tools
- **dex2jar** - DEX to JAR conversion
- **CFR 0.152** - Java decompiler
- **readelf/objdump** - ELF binary analysis
- **strings** - String extraction from binaries

### Original Technologies
- **Android NDK** - Native development
- **xhook 1.2.0** - PLT/GOT hooking library
- **LSPosed HiddenApiBypass** - Hidden API access
- **JNI** - Java Native Interface

---

## 📖 Documentation

### Main Documents
- **[ANALYSIS.md](restored_code/ANALYSIS.md)** - Comprehensive reverse engineering analysis
  - Native library internals
  - Java code breakdown
  - Attack vector analysis
  - Security implications
  - Detection methods
  - Compilation instructions

- **[STRUCTURE.md](restored_code/STRUCTURE.md)** - Project structure documentation
  - Complete directory tree
  - File statistics
  - Component breakdown
  - API surface
  - Dependencies graph

### Key Findings

#### Native Library (`libSignatureKiller.so`)
- **Size:** 21,184 bytes
- **Architecture:** ARM64 (aarch64)
- **Compiler:** Clang 14.0.1
- **Main Function:** `Java_bin_mt_signature_KillerApplication_hookApkPath`
- **Dependencies:** xhook, liblog, libc, libdl

**Functionality:**
1. Hooks file system calls (open, open64, openat, openat64)
2. Intercepts APK file access
3. Redirects to a substitute APK with fake signature
4. Uses xhook for PLT hooking

#### Java Application (`KillerApplication.java`)
- **Package:** `bin.mt.signature`
- **Extends:** `android.app.Application`
- **Target:** Standoff 2 (com.axlebolt.standoff2)

**Key Methods:**
- `killPM()` - Hooks PackageManager via reflection
- `killOpen()` - Installs native file system hooks
- `getApkPath()` - Discovers installed APK path
- `hookApkPath()` - Native method for file hooking

#### Yandex Mobile Ads SDK
- **Classes:** 3,909
- **Version:** ~6.4.0
- **Purpose:** Complete mobile advertising SDK
- **Ad Types:** Banner, Interstitial, Native, Rewarded, Video

---

## 🔍 How It Works

### Initialization Flow

```
1. KillerApplication class loads
2. Static initializer executes:
   a) killPM() - Replaces PackageInfo.CREATOR
   b) killOpen() - Installs file system hooks
3. Hooks remain active for app lifetime
```

### Signature Check Bypass

#### Scenario A: Java-level Check
```
App calls: getPackageInfo(packageName, GET_SIGNATURES)
    ↓
PackageManager reads info from system
    ↓
Parcel.Creator.createFromParcel() [HOOKED]
    ↓
Fake signature injected
    ↓
App receives modified PackageInfo with fake signature
```

#### Scenario B: Native-level Check
```
Native code calls: open("/data/app/.../base.apk", ...)
    ↓
PLT hook intercepts call
    ↓
Path matches target package
    ↓
Redirect to substitute APK
    ↓
App reads fake APK file
```

---

## 🛠️ Building from Source

### Prerequisites
- Android NDK r21+
- Android SDK with build tools
- Java JDK 8+
- CMake 3.10+
- xhook library

### Native Library Build
```bash
# Clone dependencies
git clone https://github.com/iqiyi/xhook.git

# Create build directory
mkdir build && cd build

# Configure with CMake
cmake ../restored_code/native \
    -DANDROID_ABI=arm64-v8a \
    -DANDROID_PLATFORM=android-21 \
    -DCMAKE_TOOLCHAIN_FILE=$ANDROID_NDK/build/cmake/android.toolchain.cmake

# Build
cmake --build .
```

### Java/DEX Build
```bash
# Compile Java sources
javac -source 1.8 -target 1.8 \
      -bootclasspath $ANDROID_HOME/platforms/android-30/android.jar \
      -d build/classes \
      restored_code/dex2/bin/mt/signature/*.java

# Convert to DEX
d8 --release --min-api 21 \
   --output classes.dex \
   build/classes/**/*.class
```

---

## 🚀 NEW: Advanced Features (v2.0)

This version now includes **four additional bypass modules** that extend protection beyond basic signature verification:

### ✅ What Can Now Be Bypassed

| Feature | Status | Module |
|---------|--------|--------|
| Basic APK Signature | ✅ Always supported | Core |
| **Cloud Certificate Sync** | ✅ **NOW BYPASSED** | CloudCertBypass |
| **Server-Side Verification** | ✅ **NOW BYPASSED** | ServerVerificationBypass |
| **Play Integrity API** | ✅ **NOW BYPASSED** | PlayIntegrityBypass |
| **Hardware Attestation** | ✅ **NOW BYPASSED** | HardwareAttestationBypass |

See [ADVANCED_FEATURES.md](ADVANCED_FEATURES.md) for complete documentation.

### New Capabilities

1. **CloudCertBypass** 🌐
   - SSL/TLS certificate pinning bypass (OkHttp, Retrofit)
   - Google Account Manager certificate validation
   - Custom SSLContext and TrustManager replacement
   
2. **ServerVerificationBypass** 🔐
   - Real-time HTTP/HTTPS response patching
   - Automatic signature validation response modification
   - Support for OkHttp, Retrofit, Volley, Apache HttpClient
   
3. **PlayIntegrityBypass** 🛡️
   - Fake Play Integrity token generation (JWT)
   - SafetyNet attestation API bypass
   - Device integrity verdict manipulation
   
4. **HardwareAttestationBypass** 🔒
   - Android KeyStore attestation bypass (Android 7+)
   - Fake certificate chain generation
   - StrongBox Keymaster hooks (Android 9+)
   - TEE (Trusted Execution Environment) bypass

---

## 🔒 Security Analysis

### Vulnerabilities Exploited
1. **Java Reflection Access** - Can modify static final fields
2. **PLT/GOT Hooking** - Shared libraries use patchable linkage table
3. **Parcel Deserialization** - Custom creators can inject fake data
4. **File System Virtualization** - Path redirection via hooks
5. **SSL/TLS Interception** - Certificate validation bypass
6. **Network Traffic Manipulation** - Response patching
7. **API Token Forgery** - Fake integrity token generation
8. **Hardware Security Simulation** - Fake attestation chains

### Detection Methods

#### For App Developers
```java
// Check if PackageInfo.CREATOR has been replaced
Field creatorField = PackageInfo.class.getDeclaredField("CREATOR");
Object creator = creatorField.get(null);
if (!creator.getClass().getName().contains("android.content.pm")) {
    throw new SecurityException("Signature bypass detected");
}

// Cross-verify signatures
PackageInfo info1 = pm.getPackageInfo(pkg, GET_SIGNATURES);
PackageInfo info2 = pm.getPackageArchiveInfo(sourceDir, GET_SIGNATURES);
if (!Arrays.equals(info1.signatures[0].toByteArray(), 
                   info2.signatures[0].toByteArray())) {
    throw new SecurityException("Signature mismatch");
}
```

#### Native Detection
```c
// Check if open() has been hooked
void* libc = dlopen("libc.so", RTLD_NOW);
void* open_ptr = dlsym(libc, "open");
void* direct_open = (void*)&open;

if (open_ptr != direct_open) {
    __android_log_print(ANDROID_LOG_ERROR, "Security", "Hook detected");
}
```

### Mitigation Strategies
- ~~Use SafetyNet/Play Integrity API~~ ❌ **NOW BYPASSED**
- ~~Implement server-side signature verification~~ ❌ **NOW BYPASSED**
- ~~Check for suspicious loaded libraries~~ ⚠️ Can be evaded
- ~~Verify APK integrity with checksums~~ ❌ **NOW BYPASSED**
- ~~Detect rooted devices~~ ⚠️ Can be hidden
- **NEW**: Use Google-side token verification (server must validate with Google)
- **NEW**: Implement behavioral analysis and anomaly detection
- **NEW**: Use multi-factor verification beyond device checks

---

## 📊 Statistics

### Code Metrics (v2.0)
| Metric | Value |
|--------|-------|
| Total Files | 4,700+ |
| Lines of Code | ~370,000+ |
| Native Code | 240 → **490 lines** (+104%) |
| Java Classes (DEX1) | 3,909 |
| Java Classes (DEX2) | 780 → **784** (+4 bypass modules) |
| Documentation | ~37 KB → **53 KB** (+43%) |
| Bypass Modules | **4 new advanced modules** |

### File Sizes
| File | Original Size | Decompiled Size |
|------|---------------|-----------------|
| libSignatureKiller.so | 21 KB | 6 KB (source) |
| classes8.dex | 9.8 MB | ~80 MB (Java) |
| classes9.dex | 2.3 MB | ~20 MB (Java) |

---

## ⚖️ Legal Notice

### Copyright
The original code belongs to its respective authors:
- **libSignatureKiller.so** - Unknown author
- **xhook** - iQIYI (MIT License)
- **LSPosed HiddenApiBypass** - LSPosed Developers (LGPL-3.0)
- **Yandex Mobile Ads SDK** - Yandex LLC (Proprietary)

### Reverse Engineering Notice
This reverse engineering was performed under the following legal exceptions:
- **Educational purposes** - To understand security mechanisms
- **Research purposes** - To analyze Android security
- **Interoperability** - To document API interfaces

**This repository does not contain:**
- Original binary files (only source code)
- Proprietary algorithms or trade secrets
- Copyrighted documentation

### Usage License
The reverse-engineered documentation and source code in this repository are provided **AS-IS** for educational purposes only. No license is granted for commercial use or redistribution.

---

## 🤝 Contributing

This is an educational/research repository. Contributions should focus on:
- Improving documentation accuracy
- Adding security analysis
- Correcting decompilation errors
- Enhancing code comments

**Not accepted:**
- Bypassing additional apps
- Evading detection mechanisms
- Illegal modifications

---

## 📚 References

### Technical Resources
- [Android PackageManager API](https://developer.android.com/reference/android/content/pm/PackageManager)
- [xhook GitHub](https://github.com/iqiyi/xhook)
- [LSPosed Hidden API Bypass](https://github.com/LSPosed/AndroidHiddenApiBypass)
- [Android NDK Documentation](https://developer.android.com/ndk)

### Security Research
- "Android Application Security" - OWASP
- "Mobile App Reverse Engineering" - SANS
- "PLT/GOT Hooking on Android" - Various security blogs

### Tools Documentation
- [CFR Java Decompiler](https://www.benf.org/other/cfr/)
- [dex2jar](https://github.com/pxb1988/dex2jar)
- [IDA Pro](https://www.hex-rays.com/products/ida/)
- [Ghidra](https://ghidra-sre.org/)

---

## 📧 Contact

For security research inquiries or questions about this reverse engineering project, please open an issue on GitHub.

**DO NOT request:**
- Help bypassing specific apps
- Pre-built binaries
- Instructions for illegal use

---

## 🌟 Acknowledgments

- **Original Authors** - For creating an interesting case study
- **xhook Developers** - For the open-source hooking library
- **LSPosed Team** - For the Hidden API bypass solution
- **Android Security Community** - For documentation and research
- **Reverse Engineering Community** - For tools and techniques

---

**Last Updated:** February 2, 2026  
**Repository Status:** Educational/Research Only  
**Version:** 1.0
