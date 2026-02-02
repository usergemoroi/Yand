/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.location.Location
 *  android.os.Bundle
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.impl;

import android.location.Location;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.AdvIdentifiersResult;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.impl.Di;
import io.appmetrica.analytics.impl.Gi;
import io.appmetrica.analytics.impl.Jc;
import io.appmetrica.analytics.impl.Xc;
import io.appmetrica.analytics.impl.Y7;
import io.appmetrica.analytics.impl.cb;
import io.appmetrica.analytics.impl.rb;
import io.appmetrica.analytics.impl.sb;
import io.appmetrica.analytics.impl.xa;
import java.util.List;
import java.util.Map;

public final class B0
implements cb {
    @Override
    @NonNull
    public final sb a() {
        return new Gi();
    }

    @Override
    public final void a(int n10, @NonNull Bundle bundle) {
    }

    @Override
    public final void a(@Nullable Location location) {
    }

    @Override
    public final void a(@NonNull AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
    }

    @Override
    public final void a(DeferredDeeplinkListener deferredDeeplinkListener) {
    }

    @Override
    public final void a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
    }

    @Override
    public final void a(@NonNull ReporterConfig reporterConfig) {
    }

    @Override
    public final void a(@NonNull StartupParamsCallback startupParamsCallback, @NonNull List<String> list) {
        startupParamsCallback.onRequestError(StartupParamsCallback.Reason.UNKNOWN, null);
    }

    @Override
    public final void a(@NonNull String string2) {
    }

    @Override
    public final void a(String string2, String string3) {
    }

    @Override
    public final void a(boolean bl2) {
    }

    @Override
    public final void b(@NonNull AppMetricaConfig appMetricaConfig) {
    }

    @Override
    public final void b(boolean bl2) {
    }

    @Override
    @NonNull
    public final rb c(@NonNull ReporterConfig reporterConfig) {
        return new Di();
    }

    @Override
    public final void clearAppEnvironment() {
    }

    @Override
    @NonNull
    public final xa d() {
        return new xa();
    }

    @Override
    @Nullable
    public final String e() {
        return null;
    }

    @Override
    @Nullable
    public final Map<String, String> g() {
        return null;
    }

    @Override
    @NonNull
    public final AdvIdentifiersResult h() {
        AdvIdentifiersResult.Details details = AdvIdentifiersResult.Details.INTERNAL_ERROR;
        return new AdvIdentifiersResult(new AdvIdentifiersResult.AdvId(null, details, "Device user is in locked state"), new AdvIdentifiersResult.AdvId(null, details, "Device user is in locked state"), new AdvIdentifiersResult.AdvId(null, details, "Device user is in locked state"));
    }

    @Override
    @Nullable
    public final Jc i() {
        Xc xc2 = new Xc();
        return new Jc(xc2, new Y7(xc2));
    }

    @Override
    public final void putAppEnvironmentValue(String string2, String string3) {
    }

    @Override
    public final void setDataSendingEnabled(boolean bl2) {
    }

    @Override
    public final void setUserProfileID(@Nullable String string2) {
    }
}

