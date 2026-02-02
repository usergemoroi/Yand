/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.impl.r1;
import io.appmetrica.analytics.impl.v0;

public final class Y0
implements Runnable {
    public final DeferredDeeplinkListener a;
    public final r1 b;

    public Y0(r1 r14, DeferredDeeplinkListener deferredDeeplinkListener) {
        this.b = r14;
        this.a = deferredDeeplinkListener;
    }

    @Override
    public final void run() {
        this.b.a.getClass();
        v0 v04 = v0.e;
        DeferredDeeplinkListener deferredDeeplinkListener = this.a;
        v04.f().a(deferredDeeplinkListener);
    }
}

