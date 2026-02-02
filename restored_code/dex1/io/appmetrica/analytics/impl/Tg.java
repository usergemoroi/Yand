/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceReferrer;
import io.appmetrica.analytics.impl.yj;

public final class Tg {
    public final String a;
    public final String b;
    public final yj c;

    public Tg(ECommerceReferrer object) {
        String string2 = ((ECommerceReferrer)object).getType();
        String string3 = ((ECommerceReferrer)object).getIdentifier();
        object = ((ECommerceReferrer)object).getScreen() == null ? null : new yj(((ECommerceReferrer)object).getScreen());
        this(string2, string3, (yj)object);
    }

    public Tg(String string2, String string3, yj yj3) {
        this.a = string2;
        this.b = string3;
        this.c = yj3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ReferrerWrapper{type='");
        stringBuilder.append(this.a);
        stringBuilder.append("', identifier='");
        stringBuilder.append(this.b);
        stringBuilder.append("', screen=");
        stringBuilder.append(this.c);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

