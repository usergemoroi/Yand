/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.location.Location
 */
package io.appmetrica.analytics.impl;

import android.location.Location;
import io.appmetrica.analytics.impl.r1;
import io.appmetrica.analytics.impl.v0;
import io.appmetrica.analytics.impl.w0;

public final class N0
implements Runnable {
    public final Location a;
    public final r1 b;

    public N0(r1 r14, Location location) {
        this.b = r14;
        this.a = location;
    }

    @Override
    public final void run() {
        w0 w04 = this.b.a;
        Location location = this.a;
        w04.getClass();
        v0.c().a(location);
    }
}

