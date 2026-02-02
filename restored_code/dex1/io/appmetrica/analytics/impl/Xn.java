/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.impl.Dn;
import io.appmetrica.analytics.impl.G6;
import io.appmetrica.analytics.impl.Kl;
import io.appmetrica.analytics.impl.Ln;
import io.appmetrica.analytics.impl.Ml;
import io.appmetrica.analytics.impl.Mn;
import io.appmetrica.analytics.impl.U;
import io.appmetrica.analytics.impl.V;
import io.appmetrica.analytics.impl.Wn;
import io.appmetrica.analytics.impl.bf;
import io.appmetrica.analytics.impl.cf;
import io.appmetrica.analytics.impl.ro;
import io.appmetrica.analytics.impl.u6;
import java.util.List;

public final class Xn
implements ProtobufConverter {
    public final Ln a;
    public final V b;
    public final G6 c;
    public final Kl d;
    public final bf e;
    public final cf f;

    public Xn() {
        this(new Ln(), new V(new Dn()), new G6(), new Kl(), new bf(), new cf());
    }

    public Xn(Ln ln3, V v14, G6 g63, Kl kl2, bf bf3, cf cf3) {
        this.b = v14;
        this.a = ln3;
        this.c = g63;
        this.d = kl2;
        this.e = bf3;
        this.f = cf3;
    }

    @NonNull
    public final Wn a(@NonNull u6 u63) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public final u6 a(@NonNull Wn wn3) {
        u6 u63 = new u6();
        Object object = wn3.a;
        if (object != null) {
            u63.a = this.a.a((Mn)object);
        }
        if ((object = wn3.b) != null) {
            u63.b = this.b.a((U)object);
        }
        if ((object = wn3.c) != null) {
            u63.e = this.d.a((List<Ml>)object);
        }
        if ((object = wn3.g) != null) {
            u63.c = object;
        }
        u63.d = this.c.a(wn3.h);
        if (!TextUtils.isEmpty((CharSequence)wn3.d)) {
            u63.h = this.e.a(wn3.d);
        }
        if (!TextUtils.isEmpty((CharSequence)wn3.e)) {
            u63.i = wn3.e.getBytes();
        }
        if (!ro.a(wn3.f)) {
            u63.j = this.f.a(wn3.f);
        }
        return u63;
    }

    @Override
    @NonNull
    public final Object toModel(@NonNull Object object) {
        object = (u6)object;
        throw new UnsupportedOperationException();
    }
}

