/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.collections.s0
 *  kotlin.ranges.j
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.impl.Uk;
import io.appmetrica.analytics.impl.Vk;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.s0;
import kotlin.ranges.j;
import kotlin.t;
import kotlin.text.d;
import kotlin.z;
import org.jetbrains.annotations.NotNull;

public final class Sk
implements ProtobufConverter {
    @NotNull
    public final Uk a(@NotNull Map<String, byte[]> vkArray) {
        Uk uk3 = new Uk();
        ArrayList<Vk> arrayList = new ArrayList<Vk>(vkArray.size());
        for (Map.Entry entry : vkArray.entrySet()) {
            Vk vk3 = new Vk();
            vk3.a = ((String)entry.getKey()).getBytes(d.b);
            vk3.b = (byte[])entry.getValue();
            arrayList.add(vk3);
        }
        vkArray = arrayList.toArray(new Vk[0]);
        if (vkArray != null) {
            uk3.a = (Vk[])vkArray;
            return uk3;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    @NotNull
    public final Map<String, byte[]> a(@NotNull Uk object) {
        Vk[] vkArray = ((Uk)((Object)object)).a;
        object = new LinkedHashMap<String, byte[]>(j.e((int)s0.f((int)vkArray.length), (int)16));
        for (Vk vk3 : vkArray) {
            t<String, byte[]> object2 = z.a(new String(vk3.a, d.b), vk3.b);
            object.put(object2.c(), object2.d());
        }
        return object;
    }
}

