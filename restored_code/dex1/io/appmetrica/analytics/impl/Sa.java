/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.impl.R2;
import io.appmetrica.analytics.impl.Sn;
import io.appmetrica.analytics.impl.z3;

public final class Sa
extends R2 {
    public Sa(int n10) {
        super(n10);
    }

    @NonNull
    public final Sn a(@Nullable String string2) {
        int n10;
        int n13 = n10 = 0;
        String string3 = string2;
        if (string2 != null) {
            int n14 = string2.length();
            int n15 = this.a;
            n13 = n10;
            string3 = string2;
            if (n14 > n15) {
                string3 = string2.substring(0, n15);
                n13 = string2.getBytes().length - string3.getBytes().length;
            }
        }
        return new Sn(string3, new z3(n13));
    }
}

