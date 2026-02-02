/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import io.appmetrica.analytics.impl.K1;

public final class B1
extends SafeRunnable {
    public final K1 a;

    public B1(K1 k12) {
        this.a = k12;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void runSafety() {
        K1 k12 = this.a;
        synchronized (k12) {
            try {
                K1 k14 = this.a;
                if (!k14.c) {
                    return;
                }
                // MONITOREXIT @DISABLED, blocks:[0, 2] lbl8 : MonitorExitStatement: MONITOREXIT : var1_1
                k14.b.onCreate();
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

