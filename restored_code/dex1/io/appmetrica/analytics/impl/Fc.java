/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.impl.co;
import io.appmetrica.analytics.impl.tb;
import io.appmetrica.analytics.impl.ub;

public final class Fc
extends co {
    public final AppMetricaConfig b;

    public Fc(@NonNull tb tb3, @NonNull AppMetricaConfig appMetricaConfig) {
        String string2 = appMetricaConfig.apiKey;
        super(tb3);
        this.b = appMetricaConfig;
    }

    @NonNull
    public final ub a() {
        return this.a.a().a(this.b);
    }
}

