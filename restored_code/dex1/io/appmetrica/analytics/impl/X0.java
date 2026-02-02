/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.impl.r1;
import io.appmetrica.analytics.impl.v0;

public final class X0
implements Runnable {
    public final DeferredDeeplinkParametersListener a;
    public final r1 b;

    public X0(r1 r14, DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        this.b = r14;
        this.a = deferredDeeplinkParametersListener;
    }

    @Override
    public final void run() {
        this.b.a.getClass();
        v0 v04 = v0.e;
        DeferredDeeplinkParametersListener deferredDeeplinkParametersListener = this.a;
        v04.f().a(deferredDeeplinkParametersListener);
    }
}

