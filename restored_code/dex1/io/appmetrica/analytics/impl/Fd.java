/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import io.appmetrica.analytics.impl.Jd;
import io.appmetrica.analytics.impl.fa;

public final class Fd
extends SafeRunnable {
    public final Jd a;
    public final int b;
    public final String c;

    public Fd(Jd jd3, int n10, String string2) {
        this.a = jd3;
        this.b = n10;
        this.c = string2;
    }

    @Override
    public final void runSafety() {
        Jd.a(this.a).a(new fa(this.b, this.c));
    }
}

