/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.K5;
import io.appmetrica.analytics.impl.ve;

public final class J5
implements Runnable {
    public final ve a;
    public final K5 b;

    public J5(K5 k54, ve ve2) {
        this.b = k54;
        this.a = ve2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void run() {
        K5 k54 = this.b;
        synchronized (k54) {
            Throwable throwable2;
            block5: {
                block4: {
                    Object object;
                    block3: {
                        try {
                            K5 k55 = this.b;
                            object = k55.a;
                            if (object != null) break block3;
                            k55.b.add(this.a);
                            break block4;
                        }
                        catch (Throwable throwable2) {
                            break block5;
                        }
                    }
                    this.a.consume(object);
                }
                return;
            }
            throw throwable2;
        }
    }
}

