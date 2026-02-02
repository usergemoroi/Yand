/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.D3;
import io.appmetrica.analytics.impl.Jl;
import io.appmetrica.analytics.impl.Na;
import io.appmetrica.analytics.modulesapi.internal.network.NetworkClientWithCacheControl;
import io.appmetrica.analytics.modulesapi.internal.network.SimpleNetworkApi;
import io.appmetrica.analytics.networktasks.internal.CacheControlHttpsConnectionPerformer;
import org.jetbrains.annotations.NotNull;

public final class Bl
implements SimpleNetworkApi {
    public final CacheControlHttpsConnectionPerformer a = new CacheControlHttpsConnectionPerformer(((Jl)Na.j().y()).getSslSocketFactory());

    @Override
    public final void performRequestWithCacheControl(@NotNull String string2, @NotNull NetworkClientWithCacheControl networkClientWithCacheControl) {
        this.a.performConnection(string2, new D3(networkClientWithCacheControl));
    }
}

