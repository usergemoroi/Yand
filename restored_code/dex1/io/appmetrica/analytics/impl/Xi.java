/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.Vd;
import io.appmetrica.analytics.impl.Wi;
import io.appmetrica.analytics.impl.jo;
import io.appmetrica.analytics.impl.r2;
import io.appmetrica.analytics.impl.yo;

public final class Xi
extends Vd {
    public Xi(int n10, @NonNull String string2, @NonNull yo yo3, @NonNull r2 r24) {
        super(n10, string2, yo3, new Wi(r24));
    }

    @Override
    public final void a(@NonNull jo jo3) {
        if (this.f()) {
            this.d.a(jo3, null, this);
        }
    }
}

