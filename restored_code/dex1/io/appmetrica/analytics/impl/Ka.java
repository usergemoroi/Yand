/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.Nullable;
import io.appmetrica.analytics.impl.D9;
import io.appmetrica.analytics.impl.pe;

public final class Ka
implements pe {
    @Override
    @Nullable
    public final D9 a(@Nullable Integer n10, @Nullable String string2) {
        D9 d94 = new D9();
        if (n10 != null) {
            d94.a = n10;
        }
        if (string2 != null) {
            d94.b = string2;
        }
        return d94;
    }
}

