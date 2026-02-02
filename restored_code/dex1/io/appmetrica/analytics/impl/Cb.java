/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.HandlerThread
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.impl;

import android.os.HandlerThread;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread;

public final class Cb
extends HandlerThread
implements IInterruptionSafeThread {
    public volatile boolean a = true;

    public Cb(@NonNull String string2) {
        super(string2);
    }

    @Override
    public final boolean isRunning() {
        synchronized (this) {
            boolean bl2 = this.a;
            return bl2;
        }
    }

    @Override
    public final void stopRunning() {
        synchronized (this) {
            this.a = false;
            ((Thread)((Object)this)).interrupt();
            return;
        }
    }
}

