/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.impl.Cn;
import io.appmetrica.analytics.impl.Kl;
import io.appmetrica.analytics.impl.Ml;
import io.appmetrica.analytics.impl.z6;
import java.util.ArrayList;
import java.util.List;

public final class Dn
implements ProtobufConverter {
    public final Kl a;

    public Dn() {
        this(new Kl());
    }

    public Dn(Kl kl2) {
        this.a = kl2;
    }

    @NonNull
    public final Cn a(@NonNull z6 z64) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public final z6 a(@NonNull Cn object) {
        z6 z64 = new z6();
        Object object2 = ((Cn)object).e;
        int n10 = object2 == null ? -1 : (Integer)object2;
        z64.e = n10;
        z64.d = ((Cn)object).d;
        z64.b = ((Cn)object).b;
        z64.a = ((Cn)object).a;
        z64.c = ((Cn)object).c;
        object2 = this.a;
        Object object3 = ((Cn)object).f;
        object = new ArrayList();
        object3 = object3.iterator();
        while (object3.hasNext()) {
            ((ArrayList)object).add(new Ml((StackTraceElement)object3.next()));
        }
        z64.f = ((Kl)object2).a((List<Ml>)object);
        return z64;
    }

    @Override
    @NonNull
    public final Object toModel(@NonNull Object object) {
        object = (z6)object;
        throw new UnsupportedOperationException();
    }
}

