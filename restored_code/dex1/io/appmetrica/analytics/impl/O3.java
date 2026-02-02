/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 */
package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import io.appmetrica.analytics.impl.Bj;
import io.appmetrica.analytics.impl.Gb;
import io.appmetrica.analytics.impl.Pm;
import io.appmetrica.analytics.impl.X5;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class O3
implements X5 {
    @Nullable
    public final Map<String, String> a(@NotNull ContentValues object) {
        String string2 = object.getAsString("clids");
        if (!Pm.a((HashMap)(object = Gb.c(string2)))) {
            object = new StringBuilder("Passed clids (");
            ((StringBuilder)object).append(string2);
            ((StringBuilder)object).append(") are invalid.");
            Bj.a(((StringBuilder)object).toString(), new Object[0]);
            object = null;
        }
        return object;
    }
}

