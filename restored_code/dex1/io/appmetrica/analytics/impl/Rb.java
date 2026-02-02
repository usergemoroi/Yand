/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import io.appmetrica.analytics.impl.Sb;
import java.util.HashMap;

public final class Rb
extends InterruptionSafeThread {
    public final Sb a;

    public Rb(Sb sb3, String string2) {
        this.a = sb3;
        super(string2);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void run() {
        HashMap hashMap = this.a.a;
        synchronized (hashMap) {
            Sb.a(this.a);
            this.a.e = true;
            this.a.a.notifyAll();
        }
        while (true) {
            HashMap hashMap2;
            if (!this.isRunning()) {
                return;
            }
            synchronized (this) {
                int n10 = this.a.b.size();
                if (n10 == 0) {
                    try {
                        this.wait();
                    }
                    catch (InterruptedException interruptedException) {}
                }
                hashMap2 = new HashMap(this.a.b);
                this.a.b.clear();
                // MONITOREXIT @DISABLED, blocks:[1, 6, 9] lbl20 : MonitorExitStatement: MONITOREXIT : this
                if (hashMap2.size() <= 0) continue;
            }
            Sb.a(this.a, hashMap2);
            hashMap2.clear();
        }
        {
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

