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
import io.appmetrica.analytics.impl.U2;
import io.appmetrica.analytics.impl.Zf;
import io.appmetrica.analytics.impl.eb;
import io.appmetrica.analytics.impl.o6;
import io.appmetrica.analytics.impl.v9;
import java.util.Iterator;

public abstract class V2 {
    public final Zf a;
    public final eb b;

    public V2(Zf zf2, eb eb4) {
        this.a = zf2;
        this.b = eb4;
    }

    public final eb a() {
        return this.b;
    }

    public final boolean a(@NonNull o6 o63, @NonNull U2 u22) {
        Iterator iterator = ((v9)this.a.a((int)o63.d)).a.iterator();
        while (iterator.hasNext()) {
            if (!u22.a(iterator.next(), o63)) continue;
            return true;
        }
        return false;
    }

    @VisibleForTesting(otherwise=5)
    public final Zf b() {
        return this.a;
    }
}

