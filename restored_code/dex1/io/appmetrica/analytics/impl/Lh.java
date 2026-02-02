/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.L9;
import io.appmetrica.analytics.impl.Oi;
import io.appmetrica.analytics.impl.Pi;
import io.appmetrica.analytics.impl.Zf;
import io.appmetrica.analytics.impl.nh;
import io.appmetrica.analytics.impl.o6;
import io.appmetrica.analytics.impl.v5;

public final class Lh
extends nh {
    public final Pi b;

    public Lh(v5 v54) {
        super(v54);
        this.b = new Pi((Zf)new L9(v54), v54);
    }

    @Override
    public final boolean a(@NonNull o6 o63) {
        return this.b.a(o63, new Oi());
    }
}

