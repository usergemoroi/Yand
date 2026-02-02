/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.VisibleForTesting
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceOrder;
import io.appmetrica.analytics.impl.A8;
import io.appmetrica.analytics.impl.Je;
import io.appmetrica.analytics.impl.Ke;
import io.appmetrica.analytics.impl.Zi;
import java.util.List;

public final class Ie
extends ECommerceEvent {
    public static final int d = 6;
    public static final int e = 7;
    public final int a;
    @NonNull
    public final Ke b;
    public final A8 c;

    public Ie(int n10, @NonNull ECommerceOrder eCommerceOrder) {
        this(n10, new Ke(eCommerceOrder), new Je());
    }

    @VisibleForTesting
    public Ie(int n10, @NonNull Ke ke3, @NonNull A8 a84) {
        this.a = n10;
        this.b = ke3;
        this.c = a84;
    }

    @NonNull
    @VisibleForTesting
    public final A8 a() {
        return this.c;
    }

    @Override
    @NonNull
    public final String getPublicDescription() {
        return "order info";
    }

    @Override
    public final List<Zi> toProto() {
        return (List)this.c.fromModel(this);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("OrderInfoEvent{eventType=");
        stringBuilder.append(this.a);
        stringBuilder.append(", order=");
        stringBuilder.append(this.b);
        stringBuilder.append(", converter=");
        stringBuilder.append(this.c);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

