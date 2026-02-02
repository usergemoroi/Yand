/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.location.Location
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.AnrListener;
import io.appmetrica.analytics.ExternalAttribution;
import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.impl.Di;
import io.appmetrica.analytics.impl.Mo;
import io.appmetrica.analytics.impl.ib;
import io.appmetrica.analytics.impl.m;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.util.ArrayList;
import java.util.List;

public final class Xc
extends Di
implements ib {
    @Override
    public final void a(@Nullable Activity activity) {
    }

    @Override
    public final void a(@Nullable Location location) {
    }

    @Override
    public final void a(@NonNull AnrListener anrListener) {
    }

    @Override
    public final void a(@NonNull ExternalAttribution externalAttribution) {
    }

    @Override
    public final void a(@NonNull Mo mo3) {
    }

    @Override
    public final void a(@NonNull m m12) {
    }

    @Override
    public final void a(@NonNull String string2) {
    }

    @Override
    public final void a(String string2, String string3) {
    }

    @Override
    public final void a(@NonNull String string2, boolean bl2) {
    }

    @Override
    public final void a(boolean bl2) {
    }

    @Override
    public final void b(@Nullable Activity activity) {
    }

    @Override
    public final void b(@NonNull String string2) {
    }

    @Override
    public final void b(@NonNull String string2, @Nullable String string3) {
    }

    @Override
    public final void b(boolean bl2) {
    }

    @Override
    public final boolean b() {
        return false;
    }

    @Override
    public final void c() {
    }

    @Override
    public final void c(@NonNull String string2) {
    }

    @Override
    public final List<String> f() {
        return new ArrayList<String>();
    }

    @Override
    public final void reportAdRevenue(@NonNull AdRevenue adRevenue, boolean bl2) {
    }

    @Override
    public final void reportError(@NonNull PluginErrorDetails pluginErrorDetails, @Nullable String string2) {
    }

    @Override
    public final void reportError(@NonNull String string2, @Nullable String string3, @Nullable PluginErrorDetails pluginErrorDetails) {
    }

    @Override
    public final void reportEvent(@NonNull ModuleEvent moduleEvent) {
    }

    @Override
    public final void reportUnhandledException(@NonNull PluginErrorDetails pluginErrorDetails) {
    }
}

