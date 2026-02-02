/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.impl.Xl;
import io.appmetrica.analytics.impl.Z6;

public final class Wl
implements Z6 {
    public final StartupParamsCallback a;
    public final Xl b;

    public Wl(Xl xl3, StartupParamsCallback startupParamsCallback) {
        this.b = xl3;
        this.a = startupParamsCallback;
    }

    @Override
    public final void a(int n10, Bundle bundle) {
        this.b.b(bundle, this.a);
    }
}

