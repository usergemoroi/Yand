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
import io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.impl.Dh;

public abstract class Ch
implements Dh {
    @NonNull
    protected final DataSendingRestrictionController a;

    public Ch(@NonNull DataSendingRestrictionController dataSendingRestrictionController) {
        this.a = dataSendingRestrictionController;
    }

    @Override
    public boolean a(@Nullable Boolean bl2) {
        return WrapUtils.getOrDefault(bl2, Boolean.TRUE);
    }
}

