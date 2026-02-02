/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.T2;
import io.appmetrica.analytics.impl.W3;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import org.jetbrains.annotations.NotNull;

public final class X3
extends T2 {
    @NotNull
    public final W3 a(@NotNull byte[] byArray) {
        return MessageNano.mergeFrom(new W3(), byArray);
    }

    @Override
    public final MessageNano a() {
        return new W3();
    }

    @NotNull
    public final W3 b() {
        return new W3();
    }

    @Override
    public final Object defaultValue() {
        return new W3();
    }
}

