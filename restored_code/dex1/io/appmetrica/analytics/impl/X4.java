/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.Km;
import io.appmetrica.analytics.impl.Na;
import io.appmetrica.analytics.impl.V4;
import io.appmetrica.analytics.impl.Zf;
import io.appmetrica.analytics.impl.a5;
import io.appmetrica.analytics.impl.c5;
import io.appmetrica.analytics.impl.eb;
import io.appmetrica.analytics.impl.eh;
import io.appmetrica.analytics.impl.fc;
import io.appmetrica.analytics.impl.sn;

public final class X4 {
    public final fc a;

    public X4() {
        this(Na.j().k());
    }

    public X4(fc fc3) {
        this.a = fc3;
    }

    public static c5 a(V4 v44) {
        return new c5((Zf)new a5(v44), v44);
    }

    public final sn a(V4 object, Km object2) {
        object2 = new sn((eb)object, new eh((Km)object2));
        object = this.a;
        synchronized (object) {
            ((fc)object).c.add(object2);
            return object2;
        }
    }
}

