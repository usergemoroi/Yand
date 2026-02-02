/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.collections.t
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.Ml;
import io.appmetrica.analytics.impl.Mn;
import io.appmetrica.analytics.impl.Nn;
import io.appmetrica.analytics.impl.U;
import io.appmetrica.analytics.impl.Wn;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.t;

public abstract class Zn {
    public static final Wn a(Throwable object, U u11, List object2, String string2, Boolean bl2) {
        ArrayList<Ml> arrayList = null;
        object = object != null ? Nn.a((Throwable)object, 1, 0) : null;
        if (object2 != null) {
            ArrayList<Ml> arrayList2 = new ArrayList<Ml>(t.x((Iterable)object2, (int)10));
            object2 = object2.iterator();
            while (true) {
                arrayList = arrayList2;
                if (!object2.hasNext()) break;
                arrayList2.add(new Ml((StackTraceElement)object2.next()));
            }
        }
        return new Wn((Mn)object, u11, arrayList, null, null, null, string2, bl2);
    }
}

