/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.impl.Vd;
import io.appmetrica.analytics.impl.Z2;
import io.appmetrica.analytics.impl.jo;
import io.appmetrica.analytics.impl.lo;
import io.appmetrica.analytics.impl.mo;
import io.appmetrica.analytics.impl.q2;
import io.appmetrica.analytics.impl.r2;

public final class Q4
extends Z2 {
    public Q4(@NonNull r2 r24) {
        super(r24);
    }

    @Override
    public final lo a(@NonNull jo jo3, @Nullable lo lo3, @NonNull q2 q22) {
        if (lo3 != null && !lo3.c.b) {
            lo3.c = new mo();
            return lo3;
        }
        return this.a.a(jo3, ((Vd)q22).a());
    }
}

