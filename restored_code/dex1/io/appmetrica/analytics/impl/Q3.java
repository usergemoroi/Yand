/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.q8;
import io.appmetrica.analytics.impl.r8;
import java.util.Map;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class Q3
implements r8 {
    public final Map a;
    public final q8 b;

    public Q3(@Nullable Map<String, String> map2, @NotNull q8 q84) {
        this.a = map2;
        this.b = q84;
    }

    public static Q3 a(Q3 q34, Map map2, q8 q84, int n10, Object object) {
        if ((n10 & 1) != 0) {
            map2 = q34.a;
        }
        if ((n10 & 2) != 0) {
            q84 = q34.b;
        }
        q34.getClass();
        return new Q3(map2, q84);
    }

    @NotNull
    public final Q3 a(@Nullable Map<String, String> map2, @NotNull q8 q84) {
        return new Q3(map2, q84);
    }

    @Override
    @NotNull
    public final q8 a() {
        return this.b;
    }

    @Nullable
    public final Map<String, String> b() {
        return this.a;
    }

    @NotNull
    public final q8 c() {
        return this.b;
    }

    @Nullable
    public final Map<String, String> d() {
        return this.a;
    }

    public final boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof Q3)) {
            return false;
        }
        object = (Q3)object;
        if (!y.e(this.a, ((Q3)object).a)) {
            return false;
        }
        return this.b == ((Q3)object).b;
    }

    public final int hashCode() {
        Map map2 = this.a;
        int n10 = map2 == null ? 0 : ((Object)map2).hashCode();
        return ((Object)((Object)this.b)).hashCode() + n10 * 31;
    }

    @NotNull
    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Candidate(clids=");
        stringBuilder.append(this.a);
        stringBuilder.append(", source=");
        stringBuilder.append((Object)this.b);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

