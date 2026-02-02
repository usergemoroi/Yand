/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.Vd;
import io.appmetrica.analytics.impl.Z2;
import io.appmetrica.analytics.impl.jo;
import io.appmetrica.analytics.impl.lo;
import io.appmetrica.analytics.impl.yo;
import java.util.HashMap;

public abstract class R4
extends Vd {
    public final Object f;

    public R4(int n10, String string2, Object object, yo yo3, Z2 z24) {
        super(n10, string2, yo3, z24);
        this.f = object;
    }

    @Override
    public final void a(@NonNull jo object) {
        if (this.f()) {
            Z2 z24 = this.d;
            int n10 = this.b;
            String string2 = this.a;
            if ((object = z24.a((jo)object, (lo)((HashMap)((jo)object).a.get(n10)).get(string2), this)) != null) {
                this.a((lo)object);
            }
        }
    }

    public abstract void a(@NonNull lo var1);

    @NonNull
    public final Object g() {
        return this.f;
    }
}

