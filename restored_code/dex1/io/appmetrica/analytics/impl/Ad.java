/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 */
package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.impl.S1;
import io.appmetrica.analytics.impl.ap;
import io.appmetrica.analytics.impl.bp;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleController;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleObserver;
import org.jetbrains.annotations.NotNull;

public final class Ad
implements ModuleServiceLifecycleController {
    public final S1 a;

    public Ad(@NotNull S1 s13) {
        this.a = s13;
    }

    public static final void a(ModuleServiceLifecycleObserver moduleServiceLifecycleObserver, Intent intent) {
        moduleServiceLifecycleObserver.onFirstClientConnected();
    }

    public static final void b(ModuleServiceLifecycleObserver moduleServiceLifecycleObserver, Intent intent) {
        moduleServiceLifecycleObserver.onAllClientsDisconnected();
    }

    @Override
    public final void registerObserver(@NotNull ModuleServiceLifecycleObserver moduleServiceLifecycleObserver) {
        this.a.b(new ap(moduleServiceLifecycleObserver));
        this.a.a(new bp(moduleServiceLifecycleObserver));
    }
}

