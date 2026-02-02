/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  kotlin.jvm.functions.a
 *  kotlin.jvm.internal.a0
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.impl.K;
import io.appmetrica.analytics.impl.M;
import io.appmetrica.analytics.impl.T;
import kotlin.jvm.functions.a;
import kotlin.jvm.internal.a0;

public final class P
extends a0
implements a {
    public final T a;

    public P(T t13) {
        this.a = t13;
        super(0);
    }

    public final Object invoke() {
        T t13 = this.a;
        M m12 = t13.f;
        t13 = t13.a;
        m12.getClass();
        return M.a(new K(m12, (Context)t13));
    }
}

