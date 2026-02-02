/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.BiFunction;
import io.appmetrica.analytics.impl.A4;
import io.appmetrica.analytics.impl.Cn;
import io.appmetrica.analytics.impl.Gn;
import io.appmetrica.analytics.impl.Hn;
import io.appmetrica.analytics.impl.In;
import io.appmetrica.analytics.impl.La;
import io.appmetrica.analytics.impl.Q6;
import io.appmetrica.analytics.impl.Wf;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public final class Jn {
    public final In a;
    public final BiFunction b;
    public final Wf c;

    public Jn() {
        this(new Gn(), new La(), A4.l().n());
    }

    public Jn(In in3, La la4, Q6 q62) {
        this.a = in3;
        this.b = la4;
        this.c = q62;
    }

    public final ArrayList a(Thread thread, Thread thread2) {
        Object object;
        ArrayList<Cn> arrayList = new ArrayList<Cn>();
        Object object2 = new TreeMap(new Hn());
        try {
            object = this.a.c();
        }
        catch (SecurityException securityException) {
            object = null;
        }
        if (object != null) {
            ((TreeMap)object2).putAll(object);
        }
        if (thread2 != null) {
            ((TreeMap)object2).remove(thread2);
        }
        for (Map.Entry entry : ((TreeMap)object2).entrySet()) {
            object2 = (Thread)entry.getKey();
            if (object2 == thread || object2 == thread2) continue;
            StackTraceElement[] stackTraceElementArray = (StackTraceElement[])entry.getValue();
            arrayList.add((Cn)this.b.apply(object2, stackTraceElementArray));
        }
        return arrayList;
    }
}

