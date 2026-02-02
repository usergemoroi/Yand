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
import io.appmetrica.analytics.impl.J8;
import io.appmetrica.analytics.impl.K8;
import io.appmetrica.analytics.impl.L4;
import io.appmetrica.analytics.impl.Va;
import io.appmetrica.analytics.impl.Zi;
import java.util.Map;

public final class Me
implements Converter {
    public final Va a;

    public Me() {
        this(new Va(20480, 100, 1000));
    }

    @VisibleForTesting
    public Me(@NonNull Va va4) {
        this.a = va4;
    }

    @NonNull
    public final Zi a(@NonNull Map<String, String> object) {
        int n10;
        A3 a33 = this.a.a((Map<String, String>)object);
        object = new K8();
        ((K8)object).b = ((L4)a33.b).b;
        Object object2 = (Map)a33.a;
        if (object2 != null) {
            ((K8)object).a = new J8[object2.size()];
            object2 = object2.entrySet().iterator();
            n10 = 0;
            while (object2.hasNext()) {
                Map.Entry entry = (Map.Entry)object2.next();
                ((K8)object).a[n10] = new J8();
                ((K8)object).a[n10].a = StringUtils.getUTF8Bytes((String)entry.getKey());
                ((K8)object).a[n10].b = StringUtils.getUTF8Bytes((String)entry.getValue());
                ++n10;
            }
        }
        a33 = a33.b;
        n10 = ((L4)a33).a;
        return new Zi(object, a33);
    }

    @NonNull
    public final Map<String, String> a(@NonNull Zi zi3) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public final Object toModel(@NonNull Object object) {
        object = (Zi)object;
        throw new UnsupportedOperationException();
    }
}

