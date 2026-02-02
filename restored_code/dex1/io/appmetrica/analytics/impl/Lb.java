/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.impl.Wn;
import io.appmetrica.analytics.impl.Xn;
import io.appmetrica.analytics.impl.md;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

public final class Lb
implements Converter {
    public final md a;

    public Lb() {
        this(new md(new Xn()));
    }

    public Lb(md md3) {
        this.a = md3;
    }

    @NonNull
    public final Wn a(@NonNull byte[] byArray) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public final byte[] a(@NonNull Wn wn3) {
        return MessageNano.toByteArray((MessageNano)this.a.a.fromModel(wn3));
    }

    @NonNull
    public final Object toModel(@NonNull Object object) {
        object = (byte[])object;
        throw new UnsupportedOperationException();
    }
}

