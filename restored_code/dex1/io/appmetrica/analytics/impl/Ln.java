/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.impl.A6;
import io.appmetrica.analytics.impl.Kl;
import io.appmetrica.analytics.impl.Ml;
import io.appmetrica.analytics.impl.Mn;
import java.util.List;

public final class Ln
implements ProtobufConverter {
    public final Kl a;

    public Ln() {
        this(new Kl());
    }

    public Ln(Kl kl2) {
        this.a = kl2;
    }

    @NonNull
    public final A6 a(@NonNull Mn iterator) {
        A6 a64 = new A6();
        a64.a = WrapUtils.getOrDefault(((Mn)((Object)iterator)).a, "");
        a64.b = StringUtils.correctIllFormedString(WrapUtils.getOrDefault(((Mn)((Object)iterator)).b, ""));
        Object object = ((Mn)((Object)iterator)).c;
        if (object != null) {
            a64.c = this.a.a((List<Ml>)object);
        }
        if ((object = ((Mn)((Object)iterator)).d) != null) {
            a64.d = this.a((Mn)object);
        }
        iterator = ((Mn)((Object)iterator)).e;
        int n10 = 0;
        if (iterator == null) {
            a64.e = new A6[0];
        } else {
            a64.e = new A6[iterator.size()];
            iterator = iterator.iterator();
            while (iterator.hasNext()) {
                object = (Mn)iterator.next();
                a64.e[n10] = this.a((Mn)object);
                ++n10;
            }
        }
        return a64;
    }

    @NonNull
    public final Mn a(@NonNull A6 a64) {
        throw new UnsupportedOperationException();
    }

    @Override
    @NonNull
    public final Object toModel(@NonNull Object object) {
        object = (A6)object;
        throw new UnsupportedOperationException();
    }
}

