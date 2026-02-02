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
import io.appmetrica.analytics.impl.Jl;
import io.appmetrica.analytics.impl.Km;
import io.appmetrica.analytics.impl.Na;
import io.appmetrica.analytics.impl.Sl;
import io.appmetrica.analytics.impl.am;
import io.appmetrica.analytics.impl.km;
import io.appmetrica.analytics.impl.mm;
import io.appmetrica.analytics.networktasks.internal.ConfigProvider;
import io.appmetrica.analytics.networktasks.internal.FullUrlFormer;
import io.appmetrica.analytics.networktasks.internal.RequestDataHolder;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask;
import javax.net.ssl.SSLSocketFactory;

public final class Im
implements UnderlyingNetworkTask {
    public final Km a;
    public mm b;
    public Sl c;
    public final RequestDataHolder d;
    public final ConfigProvider e;
    public final ResponseDataHolder f;
    public final FullUrlFormer g;
    public final am h;

    public Im(Km km3, am am2, FullUrlFormer fullUrlFormer, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, ConfigProvider configProvider) {
        this.a = km3;
        this.h = am2;
        this.d = requestDataHolder;
        this.f = responseDataHolder;
        this.e = configProvider;
        this.g = fullUrlFormer;
        fullUrlFormer.setHosts(((km)configProvider.getConfig()).k());
    }

    public Im(@NonNull Km km3, @NonNull FullUrlFormer<km> fullUrlFormer, @NonNull RequestDataHolder requestDataHolder, @NonNull ResponseDataHolder responseDataHolder, @NonNull ConfigProvider<km> configProvider) {
        this(km3, new am(), fullUrlFormer, requestDataHolder, responseDataHolder, configProvider);
    }

    @Override
    @NonNull
    public final String description() {
        StringBuilder stringBuilder = new StringBuilder("Startup task for component: ");
        stringBuilder.append(this.a.a.f.toString());
        return stringBuilder.toString();
    }

    @Override
    @NonNull
    public final FullUrlFormer<?> getFullUrlFormer() {
        return this.g;
    }

    @Override
    @NonNull
    public final RequestDataHolder getRequestDataHolder() {
        return this.d;
    }

    @Override
    @NonNull
    public final ResponseDataHolder getResponseDataHolder() {
        return this.f;
    }

    @Override
    @Nullable
    public final RetryPolicyConfig getRetryPolicyConfig() {
        return ((km)this.e.getConfig()).getRetryPolicyConfig();
    }

    @Override
    @Nullable
    public final SSLSocketFactory getSslSocketFactory() {
        ((Jl)Na.F.y()).getClass();
        return null;
    }

    @Override
    public final boolean onCreateTask() {
        this.d.setHeader("Accept-Encoding", "encrypted");
        return this.a.g();
    }

    @Override
    public final void onPerformRequest() {
    }

    @Override
    public final void onPostRequestComplete(boolean bl2) {
        if (!bl2) {
            this.c = Sl.d;
        }
    }

    @Override
    public final boolean onRequestComplete() {
        mm mm3;
        this.b = mm3 = this.h.a(this.f);
        boolean bl2 = mm3 != null;
        return bl2;
    }

    @Override
    public final void onRequestError(@Nullable Throwable throwable) {
        this.c = Sl.c;
    }

    @Override
    public final void onShouldNotExecute() {
        this.c = Sl.c;
    }

    @Override
    public final void onSuccessfulTaskFinished() {
        if (this.b != null && this.f.getResponseHeaders() != null) {
            this.a.a(this.b, (km)this.e.getConfig(), this.f.getResponseHeaders());
        }
    }

    @Override
    public final void onTaskAdded() {
    }

    @Override
    public final void onTaskFinished() {
    }

    @Override
    public final void onTaskRemoved() {
    }

    @Override
    public final void onUnsuccessfulTaskFinished() {
        if (this.c == null) {
            this.c = Sl.b;
        }
        this.a.a(this.c);
    }
}

