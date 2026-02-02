/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.ArrayList;

public final class Mo {
    public final ArrayList a = new ArrayList();
    public PublicLogger b;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(Consumer consumer) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    PublicLogger publicLogger;
                    block3: {
                        try {
                            publicLogger = this.b;
                            if (publicLogger != null) break block3;
                            this.a.add(consumer);
                            break block4;
                        }
                        catch (Throwable throwable2) {
                            break block5;
                        }
                    }
                    consumer.consume(publicLogger);
                }
                return;
            }
            throw throwable2;
        }
    }
}

