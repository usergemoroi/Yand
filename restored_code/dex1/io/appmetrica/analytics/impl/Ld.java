/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.collections.s0
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.impl.Cm;
import io.appmetrica.analytics.impl.Hk;
import io.appmetrica.analytics.impl.Na;
import io.appmetrica.analytics.impl.yd;
import java.util.ArrayList;
import java.util.Map;
import kotlin.collections.s0;
import kotlin.z;
import org.jetbrains.annotations.NotNull;

public final class Ld
implements Converter {
    public final Hk a = Na.j().o();

    @NotNull
    public final Map<String, Object> a(@NotNull Cm[] cmArray) {
        Map<String, yd> map2 = this.a.c();
        ArrayList<String> arrayList = new ArrayList<String>();
        for (Cm cm3 : cmArray) {
            Object object2;
            yd yd3 = map2.get(cm3.a);
            if (yd3 != null) {
                object2 = cm3.a;
                byte[] byArray = cm3.b;
                object2 = z.a(object2, yd3.c.toModel(byArray));
            } else {
                object2 = null;
            }
            if (object2 == null) continue;
            arrayList.add((String)object2);
        }
        return s0.v(arrayList);
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public final Cm[] a(@NotNull Map<String, ? extends Object> object2) {
        Map<String, yd> map2 = this.a.c();
        ArrayList<void> arrayList = new ArrayList<void>();
        for (Map.Entry entry : object2.entrySet()) {
            void var1_6;
            String string2 = (String)entry.getKey();
            Object v14 = entry.getValue();
            yd yd3 = map2.get(string2);
            if (yd3 != null && v14 != null) {
                Cm cm3 = new Cm();
                cm3.a = string2;
                cm3.b = (byte[])yd3.c.fromModel(v14);
            } else {
                Object var1_5 = null;
            }
            if (var1_6 == null) continue;
            arrayList.add(var1_6);
        }
        Cm[] cmArray = arrayList.toArray(new Cm[0]);
        if (cmArray != null) {
            return cmArray;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }
}

