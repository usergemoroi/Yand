/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.VisibleForTesting
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.impl.A3;
import io.appmetrica.analytics.impl.E8;
import io.appmetrica.analytics.impl.L4;
import io.appmetrica.analytics.impl.Ra;
import io.appmetrica.analytics.impl.Zi;
import java.util.List;

public final class K3
implements Converter {
    public final Ra a;

    public K3() {
        this(new Ra(20, 100));
    }

    @VisibleForTesting
    public K3(@NonNull Ra ra4) {
        this.a = ra4;
    }

    @NonNull
    public final Zi a(@NonNull List<String> object) {
        A3 a33 = this.a.a((List<Object>)object);
        object = new E8();
        ((E8)object).a = StringUtils.getUTF8Bytes((List)a33.a);
        a33 = a33.b;
        int n10 = ((L4)a33).a;
        return new Zi(object, a33);
    }

    @NonNull
    public final List<String> a(@NonNull Zi zi3) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public final Object toModel(@NonNull Object object) {
        object = (Zi)object;
        throw new UnsupportedOperationException();
    }
}

