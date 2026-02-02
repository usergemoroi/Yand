/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.collections.s0
 *  kotlin.ranges.j
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.impl.Q3;
import io.appmetrica.analytics.impl.R3;
import io.appmetrica.analytics.impl.T3;
import io.appmetrica.analytics.impl.U3;
import io.appmetrica.analytics.impl.V3;
import io.appmetrica.analytics.impl.W3;
import io.appmetrica.analytics.impl.q8;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.s0;
import kotlin.r;
import kotlin.ranges.j;
import kotlin.t;
import kotlin.z;
import org.jetbrains.annotations.NotNull;

public final class S3
implements ProtobufConverter {
    public static Q3 a(T3 object) {
        int n10;
        Object object2 = object.a;
        if (object2 != null) {
            U3[] u3Array = ((V3)object2).a;
            LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String, String>(j.e((int)s0.f((int)u3Array.length), (int)16));
            int n13 = u3Array.length;
            n10 = 0;
            while (true) {
                object2 = linkedHashMap;
                if (n10 < n13) {
                    object2 = u3Array[n10];
                    object2 = z.a(((U3)object2).a, ((U3)object2).b);
                    linkedHashMap.put((String)((t)object2).c(), (String)((t)object2).d());
                    ++n10;
                    continue;
                }
                break;
            }
        } else {
            object2 = null;
        }
        object = (n10 = object.b) != 0 ? (n10 != 1 ? (n10 != 2 ? (n10 != 3 ? q8.b : q8.e) : q8.d) : q8.c) : q8.b;
        return new Q3((Map<String, String>)object2, (q8)((Object)object));
    }

    public static T3 a(Q3 q34) {
        int n10;
        int n13;
        T3 t33 = new T3();
        Object object = q34.a;
        int n14 = 0;
        if (object != null) {
            V3 v33 = new V3();
            n13 = object.size();
            Object object2 = new U3[n13];
            for (n10 = 0; n10 < n13; ++n10) {
                object2[n10] = new U3();
            }
            v33.a = object2;
            object2 = object.entrySet().iterator();
            n10 = 0;
            while (true) {
                object = v33;
                if (object2.hasNext()) {
                    Object object3 = (Map.Entry)object2.next();
                    object = (String)object3.getKey();
                    object3 = (String)object3.getValue();
                    U3 u33 = v33.a[n10];
                    u33.a = object;
                    u33.b = object3;
                    ++n10;
                    continue;
                }
                break;
            }
        } else {
            object = null;
        }
        t33.a = object;
        n13 = q34.b.ordinal();
        n10 = n14;
        if (n13 != 0) {
            if (n13 != 1) {
                n10 = 2;
                if (n13 != 2) {
                    n10 = 3;
                    if (n13 != 3) {
                        throw new r();
                    }
                }
            } else {
                n10 = 1;
            }
        }
        t33.b = n10;
        return t33;
    }

    @NotNull
    public final R3 a(@NotNull W3 object) {
        T3[] t3Array = ((W3)object).a;
        Object object2 = t3Array;
        if (t3Array == null) {
            object2 = new T3();
        }
        object2 = S3.a((T3)object2);
        t3Array = ((W3)object).b;
        object = new ArrayList(t3Array.length);
        int n10 = t3Array.length;
        for (int i14 = 0; i14 < n10; ++i14) {
            ((ArrayList)object).add(S3.a(t3Array[i14]));
        }
        return new R3((Q3)object2, (List<Q3>)object);
    }

    @NotNull
    public final W3 a(@NotNull R3 r34) {
        W3 w33 = new W3();
        w33.a = S3.a(r34.a);
        int n10 = r34.b.size();
        T3[] t3Array = new T3[n10];
        for (int i14 = 0; i14 < n10; ++i14) {
            t3Array[i14] = S3.a((Q3)r34.b.get(i14));
        }
        w33.b = t3Array;
        return w33;
    }
}

