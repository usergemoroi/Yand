/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.impl.Em;
import io.appmetrica.analytics.impl.Mm;
import org.jetbrains.annotations.NotNull;

public final class Nm
implements ProtobufConverter {
    @NotNull
    public final Em a(@NotNull Mm mm3) {
        Em em3 = new Em();
        em3.a = mm3.a;
        return em3;
    }

    @NotNull
    public final Mm a(@NotNull Em em3) {
        return new Mm(em3.a);
    }

    @Override
    public final Object toModel(Object object) {
        return new Mm(((Em)object).a);
    }
}

