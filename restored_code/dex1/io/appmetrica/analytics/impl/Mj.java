/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.qb;
import io.appmetrica.analytics.impl.rb;

public final class Mj
implements qb {
    public final String a;
    public final String b;
    public final Throwable c;

    public Mj(String string2, String string3, Throwable throwable) {
        this.a = string2;
        this.b = string3;
        this.c = throwable;
    }

    @Override
    public final void a(rb rb2) {
        rb2.reportError(this.a, this.b, this.c);
    }
}

