/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.impl.qb;
import io.appmetrica.analytics.impl.rb;

public final class Sj
implements qb {
    public final Revenue a;

    public Sj(Revenue revenue) {
        this.a = revenue;
    }

    @Override
    public final void a(rb rb2) {
        rb2.reportRevenue(this.a);
    }
}

