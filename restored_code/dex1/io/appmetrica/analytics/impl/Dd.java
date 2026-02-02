/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import io.appmetrica.analytics.impl.Jd;

public final class Dd
extends SafeRunnable {
    public final Jd a;
    public final AdRevenue b;
    public final boolean c;

    public Dd(Jd jd3, AdRevenue adRevenue, boolean bl2) {
        this.a = jd3;
        this.b = adRevenue;
        this.c = bl2;
    }

    @Override
    public final void runSafety() {
        Jd.a(this.a).reportAdRevenue(this.b, this.c);
    }
}

