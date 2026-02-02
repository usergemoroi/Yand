/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController;
import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;
import org.jetbrains.annotations.NotNull;

public final class Li
implements IExecutionPolicy {
    public final DataSendingRestrictionController a;
    public final String b;

    public Li(@NotNull DataSendingRestrictionController dataSendingRestrictionController) {
        this.a = dataSendingRestrictionController;
        this.b = "data restriction based";
    }

    @Override
    public final boolean canBeExecuted() {
        return this.a.isRestrictedForSdk() ^ true;
    }

    @Override
    @NotNull
    public final String description() {
        return this.b;
    }
}

