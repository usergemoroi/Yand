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

public final class K
implements Provider {
    public final Context a;
    public final M b;

    public K(M m12, Context context) {
        this.b = m12;
        this.a = context;
    }

    public final Object get() {
        return this.b.a.a(this.a);
    }
}

