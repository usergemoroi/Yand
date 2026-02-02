/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import io.appmetrica.analytics.internal.AppMetricaService;
import org.jetbrains.annotations.NotNull;

public final class U1 {
    @NotNull
    public final Intent a(@NotNull Context context, @NotNull String string2) {
        context = new Intent(context, AppMetricaService.class);
        context.setAction(string2);
        return context;
    }
}

