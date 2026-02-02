/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceCartItem;
import io.appmetrica.analytics.impl.Tf;
import io.appmetrica.analytics.impl.Tg;
import io.appmetrica.analytics.impl.dg;
import java.math.BigDecimal;

public final class J3 {
    public final dg a;
    public final BigDecimal b;
    public final Tf c;
    public final Tg d;

    public J3(ECommerceCartItem object) {
        dg dg3 = new dg(((ECommerceCartItem)object).getProduct());
        BigDecimal bigDecimal = ((ECommerceCartItem)object).getQuantity();
        Tf tf2 = new Tf(((ECommerceCartItem)object).getRevenue());
        object = ((ECommerceCartItem)object).getReferrer() == null ? null : new Tg(((ECommerceCartItem)object).getReferrer());
        this(dg3, bigDecimal, tf2, (Tg)object);
    }

    public J3(dg dg3, BigDecimal bigDecimal, Tf tf2, Tg tg3) {
        this.a = dg3;
        this.b = bigDecimal;
        this.c = tf2;
        this.d = tg3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("CartItemWrapper{product=");
        stringBuilder.append(this.a);
        stringBuilder.append(", quantity=");
        stringBuilder.append(this.b);
        stringBuilder.append(", revenue=");
        stringBuilder.append(this.c);
        stringBuilder.append(", referrer=");
        stringBuilder.append(this.d);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

