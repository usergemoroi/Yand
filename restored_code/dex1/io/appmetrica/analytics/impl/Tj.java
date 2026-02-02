/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.impl.qb;
import io.appmetrica.analytics.impl.rb;

public final class Tj
implements qb {
    public final ECommerceEvent a;

    public Tj(ECommerceEvent eCommerceEvent) {
        this.a = eCommerceEvent;
    }

    @Override
    public final void a(rb rb2) {
        rb2.reportECommerce(this.a);
    }
}

