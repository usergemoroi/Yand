/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.impl.Qa;
import io.appmetrica.analytics.impl.Y;

public final class Sf
extends Qa {
    public Sf(int n10) {
        super(n10);
    }

    public final int a(@Nullable Y y10) {
        int n10 = y10 == null ? 0 : StringUtils.getUtf8BytesLength(y10.b) + 12;
        return n10;
    }
}

