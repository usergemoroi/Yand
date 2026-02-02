/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceAmount;
import java.math.BigDecimal;

public final class Y {
    public final BigDecimal a;
    public final String b;

    public Y(ECommerceAmount eCommerceAmount) {
        this(eCommerceAmount.getAmount(), eCommerceAmount.getUnit());
    }

    public Y(BigDecimal bigDecimal, String string2) {
        this.a = bigDecimal;
        this.b = string2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("AmountWrapper{amount=");
        stringBuilder.append(this.a);
        stringBuilder.append(", unit='");
        stringBuilder.append(this.b);
        stringBuilder.append("'}");
        return stringBuilder.toString();
    }
}

