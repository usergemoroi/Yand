/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.ICrashTransformer;
import io.appmetrica.analytics.impl.H6;
import io.appmetrica.analytics.impl.I6;
import io.appmetrica.analytics.impl.co;
import io.appmetrica.analytics.impl.ma;

public final class Xh
extends I6 {
    public final co d;

    public Xh(@NonNull Context context, @NonNull co co3, @NonNull H6 h63, @Nullable ICrashTransformer iCrashTransformer) {
        this(co3, h63, iCrashTransformer, new ma(context));
    }

    public Xh(co co3, H6 h63, ICrashTransformer iCrashTransformer, ma ma2) {
        super(h63, iCrashTransformer, ma2);
        this.d = co3;
    }
}

