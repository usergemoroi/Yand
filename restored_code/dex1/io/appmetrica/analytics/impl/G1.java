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

public final class G1
extends SafeRunnable {
    public final Intent a;
    public final K1 b;

    public G1(K1 k12, Intent intent) {
        this.b = k12;
        this.a = intent;
    }

    @Override
    public final void runSafety() {
        this.b.b.b(this.a);
    }
}

