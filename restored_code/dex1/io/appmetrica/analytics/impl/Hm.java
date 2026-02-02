/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.Bm;
import io.appmetrica.analytics.impl.Gm;
import io.appmetrica.analytics.impl.T2;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.io.IOException;

public final class Hm
extends T2 {
    @NonNull
    public final Gm a(@NonNull byte[] byArray) throws IOException {
        return MessageNano.mergeFrom(new Gm(), byArray);
    }

    @NonNull
    public final Gm b() {
        Gm gm3 = new Gm();
        gm3.i = new Bm();
        return gm3;
    }
}

