/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.qb;
import io.appmetrica.analytics.impl.rb;

public final class Uj
implements qb {
    public final boolean a;

    public Uj(boolean bl2) {
        this.a = bl2;
    }

    @Override
    public final void a(rb rb2) {
        rb2.setDataSendingEnabled(this.a);
    }
}

