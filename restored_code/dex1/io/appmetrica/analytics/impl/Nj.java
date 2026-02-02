/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.qb;
import io.appmetrica.analytics.impl.rb;

public final class Nj
implements qb {
    public final Throwable a;

    public Nj(Throwable throwable) {
        this.a = throwable;
    }

    @Override
    public final void a(rb rb2) {
        rb2.reportUnhandledException(this.a);
    }
}

