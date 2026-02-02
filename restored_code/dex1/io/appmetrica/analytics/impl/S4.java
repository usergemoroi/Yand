/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.ResultReceiver
 *  androidx.annotation.NonNull
 *  androidx.annotation.VisibleForTesting
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.impl.D4;
import io.appmetrica.analytics.impl.N4;
import io.appmetrica.analytics.impl.V4;
import io.appmetrica.analytics.impl.a7;
import io.appmetrica.analytics.impl.o6;
import io.appmetrica.analytics.impl.r4;

public final class S4
implements D4 {
    public final Context a;
    public final V4 b;
    public final ResultReceiver c;

    public S4(@NonNull Context context, @NonNull V4 v44, @NonNull N4 n42) {
        this.a = context;
        this.b = v44;
        this.c = n42.c;
        v44.a(this);
    }

    @Override
    public final void a() {
        this.b.b(this);
    }

    @Override
    public final void a(@NonNull o6 o63, @NonNull N4 n42) {
        this.b.a(n42.b);
        this.b.a(o63, this);
    }

    public final void a(@NonNull r4 r44) {
        a7.a(this.c, r44);
    }

    @NonNull
    public final V4 b() {
        return this.b;
    }

    @NonNull
    public final Context c() {
        return this.a;
    }

    @NonNull
    @VisibleForTesting
    public final ResultReceiver d() {
        return this.c;
    }
}

