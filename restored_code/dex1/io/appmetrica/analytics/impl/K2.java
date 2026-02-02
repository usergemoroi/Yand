/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.impl.L2;
import io.appmetrica.analytics.impl.M2;
import io.appmetrica.analytics.impl.d2;

public final class K2
implements ProtobufConverter {
    @NonNull
    public final M2 a(@NonNull d2 object) {
        int n10 = ((d2)object).a;
        Object var4_3 = null;
        Object object2 = n10 != 1 ? (n10 != 2 ? (n10 != 3 ? (n10 != 4 ? (n10 != 5 ? null : L2.f) : L2.e) : L2.d) : L2.c) : L2.b;
        n10 = ((d2)object).b;
        object = n10 != 0 ? (n10 != 1 ? var4_3 : Boolean.TRUE) : Boolean.FALSE;
        return new M2((L2)((Object)object2), (Boolean)object);
    }

    @NonNull
    public final d2 a(@NonNull M2 object) {
        d2 d24 = new d2();
        L2 l22 = ((M2)object).a;
        if (l22 != null) {
            int n10 = l22.ordinal();
            if (n10 != 1) {
                if (n10 != 2) {
                    if (n10 != 3) {
                        if (n10 != 4) {
                            if (n10 == 5) {
                                d24.a = 5;
                            }
                        } else {
                            d24.a = 4;
                        }
                    } else {
                        d24.a = 3;
                    }
                } else {
                    d24.a = 2;
                }
            } else {
                d24.a = 1;
            }
        }
        if ((object = ((M2)object).b) != null) {
            d24.b = ((Boolean)object).booleanValue() ? 1 : 0;
        }
        return d24;
    }
}

