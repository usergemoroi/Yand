# 🔧 Installation Guide - SignatureKiller

## Quick Start

### Prerequisites
- Android device or emulator with API 21+ (Android 5.0+)
- ADB (Android Debug Bridge) installed
- Root access or LSPosed framework (recommended)
- USB debugging enabled

---

## Installation Methods

### Method 1: Module Integration (Recommended)

**For LSPosed/Xposed Users:**

1. **Install as Xposed Module:**
   ```bash
   # Package the files into an APK structure
   mkdir -p module/app/lib/arm64-v8a
   cp libSignatureKiller.so module/app/lib/arm64-v8a/
   cp classes8.dex module/app/
   cp classes9.dex module/app/
   
   # Build APK
   cd module
   aapt package -f -M AndroidManifest.xml -F SignatureKiller.apk .
   jarsigner -verbose SignatureKiller.apk yourkey
   zipalign -f 4 SignatureKiller.apk SignatureKiller_aligned.apk
   
   # Install
   adb install -r SignatureKiller_aligned.apk
   ```

2. **Activate in LSPosed:**
   - Open LSPosed Manager
   - Enable "SignatureKiller" module
   - Select target applications
   - Reboot device

---

### Method 2: Direct APK Modification

**Inject into existing APK:**

1. **Decompile target APK:**
   ```bash
   apktool d TargetApp.apk -o TargetApp_decompiled
   ```

2. **Add SignatureKiller files:**
   ```bash
   # Add native library
   mkdir -p TargetApp_decompiled/lib/arm64-v8a
   cp libSignatureKiller.so TargetApp_decompiled/lib/arm64-v8a/
   
   # Add DEX files
   cp classes8.dex TargetApp_decompiled/
   cp classes9.dex TargetApp_decompiled/
   ```

3. **Modify AndroidManifest.xml:**
   ```xml
   <application
       android:name="bin.mt.signature.KillerApplication"
       android:allowBackup="true"
       android:icon="@mipmap/ic_launcher"
       android:label="@string/app_name">
       ...
   </application>
   ```

4. **Rebuild and sign:**
   ```bash
   apktool b TargetApp_decompiled -o TargetApp_modified.apk
   jarsigner -verbose -sigalg SHA256withRSA -digestalg SHA-256 \
       -keystore ~/.android/debug.keystore \
       -storepass android \
       TargetApp_modified.apk androiddebugkey
   zipalign -f 4 TargetApp_modified.apk TargetApp_final.apk
   ```

5. **Install:**
   ```bash
   adb install -r TargetApp_final.apk
   ```

---

### Method 3: Magisk Module

**For Magisk users:**

1. **Create module structure:**
   ```bash
   mkdir -p magisk_module/system/app/SignatureKiller
   cp libSignatureKiller.so classes8.dex classes9.dex magisk_module/system/app/SignatureKiller/
   ```

2. **Create module.prop:**
   ```properties
   id=signaturekiller
   name=SignatureKiller
   version=2.0
   versionCode=20
   author=SecurityResearch
   description=Advanced Android signature bypass system
   ```

3. **Package and install:**
   ```bash
   cd magisk_module
   zip -r SignatureKiller_magisk.zip *
   adb push SignatureKiller_magisk.zip /sdcard/
   # Install via Magisk Manager
   ```

---

## Configuration

### Basic Configuration

Create `/data/data/bin.mt.signature/shared_prefs/config.xml`:

```xml
<?xml version='1.0' encoding='utf-8' standalone='yes' ?>
<map>
    <string name="target_package">com.your.target.app</string>
    <string name="fake_signature">YOUR_BASE64_SIGNATURE</string>
    <boolean name="enable_ssl_bypass" value="true" />
    <boolean name="enable_server_bypass" value="true" />
    <boolean name="enable_play_integrity" value="true" />
    <boolean name="enable_hardware_attestation" value="true" />
    <boolean name="debug_mode" value="false" />
</map>
```

### Advanced Configuration

**For multiple target apps:**

```xml
<map>
    <set name="target_packages">
        <string>com.example.app1</string>
        <string>com.example.app2</string>
        <string>com.example.app3</string>
    </set>
    <string-array name="fake_signatures">
        <item>BASE64_SIGNATURE_1</item>
        <item>BASE64_SIGNATURE_2</item>
        <item>BASE64_SIGNATURE_3</item>
    </string-array>
</map>
```

---

## Verification

### Check Installation

```bash
# Verify files are installed
adb shell "ls -l /data/app/*/lib/arm64/"
# Should show libSignatureKiller.so

# Verify DEX files
adb shell "ls -l /data/app/*/base.apk"
# Check file size (should be larger after adding DEX files)
```

### Check Logs

```bash
# Monitor initialization
adb logcat -c
adb logcat | grep -E "KillerApplication|SignatureKiller"

# Expected output:
# I/KillerApplication: PackageManager signature bypass installed
# I/SignatureKiller: Hook registered successfully
# I/KillerApplication: ✅ CloudCertBypass initialized
# I/KillerApplication: ✅ ServerVerificationBypass initialized
# I/KillerApplication: ✅ PlayIntegrityBypass initialized
# I/KillerApplication: ✅ HardwareAttestationBypass initialized
```

### Verify Hooks Are Active

```bash
# Check if hooks are working
adb logcat | grep "Redirecting\|Intercepted\|Patching"

# Expected output:
# I/SignatureKiller: Redirecting open() from /data/app/.../base.apk
# I/AdvancedBypass: SSL_connect intercepted
# I/AdvancedBypass: Detected verification response, patching...
```

---

## Troubleshooting

### Issue: Library Not Loading

**Error:** `UnsatisfiedLinkError: dlopen failed`

**Solutions:**
1. Check architecture:
   ```bash
   adb shell "getprop ro.product.cpu.abi"
   # Output should be: arm64-v8a
   ```

2. Verify library file:
   ```bash
   file libSignatureKiller.so
   # Should be: ELF 64-bit LSB shared object, ARM aarch64
   ```

3. Check permissions:
   ```bash
   adb shell "ls -l /data/app/*/lib/arm64/libSignatureKiller.so"
   # Should have read/execute permissions
   ```

---

### Issue: DEX Files Not Recognized

**Error:** `ClassNotFoundException` or `DexOptimizationFailed`

**Solutions:**
1. Verify DEX format:
   ```bash
   file classes8.dex classes9.dex
   # Should show: Dalvik dex file version 039
   ```

2. Check DEX file sizes:
   ```bash
   ls -lh classes*.dex
   # classes8.dex should be ~9MB
   # classes9.dex should be ~2MB
   ```

3. Clear app data and reinstall:
   ```bash
   adb shell pm clear com.your.target.app
   adb uninstall com.your.target.app
   adb install -r YourApp.apk
   ```

---

### Issue: Hooks Not Working

**Error:** Signature checks still failing

**Solutions:**
1. Enable debug logging:
   ```bash
   adb shell "setprop log.tag.SignatureKiller DEBUG"
   adb shell "setprop log.tag.KillerApplication DEBUG"
   adb shell "setprop log.tag.AdvancedBypass DEBUG"
   ```

2. Check if xhook is initialized:
   ```bash
   adb logcat | grep xhook
   # Should see: "Hook registered successfully"
   ```

3. Verify target package name:
   ```bash
   adb shell "dumpsys package com.your.target.app | grep signature"
   ```

4. Try clearing cache:
   ```bash
   adb shell "rm -rf /data/dalvik-cache/*"
   adb reboot
   ```

---

### Issue: LSPosed Not Detecting Module

**Error:** Module not showing in LSPosed

**Solutions:**
1. Check module compatibility:
   - Ensure LSPosed version is 1.8.0+
   - Verify Xposed API level (100+)

2. Add Xposed module declaration to manifest:
   ```xml
   <meta-data
       android:name="xposedmodule"
       android:value="true" />
   <meta-data
       android:name="xposeddescription"
       android:value="Advanced signature bypass system" />
   <meta-data
       android:name="xposedminversion"
       android:value="100" />
   ```

3. Reinstall module:
   ```bash
   adb uninstall bin.mt.signature
   adb install -r SignatureKiller.apk
   # Reboot device
   adb reboot
   ```

---

## Performance Tuning

### Optimize for Speed

Add to config:
```xml
<boolean name="lazy_hook_initialization" value="true" />
<boolean name="cache_signatures" value="true" />
<int name="hook_thread_priority" value="-10" />
```

### Optimize for Stealth

Add to config:
```xml
<boolean name="hide_logs" value="true" />
<boolean name="randomize_delays" value="true" />
<int name="max_log_level" value="3" />  <!-- ERROR only -->
```

---

## Uninstallation

### Complete Removal

```bash
# Uninstall application
adb uninstall bin.mt.signature

# Remove configuration
adb shell "rm -rf /data/data/bin.mt.signature"

# Clear cache
adb shell "rm -rf /data/dalvik-cache/*signature*"

# For Magisk module
# Disable in Magisk Manager and reboot
```

---

## Security Considerations

### Before Installation

⚠️ **WARNING:** This tool modifies system security mechanisms. Use only on:
- Test devices
- Development environments
- Isolated research systems

### Recommended Setup

1. **Use isolated device:** Dedicated test device, not primary phone
2. **Enable logging:** Keep detailed logs for analysis
3. **Backup data:** Full device backup before installation
4. **Network isolation:** Test on isolated network
5. **Regular monitoring:** Check logs for unexpected behavior

---

## Support & Resources

### Getting Help

- Review [README.md](README.md) for overview
- Check [BUILD_INSTRUCTIONS.md](../BUILD_INSTRUCTIONS.md) for building
- See [ADVANCED_FEATURES.md](../ADVANCED_FEATURES.md) for features

### Community Resources

- GitHub Issues for bug reports
- Technical documentation in `/restored_code/ANALYSIS.md`
- Example configurations in `/examples/`

---

**Last Updated:** February 2, 2026  
**Tested On:** Android 5.0 - 13.0 (API 21-33)  
**Compatibility:** ARM64-v8a (primary), ARMv7, x86_64 (untested)
