/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import io.appmetrica.analytics.impl.a0;

public final class Z
extends SafeRunnable {
    public final a0 a;
    public final Context b;

    public Z(a0 a04, Context context) {
        this.a = a04;
        this.b = context;
    }

    @Override
    public final void runSafety() {
        a0 a04 = this.a;
        Context context = this.b;
        a04.getClass();
        a04.a(context, AppMetricaLibraryAdapterConfig.newConfigBuilder().build());
    }
}

