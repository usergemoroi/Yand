/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.qb;
import io.appmetrica.analytics.impl.rb;

public final class Lj
implements qb {
    public final String a;
    public final Throwable b;

    public Lj(String string2, Throwable throwable) {
        this.a = string2;
        this.b = throwable;
    }

    @Override
    public final void a(rb rb2) {
        rb2.reportError(this.a, this.b);
    }
}

