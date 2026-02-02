/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.VisibleForTesting
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import io.appmetrica.analytics.impl.Gh;
import io.appmetrica.analytics.impl.e9;
import io.appmetrica.analytics.impl.f9;
import io.appmetrica.analytics.impl.g9;
import io.appmetrica.analytics.impl.l9;
import io.appmetrica.analytics.impl.zo;

public final class Vn
implements zo {
    public final f9 a;

    public Vn() {
        this(new f9());
    }

    public Vn(f9 f94) {
        this.a = f94;
    }

    @NonNull
    @VisibleForTesting
    public final f9 a() {
        return this.a;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    @NonNull
    public final byte[] a(@NonNull l9 object, @NonNull Gh object2) {
        void var1_5;
        byte[] byArray = new byte[]{};
        try {
            byte[] byArray2 = Base64Utils.decompressBase64GzipAsBytes(object.b);
            byArray = byArray2;
        }
        catch (Throwable throwable) {}
        f9 f94 = this.a;
        g9 g94 = object.o;
        byte[] byArray3 = byArray = ((e9)f94.a.a((Object)g94)).a(byArray);
        if (byArray == null) {
            byte[] byArray4 = new byte[]{};
        }
        return var1_5;
    }
}

