/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.Q3;
import io.appmetrica.analytics.impl.p8;
import io.appmetrica.analytics.impl.q8;
import io.appmetrica.analytics.impl.ro;
import org.jetbrains.annotations.NotNull;

public final class Z3
extends p8 {
    public final boolean a(@NotNull Q3 object, @NotNull Q3 q34) {
        boolean bl2;
        block5: {
            block4: {
                if (ro.a(q34.a)) break block4;
                boolean bl3 = ro.a(object.a);
                bl2 = false;
                if (bl3) {
                    return false;
                }
                object = object.b;
                if (!(object == q8.c ? ((Number)this.a.a(object)).intValue() >= ((Number)this.a.a((Object)q34.b)).intValue() : ((Number)this.a.a(object)).intValue() > ((Number)this.a.a((Object)q34.b)).intValue())) break block5;
            }
            bl2 = true;
        }
        return bl2;
    }
}

