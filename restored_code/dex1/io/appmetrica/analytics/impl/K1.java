/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.content.res.Configuration
 *  android.os.Bundle
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.impl;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.impl.A1;
import io.appmetrica.analytics.impl.B1;
import io.appmetrica.analytics.impl.C1;
import io.appmetrica.analytics.impl.D1;
import io.appmetrica.analytics.impl.E1;
import io.appmetrica.analytics.impl.F1;
import io.appmetrica.analytics.impl.G1;
import io.appmetrica.analytics.impl.H1;
import io.appmetrica.analytics.impl.I1;
import io.appmetrica.analytics.impl.J1;
import io.appmetrica.analytics.impl.Na;
import io.appmetrica.analytics.impl.y1;
import io.appmetrica.analytics.impl.z1;

public final class K1
implements z1 {
    public final ICommonExecutor a;
    public final z1 b;
    public boolean c = false;

    public K1(IHandlerExecutor iHandlerExecutor, z1 z13) {
        this.a = iHandlerExecutor;
        this.b = z13;
    }

    public K1(@NonNull z1 z13) {
        this(Na.j().w().b(), z13);
    }

    @Override
    public final void a(Intent intent) {
        this.a.execute(new E1(this, intent));
    }

    @Override
    public final void a(Intent intent, int n10) {
        this.a.execute(new C1(this, intent, n10));
    }

    @Override
    public final void a(Intent intent, int n10, int n13) {
        this.a.execute(new D1(this, intent, n10, n13));
    }

    @Override
    public final void a(@NonNull y1 y14) {
        this.b.a(y14);
    }

    @Override
    public final void b(Intent intent) {
        this.a.execute(new G1(this, intent));
    }

    @Override
    public final void c(Intent intent) {
        this.a.execute(new F1(this, intent));
    }

    @Override
    public final void onConfigurationChanged(@NonNull Configuration configuration) {
        this.a.execute(new A1(this, configuration));
    }

    @Override
    public final void onCreate() {
        synchronized (this) {
            this.c = true;
            ICommonExecutor iCommonExecutor = this.a;
            B1 b14 = new B1(this);
            iCommonExecutor.execute(b14);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void onDestroy() {
        this.a.removeAll();
        synchronized (this) {
            this.c = false;
        }
        this.b.onDestroy();
    }

    @Override
    public final void pauseUserSession(@NonNull Bundle bundle) {
        this.a.execute(new J1(this, bundle));
    }

    @Override
    public final void reportData(int n10, Bundle bundle) {
        this.a.execute(new H1(this, n10, bundle));
    }

    @Override
    public final void resumeUserSession(@NonNull Bundle bundle) {
        this.a.execute(new I1(this, bundle));
    }
}

