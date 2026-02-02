/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 */
package io.appmetrica.analytics.impl;

import android.os.Handler;
import android.os.Looper;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import io.appmetrica.analytics.impl.Ak;
import io.appmetrica.analytics.impl.Cb;
import io.appmetrica.analytics.impl.Na;
import io.appmetrica.analytics.impl.Ud;
import io.appmetrica.analytics.impl.Z9;
import io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider;
import java.util.concurrent.Executor;
import org.jetbrains.annotations.NotNull;

public final class Y9
implements ExecutorProvider {
    public final Ak a;
    public final IHandlerExecutor b;

    public Y9() {
        Ak ak3;
        this.a = ak3 = Na.j().w();
        this.b = ak3.c();
    }

    @Override
    @NotNull
    public final IHandlerExecutor getDefaultExecutor() {
        return this.a.a();
    }

    @Override
    @NotNull
    public final InterruptionSafeThread getInterruptionThread(@NotNull String string2, @NotNull String object, @NotNull Runnable runnable) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append('-');
        stringBuilder.append((String)object);
        string2 = stringBuilder.toString();
        object = new StringBuilder();
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append("-");
        ((StringBuilder)object).append(Ud.a.incrementAndGet());
        return new InterruptionSafeThread(runnable, ((StringBuilder)object).toString());
    }

    @Override
    @NotNull
    public final IHandlerExecutor getModuleExecutor() {
        return this.b;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    @NotNull
    public final IHandlerExecutor getSupportIOExecutor() {
        Ak ak3 = this.a;
        if (ak3.f != null) return ak3.f;
        synchronized (ak3) {
            try {
                Z9 z94;
                if (ak3.f != null) return ak3.f;
                ak3.a.getClass();
                Cb cb2 = Z9.a("IAA-SIO");
                Looper looper = cb2.getLooper();
                Handler handler = new Handler(cb2.getLooper());
                ak3.f = z94 = new Z9(cb2, looper, handler);
                return ak3.f;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    @Override
    @NotNull
    public final Executor getUiExecutor() {
        return this.a.f();
    }
}

