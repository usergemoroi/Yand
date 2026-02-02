/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.qb;
import io.appmetrica.analytics.impl.rb;
import io.appmetrica.analytics.plugins.PluginErrorDetails;

public final class Zj
implements qb {
    public final String a;
    public final String b;
    public final PluginErrorDetails c;

    public Zj(String string2, String string3, PluginErrorDetails pluginErrorDetails) {
        this.a = string2;
        this.b = string3;
        this.c = pluginErrorDetails;
    }

    @Override
    public final void a(rb rb2) {
        rb2.getPluginExtension().reportError(this.a, this.b, this.c);
    }
}

