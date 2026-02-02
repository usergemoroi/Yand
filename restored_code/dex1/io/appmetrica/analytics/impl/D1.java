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

public final class D1
extends SafeRunnable {
    public final Intent a;
    public final int b;
    public final int c;
    public final K1 d;

    public D1(K1 k12, Intent intent, int n10, int n13) {
        this.d = k12;
        this.a = intent;
        this.b = n10;
        this.c = n13;
    }

    @Override
    public final void runSafety() {
        this.d.b.a(this.a, this.b, this.c);
    }
}

