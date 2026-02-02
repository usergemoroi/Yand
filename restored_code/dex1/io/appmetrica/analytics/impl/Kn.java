/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.ValidationException;
import io.appmetrica.analytics.impl.wo;
import io.appmetrica.analytics.impl.yo;

public class Kn
implements yo {
    public final yo a;

    public Kn(@NonNull yo yo3) {
        this.a = yo3;
    }

    @Override
    public final wo a(@Nullable Object object) {
        object = this.a.a(object);
        if (((wo)object).a) {
            return object;
        }
        throw new ValidationException(((wo)object).b);
    }

    @NonNull
    @VisibleForTesting
    public final yo a() {
        return this.a;
    }
}

