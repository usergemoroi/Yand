/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.impl.r1;

public final class W0
implements Runnable {
    public final ECommerceEvent a;
    public final r1 b;

    public W0(r1 r14, ECommerceEvent eCommerceEvent) {
        this.b = r14;
        this.a = eCommerceEvent;
    }

    @Override
    public final void run() {
        r1.a(this.b).reportECommerce(this.a);
    }
}

