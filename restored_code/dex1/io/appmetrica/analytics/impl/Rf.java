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
import io.appmetrica.analytics.impl.B8;
import io.appmetrica.analytics.impl.L8;
import io.appmetrica.analytics.impl.Sf;
import io.appmetrica.analytics.impl.Sn;
import io.appmetrica.analytics.impl.Tf;
import io.appmetrica.analytics.impl.X;
import io.appmetrica.analytics.impl.Y;
import io.appmetrica.analytics.impl.Zi;
import io.appmetrica.analytics.impl.ro;
import io.appmetrica.analytics.impl.z3;
import java.util.Collection;
import java.util.List;

public final class Rf
implements Converter {
    public final X a;
    public final Sf b;

    public Rf() {
        this(new X(), new Sf(30));
    }

    public Rf(X x10, Sf sf2) {
        this.a = x10;
        this.b = sf2;
    }

    @NonNull
    public final Tf a(@NonNull Zi zi3) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public final Zi a(@NonNull Tf object) {
        int n10;
        L8 l82 = new L8();
        Zi zi3 = this.a.a(((Tf)object).a);
        l82.a = (B8)zi3.a;
        object = this.b.a(((Tf)object).b);
        if (!ro.a((Collection)((Sn)object).a)) {
            l82.b = new B8[((List)((Sn)object).a).size()];
            int n13 = 0;
            int n14 = 0;
            while (true) {
                n10 = n14;
                if (n13 < ((List)((Sn)object).a).size()) {
                    Zi zi4 = this.a.a((Y)((List)((Sn)object).a).get(n13));
                    l82.b[n13] = (B8)zi4.a;
                    n14 += zi4.b.getBytesTruncated();
                    ++n13;
                    continue;
                }
                break;
            }
        } else {
            n10 = 0;
        }
        return new Zi(l82, new z3(z3.b(new A3[]{zi3, object, new z3(n10)})));
    }

    @NonNull
    public final Object toModel(@NonNull Object object) {
        object = (Zi)object;
        throw new UnsupportedOperationException();
    }
}

