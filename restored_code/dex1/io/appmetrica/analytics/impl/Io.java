/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.toggle.SimpleThreadSafeToggle;
import java.util.WeakHashMap;
import org.jetbrains.annotations.NotNull;

public final class Io
extends SimpleThreadSafeToggle {
    public final WeakHashMap a = new WeakHashMap();

    public Io() {
        super(false, "[WakelocksToggle]");
    }

    public final void a(@NotNull Object object) {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        this.a.put(object, null);
                        if (this.a.size() != 1) break block3;
                        this.updateState(true);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    public final void b(@NotNull Object object) {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        this.a.remove(object);
                        if (!this.a.isEmpty()) break block3;
                        this.updateState(false);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }
}

