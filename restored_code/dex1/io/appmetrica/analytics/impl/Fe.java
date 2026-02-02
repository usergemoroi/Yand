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
import io.appmetrica.analytics.impl.Jg;
import io.appmetrica.analytics.impl.Pc;
import io.appmetrica.analytics.impl.mb;
import io.appmetrica.analytics.impl.nb;

public final class Fe
implements nb {
    public final mb a;

    public Fe(@NonNull mb mb3) {
        this.a = mb3;
    }

    @Override
    public final boolean a(@Nullable Jg jg3) {
        boolean bl2 = jg3 != null && !((Pc)this.a).D();
        return bl2;
    }
}

