/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.rd;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class P5
implements rd {
    public final String a;

    public P5(@NotNull String string2) {
        this.a = string2;
    }

    public static P5 a(P5 p54, String string2, int n10, Object object) {
        if ((n10 & 1) != 0) {
            string2 = p54.a;
        }
        p54.getClass();
        return new P5(string2);
    }

    @NotNull
    public final P5 a(@NotNull String string2) {
        return new P5(string2);
    }

    @Override
    @NotNull
    public final String a() {
        return this.a;
    }

    @NotNull
    public final String b() {
        return this.a;
    }

    public final boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof P5)) {
            return false;
        }
        object = (P5)object;
        return y.e(this.a, ((P5)object).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @NotNull
    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ConstantModuleEntryPointProvider(className=");
        stringBuilder.append(this.a);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

