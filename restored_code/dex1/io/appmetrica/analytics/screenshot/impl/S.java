/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.screenshot.impl.P;
import io.appmetrica.analytics.screenshot.impl.k;
import io.appmetrica.analytics.screenshot.impl.l;
import java.util.List;

public final class S {
    public final List a;

    public S(List list) {
        this.a = list;
    }

    public final void a(k k11) {
        for (P p14 : this.a) {
            l l10;
            l l11 = l10 = null;
            if (k11 != null) {
                k k12 = k11.a ? k11 : null;
                l11 = l10;
                if (k12 != null) {
                    l11 = k12.b;
                }
            }
            p14.a(l11);
        }
    }
}

