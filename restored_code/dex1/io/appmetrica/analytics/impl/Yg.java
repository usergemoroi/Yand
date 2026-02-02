/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.NonNull
 *  androidx.annotation.VisibleForTesting
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.impl.N4;
import io.appmetrica.analytics.impl.Ql;
import io.appmetrica.analytics.impl.Xg;
import io.appmetrica.analytics.impl.m8;
import io.appmetrica.analytics.impl.o5;
import io.appmetrica.analytics.impl.p5;
import io.appmetrica.analytics.impl.w5;

public final class Yg
implements m8 {
    public final w5 a;

    public Yg(@NonNull w5 w54) {
        this.a = w54;
    }

    @NonNull
    @VisibleForTesting
    public final w5 a() {
        return this.a;
    }

    public final Xg b(@NonNull Context context, @NonNull o5 o54, @NonNull N4 n42) {
        return new Xg(context, o54, n42, this.a, new p5(), Ql.a());
    }
}

