/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.impl.Ge;
import io.appmetrica.analytics.impl.I7;
import io.appmetrica.analytics.impl.N7;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class J7
implements Converter {
    public final Ge a;

    public J7() {
        this(null, 1, null);
    }

    public J7(@NotNull Ge ge2) {
        this.a = ge2;
    }

    public /* synthetic */ J7(Ge ge2, int n10, p p14) {
        if ((n10 & 1) != 0) {
            ge2 = new Ge();
        }
        this(ge2);
    }

    @NotNull
    public final I7 a(@Nullable N7 object) {
        if (object == null) {
            return new I7(null, null, null, null, null, null, null, null, null, null);
        }
        N7 n73 = new N7();
        Boolean bl2 = this.a.a(((N7)object).a);
        double d14 = ((N7)object).c;
        double d15 = n73.c;
        int n10 = 0;
        int n13 = d14 == d15 ? 1 : 0;
        Double d16 = n13 ^ true ? Double.valueOf(d14) : null;
        d14 = ((N7)object).b;
        n13 = n10;
        if (d14 == n73.b) {
            n13 = 1;
        }
        Double d17 = n13 ^ true ? Double.valueOf(d14) : null;
        long l10 = ((N7)object).h;
        Long l11 = l10 != n73.h ? Long.valueOf(l10) : null;
        n13 = ((N7)object).f;
        Integer n14 = n13 != n73.f ? Integer.valueOf(n13) : null;
        n13 = ((N7)object).e;
        Integer n15 = n13 != n73.e ? Integer.valueOf(n13) : null;
        n13 = ((N7)object).g;
        Integer n16 = n13 != n73.g ? Integer.valueOf(n13) : null;
        n13 = ((N7)object).d;
        Integer n17 = n13;
        if (n13 == n73.d) {
            n17 = null;
        }
        String string2 = ((N7)object).i;
        if (!(y.e(string2, n73.i) ^ true)) {
            string2 = null;
        }
        object = ((N7)object).j;
        if (!(y.e(object, n73.j) ^ true)) {
            object = null;
        }
        return new I7(bl2, d17, d16, n17, n15, n14, n16, l11, string2, (String)object);
    }

    @NotNull
    public final N7 a(@NotNull I7 object) {
        N7 n73 = new N7();
        Object object2 = ((I7)object).a;
        if (object2 != null) {
            n73.a = this.a.a((Boolean)object2);
        }
        if ((object2 = ((I7)object).c) != null) {
            n73.c = ((Number)object2).doubleValue();
        }
        if ((object2 = ((I7)object).b) != null) {
            n73.b = ((Number)object2).doubleValue();
        }
        if ((object2 = ((I7)object).h) != null) {
            n73.h = ((Number)object2).longValue();
        }
        if ((object2 = ((I7)object).f) != null) {
            n73.f = ((Number)object2).intValue();
        }
        if ((object2 = ((I7)object).e) != null) {
            n73.e = ((Number)object2).intValue();
        }
        if ((object2 = ((I7)object).g) != null) {
            n73.g = ((Number)object2).intValue();
        }
        if ((object2 = ((I7)object).d) != null) {
            n73.d = ((Number)object2).intValue();
        }
        if ((object2 = ((I7)object).i) != null) {
            n73.i = object2;
        }
        if ((object = ((I7)object).j) != null) {
            n73.j = object;
        }
        return n73;
    }
}

