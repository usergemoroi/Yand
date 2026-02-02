/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.R3;
import io.appmetrica.analytics.impl.Tm;
import io.appmetrica.analytics.impl.Um;
import io.appmetrica.analytics.impl.Vm;
import io.appmetrica.analytics.impl.Wm;
import io.appmetrica.analytics.impl.Xm;
import io.appmetrica.analytics.impl.Ym;
import io.appmetrica.analytics.impl.an;
import io.appmetrica.analytics.impl.b2;
import io.appmetrica.analytics.impl.sm;
import io.appmetrica.analytics.impl.xf;
import io.appmetrica.analytics.impl.z2;
import java.util.HashMap;

public final class Zm {
    public final HashMap a;

    public Zm() {
        HashMap<Class<R3>, an> hashMap;
        this.a = hashMap = new HashMap<Class<R3>, an>();
        Tm tm3 = new Tm();
        Um um3 = new Um();
        Vm vm3 = new Vm();
        Wm wm3 = new Wm();
        Xm xm3 = new Xm();
        hashMap.put(sm.class, tm3);
        hashMap.put(b2.class, um3);
        hashMap.put(xf.class, vm3);
        hashMap.put(z2.class, wm3);
        hashMap.put(R3.class, xm3);
    }

    public static an a(Class clazz) {
        return (an)Ym.a.a.get(clazz);
    }
}

