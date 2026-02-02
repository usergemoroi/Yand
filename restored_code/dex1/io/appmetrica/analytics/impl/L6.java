/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.impl.Si;
import io.appmetrica.analytics.impl.Vf;
import io.appmetrica.analytics.impl.b9;
import io.appmetrica.analytics.impl.bi;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

public final class L6 {
    public final Si a;
    public final bi b;

    public L6(Vf vf3, b9 b94, Si si3, AppMetricaConfig appMetricaConfig) {
        this.a = si3;
        this.b = new bi(vf3, new CounterConfiguration(appMetricaConfig, CounterConfigurationReporterType.CRASH), b94, appMetricaConfig.userProfileID);
    }

    public final bi a() {
        return this.b;
    }
}

