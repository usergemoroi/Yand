/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.r1;
import io.appmetrica.analytics.impl.v0;
import io.appmetrica.analytics.impl.w0;

public final class R0
implements Runnable {
    public final String a;
    public final r1 b;

    public R0(r1 r14, String string2) {
        this.b = r14;
        this.a = string2;
    }

    @Override
    public final void run() {
        w0 w04 = this.b.a;
        String string2 = this.a;
        w04.getClass();
        v0.c().setUserProfileID(string2);
    }
}

