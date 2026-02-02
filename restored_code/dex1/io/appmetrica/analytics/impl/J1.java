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

public final class J1
extends SafeRunnable {
    public final Bundle a;
    public final K1 b;

    public J1(K1 k12, Bundle bundle) {
        this.b = k12;
        this.a = bundle;
    }

    @Override
    public final void runSafety() {
        this.b.b.pauseUserSession(this.a);
    }
}

