/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AnrListener;
import io.appmetrica.analytics.impl.dc;
import io.appmetrica.analytics.impl.e;
import io.appmetrica.analytics.impl.f0;
import io.appmetrica.analytics.impl.kp;

public final class Ic {
    public int a = 5;
    public final e b;

    public Ic(f0 f04) {
        this.b = new e(new dc(f04));
    }

    public static final void b(AnrListener anrListener) {
        anrListener.onAppNotResponding();
    }

    public final void a(AnrListener object) {
        e e11 = this.b;
        object = new kp((AnrListener)object);
        e11.a.add(object);
    }
}

