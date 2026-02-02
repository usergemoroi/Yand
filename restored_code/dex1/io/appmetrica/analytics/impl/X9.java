/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.impl.ya;
import java.util.concurrent.locks.ReentrantLock;

public final class X9 {
    public final ReentrantLock a;
    public final ya b;

    public X9(Context context, String string2) {
        this(new ReentrantLock(), new ya(context, string2));
    }

    public X9(ReentrantLock reentrantLock, ya ya2) {
        this.a = reentrantLock;
        this.b = ya2;
    }

    public final void a() {
        this.a.lock();
        this.b.a();
    }

    public final void b() {
        this.b.b();
        this.a.unlock();
    }

    public final void c() {
        ya ya2 = this.b;
        synchronized (ya2) {
            ya2.b();
            ya2.a.delete();
            // MONITOREXIT @DISABLED, blocks:[0, 1] lbl7 : MonitorExitStatement: MONITOREXIT : var2_1
            this.a.unlock();
            return;
        }
    }
}

