/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.impl.qb;
import io.appmetrica.analytics.impl.rb;

public final class Wj
implements qb {
    public final AdRevenue a;

    public Wj(AdRevenue adRevenue) {
        this.a = adRevenue;
    }

    @Override
    public final void a(rb rb2) {
        rb2.reportAdRevenue(this.a);
    }
}

