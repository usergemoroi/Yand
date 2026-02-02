/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.Ri;

public final class Qi
implements Runnable {
    public final Ri a;

    public Qi(Ri ri2) {
        this.a = ri2;
    }

    @Override
    public final void run() {
        this.a.c();
    }
}

