/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 */
package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import io.appmetrica.analytics.impl.K1;

public final class C1
extends SafeRunnable {
    public final Intent a;
    public final int b;
    public final K1 c;

    public C1(K1 k12, Intent intent, int n10) {
        this.c = k12;
        this.a = intent;
        this.b = n10;
    }

    @Override
    public final void runSafety() {
        this.c.b.a(this.a, this.b);
    }
}

