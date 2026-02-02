/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.impl.Di;
import io.appmetrica.analytics.impl.Xc;
import io.appmetrica.analytics.impl.ib;
import io.appmetrica.analytics.impl.k0;
import io.appmetrica.analytics.impl.rb;
import io.appmetrica.analytics.impl.sb;
import io.appmetrica.analytics.impl.ub;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

public final class Gi
implements sb {
    @Override
    @NonNull
    public final ib a(@NonNull AppMetricaConfig appMetricaConfig, @NonNull PublicLogger publicLogger, @NonNull k0 k02) {
        return new Xc();
    }

    @Override
    @NonNull
    public final sb a() {
        return this;
    }

    @Override
    @NonNull
    public final ub a(@NonNull AppMetricaConfig appMetricaConfig) {
        return new Di();
    }

    @Override
    public final void a(@NonNull ReporterConfig reporterConfig) {
    }

    @Override
    @NonNull
    public final ib b(@NonNull AppMetricaConfig appMetricaConfig, @NonNull PublicLogger publicLogger, @NonNull k0 k02) {
        return new Xc();
    }

    @Override
    @NonNull
    public final rb b(@NonNull ReporterConfig reporterConfig) {
        return new Di();
    }
}

