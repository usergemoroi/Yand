/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.impl.r1;

public final class V0
implements Runnable {
    public final AdRevenue a;
    public final r1 b;

    public V0(r1 r14, AdRevenue adRevenue) {
        this.b = r14;
        this.a = adRevenue;
    }

    @Override
    public final void run() {
        r1.a(this.b).reportAdRevenue(this.a);
    }
}

