/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.Vb;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory;
import org.jetbrains.annotations.NotNull;

public final class Ub
implements LastKnownLocationExtractorProviderFactory {
    public final Vb a = new Vb();

    @Override
    @NotNull
    public final LastKnownLocationExtractorProvider getGplLastKnownLocationExtractorProvider() {
        return this.a;
    }

    @Override
    @NotNull
    public final LastKnownLocationExtractorProvider getGpsLastKnownLocationExtractorProvider() {
        return this.a;
    }

    @Override
    @NotNull
    public final LastKnownLocationExtractorProvider getNetworkLastKnownLocationExtractorProvider() {
        return this.a;
    }

    @Override
    @NotNull
    public final LastKnownLocationExtractorProvider getPassiveLastKnownLocationExtractorProvider() {
        return this.a;
    }
}

