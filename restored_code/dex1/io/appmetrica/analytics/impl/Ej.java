/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.impl.B5;
import io.appmetrica.analytics.impl.Dj;
import io.appmetrica.analytics.impl.E4;
import io.appmetrica.analytics.impl.N4;
import io.appmetrica.analytics.impl.Nc;
import io.appmetrica.analytics.impl.Xg;
import io.appmetrica.analytics.impl.o4;
import io.appmetrica.analytics.impl.o5;
import org.jetbrains.annotations.NotNull;

public final class Ej
implements E4 {
    @NotNull
    public final Dj b(@NotNull Context object, @NotNull B5 b54, @NotNull o4 o44, @NotNull N4 n42) {
        object = new Nc(o44.b, o44.a);
        synchronized (b54) {
            object = (Xg)b54.a.get(((o5)object).toString());
            return new Dj((Xg)object);
        }
    }
}

