/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import io.appmetrica.analytics.impl.Jd;

public final class Gd
extends SafeRunnable {
    public final Jd a;
    public final boolean b;

    public Gd(Jd jd3, boolean bl2) {
        this.a = jd3;
        this.b = bl2;
    }

    @Override
    public final void runSafety() {
        Jd.a(this.a).b(this.b);
    }
}

