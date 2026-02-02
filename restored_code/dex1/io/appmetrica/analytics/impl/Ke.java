/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.ecommerce.ECommerceCartItem;
import io.appmetrica.analytics.ecommerce.ECommerceOrder;
import io.appmetrica.analytics.impl.J3;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public final class Ke {
    public final String a;
    public final String b;
    public final List c;
    public final Map d;

    public Ke(ECommerceOrder eCommerceOrder) {
        this(UUID.randomUUID().toString(), eCommerceOrder.getIdentifier(), Ke.a(eCommerceOrder.getCartItems()), CollectionUtils.mapCopyOfNullableMap(eCommerceOrder.getPayload()));
    }

    public Ke(String string2, String string3, ArrayList arrayList, Map map2) {
        this.a = string2;
        this.b = string3;
        this.c = arrayList;
        this.d = map2;
    }

    public static ArrayList a(List object) {
        ArrayList<J3> arrayList = new ArrayList<J3>(object.size());
        object = object.iterator();
        while (object.hasNext()) {
            arrayList.add(new J3((ECommerceCartItem)object.next()));
        }
        return arrayList;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("OrderWrapper{uuid='");
        stringBuilder.append(this.a);
        stringBuilder.append("', identifier='");
        stringBuilder.append(this.b);
        stringBuilder.append("', cartItems=");
        stringBuilder.append(this.c);
        stringBuilder.append(", payload=");
        stringBuilder.append(this.d);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

