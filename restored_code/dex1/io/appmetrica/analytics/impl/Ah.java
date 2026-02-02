/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.I5;
import io.appmetrica.analytics.impl.nh;
import io.appmetrica.analytics.impl.o6;
import io.appmetrica.analytics.impl.v5;

public final class Ah
extends nh {
    public Ah(v5 v54) {
        super(v54);
    }

    @Override
    public final boolean a(@NonNull o6 o63) {
        v5 v54 = this.a;
        synchronized (v54) {
            ((I5)v54.p).d();
            return false;
        }
    }
}

