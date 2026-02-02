/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.impl.Fj;
import io.appmetrica.analytics.impl.Jj;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

public final class Gj {
    public final String a;
    public final Context b;
    public final CounterConfigurationReporterType c;
    public final Jj d;

    public Gj(String string2, Context context, CounterConfigurationReporterType counterConfigurationReporterType, Jj jj3) {
        this.a = string2;
        this.b = context;
        int n10 = Fj.a[counterConfigurationReporterType.ordinal()];
        this.c = n10 != 1 ? (n10 != 2 ? null : CounterConfigurationReporterType.SELF_DIAGNOSTIC_MANUAL) : CounterConfigurationReporterType.SELF_DIAGNOSTIC_MAIN;
        this.d = jj3;
    }
}

