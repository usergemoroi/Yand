/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.I0;
import io.appmetrica.analytics.plugins.AppMetricaPlugins;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class G0
implements AppMetricaPlugins {
    public final I0 a;

    public G0() {
        this(new I0());
    }

    public G0(@NotNull I0 i04) {
        this.a = i04;
    }

    @Override
    public final void reportError(@NotNull PluginErrorDetails pluginErrorDetails, @Nullable String string2) {
        this.a.a(pluginErrorDetails, string2);
    }

    @Override
    public final void reportError(@NotNull String string2, @Nullable String string3, @Nullable PluginErrorDetails pluginErrorDetails) {
        this.a.a(string2, string3, pluginErrorDetails);
    }

    @Override
    public final void reportUnhandledException(@NotNull PluginErrorDetails pluginErrorDetails) {
        this.a.a(pluginErrorDetails);
    }
}

