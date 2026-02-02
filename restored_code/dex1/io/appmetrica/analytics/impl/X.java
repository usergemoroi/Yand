/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.impl.A3;
import io.appmetrica.analytics.impl.B8;
import io.appmetrica.analytics.impl.Sa;
import io.appmetrica.analytics.impl.Sn;
import io.appmetrica.analytics.impl.V7;
import io.appmetrica.analytics.impl.Y;
import io.appmetrica.analytics.impl.Zi;
import io.appmetrica.analytics.impl.z3;

public final class X
implements Converter {
    public final V7 a;
    public final Sa b;

    public X() {
        this(new V7(), new Sa(20));
    }

    public X(V7 v74, Sa sa2) {
        this.a = v74;
        this.b = sa2;
    }

    @NonNull
    public final Y a(@NonNull Zi zi3) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public final Zi a(@NonNull Y object) {
        B8 b82 = new B8();
        b82.b = this.a.a(((Y)object).a);
        object = this.b.a(((Y)object).b);
        b82.a = StringUtils.getUTF8Bytes((String)((Sn)object).a);
        return new Zi(b82, new z3(z3.b(new A3[]{object})));
    }

    @NonNull
    public final Object toModel(@NonNull Object object) {
        object = (Zi)object;
        throw new UnsupportedOperationException();
    }
}

