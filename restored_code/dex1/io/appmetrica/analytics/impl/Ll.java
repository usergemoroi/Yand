/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.impl.Ml;
import io.appmetrica.analytics.impl.y6;

public final class Ll
implements ProtobufConverter {
    @NonNull
    public final Ml a(@NonNull y6 y64) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public final y6 a(@NonNull Ml ml2) {
        y6 y64 = new y6();
        y64.a = WrapUtils.getOrDefault(ml2.a, y64.a);
        y64.b = WrapUtils.getOrDefault(ml2.b, y64.b);
        y64.c = WrapUtils.getOrDefault(ml2.c, y64.c);
        y64.f = WrapUtils.getOrDefault(ml2.d, y64.f);
        y64.d = WrapUtils.getOrDefault(ml2.e, y64.d);
        y64.e = WrapUtils.getOrDefault(ml2.f, y64.e);
        return y64;
    }

    @Override
    @NonNull
    public final Object toModel(@NonNull Object object) {
        object = (y6)object;
        throw new UnsupportedOperationException();
    }
}

