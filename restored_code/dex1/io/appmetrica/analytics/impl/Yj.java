/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.qb;
import io.appmetrica.analytics.impl.rb;
import io.appmetrica.analytics.plugins.PluginErrorDetails;

public final class Yj
implements qb {
    public final PluginErrorDetails a;
    public final String b;

    public Yj(PluginErrorDetails pluginErrorDetails, String string2) {
        this.a = pluginErrorDetails;
        this.b = string2;
    }

    @Override
    public final void a(rb rb2) {
        rb2.getPluginExtension().reportError(this.a, this.b);
    }
}

