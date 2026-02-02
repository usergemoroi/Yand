/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.network.NetworkClientWithCacheControl;
import io.appmetrica.analytics.networktasks.internal.CacheControlHttpsConnectionPerformer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class D3
implements CacheControlHttpsConnectionPerformer.Client {
    public final NetworkClientWithCacheControl a;

    public D3(@NotNull NetworkClientWithCacheControl networkClientWithCacheControl) {
        this.a = networkClientWithCacheControl;
    }

    @Override
    @Nullable
    public final String getOldETag() {
        return this.a.getETag();
    }

    @Override
    public final void onError() {
        this.a.onError();
    }

    @Override
    public final void onNotModified() {
        this.a.onNotModified();
    }

    @Override
    public final void onResponse(@NotNull String string2, @NotNull byte[] byArray) {
        this.a.onResponse(string2, byArray);
    }
}

