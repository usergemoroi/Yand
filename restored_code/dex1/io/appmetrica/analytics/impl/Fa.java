/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.impl.Bm;
import io.appmetrica.analytics.impl.H4;
import io.appmetrica.analytics.impl.He;
import io.appmetrica.analytics.impl.J4;
import io.appmetrica.analytics.impl.bm;

public final class Fa
implements ProtobufConverter {
    public final He a;

    public Fa() {
        this(new bm());
    }

    public Fa(bm bm3) {
        this.a = bm3;
    }

    @NonNull
    public final Bm a(@NonNull J4 j44) {
        Bm bm3 = new Bm();
        bm3.b = j44.b;
        bm3.a = j44.a;
        bm3.c = j44.c;
        bm3.d = j44.d;
        bm3.e = j44.e;
        bm3.f = this.a.a(j44.f);
        return bm3;
    }

    @NonNull
    public final J4 a(@NonNull Bm bm3) {
        H4 h43 = new H4();
        h43.d = bm3.d;
        h43.c = bm3.c;
        h43.b = bm3.b;
        h43.a = bm3.a;
        h43.e = bm3.e;
        h43.f = this.a.a(bm3.f);
        return new J4(h43);
    }
}

