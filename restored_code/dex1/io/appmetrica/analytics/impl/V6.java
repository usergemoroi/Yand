/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.collections.l
 *  kotlin.collections.s0
 *  kotlin.collections.t
 *  kotlin.ranges.j
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.impl.zm;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.l;
import kotlin.collections.s0;
import kotlin.ranges.j;
import kotlin.t;
import kotlin.z;
import org.jetbrains.annotations.NotNull;

public final class V6
implements Converter {
    @NotNull
    public final Map<String, List<String>> a(@NotNull zm[] zmArray) {
        LinkedHashMap<String, List<String>> linkedHashMap = new LinkedHashMap<String, List<String>>(j.e((int)s0.f((int)zmArray.length), (int)16));
        for (zm zm3 : zmArray) {
            t<String, List> object = z.a(zm3.a, l.i1((Object[])zm3.b));
            linkedHashMap.put(object.c(), object.d());
        }
        return linkedHashMap;
    }

    @NotNull
    public final zm[] a(@NotNull Map<String, ? extends List<String>> object) {
        zm[] zmArray = new zm[object.size()];
        object = object.entrySet().iterator();
        int n10 = 0;
        while (object.hasNext()) {
            Object object2 = object.next();
            if (n10 < 0) {
                kotlin.collections.t.w();
            }
            String[] stringArray = (String[])object2;
            object2 = new zm();
            ((zm)object2).a = (String)stringArray.getKey();
            if ((stringArray = ((Collection)stringArray.getValue()).toArray(new String[0])) != null) {
                ((zm)object2).b = stringArray;
                zmArray[n10] = object2;
                ++n10;
                continue;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        return zmArray;
    }
}

