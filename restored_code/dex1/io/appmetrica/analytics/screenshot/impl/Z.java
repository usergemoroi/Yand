/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.screenshot.impl.M;
import io.appmetrica.analytics.screenshot.impl.X;
import org.jetbrains.annotations.NotNull;

public final class Z
implements Converter {
    @NotNull
    public final M a(@NotNull X x10) {
        M m12 = new M();
        m12.a = x10.a;
        m12.b = x10.b;
        return m12;
    }

    @NotNull
    public final X a(@NotNull M m12) {
        return new X(m12.a, m12.b);
    }

    public final Object toModel(Object object) {
        object = (M)object;
        return new X(((M)object).a, ((M)object).b);
    }
}

