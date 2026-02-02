/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Configuration
 */
package io.appmetrica.analytics.impl;

import android.content.res.Configuration;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import io.appmetrica.analytics.impl.K1;

public final class A1
extends SafeRunnable {
    public final Configuration a;
    public final K1 b;

    public A1(K1 k12, Configuration configuration) {
        this.b = k12;
        this.a = configuration;
    }

    @Override
    public final void runSafety() {
        this.b.b.onConfigurationChanged(this.a);
    }
}

