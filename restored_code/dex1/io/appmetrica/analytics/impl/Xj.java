/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.qb;
import io.appmetrica.analytics.impl.rb;
import io.appmetrica.analytics.plugins.PluginErrorDetails;

public final class Xj
implements qb {
    public final PluginErrorDetails a;

    public Xj(PluginErrorDetails pluginErrorDetails) {
        this.a = pluginErrorDetails;
    }

    @Override
    public final void a(rb rb2) {
        rb2.getPluginExtension().reportUnhandledException(this.a);
    }
}

