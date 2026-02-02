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
import io.appmetrica.analytics.impl.N4;
import io.appmetrica.analytics.impl.Wg;
import io.appmetrica.analytics.impl.Xg;
import io.appmetrica.analytics.impl.Yg;
import io.appmetrica.analytics.impl.m8;
import io.appmetrica.analytics.impl.o4;
import io.appmetrica.analytics.impl.o5;
import io.appmetrica.analytics.impl.w5;
import org.jetbrains.annotations.NotNull;

public final class Yh
implements E4 {
    public final w5 a;

    public Yh(@NotNull w5 w54) {
        this.a = w54;
    }

    @NotNull
    public final Wg b(@NotNull Context context, @NotNull B5 b54, @NotNull o4 object, @NotNull N4 n42) {
        o5 o54 = new o5(((o4)object).b, ((o4)object).a);
        object = new Yg(this.a);
        synchronized (b54) {
            object = (Xg)b54.a(o54, n42, (m8)object, b54.a);
            return new Wg(context, (Xg)object);
        }
    }
}

