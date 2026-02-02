/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.impl.C3;
import io.appmetrica.analytics.impl.ym;

public final class E3
implements ProtobufConverter {
    @NonNull
    public final C3 a(@NonNull ym ym3) {
        return new C3(ym3.a);
    }

    @NonNull
    public final ym a(@NonNull C3 c34) {
        ym ym3 = new ym();
        ym3.a = c34.a;
        return ym3;
    }

    @Override
    @NonNull
    public final Object fromModel(@NonNull Object object) {
        C3 c34 = (C3)object;
        object = new ym();
        ((ym)object).a = c34.a;
        return object;
    }

    @Override
    @NonNull
    public final Object toModel(@NonNull Object object) {
        return new C3(((ym)object).a);
    }
}

