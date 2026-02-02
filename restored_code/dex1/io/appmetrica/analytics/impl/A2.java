/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.ProductType;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.impl.B2;
import io.appmetrica.analytics.impl.C2;
import io.appmetrica.analytics.impl.j3;
import io.appmetrica.analytics.impl.z2;
import java.util.ArrayList;
import java.util.Iterator;

public final class A2
implements ProtobufConverter {
    public final j3 a;

    public A2() {
        this(new j3());
    }

    public A2(j3 j33) {
        this.a = j33;
    }

    @NonNull
    public final C2 a(@NonNull z2 z24) {
        C2 c24 = new C2();
        c24.a = new B2[z24.a.size()];
        Iterator iterator = z24.a.iterator();
        int n10 = 0;
        while (iterator.hasNext()) {
            BillingInfo billingInfo = (BillingInfo)iterator.next();
            B2[] b2Array = c24.a;
            this.a.getClass();
            b2Array[n10] = j3.a(billingInfo);
            ++n10;
        }
        c24.b = z24.b;
        return c24;
    }

    @NonNull
    public final z2 a(@NonNull C2 c24) {
        ArrayList<BillingInfo> arrayList = new ArrayList<BillingInfo>(c24.a.length);
        for (B2 b22 : c24.a) {
            this.a.getClass();
            int n10 = b22.a;
            ProductType productType = n10 != 2 ? (n10 != 3 ? ProductType.UNKNOWN : ProductType.SUBS) : ProductType.INAPP;
            arrayList.add(new BillingInfo(productType, b22.b, b22.c, b22.d, b22.e));
        }
        return new z2(arrayList, c24.b);
    }
}

