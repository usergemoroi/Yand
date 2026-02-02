/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Provider;
import io.appmetrica.analytics.impl.M;
import io.appmetrica.analytics.impl.cj;

public final class L
implements Provider {
    public final Context a;
    public final cj b;
    public final M c;

    public L(M m12, Context context, cj cj3) {
        this.c = m12;
        this.a = context;
        this.b = cj3;
    }

    public final Object get() {
        return this.c.a.a(this.a, this.b);
    }
}

