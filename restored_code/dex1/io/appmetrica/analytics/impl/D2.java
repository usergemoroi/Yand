/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.C2;
import io.appmetrica.analytics.impl.T2;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.io.IOException;

public final class D2
extends T2 {
    @NonNull
    public final C2 a(@NonNull byte[] byArray) throws IOException {
        return MessageNano.mergeFrom(new C2(), byArray);
    }

    @Override
    @NonNull
    public final MessageNano a() {
        return new C2();
    }

    @NonNull
    public final C2 b() {
        return new C2();
    }

    @Override
    @NonNull
    public final Object defaultValue() {
        return new C2();
    }
}

