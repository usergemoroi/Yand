/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.impl.Sn;
import io.appmetrica.analytics.impl.Ta;

public abstract class R2
implements Ta {
    public final int a;

    public R2(int n10) {
        this.a = n10;
    }

    @VisibleForTesting(otherwise=4)
    public final int a() {
        return this.a;
    }

    @Override
    @NonNull
    public abstract /* synthetic */ Sn a(@Nullable Object var1);
}

