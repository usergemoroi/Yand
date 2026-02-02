/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.impl.D7;
import io.appmetrica.analytics.impl.Da;
import io.appmetrica.analytics.impl.Ge;
import io.appmetrica.analytics.impl.I7;
import io.appmetrica.analytics.impl.J7;
import io.appmetrica.analytics.impl.M7;
import io.appmetrica.analytics.impl.M9;
import io.appmetrica.analytics.impl.g9;
import java.util.Arrays;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;

public final class B7
implements ProtobufConverter {
    public final Ge a;
    public final J7 b;

    public B7() {
        this(null, null, 3, null);
    }

    public B7(@NotNull Ge ge2, @NotNull J7 j74) {
        this.a = ge2;
        this.b = j74;
    }

    public /* synthetic */ B7(Ge ge2, J7 j74, int n10, p p14) {
        if ((n10 & 1) != 0) {
            ge2 = new Ge();
        }
        if ((n10 & 2) != 0) {
            j74 = new J7(null, 1, null);
        }
        this(ge2, j74);
    }

    @NotNull
    public final D7 a(@NotNull M7 object) {
        Object object2;
        Da da3;
        String string2;
        g9 g94;
        Object object3;
        String string3;
        Integer n10;
        Integer n13;
        Long l10;
        String string4;
        String string5;
        I7 i74;
        Long l11;
        String string6;
        String string7;
        Integer n14;
        int n15;
        M7 m74;
        block14: {
            m74 = new M7();
            n15 = ((M7)object).a;
            n14 = n15 != m74.a ? Integer.valueOf(n15) : null;
            string7 = ((M7)object).b;
            if (!(y.e(string7, m74.b) ^ true)) {
                string7 = null;
            }
            string6 = ((M7)object).c;
            if (!(y.e(string6, m74.c) ^ true)) {
                string6 = null;
            }
            long l13 = ((M7)object).d;
            l11 = l13 != m74.d ? Long.valueOf(l13) : null;
            i74 = this.b.a(((M7)object).e);
            string5 = ((M7)object).f;
            if (!(y.e(string5, m74.f) ^ true)) {
                string5 = null;
            }
            string4 = ((M7)object).g;
            if (!(y.e(string4, m74.g) ^ true)) {
                string4 = null;
            }
            l13 = ((M7)object).h;
            l10 = l13;
            if (l13 == m74.h) {
                l10 = null;
            }
            n15 = ((M7)object).i;
            n13 = n15 != m74.i ? Integer.valueOf(n15) : null;
            n15 = ((M7)object).j;
            n10 = n15 != m74.j ? Integer.valueOf(n15) : null;
            string3 = ((M7)object).k;
            if (!(y.e(string3, m74.k) ^ true)) {
                string3 = null;
            }
            n15 = ((M7)object).l;
            object3 = Integer.valueOf(n15);
            if (n15 == m74.l) {
                object3 = null;
            }
            g94 = object3 != null ? g9.a(object3.intValue()) : null;
            string2 = ((M7)object).m;
            if (!(y.e(string2, m74.m) ^ true)) {
                string2 = null;
            }
            n15 = ((M7)object).n;
            object3 = n15;
            if (n15 == m74.n) {
                object3 = null;
            }
            da3 = object3 != null ? Da.a(object3.intValue()) : null;
            n15 = ((M7)object).o;
            object3 = n15;
            if (n15 == m74.o) {
                object3 = null;
            }
            if (object3 != null) {
                int n16 = object3.intValue();
                object3 = M9.values();
                int n17 = ((M9[])object3).length;
                for (n15 = 0; n15 < n17; ++n15) {
                    object2 = object3[n15];
                    if (object2.a != n16) continue;
                    object3 = object2;
                    break block14;
                }
                object3 = M9.b;
            } else {
                object3 = null;
            }
        }
        Boolean bl2 = this.a.a(((M7)object).p);
        n15 = ((M7)object).q;
        object2 = n15 != m74.q ? Integer.valueOf(n15) : null;
        object = ((M7)object).r;
        if (!(Arrays.equals((byte[])object, m74.r) ^ true)) {
            object = null;
        }
        return new D7(n14, string7, string6, l11, i74, string5, string4, l10, n13, n10, string3, g94, string2, da3, (M9)((Object)object3), bl2, (Integer)object2, (byte[])object);
    }

    @NotNull
    public final M7 a(@NotNull D7 object) {
        M7 m74 = new M7();
        Object object2 = ((D7)object).a;
        if (object2 != null) {
            m74.a = ((Number)object2).intValue();
        }
        if ((object2 = ((D7)object).b) != null) {
            m74.b = StringUtils.correctIllFormedString((String)object2);
        }
        if ((object2 = ((D7)object).c) != null) {
            m74.c = StringUtils.correctIllFormedString((String)object2);
        }
        if ((object2 = ((D7)object).d) != null) {
            m74.d = ((Number)object2).longValue();
        }
        if ((object2 = ((D7)object).e) != null) {
            m74.e = this.b.a((I7)object2);
        }
        if ((object2 = ((D7)object).f) != null) {
            m74.f = object2;
        }
        if ((object2 = ((D7)object).g) != null) {
            m74.g = object2;
        }
        if ((object2 = ((D7)object).h) != null) {
            m74.h = ((Number)object2).longValue();
        }
        if ((object2 = ((D7)object).i) != null) {
            m74.i = ((Number)object2).intValue();
        }
        if ((object2 = ((D7)object).j) != null) {
            m74.j = ((Number)object2).intValue();
        }
        if ((object2 = ((D7)object).k) != null) {
            m74.k = object2;
        }
        if ((object2 = ((D7)object).l) != null) {
            m74.l = ((g9)((Object)object2)).a;
        }
        if ((object2 = ((D7)object).m) != null) {
            m74.m = object2;
        }
        if ((object2 = ((D7)object).n) != null) {
            m74.n = ((Da)((Object)object2)).a;
        }
        if ((object2 = ((D7)object).o) != null) {
            m74.o = ((M9)((Object)object2)).a;
        }
        if ((object2 = ((D7)object).p) != null) {
            m74.p = this.a.a((Boolean)object2);
        }
        if ((object2 = ((D7)object).q) != null) {
            m74.q = ((Number)object2).intValue();
        }
        if ((object = (Object)((D7)object).r) != null) {
            m74.r = (byte[])object;
        }
        return m74;
    }
}

