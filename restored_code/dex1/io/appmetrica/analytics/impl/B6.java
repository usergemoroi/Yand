/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.impl.A4;
import io.appmetrica.analytics.impl.M6;
import io.appmetrica.analytics.impl.Q6;
import io.appmetrica.analytics.impl.Rh;
import io.appmetrica.analytics.impl.T1;
import io.appmetrica.analytics.impl.il;
import io.appmetrica.analytics.impl.lh;
import io.appmetrica.analytics.impl.o0;
import io.appmetrica.analytics.internal.AppMetricaService;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class B6
extends lh {
    public final Context f;
    public final Rh g;
    public final Q6 h;
    public final T1 i;
    public final M6 j;

    public B6(@NotNull Context context, @NotNull o0 o02, @Nullable il il3, @NotNull Rh rh3) {
        super(o02, il3, rh3);
        this.f = context;
        this.g = rh3;
        this.h = A4.l().i();
        this.i = A4.l().f();
        this.j = new M6(context);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void a() {
        synchronized (this) {
            Throwable throwable2;
            block7: {
                block6: {
                    try {
                        boolean bl2 = this.c;
                        if (!bl2) break block6;
                    }
                    catch (Throwable throwable2) {
                        break block7;
                    }
                    return;
                }
                this.c = true;
                String string2 = this.h.a.a();
                T1 t13 = this.i;
                Object object = this.f;
                t13.getClass();
                object = PackageManagerUtils.getServiceInfo(object, AppMetricaService.class);
                object = object != null ? object.processName : null;
                if (y.e(string2, object)) {
                    this.j.a(this.g);
                } else {
                    this.a.c();
                    this.c = false;
                    super.a();
                }
                return;
            }
            throw throwable2;
        }
    }

    @Override
    public final boolean c() {
        this.j.a(this.g);
        return false;
    }
}

