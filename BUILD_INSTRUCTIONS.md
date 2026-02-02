# Build Instructions - Android Signature Bypass v2.0

## Prerequisites

### Required Tools
- **Android NDK** r21 or later
- **Android SDK** with build tools 30.0.0+
- **CMake** 3.10 or later
- **Java JDK** 8 or later
- **Git** (for cloning dependencies)

### Environment Variables
```bash
export ANDROID_SDK_ROOT=/path/to/android/sdk
export ANDROID_NDK_ROOT=/path/to/android/ndk
export ANDROID_HOME=$ANDROID_SDK_ROOT
```

---

## Step 1: Clone Dependencies

### xhook Library
```bash
cd /tmp
git clone https://github.com/iqiyi/xhook.git
cd xhook
git checkout v1.2.0
```

### Copy xhook to Project
```bash
cp -r xhook/libxhook/jni/xhook.h restored_code/native/include/
```

---

## Step 2: Build Native Library

### Option A: Using CMake (Recommended)

```bash
cd restored_code/native

# Create build directory
mkdir -p build/arm64-v8a
cd build/arm64-v8a

# Configure
cmake ../.. \
    -DCMAKE_TOOLCHAIN_FILE=$ANDROID_NDK_ROOT/build/cmake/android.toolchain.cmake \
    -DANDROID_ABI=arm64-v8a \
    -DANDROID_PLATFORM=android-21 \
    -DCMAKE_BUILD_TYPE=Release

# Build
cmake --build . -- -j$(nproc)

# Output: lib/arm64-v8a/libSignatureKiller.so
```

### Build for Multiple Architectures

```bash
# ARM64
cmake -DANDROID_ABI=arm64-v8a ...

# ARMv7
cmake -DANDROID_ABI=armeabi-v7a ...

# x86_64
cmake -DANDROID_ABI=x86_64 ...

# x86
cmake -DANDROID_ABI=x86 ...
```

### Option B: Using ndk-build

Create `Android.mk`:
```makefile
LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)
LOCAL_MODULE := SignatureKiller
LOCAL_SRC_FILES := src/signature_killer.cpp src/advanced_bypass.cpp
LOCAL_C_INCLUDES := $(LOCAL_PATH)/include
LOCAL_LDLIBS := -llog -landroid -ldl -lssl -lcrypto
LOCAL_CPPFLAGS := -std=c++11 -Wall -Wextra -O2
include $(BUILD_SHARED_LIBRARY)
```

Build:
```bash
cd restored_code/native
ndk-build NDK_PROJECT_PATH=. APP_BUILD_SCRIPT=Android.mk APP_ABI=arm64-v8a
```

---

## Step 3: Build Java/DEX Files

### Compile Core Module

```bash
cd restored_code/dex2

# Create output directory
mkdir -p build/classes

# Compile KillerApplication
javac -source 1.8 -target 1.8 \
    -bootclasspath $ANDROID_SDK_ROOT/platforms/android-30/android.jar \
    -d build/classes \
    bin/mt/signature/KillerApplication.java

# Compile bypass modules
javac -source 1.8 -target 1.8 \
    -bootclasspath $ANDROID_SDK_ROOT/platforms/android-30/android.jar \
    -cp build/classes \
    -d build/classes \
    bin/mt/signature/bypass/*.java
```

### Convert to DEX

```bash
# Using d8 (recommended)
d8 --release \
   --min-api 21 \
   --output build/classes9.dex \
   build/classes/**/*.class

# Or using dx (legacy)
dx --dex \
   --min-sdk-version=21 \
   --output=build/classes9.dex \
   build/classes
```

### Compile Yandex Ads SDK (DEX1)

```bash
cd restored_code/dex1

# Compile all classes
find com/yandex/mobile/ads -name "*.java" > sources.txt
javac -source 1.8 -target 1.8 \
    -bootclasspath $ANDROID_SDK_ROOT/platforms/android-30/android.jar \
    -d build/classes \
    @sources.txt

# Convert to DEX
d8 --release \
   --min-api 21 \
   --output build/classes8.dex \
   build/classes/**/*.class
```

---

## Step 4: Package into APK

### Create APK Structure

```bash
mkdir -p apk/lib/arm64-v8a
mkdir -p apk/assets

# Copy native library
cp restored_code/native/build/arm64-v8a/lib/arm64-v8a/libSignatureKiller.so \
   apk/lib/arm64-v8a/

# Copy DEX files
cp restored_code/dex1/build/classes8.dex apk/
cp restored_code/dex2/build/classes9.dex apk/
```

### Create AndroidManifest.xml

```xml
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    package="bin.mt.signature"
    android:versionCode="2"
    android:versionName="2.0">
    
    <uses-permission android:name="android.permission.INTERNET" />
    <uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />
    
    <application
        android:name="bin.mt.signature.KillerApplication"
        android:allowBackup="false"
        android:debuggable="false"
        android:label="SignatureKiller">
    </application>
</manifest>
```

### Build APK

```bash
# Create unsigned APK
cd apk
aapt package -f -M AndroidManifest.xml -F ../SignatureKiller_unsigned.apk .

# Sign APK
jarsigner -verbose \
    -sigalg SHA256withRSA \
    -digestalg SHA-256 \
    -keystore ~/.android/debug.keystore \
    -storepass android \
    SignatureKiller_unsigned.apk \
    androiddebugkey

# Align APK
zipalign -f -v 4 SignatureKiller_unsigned.apk SignatureKiller.apk
```

---

## Step 5: Testing

### Install APK

```bash
adb install -r SignatureKiller.apk
```

### Check Logs

```bash
# Monitor all logs
adb logcat | grep -E "KillerApplication|SignatureKiller|CloudCertBypass|ServerVerificationBypass|PlayIntegrityBypass|HardwareAttestationBypass"

# Monitor specific module
adb logcat | grep CloudCertBypass
adb logcat | grep PlayIntegrityBypass
```

### Verify Hooks

```bash
# Check if library is loaded
adb shell "ps -A | grep standoff2"
PID=$(adb shell "pidof com.axlebolt.standoff2")
adb shell "cat /proc/$PID/maps | grep SignatureKiller"

# Expected output:
# 7000000000-7000001000 r-xp 00000000 fd:00 12345  /data/app/.../lib/arm64/libSignatureKiller.so
```

---

## Advanced Build Options

### Enable Debug Logging

```cpp
// In signature_killer.cpp and advanced_bypass.cpp
#define ENABLE_DEBUG_LOGS 1

#if ENABLE_DEBUG_LOGS
#define LOGD(...) __android_log_print(ANDROID_LOG_DEBUG, LOG_TAG, __VA_ARGS__)
#else
#define LOGD(...)
#endif
```

### Obfuscation

Using ProGuard:
```
-keep class bin.mt.signature.** { *; }
-keep class bin.mt.signature.bypass.** { *; }
-keepclassmembers class * {
    native <methods>;
}
```

### Strip Symbols

```bash
# Strip debug symbols from native library
$ANDROID_NDK_ROOT/toolchains/llvm/prebuilt/linux-x86_64/bin/llvm-strip \
    libSignatureKiller.so
```

---

## Troubleshooting

### Issue: "UnsatisfiedLinkError: dlopen failed"

**Solution**: Check library architecture matches device
```bash
adb shell "getprop ro.product.cpu.abi"
# Output: arm64-v8a

# Ensure you built for correct architecture
file libSignatureKiller.so
# Output: ELF 64-bit LSB shared object, ARM aarch64
```

### Issue: "ClassNotFoundException: bin.mt.signature.bypass.*"

**Solution**: Ensure bypass modules are in DEX file
```bash
dexdump -f classes9.dex | grep "bin.mt.signature.bypass"
```

### Issue: Hooks Not Working

**Solution**: Check xhook initialization
```bash
adb logcat | grep xhook
# Should see: "Hook registered successfully"
```

### Issue: SSL Hooks Fail

**Solution**: Add OpenSSL library dependency
```bash
# In CMakeLists.txt
find_library(SSL_LIB ssl)
find_library(CRYPTO_LIB crypto)
target_link_libraries(SignatureKiller ${SSL_LIB} ${CRYPTO_LIB})
```

---

## Verification Checklist

- [ ] Native library builds without errors
- [ ] All Java classes compile successfully
- [ ] DEX files created (classes8.dex, classes9.dex)
- [ ] APK installs on device
- [ ] Logs show "KillerApplication initialized"
- [ ] Logs show "✅ CloudCertBypass initialized"
- [ ] Logs show "✅ ServerVerificationBypass initialized"
- [ ] Logs show "✅ PlayIntegrityBypass initialized"
- [ ] Logs show "✅ HardwareAttestationBypass initialized"
- [ ] Target app signature checks are bypassed
- [ ] Network traffic is properly intercepted

---

## Performance Optimization

### Compiler Flags

```cmake
# Optimize for size
target_compile_options(SignatureKiller PRIVATE -Os)

# Optimize for speed
target_compile_options(SignatureKiller PRIVATE -O3)

# Link-time optimization
set(CMAKE_INTERPROCEDURAL_OPTIMIZATION TRUE)
```

### ProGuard Optimization

```
-optimizationpasses 5
-dontusemixedcaseclassnames
-dontskipnonpubliclibraryclasses
-verbose
-optimizations !code/simplification/arithmetic,!field/*,!class/merging/*
```

---

## Distribution

### Create Release Build

```bash
# Build release native library
cmake -DCMAKE_BUILD_TYPE=Release ...

# Strip symbols
llvm-strip libSignatureKiller.so

# Sign APK with release key
jarsigner -keystore release.keystore ...
```

### Size Optimization

```bash
# Before optimization
du -h libSignatureKiller.so
# 250K

# After stripping
llvm-strip libSignatureKiller.so
du -h libSignatureKiller.so
# 21K (-92%)
```

---

## Support

For build issues, check:
1. [Android NDK Documentation](https://developer.android.com/ndk)
2. [CMake Documentation](https://cmake.org/documentation/)
3. [xhook GitHub Issues](https://github.com/iqiyi/xhook/issues)

---

**Last Updated**: February 2, 2026  
**Build System Version**: 2.0  
**Tested NDK Versions**: r21, r23, r25
