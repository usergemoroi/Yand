/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.r1;
import io.appmetrica.analytics.impl.v0;
import io.appmetrica.analytics.impl.w0;

public final class O0
implements Runnable {
    public final boolean a;
    public final r1 b;

    public O0(r1 r14, boolean bl2) {
        this.b = r14;
        this.a = bl2;
    }

    @Override
    public final void run() {
        w0 w04 = this.b.a;
        boolean bl2 = this.a;
        w04.getClass();
        v0.c().a(bl2);
    }
}

