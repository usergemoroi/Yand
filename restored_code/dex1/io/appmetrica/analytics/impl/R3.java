/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.Q3;
import io.appmetrica.analytics.impl.o8;
import java.util.List;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class R3
implements o8 {
    public final Q3 a;
    public final List b;

    public R3(@NotNull Q3 q34, @NotNull List<Q3> list) {
        this.a = q34;
        this.b = list;
    }

    public static R3 a(R3 r34, Q3 q34, List list, int n10, Object object) {
        if ((n10 & 1) != 0) {
            q34 = r34.a;
        }
        if ((n10 & 2) != 0) {
            list = r34.b;
        }
        r34.getClass();
        return new R3(q34, list);
    }

    @NotNull
    public final R3 a(@NotNull Q3 q34, @NotNull List<Q3> list) {
        return new R3(q34, list);
    }

    @Override
    @NotNull
    public final List<Q3> a() {
        return this.b;
    }

    @Override
    public final Object b() {
        return this.a;
    }

    @NotNull
    public final Q3 c() {
        return this.a;
    }

    @NotNull
    public final List<Q3> d() {
        return this.b;
    }

    @NotNull
    public final Q3 e() {
        return this.a;
    }

    public final boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof R3)) {
            return false;
        }
        object = (R3)object;
        if (!y.e(this.a, ((R3)object).a)) {
            return false;
        }
        return y.e(this.b, ((R3)object).b);
    }

    public final int hashCode() {
        int n10 = this.a.hashCode();
        return ((Object)this.b).hashCode() + n10 * 31;
    }

    @NotNull
    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ClidsInfo(chosen=");
        stringBuilder.append(this.a);
        stringBuilder.append(", candidates=");
        stringBuilder.append(this.b);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

