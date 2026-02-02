/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.Y7;
import io.appmetrica.analytics.impl.ve;

public final class Z1
implements ve {
    public final String a;

    public Z1(String string2) {
        this.a = string2;
    }

    @Override
    public final void consume(Object object) {
        ((Y7)object).a(this.a, true);
    }
}

