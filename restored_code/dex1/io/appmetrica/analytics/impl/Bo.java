/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationState;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateObserver;
import io.appmetrica.analytics.coreutils.internal.toggle.SimpleThreadSafeToggle;
import io.appmetrica.analytics.impl.Na;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;

public final class Bo
extends SimpleThreadSafeToggle
implements ApplicationStateObserver {
    public Bo() {
        super(false, "[VisibleAppStateOnlyTrackingStatusToggle]");
        synchronized (this) {
            this.a(Na.j().d().registerStickyObserver(this));
            k0 k02 = k0.a;
            return;
        }
    }

    public final void a(ApplicationState applicationState) {
        boolean bl2 = applicationState == ApplicationState.VISIBLE;
        this.updateState(bl2);
    }

    @Override
    public final void onApplicationStateChanged(@NotNull ApplicationState applicationState) {
        synchronized (this) {
            this.a(applicationState);
            return;
        }
    }
}

