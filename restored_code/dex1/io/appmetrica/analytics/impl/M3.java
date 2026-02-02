/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.collections.t
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.Q3;
import io.appmetrica.analytics.impl.ho;
import io.appmetrica.analytics.impl.q8;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.t;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class M3
implements ho {
    @Nullable
    public final List<Q3> a(@NotNull List<Q3> list2, @NotNull Q3 q34) {
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator iterator = list2.iterator();
            while (iterator.hasNext()) {
                Object object = ((Q3)iterator.next()).b;
                q8 q84 = q34.b;
                if (object != q84) continue;
                if (q84 == q8.c) {
                    object = new ArrayList();
                    for (List<Object> list2 : list2) {
                        if (((Q3)((Object)list2)).b == q8.c) continue;
                        object.add(list2);
                    }
                    list2 = t.N0((Collection)object, (Object)q34);
                } else {
                    list2 = null;
                }
                break;
            }
        } else {
            list2 = t.N0(list2, (Object)q34);
        }
        return list2;
    }
}

