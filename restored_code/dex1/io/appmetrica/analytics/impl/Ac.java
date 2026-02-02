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
import io.appmetrica.analytics.impl.S4;
import io.appmetrica.analytics.impl.T4;
import io.appmetrica.analytics.impl.V4;
import io.appmetrica.analytics.impl.W4;
import io.appmetrica.analytics.impl.m8;
import io.appmetrica.analytics.impl.o4;
import org.jetbrains.annotations.NotNull;

public final class Ac
implements E4 {
    @NotNull
    public final S4 b(@NotNull Context context, @NotNull B5 b54, @NotNull o4 object, @NotNull N4 n42) {
        T4 t44 = new T4(((o4)object).b);
        object = new W4();
        synchronized (b54) {
            object = (V4)b54.a(t44, n42, (m8)object, b54.b);
            return new S4(context, (V4)object, n42);
        }
    }
}

