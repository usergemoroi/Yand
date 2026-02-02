/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.VisibleForTesting
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.SdkEnvironmentProvider;
import io.appmetrica.analytics.impl.Na;
import io.appmetrica.analytics.impl.k6;
import io.appmetrica.analytics.impl.om;
import io.appmetrica.analytics.impl.zj;
import io.appmetrica.analytics.networktasks.internal.ArgumentsMerger;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

public abstract class M5
implements zj {
    public BaseRequestConfig a;
    public final BaseRequestConfig.RequestConfigLoader b;
    public k6 c;

    public M5(@NonNull BaseRequestConfig.RequestConfigLoader<Object, k6> requestConfigLoader, @NonNull om om3, @NonNull ArgumentsMerger<Object, Object> argumentsMerger) {
        this.b = requestConfigLoader;
        Na.j().u().a(this);
        this.a(new k6(om3, (SdkEnvironmentProvider)Na.j().u(), Na.j().r(), argumentsMerger));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @NonNull
    public final BaseRequestConfig a() {
        synchronized (this) {
            try {
                if (this.a != null) return this.a;
                this.a = this.b.load(this.c);
                return this.a;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final void a(@NonNull k6 k63) {
        synchronized (this) {
            this.c = k63;
            return;
        }
    }

    public final void a(@NonNull om om3) {
        synchronized (this) {
            k6 k63 = new k6(om3, (SdkEnvironmentProvider)Na.F.u(), Na.F.r(), this.b());
            this.a(k63);
            this.e();
            return;
        }
    }

    public void a(@NonNull Object object) {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        if (((ArgumentsMerger)this.c.componentArguments).compareWithOtherArguments(object)) break block3;
                        k6 k63 = new k6(this.c(), (SdkEnvironmentProvider)Na.F.u(), Na.F.r(), (ArgumentsMerger)((ArgumentsMerger)this.c.componentArguments).mergeFrom(object));
                        this.a(k63);
                        this.e();
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    @NonNull
    @VisibleForTesting(otherwise=4)
    public final ArgumentsMerger<Object, Object> b() {
        synchronized (this) {
            ArgumentsMerger argumentsMerger = (ArgumentsMerger)this.c.componentArguments;
            return argumentsMerger;
        }
    }

    @NonNull
    public final om c() {
        synchronized (this) {
            om om3 = this.c.a;
            return om3;
        }
    }

    public final void d() {
        synchronized (this) {
            this.a = null;
            return;
        }
    }

    public final void e() {
        synchronized (this) {
            this.a = null;
            return;
        }
    }
}

