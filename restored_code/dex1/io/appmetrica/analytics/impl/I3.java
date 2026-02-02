/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.impl.A3;
import io.appmetrica.analytics.impl.Cg;
import io.appmetrica.analytics.impl.D8;
import io.appmetrica.analytics.impl.J3;
import io.appmetrica.analytics.impl.L8;
import io.appmetrica.analytics.impl.M8;
import io.appmetrica.analytics.impl.O8;
import io.appmetrica.analytics.impl.Rf;
import io.appmetrica.analytics.impl.Tg;
import io.appmetrica.analytics.impl.V7;
import io.appmetrica.analytics.impl.Zi;
import io.appmetrica.analytics.impl.ag;
import io.appmetrica.analytics.impl.z3;

public final class I3
implements Converter {
    public final ag a;
    public final V7 b;
    public final Rf c;
    public final Cg d;

    public I3() {
        this(new ag(), new V7(), new Rf(), new Cg());
    }

    public I3(ag ag2, V7 v74, Rf rf3, Cg cg3) {
        this.a = ag2;
        this.b = v74;
        this.c = rf3;
        this.d = cg3;
    }

    @NonNull
    public final J3 a(@NonNull Zi zi3) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public final Zi a(@NonNull J3 object) {
        D8 d84 = new D8();
        Zi zi3 = this.a.a(((J3)object).a);
        d84.a = (M8)zi3.a;
        d84.c = this.b.a(((J3)object).b);
        Zi zi4 = this.c.a(((J3)object).c);
        d84.d = (L8)zi4.a;
        object = ((J3)object).d;
        if (object != null) {
            object = this.d.a((Tg)object);
            d84.b = (O8)((Zi)object).a;
        } else {
            object = null;
        }
        return new Zi(d84, new z3(z3.b(new A3[]{zi3, zi4, object})));
    }

    @NonNull
    public final Object toModel(@NonNull Object object) {
        object = (Zi)object;
        throw new UnsupportedOperationException();
    }
}

