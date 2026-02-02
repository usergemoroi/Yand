/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.impl.N4;
import io.appmetrica.analytics.impl.Na;
import io.appmetrica.analytics.impl.Xg;
import io.appmetrica.analytics.impl.f;
import io.appmetrica.analytics.impl.o6;

public final class Mc
extends f {
    public Mc(Context context, Xg xg3) {
        super(context, xg3);
    }

    @Override
    public final void b(@NonNull o6 o63, @NonNull N4 n42) {
        boolean bl2 = WrapUtils.getOrDefault(n42.b.b, Boolean.FALSE);
        Object object = Na.F.l();
        object.a(bl2);
        object.a(n42.b.c);
        object = n42.b.n;
        if (object != null) {
            Na.F.b().b((Boolean)object);
        }
        this.b.a(o63, n42);
    }
}

