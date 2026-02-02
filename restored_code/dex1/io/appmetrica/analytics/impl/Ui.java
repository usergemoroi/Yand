/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  androidx.annotation.VisibleForTesting
 */
package io.appmetrica.analytics.impl;

import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import io.appmetrica.analytics.impl.A4;
import io.appmetrica.analytics.impl.B6;
import io.appmetrica.analytics.impl.Le;
import io.appmetrica.analytics.impl.Rh;
import io.appmetrica.analytics.impl.Th;
import io.appmetrica.analytics.impl.Ti;
import io.appmetrica.analytics.impl.Tn;
import io.appmetrica.analytics.impl.Vf;
import io.appmetrica.analytics.impl.aj;
import io.appmetrica.analytics.impl.lh;
import io.appmetrica.analytics.impl.o0;
import io.appmetrica.analytics.impl.rk;
import io.appmetrica.analytics.impl.uk;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

public final class Ui
implements uk {
    @NotNull
    public static final Ti e = new Ti();
    public static final long f = TimeUnit.SECONDS.toMillis(4L);
    public final o0 a;
    public final rk b;
    public final TimeProvider c;
    public final ICommonExecutor d;

    public Ui(@NotNull o0 o02, @NotNull rk rk3) {
        this(o02, rk3, new SystemTimeProvider());
    }

    @VisibleForTesting
    public Ui(@NotNull o0 o02, @NotNull rk rk3, @NotNull TimeProvider timeProvider) {
        this.a = o02;
        this.b = rk3;
        this.c = timeProvider;
        this.d = A4.l().g().b();
    }

    public final void a(@NotNull Rh object) {
        ICommonExecutor iCommonExecutor = this.d;
        if (((Rh)object).b) {
            rk rk3 = this.b;
            object = new B6(rk3.a, rk3.b, rk3.c, (Rh)object);
        } else {
            rk rk4 = this.b;
            object = new lh(rk4.b, rk4.c, (Rh)object);
        }
        iCommonExecutor.submit(object);
    }

    public final void a(@NotNull Vf vf3) {
        ICommonExecutor iCommonExecutor = this.d;
        rk rk3 = this.b;
        iCommonExecutor.submit(new Le(rk3.b, rk3.c, vf3));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(@NotNull Rh rh3) {
        long l10 = this.c.uptimeMillis();
        Object object = this.b;
        object = new B6(((rk)object).a, ((rk)object).b, ((rk)object).c, rh3);
        if (this.a.a()) {
            try {
                this.d.submit(object).get(f, TimeUnit.MILLISECONDS);
            }
            catch (Throwable throwable) {}
        }
        if (!((Th)object).c) {
            try {
                ((B6)object).a();
            }
            catch (Throwable throwable) {}
        }
        long l11 = this.c.uptimeMillis();
        l10 = Math.max(0L, f - (l11 - l10));
        try {
            Thread.sleep(l10);
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    public final void b(@NotNull Vf vf3) {
        ICommonExecutor iCommonExecutor = this.d;
        rk rk3 = this.b;
        iCommonExecutor.submit(new aj(rk3.b, rk3.c, vf3));
    }

    @Override
    public final void reportData(int n10, @NotNull Bundle bundle) {
        ICommonExecutor iCommonExecutor = this.d;
        rk rk3 = this.b;
        iCommonExecutor.submit(new Tn(rk3.b, rk3.c, n10, bundle));
    }
}

