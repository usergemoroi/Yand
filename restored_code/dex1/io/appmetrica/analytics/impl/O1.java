/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  androidx.annotation.WorkerThread
 */
package io.appmetrica.analytics.impl;

import android.os.Bundle;
import androidx.annotation.WorkerThread;
import io.appmetrica.analytics.impl.L1;
import io.appmetrica.analytics.impl.N1;
import io.appmetrica.analytics.impl.r0;
import io.appmetrica.analytics.impl.uk;
import org.jetbrains.annotations.NotNull;

public final class O1
implements uk {
    @NotNull
    public static final N1 b = new N1();
    public static final int c = 1;
    public final r0 a;

    public O1(@NotNull r0 r02) {
        this.a = r02;
    }

    @Override
    @WorkerThread
    public final void reportData(int n10, @NotNull Bundle bundle) {
        ((L1)this.a).a(bundle);
    }
}

