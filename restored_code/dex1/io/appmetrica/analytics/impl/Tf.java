/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceAmount;
import io.appmetrica.analytics.ecommerce.ECommercePrice;
import io.appmetrica.analytics.impl.Y;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class Tf {
    public final Y a;
    public final List b;

    public Tf(ECommercePrice eCommercePrice) {
        this(new Y(eCommercePrice.getFiat()), Tf.a(eCommercePrice.getInternalComponents()));
    }

    public Tf(Y y10, LinkedList linkedList) {
        this.a = y10;
        this.b = linkedList;
    }

    public static LinkedList a(List object) {
        if (object != null) {
            LinkedList<Y> linkedList = new LinkedList<Y>();
            Iterator iterator = object.iterator();
            while (true) {
                object = linkedList;
                if (iterator.hasNext()) {
                    object = (ECommerceAmount)iterator.next();
                    linkedList.add(new Y(((ECommerceAmount)object).getAmount(), ((ECommerceAmount)object).getUnit()));
                    continue;
                }
                break;
            }
        } else {
            object = null;
        }
        return object;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("PriceWrapper{fiat=");
        stringBuilder.append(this.a);
        stringBuilder.append(", internalComponents=");
        stringBuilder.append(this.b);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

