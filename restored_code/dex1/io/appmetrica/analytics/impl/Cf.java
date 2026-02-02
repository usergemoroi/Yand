/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.Hf;
import io.appmetrica.analytics.impl.T2;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.io.IOException;

public final class Cf
extends T2 {
    @NonNull
    public final Hf a(@NonNull byte[] byArray) throws IOException {
        return MessageNano.mergeFrom(new Hf(), byArray);
    }

    @Override
    @NonNull
    public final MessageNano a() {
        return new Hf();
    }

    @NonNull
    public final Hf b() {
        return new Hf();
    }

    @Override
    @NonNull
    public final Object defaultValue() {
        return new Hf();
    }
}

