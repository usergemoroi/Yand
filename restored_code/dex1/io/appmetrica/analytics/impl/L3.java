/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageInfo
 *  android.content.pm.Signature
 *  android.content.pm.SigningInfo
 *  androidx.core.content.pm.a
 *  com.adjust.sdk.e1
 *  com.google.android.gms.common.c
 *  com.google.android.gms.common.d
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import androidx.core.content.pm.a;
import com.adjust.sdk.e1;
import com.google.android.gms.common.c;
import com.google.android.gms.common.d;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.impl.qf;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class L3 {
    public final Context a;
    public final qf b;
    public final String c;
    public final SafePackageManager d;

    public L3(Context context, qf qf3, String string2, SafePackageManager safePackageManager) {
        this.a = context;
        this.b = qf3;
        this.c = string2;
        this.d = safePackageManager;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final List a() {
        void var3_17;
        List<String> list;
        List<String> list2 = list = this.b.g();
        if (list.isEmpty()) {
            ArrayList<String> arrayList;
            block13: {
                void var3_13;
                arrayList = new ArrayList<String>();
                if (AndroidUtils.isApiAchieved(28)) {
                    SigningInfo signingInfo = androidx.core.content.pm.a.a((PackageInfo)this.d.getPackageInfo(this.a, this.c, 0x8000000));
                    if (com.google.android.gms.common.c.a((SigningInfo)signingInfo)) {
                        Signature[] signatureArray = e1.a((SigningInfo)signingInfo);
                    } else {
                        Signature[] signatureArray = com.google.android.gms.common.d.a((SigningInfo)signingInfo);
                    }
                } else {
                    Signature[] signatureArray = this.d.getPackageInfo((Context)this.a, (String)this.c, (int)64).signatures;
                }
                if (var3_13 == null) break block13;
                for (void var4_3 : var3_13) {
                    void var4_7;
                    try {
                        String string2 = StringUtils.formatSha1(MessageDigest.getInstance("SHA1").digest(var4_3.toByteArray()));
                    }
                    catch (Throwable throwable) {
                        Object var4_6 = null;
                    }
                    if (var4_7 == null) continue;
                    try {
                        arrayList.add((String)var4_7);
                    }
                    catch (Throwable throwable) {}
                    continue;
                    break;
                }
            }
            Collections.sort(arrayList);
            ArrayList<String> arrayList2 = arrayList;
            if (!arrayList.isEmpty()) {
                this.b.a(arrayList).b();
                ArrayList<String> arrayList3 = arrayList;
            }
        }
        return var3_17;
    }
}

