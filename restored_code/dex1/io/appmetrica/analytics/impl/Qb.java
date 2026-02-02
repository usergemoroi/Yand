/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.Nullable;
import io.appmetrica.analytics.impl.wo;
import io.appmetrica.analytics.impl.yo;

public final class Qb
implements yo {
    public final wo a(@Nullable String string2) {
        if (string2 == null) {
            return new wo(this, false, "key is null");
        }
        if (string2.startsWith("appmetrica")) {
            return new wo(this, false, "key starts with appmetrica");
        }
        if (string2.length() > 200) {
            return new wo(this, false, "key length more then 200 characters");
        }
        return new wo(this, true, "");
    }
}

