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
import io.appmetrica.analytics.impl.O8;
import io.appmetrica.analytics.impl.P8;
import io.appmetrica.analytics.impl.Sa;
import io.appmetrica.analytics.impl.Sn;
import io.appmetrica.analytics.impl.Tg;
import io.appmetrica.analytics.impl.Zi;
import io.appmetrica.analytics.impl.uj;
import io.appmetrica.analytics.impl.yj;
import io.appmetrica.analytics.impl.z3;

public final class Cg
implements Converter {
    public final uj a;
    public final Sa b;
    public final Sa c;

    public Cg() {
        this(new uj(), new Sa(100), new Sa(2048));
    }

    public Cg(uj uj3, Sa sa2, Sa sa4) {
        this.a = uj3;
        this.b = sa2;
        this.c = sa4;
    }

    @NonNull
    public final Tg a(@NonNull Zi zi3) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public final Zi a(@NonNull Tg object) {
        O8 o84 = new O8();
        Sn sn3 = this.b.a(((Tg)object).a);
        o84.a = StringUtils.getUTF8Bytes((String)sn3.a);
        Sn sn4 = this.c.a(((Tg)object).b);
        o84.b = StringUtils.getUTF8Bytes((String)sn4.a);
        object = ((Tg)object).c;
        if (object != null) {
            object = this.a.a((yj)object);
            o84.c = (P8)((Zi)object).a;
        } else {
            object = null;
        }
        return new Zi(o84, new z3(z3.b(new A3[]{sn3, sn4, object})));
    }

    @NonNull
    public final Object toModel(@NonNull Object object) {
        object = (Zi)object;
        throw new UnsupportedOperationException();
    }
}

