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
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.impl.Qa;
import io.appmetrica.analytics.impl.Sa;

public final class Ra
extends Qa {
    public Ra(int n10, int n13) {
        this(n10, new Sa(n13));
    }

    @VisibleForTesting
    public Ra(int n10, @NonNull Sa sa2) {
        super(n10, sa2);
    }

    public final int a(@Nullable String string2) {
        return StringUtils.getUTF8Bytes(string2).length;
    }

    @Override
    public final int b(@Nullable Object object) {
        return StringUtils.getUTF8Bytes((String)object).length;
    }
}

