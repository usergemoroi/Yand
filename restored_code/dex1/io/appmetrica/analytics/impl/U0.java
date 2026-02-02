/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.impl.r1;

public final class U0
implements Runnable {
    public final Revenue a;
    public final r1 b;

    public U0(r1 r14, Revenue revenue) {
        this.b = r14;
        this.a = revenue;
    }

    @Override
    public final void run() {
        r1.a(this.b).reportRevenue(this.a);
    }
}

