/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.T2;
import io.appmetrica.analytics.impl.Uk;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import org.jetbrains.annotations.NotNull;

public final class Wk
extends T2 {
    @NotNull
    public final Uk a(@NotNull byte[] byArray) {
        return MessageNano.mergeFrom(new Uk(), byArray);
    }

    @Override
    public final MessageNano a() {
        return new Uk();
    }

    @NotNull
    public final Uk b() {
        return new Uk();
    }

    @Override
    public final Object defaultValue() {
        return new Uk();
    }
}

