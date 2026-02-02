/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.Kf;
import io.appmetrica.analytics.impl.p8;
import org.jetbrains.annotations.NotNull;

public final class Ef
extends p8 {
    public final boolean a(@NotNull Kf kf3, @NotNull Kf kf4) {
        boolean bl2 = kf3.c;
        boolean bl3 = false;
        if (!bl2) {
            return false;
        }
        if (!kf4.c) {
            return true;
        }
        if (((Number)this.a.a((Object)kf3.e)).intValue() > ((Number)this.a.a((Object)kf4.e)).intValue()) {
            bl3 = true;
        }
        return bl3;
    }
}

