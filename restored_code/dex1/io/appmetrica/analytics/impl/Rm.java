/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.impl.Fm;
import io.appmetrica.analytics.impl.Qm;

public final class Rm
implements ProtobufConverter {
    @NonNull
    public final Fm a(@NonNull Qm qm3) {
        Fm fm3 = new Fm();
        fm3.a = qm3.a;
        return fm3;
    }

    @NonNull
    public final Qm a(@NonNull Fm fm3) {
        return new Qm(fm3.a);
    }

    @Override
    @NonNull
    public final Object fromModel(@NonNull Object object) {
        Qm qm3 = (Qm)object;
        object = new Fm();
        ((Fm)object).a = qm3.a;
        return object;
    }

    @Override
    @NonNull
    public final Object toModel(@NonNull Object object) {
        return new Qm(((Fm)object).a);
    }
}

