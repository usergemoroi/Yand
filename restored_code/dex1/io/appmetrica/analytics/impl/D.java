/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.collections.s0
 *  kotlin.collections.t
 *  kotlin.jvm.functions.l
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.impl.A;
import io.appmetrica.analytics.impl.B;
import io.appmetrica.analytics.impl.C;
import io.appmetrica.analytics.impl.E;
import io.appmetrica.analytics.impl.Gb;
import io.appmetrica.analytics.impl.X7;
import io.appmetrica.analytics.impl.dn;
import io.appmetrica.analytics.impl.fn;
import io.appmetrica.analytics.impl.nn;
import io.appmetrica.analytics.impl.q;
import io.appmetrica.analytics.impl.r;
import io.appmetrica.analytics.impl.s;
import io.appmetrica.analytics.impl.w;
import io.appmetrica.analytics.impl.x;
import io.appmetrica.analytics.impl.y;
import io.appmetrica.analytics.impl.z;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.s0;
import kotlin.collections.t;
import kotlin.jvm.functions.l;
import kotlin.text.d;

public final class D {
    public final AdRevenue a;
    public final boolean b;
    public final s c;
    public final fn d;
    public final dn e;

    public D(AdRevenue adRevenue, boolean bl2, nn nn3, PublicLogger publicLogger) {
        this.a = adRevenue;
        this.b = bl2;
        this.c = nn3;
        this.d = new fn(100, "ad revenue strings", publicLogger);
        this.e = new dn(30720, "ad revenue payload", publicLogger);
    }

    public final kotlin.t a() {
        r r14 = new r();
        kotlin.t<String, w> t13 = kotlin.z.a(this.a.adNetwork, new w(r14));
        Object object = kotlin.z.a(this.a.adPlacementId, new x(r14));
        kotlin.t<String, y> t14 = kotlin.z.a(this.a.adPlacementName, new y(r14));
        kotlin.t<String, z> t15 = kotlin.z.a(this.a.adUnitId, new z(r14));
        Object object2 = kotlin.z.a(this.a.adUnitName, new A(r14));
        Object object3 = kotlin.z.a(this.a.precision, new B(r14));
        Object object4 = kotlin.z.a(this.a.currency.getCurrencyCode(), new C(r14));
        int n10 = 0;
        object3 = t.p((Object[])new kotlin.t[]{t13, object, t14, t15, object2, object3, object4}).iterator();
        int n13 = 0;
        while (object3.hasNext()) {
            object4 = (kotlin.t)object3.next();
            object = (String)((kotlin.t)object4).c();
            object4 = (l)((kotlin.t)object4).d();
            object2 = this.d;
            object2.getClass();
            object2 = ((fn)object2).a((String)object);
            object = StringUtils.stringToBytesForProtobuf((String)object);
            object2 = StringUtils.stringToBytesForProtobuf((String)object2);
            object4.invoke(object2);
            n13 += ((Object)object).length - ((Object)object2).length;
        }
        object3 = (Integer)E.a.get((Object)this.a.adType);
        if (object3 != null) {
            n10 = (Integer)object3;
        }
        r14.d = n10;
        object4 = new q();
        object = this.a.adRevenue;
        object3 = X7.a;
        n10 = -((BigDecimal)object).scale();
        object3 = ((BigDecimal)object).unscaledValue();
        while (true) {
            block7: {
                block9: {
                    block8: {
                        if (((BigInteger)object3).compareTo(X7.a) > 0 || ((BigInteger)object3).compareTo(X7.b) < 0) break block7;
                        object3 = kotlin.z.a(((BigInteger)object3).longValue(), n10);
                        long l10 = ((Number)((kotlin.t)object3).c()).longValue();
                        n10 = ((Number)((kotlin.t)object3).d()).intValue();
                        ((q)object4).a = l10;
                        ((q)object4).b = n10;
                        r14.b = object4;
                        object3 = this.a.payload;
                        object = this.c;
                        if (object3 == null) break block8;
                        object3 = object4 = s0.C((Map)object3);
                        if (object4 != null) break block9;
                    }
                    object3 = new LinkedHashMap();
                }
                object3 = Gb.b(object.a((Map)object3));
                object4 = this.e;
                object4.getClass();
                object4 = StringUtils.stringToBytesForProtobuf(((dn)object4).a((String)object3));
                r14.k = (byte[])object4;
                n10 = StringUtils.stringToBytesForProtobuf((String)object3).length;
                int n14 = ((Object)object4).length;
                if (this.b) {
                    r14.a = "autocollected".getBytes(kotlin.text.d.b);
                }
                return kotlin.z.a(MessageNano.toByteArray(r14), n10 - n14 + n13);
            }
            object3 = ((BigInteger)object3).divide(BigInteger.TEN);
            ++n10;
        }
    }
}

