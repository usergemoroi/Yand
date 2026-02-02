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
import io.appmetrica.analytics.impl.L;
import io.appmetrica.analytics.impl.M;
import io.appmetrica.analytics.impl.T;
import io.appmetrica.analytics.impl.cj;
import kotlin.jvm.functions.a;
import kotlin.jvm.internal.a0;

public final class S
extends a0
implements a {
    public final T a;
    public final cj b;

    public S(T t13, cj cj3) {
        this.a = t13;
        this.b = cj3;
        super(0);
    }

    public final Object invoke() {
        T t13 = this.a;
        M m12 = t13.h;
        t13 = t13.a;
        cj cj3 = this.b;
        m12.getClass();
        return M.a(new L(m12, (Context)t13, cj3));
    }
}

