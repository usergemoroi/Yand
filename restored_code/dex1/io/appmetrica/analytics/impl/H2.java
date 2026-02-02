/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import io.appmetrica.analytics.impl.I2;

public final class H2
implements Runnable {
    public final Context a;
    public final Intent b;
    public final I2 c;

    public H2(I2 i23, Context context, Intent intent) {
        this.c = i23;
        this.a = context;
        this.b = intent;
    }

    @Override
    public final void run() {
        this.c.a.consume(this.a, this.b);
    }
}

