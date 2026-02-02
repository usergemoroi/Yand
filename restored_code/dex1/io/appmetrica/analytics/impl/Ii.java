/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.impl.Ki;
import io.appmetrica.analytics.impl.v0;
import io.appmetrica.analytics.impl.w0;

public final class Ii
implements Runnable {
    public final Context a;
    public final Ki b;

    public Ii(Ki ki3, Context context) {
        this.b = ki3;
        this.a = context;
    }

    @Override
    public final void run() {
        w0 w04 = this.b.b;
        Context context = this.a;
        w04.getClass();
        v0.a(context);
    }
}

