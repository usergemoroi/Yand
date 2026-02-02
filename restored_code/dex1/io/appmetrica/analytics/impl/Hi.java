/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.impl.wo;
import io.appmetrica.analytics.impl.yo;
import java.util.Map;

public final class Hi
implements yo {
    public final Map a;

    public Hi(@NonNull Map<String, ?> map2) {
        this.a = map2;
    }

    public final wo a(@Nullable String string2) {
        if (this.a.containsKey(string2)) {
            return new wo(this, false, String.format("Failed to activate AppMetrica with provided apiKey ApiKey %s has already been used by another reporter.", string2));
        }
        return new wo(this, true, "");
    }
}

