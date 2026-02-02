/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.r1;

public final class T0
implements Runnable {
    public final r1 a;

    public T0(r1 r14) {
        this.a = r14;
    }

    @Override
    public final void run() {
        r1.a(this.a).sendEventsBuffer();
    }
}

