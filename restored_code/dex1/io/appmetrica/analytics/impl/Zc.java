/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.collections.s0
 *  kotlin.collections.t
 *  kotlin.ranges.j
 *  org.json.JSONObject
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.aa;
import io.appmetrica.analytics.impl.ad;
import io.appmetrica.analytics.impl.ja;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.s0;
import kotlin.r;
import kotlin.ranges.j;
import kotlin.t;
import kotlin.text.d;
import kotlin.z;
import org.json.JSONObject;

public final class Zc {
    public static final aa a(Zc object, ja object2, Map object3) {
        int n10;
        object.getClass();
        aa aa4 = new aa();
        switch (((Enum)object2).ordinal()) {
            default: {
                throw new r();
            }
            case 6: {
                n10 = 6;
                break;
            }
            case 5: {
                n10 = 5;
                break;
            }
            case 4: {
                n10 = 4;
                break;
            }
            case 3: {
                n10 = 3;
                break;
            }
            case 2: {
                n10 = 2;
                break;
            }
            case 1: {
                n10 = 1;
                break;
            }
            case 0: {
                n10 = 0;
            }
        }
        aa4.a = n10;
        ad.b.getClass();
        object = object3.entrySet();
        object2 = new LinkedHashMap(j.e((int)s0.f((int)kotlin.collections.t.x((Iterable)object, (int)10)), (int)16));
        object3 = object.iterator();
        while (object3.hasNext()) {
            Object k11;
            block13: {
                block11: {
                    block12: {
                        object = (Map.Entry)object3.next();
                        k11 = object.getKey();
                        if (!(object.getValue() instanceof Number)) break block11;
                        Object v14 = object.getValue();
                        if (v14 == null) break block12;
                        double d14 = ((Number)v14).doubleValue();
                        if (!Double.isInfinite(d14) && !Double.isNaN(d14)) break block11;
                        object = null;
                        break block13;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Number");
                }
                object = object.getValue();
            }
            object = z.a(k11, object);
            object2.put(((t)object).c(), ((t)object).d());
        }
        object = new JSONObject((Map)object2).toString();
        if (object != null) {
            aa4.b = ((String)object).getBytes(d.b);
        }
        return aa4;
    }
}

