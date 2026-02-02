/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import io.appmetrica.analytics.impl.K1;

public final class H1
extends SafeRunnable {
    public final int a;
    public final Bundle b;
    public final K1 c;

    public H1(K1 k12, int n10, Bundle bundle) {
        this.c = k12;
        this.a = n10;
        this.b = bundle;
    }

    @Override
    public final void runSafety() {
        this.c.b.reportData(this.a, this.b);
    }
}

