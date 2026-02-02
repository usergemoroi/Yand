/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.G;
import io.appmetrica.analytics.impl.i8;
import kotlin.jvm.internal.y;

public final class F {
    public final int a;
    public final int b;
    public final int c;

    public F(int n10, int n13, int n14) {
        this.a = n10;
        this.b = n13;
        this.c = n14;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        Class<?> clazz = object != null ? object.getClass() : null;
        if (!y.e(F.class, clazz)) {
            return false;
        }
        if (object != null) {
            object = (F)object;
            if (this.a != ((F)object).a) {
                return false;
            }
            if (this.b != ((F)object).b) {
                return false;
            }
            return this.c == ((F)object).c;
        }
        throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.impl.id.AdvIdGetterController.CanTrackIdentifiers");
    }

    public final int hashCode() {
        int n10 = i8.a(this.a);
        int n13 = i8.a(this.b);
        return i8.a(this.c) + (n13 + n10 * 31) * 31;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("CanTrackIdentifiers(canTrackGaid=");
        stringBuilder.append(G.a(this.a));
        stringBuilder.append(", canTrackHoaid=");
        stringBuilder.append(G.a(this.b));
        stringBuilder.append(", canTrackYandexAdvId=");
        stringBuilder.append(G.a(this.c));
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

