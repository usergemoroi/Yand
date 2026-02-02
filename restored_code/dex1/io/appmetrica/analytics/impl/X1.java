/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.Y7;
import io.appmetrica.analytics.impl.Z1;
import io.appmetrica.analytics.impl.ve;

public final class X1
implements Runnable {
    public final ve a;
    public final Y7 b;

    public X1(Z1 z13, Y7 y74) {
        this.a = z13;
        this.b = y74;
    }

    @Override
    public final void run() {
        this.a.consume(this.b);
    }
}

