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
import io.appmetrica.analytics.impl.jo;
import io.appmetrica.analytics.impl.lo;
import io.appmetrica.analytics.impl.r2;
import java.util.HashMap;

public final class Hl
implements r2 {
    @Override
    @Nullable
    public final lo a(@NonNull jo jo3, @NonNull lo lo3) {
        ((HashMap)jo3.a.get(lo3.b)).put(new String(lo3.a), lo3);
        return lo3;
    }
}

