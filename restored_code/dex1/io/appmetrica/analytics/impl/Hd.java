/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import io.appmetrica.analytics.impl.Jd;

public final class Hd
extends SafeRunnable {
    public final Jd a;
    public final String b;
    public final byte[] c;

    public Hd(Jd jd3, String string2, byte[] byArray) {
        this.a = jd3;
        this.b = string2;
        this.c = byArray;
    }

    @Override
    public final void runSafety() {
        Jd.a(this.a).setSessionExtra(this.b, this.c);
    }
}

