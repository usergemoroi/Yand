/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.Nullable;
import io.appmetrica.analytics.impl.Bb;
import io.appmetrica.analytics.impl.Gg;
import io.appmetrica.analytics.impl.Jg;
import io.appmetrica.analytics.impl.Pc;
import io.appmetrica.analytics.impl.o6;

public final class Oc
implements Gg {
    public final Pc a;

    public Oc(Pc pc3) {
        this.a = pc3;
    }

    @Override
    public final void a(@Nullable Jg object) {
        if (object == null) {
            return;
        }
        o6 o63 = new o6("", "", 0);
        o63.setValueBytes(object.a());
        object = Bb.c;
        o63.d = 4097;
        this.a.a(o63);
    }
}

