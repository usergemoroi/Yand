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
import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.impl.U;
import io.appmetrica.analytics.impl.Wn;
import io.appmetrica.analytics.impl.jf;
import io.appmetrica.analytics.impl.rb;
import io.appmetrica.analytics.plugins.IPluginReporter;
import io.appmetrica.analytics.profile.UserProfile;
import java.util.Map;

public class Di
implements rb {
    public final jf a = new jf();

    @Override
    public final void a(@NonNull U u11) {
    }

    @Override
    public final void a(@NonNull Wn wn3) {
    }

    @Override
    public final void clearAppEnvironment() {
    }

    @Override
    @NonNull
    public final IPluginReporter getPluginExtension() {
        return this.a;
    }

    @Override
    public final void pauseSession() {
    }

    @Override
    public final void putAppEnvironmentValue(@NonNull String string2, @Nullable String string3) {
    }

    @Override
    public final void reportAdRevenue(@NonNull AdRevenue adRevenue) {
    }

    @Override
    public void reportAdRevenue(@NonNull AdRevenue adRevenue, boolean bl2) {
    }

    @Override
    public final void reportAnr(@NonNull Map<Thread, StackTraceElement[]> map2) {
    }

    @Override
    public final void reportECommerce(@NonNull ECommerceEvent eCommerceEvent) {
    }

    @Override
    public final void reportError(@NonNull String string2, @Nullable String string3) {
    }

    @Override
    public final void reportError(@NonNull String string2, @Nullable String string3, @Nullable Throwable throwable) {
    }

    @Override
    public final void reportError(@NonNull String string2, @Nullable Throwable throwable) {
    }

    @Override
    public void reportEvent(@NonNull ModuleEvent moduleEvent) {
    }

    @Override
    public final void reportEvent(@NonNull String string2) {
    }

    @Override
    public final void reportEvent(@NonNull String string2, @Nullable String string3) {
    }

    @Override
    public final void reportEvent(@NonNull String string2, @Nullable Map<String, Object> map2) {
    }

    @Override
    public final void reportRevenue(@NonNull Revenue revenue) {
    }

    @Override
    public final void reportUnhandledException(@NonNull Throwable throwable) {
    }

    @Override
    public final void reportUserProfile(@NonNull UserProfile userProfile) {
    }

    @Override
    public final void resumeSession() {
    }

    @Override
    public final void sendEventsBuffer() {
    }

    @Override
    public final void setDataSendingEnabled(boolean bl2) {
    }

    @Override
    public final void setSessionExtra(@NonNull String string2, @Nullable byte[] byArray) {
    }

    @Override
    public final void setUserProfileID(@Nullable String string2) {
    }
}

