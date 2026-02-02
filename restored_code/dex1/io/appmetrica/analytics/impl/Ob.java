/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.SystemClock
 */
package io.appmetrica.analytics.impl;

import android.os.Handler;
import android.os.SystemClock;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.impl.Pb;
import io.appmetrica.analytics.impl.Y2;

public final class Ob {
    public final Handler a;
    public final Y2 b;
    public final Pb c;

    public Ob(Handler handler, Y2 y23) {
        this.a = handler;
        this.b = y23;
        this.c = new Pb(handler, y23);
    }

    public static void a(Handler handler, Y2 y23, Runnable runnable) {
        handler.removeCallbacks(runnable, (Object)y23.b.b.getApiKey());
        handler.postAtTime(runnable, (Object)y23.b.b.getApiKey(), SystemClock.uptimeMillis() + (long)(WrapUtils.getOrDefault(y23.b.b.getSessionTimeout(), 10) * 500));
    }
}

