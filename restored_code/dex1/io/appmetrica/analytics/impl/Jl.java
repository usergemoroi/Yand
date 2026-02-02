/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.impl.a3;
import io.appmetrica.analytics.impl.om;
import javax.net.ssl.SSLSocketFactory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class Jl
implements a3 {
    public final Context a;

    public Jl(@NotNull Context context) {
        this.a = context;
    }

    @Override
    public final void a(@NotNull om om3) {
    }

    @NotNull
    public final Context b() {
        return this.a;
    }

    @Override
    @Nullable
    public final SSLSocketFactory getSslSocketFactory() {
        return null;
    }
}

