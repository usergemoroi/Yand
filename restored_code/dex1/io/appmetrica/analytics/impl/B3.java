/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Base64
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.impl;

import android.util.Base64;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.Gh;
import io.appmetrica.analytics.impl.e9;
import io.appmetrica.analytics.impl.f9;
import io.appmetrica.analytics.impl.g9;
import io.appmetrica.analytics.impl.l9;
import io.appmetrica.analytics.impl.zo;

public final class B3
implements zo {
    public final f9 a;

    public B3() {
        this(new f9());
    }

    public B3(f9 f94) {
        this.a = f94;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    @NonNull
    public final byte[] a(@NonNull l9 object, @NonNull Gh object2) {
        byte[] byArray = new byte[]{};
        String string2 = object.b;
        byte[] byArray2 = byArray;
        if (string2 != null) {
            try {
                byArray2 = Base64.decode((String)string2, (int)0);
            }
            catch (Throwable throwable) {
                byArray2 = byArray;
            }
        }
        f9 f94 = this.a;
        g9 g94 = object.o;
        return ((e9)f94.a.a((Object)g94)).a(byArray2);
    }
}

