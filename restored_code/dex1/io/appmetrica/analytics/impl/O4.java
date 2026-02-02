/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.Bb;
import io.appmetrica.analytics.impl.Ni;
import io.appmetrica.analytics.impl.P4;
import io.appmetrica.analytics.impl.W9;
import io.appmetrica.analytics.impl.nh;
import java.util.List;

public final class O4
extends P4 {
    public O4(@NonNull Ni ni3) {
        super(ni3);
    }

    public final void a(@NonNull Bb bb4, @NonNull List<nh> list) {
        if (W9.h.contains((Object)bb4) ^ true) {
            list.add(this.a.s);
        }
        if (W9.b.contains((Object)bb4) ^ true) {
            list.add(this.a.c);
        }
    }
}

