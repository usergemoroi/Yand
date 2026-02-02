/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ListConverter;
import io.appmetrica.analytics.impl.Ll;
import io.appmetrica.analytics.impl.Ml;
import io.appmetrica.analytics.impl.y6;
import java.util.List;

public final class Kl
implements ListConverter {
    public final Ll a = new Ll();

    @NonNull
    public final List<Ml> a(y6[] y6Array) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public final y6[] a(@NonNull List<Ml> object) {
        y6[] y6Array = new y6[object.size()];
        object = object.iterator();
        int n10 = 0;
        while (object.hasNext()) {
            Ml ml2 = (Ml)object.next();
            y6Array[n10] = this.a.a(ml2);
            ++n10;
        }
        return y6Array;
    }

    @Override
    @NonNull
    public final Object toModel(Object y6Array) {
        y6Array = y6Array;
        throw new UnsupportedOperationException();
    }
}

