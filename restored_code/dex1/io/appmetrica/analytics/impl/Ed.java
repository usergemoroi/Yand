/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import io.appmetrica.analytics.impl.Jd;

public final class Ed
extends SafeRunnable {
    public final Jd a;
    public final ModuleEvent b;

    public Ed(Jd jd3, ModuleEvent moduleEvent) {
        this.a = jd3;
        this.b = moduleEvent;
    }

    @Override
    public final void runSafety() {
        Jd.a(this.a).reportEvent(this.b);
    }
}

