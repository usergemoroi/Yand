/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.impl.M4;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.util.Map;

public final class Bh
extends BaseRequestConfig.BaseRequestArguments {
    @Nullable
    public final String a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;
    public final boolean h;
    @Nullable
    public final Map<String, String> i;
    public final int j;

    public Bh(@NonNull M4 m44) {
        this(m44.a, m44.b, m44.d, m44.e, m44.f, m44.g, m44.h, m44.i, m44.j, m44.k);
    }

    public Bh(String object, Boolean bl2, Boolean bl3, Integer n10, Integer n13, Integer n14, Boolean bl4, Boolean bl5, Map map2, Integer n15) {
        this.a = object;
        object = Boolean.FALSE;
        this.b = (Boolean)WrapUtils.getOrDefault(bl2, object);
        this.c = (Boolean)WrapUtils.getOrDefault(bl3, object);
        this.d = Math.max(10, WrapUtils.getOrDefault(n10, 10));
        this.e = WrapUtils.getOrDefault(n13, 7);
        this.f = WrapUtils.getOrDefault(n14, 90);
        this.g = (Boolean)WrapUtils.getOrDefault(bl4, object);
        this.h = WrapUtils.getOrDefault(bl5, Boolean.TRUE);
        this.i = map2;
        this.j = WrapUtils.getOrDefault(n15, 1000);
    }

    public static Bh a() {
        return new Bh(null, null, null, null, null, null, null, null, null, null);
    }

    public final boolean a(@NonNull M4 object) {
        Object object2 = ((M4)object).b;
        if (object2 != null && this.b != (Boolean)object2) {
            return false;
        }
        object2 = ((M4)object).d;
        if (object2 != null && this.c != (Boolean)object2) {
            return false;
        }
        object2 = ((M4)object).e;
        if (object2 != null && this.d != (Integer)object2) {
            return false;
        }
        object2 = ((M4)object).f;
        if (object2 != null && this.e != (Integer)object2) {
            return false;
        }
        object2 = ((M4)object).g;
        if (object2 != null && this.f != (Integer)object2) {
            return false;
        }
        object2 = ((M4)object).h;
        if (object2 != null && this.g != (Boolean)object2) {
            return false;
        }
        object2 = ((M4)object).i;
        if (object2 != null && this.h != (Boolean)object2) {
            return false;
        }
        Map<String, String> map2 = ((M4)object).a;
        if (!(map2 == null || (object2 = this.a) != null && ((String)object2).equals(map2))) {
            return false;
        }
        map2 = ((M4)object).j;
        if (!(map2 == null || (object2 = this.i) != null && object2.equals(map2))) {
            return false;
        }
        object = ((M4)object).k;
        return object == null || this.j == (Integer)object;
    }

    @NonNull
    public final Bh b(@NonNull M4 m44) {
        return new Bh(WrapUtils.getOrDefaultNullable(m44.a, this.a), WrapUtils.getOrDefaultNullable(m44.b, this.b), WrapUtils.getOrDefaultNullable(m44.d, this.c), WrapUtils.getOrDefaultNullable(m44.e, this.d), WrapUtils.getOrDefaultNullable(m44.f, this.e), WrapUtils.getOrDefaultNullable(m44.g, this.f), WrapUtils.getOrDefaultNullable(m44.h, this.g), WrapUtils.getOrDefaultNullable(m44.i, this.h), WrapUtils.getOrDefaultNullable(m44.j, this.i), WrapUtils.getOrDefaultNullable(m44.k, this.j));
    }
}

