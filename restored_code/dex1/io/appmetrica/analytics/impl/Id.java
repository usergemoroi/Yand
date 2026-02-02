/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import io.appmetrica.analytics.impl.A4;
import io.appmetrica.analytics.impl.v0;
import io.appmetrica.analytics.impl.w0;

public final class Id
extends SafeRunnable {
    public final String a;

    public Id(String string2) {
        this.a = string2;
    }

    @Override
    public final void runSafety() {
        w0 w04 = A4.l().p;
        String string2 = this.a;
        w04.getClass();
        v0.c().a(string2);
    }
}

