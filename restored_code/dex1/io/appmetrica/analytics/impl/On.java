/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.pk;
import io.appmetrica.analytics.impl.qk;

public abstract class On {
    public static long a() {
        qk qk3 = pk.a;
        synchronized (qk3) {
            long l10 = qk3.a;
            return l10;
        }
    }
}

