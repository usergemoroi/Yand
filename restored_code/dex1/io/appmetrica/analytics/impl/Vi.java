/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.ResultReceiver
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.impl;

import android.os.ResultReceiver;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.S4;
import io.appmetrica.analytics.impl.U4;
import io.appmetrica.analytics.impl.V4;
import io.appmetrica.analytics.impl.Y4;
import io.appmetrica.analytics.impl.o6;

public final class Vi
extends Y4 {
    public Vi(V4 v44) {
        super(v44);
    }

    @Override
    public final boolean a(@NonNull o6 o63, @NonNull S4 s42) {
        o63 = o63.m;
        o63 = o63 != null ? (ResultReceiver)o63.getParcelable("io.appmetrica.analytics.impl.referrer.common.ReferrerResultReceiver") : null;
        this.a.k.a(new U4((ResultReceiver)o63));
        return false;
    }
}

