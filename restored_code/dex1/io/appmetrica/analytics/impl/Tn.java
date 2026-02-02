/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.impl.Th;
import io.appmetrica.analytics.impl.il;
import io.appmetrica.analytics.impl.o0;
import io.appmetrica.analytics.internal.IAppMetricaService;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class Tn
extends Th {
    public final int e;
    public final Bundle f;

    public Tn(@NotNull o0 o02, @Nullable il il3, int n10, @NotNull Bundle bundle) {
        super(o02, il3);
        this.e = n10;
        this.f = bundle;
    }

    @Override
    public final void a(@NotNull IAppMetricaService iAppMetricaService) {
        iAppMetricaService.reportData(this.e, this.f);
    }
}

