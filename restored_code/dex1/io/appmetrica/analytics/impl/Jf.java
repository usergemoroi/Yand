/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.impl.q8;

public final class Jf
implements Converter {
    @NonNull
    public final q8 a(@NonNull Integer n10) {
        int n13 = n10;
        if (n13 != 1) {
            if (n13 != 2) {
                if (n13 != 3) {
                    return q8.b;
                }
                return q8.d;
            }
            return q8.e;
        }
        return q8.c;
    }

    @NonNull
    public final Integer a(@NonNull q8 q84) {
        int n10 = q84.ordinal();
        if (n10 != 1) {
            if (n10 != 2) {
                if (n10 != 3) {
                    return 0;
                }
                return 2;
            }
            return 3;
        }
        return 1;
    }
}

