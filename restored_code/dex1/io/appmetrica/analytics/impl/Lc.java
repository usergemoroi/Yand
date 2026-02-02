/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.impl.B5;
import io.appmetrica.analytics.impl.E4;
import io.appmetrica.analytics.impl.Mc;
import io.appmetrica.analytics.impl.N4;
import io.appmetrica.analytics.impl.Nc;
import io.appmetrica.analytics.impl.Qc;
import io.appmetrica.analytics.impl.Xg;
import io.appmetrica.analytics.impl.Yg;
import io.appmetrica.analytics.impl.m8;
import io.appmetrica.analytics.impl.o4;
import org.jetbrains.annotations.NotNull;

public final class Lc
implements E4 {
    @NotNull
    public final Mc b(@NotNull Context context, @NotNull B5 b54, @NotNull o4 object, @NotNull N4 n42) {
        Nc nc3 = new Nc(((o4)object).b, ((o4)object).a);
        object = new Yg(new Qc());
        synchronized (b54) {
            object = (Xg)b54.a(nc3, n42, (m8)object, b54.a);
            return new Mc(context, (Xg)object);
        }
    }
}

