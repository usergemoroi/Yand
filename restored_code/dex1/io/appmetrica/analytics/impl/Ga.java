/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.M4;
import io.appmetrica.analytics.impl.Na;
import io.appmetrica.analytics.impl.S4;
import io.appmetrica.analytics.impl.T;
import io.appmetrica.analytics.impl.V4;
import io.appmetrica.analytics.impl.Y4;
import io.appmetrica.analytics.impl.o6;
import io.appmetrica.analytics.impl.xb;
import org.jetbrains.annotations.NotNull;

public final class Ga
extends Y4 {
    public Ga(@NotNull V4 v44) {
        super(v44);
    }

    @Override
    public final boolean a(@NotNull o6 parcelable, @NotNull S4 object) {
        parcelable = parcelable.m;
        parcelable = parcelable != null ? (xb)parcelable.getParcelable("io.appmetrica.analytics.impl.IdentifiersData") : null;
        if (parcelable != null) {
            boolean bl2 = ((xb)parcelable).d;
            boolean bl3 = true;
            if (bl2) {
                Object object2 = ((S4)object).b.d.a;
                object = ((M4)object2).n;
                object2 = ((M4)object2).i;
                T t13 = Na.F.b();
                if (object != null) {
                    bl3 = (Boolean)object;
                }
                t13.c(bl3);
                Na.F.g().b((Boolean)object2);
            }
        }
        this.a.a((xb)parcelable);
        return false;
    }
}

