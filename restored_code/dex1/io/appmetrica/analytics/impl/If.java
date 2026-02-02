/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.VisibleForTesting
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.impl.Na;
import io.appmetrica.analytics.impl.oj;
import io.appmetrica.analytics.impl.tf;
import org.jetbrains.annotations.NotNull;

public final class If
implements oj {
    public final tf a;

    public If() {
        this(Na.j().x());
    }

    @VisibleForTesting
    public If(@NotNull tf tf2) {
        this.a = tf2;
    }

    @Override
    public final boolean a() {
        return this.a.i();
    }

    @Override
    public final void b() {
        this.a.h().b();
    }
}

