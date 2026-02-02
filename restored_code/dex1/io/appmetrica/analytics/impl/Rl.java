/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.SdkEnvironmentProvider;
import io.appmetrica.analytics.impl.M5;
import io.appmetrica.analytics.impl.Na;
import io.appmetrica.analytics.impl.im;
import io.appmetrica.analytics.impl.jm;
import io.appmetrica.analytics.impl.k6;
import io.appmetrica.analytics.impl.om;

public final class Rl
extends M5 {
    public Rl(jm jm3, om om3, im im3) {
        super(jm3, om3, im3);
    }

    public final void a(@NonNull im im3) {
        synchronized (this) {
            k6 k63 = new k6(this.c(), (SdkEnvironmentProvider)Na.F.u(), Na.F.r(), ((im)this.b()).b(im3));
            this.a(k63);
            this.e();
            return;
        }
    }
}

