/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  androidx.annotation.NonNull
 *  androidx.annotation.VisibleForTesting
 */
package io.appmetrica.analytics.impl;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.impl.Cb;
import io.appmetrica.analytics.impl.Ud;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

public final class Z9
implements IHandlerExecutor {
    public final Looper a;
    public final Handler b;
    public final Cb c;

    public Z9(Cb cb2) {
        this(cb2, cb2.getLooper(), new Handler(cb2.getLooper()));
    }

    @VisibleForTesting
    public Z9(@NonNull Cb cb2, @NonNull Looper looper, @NonNull Handler handler) {
        this.c = cb2;
        this.a = looper;
        this.b = handler;
    }

    public Z9(@NonNull String string2) {
        this(Z9.a(string2));
    }

    public static Cb a(String object) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((String)object);
        stringBuilder.append("-");
        stringBuilder.append(Ud.a.incrementAndGet());
        object = new Cb(stringBuilder.toString());
        ((Thread)object).start();
        return object;
    }

    @Override
    public final void execute(@NonNull Runnable runnable) {
        this.b.post(runnable);
    }

    @Override
    public final void executeDelayed(@NonNull Runnable runnable, long l10) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.b.postDelayed(runnable, timeUnit.toMillis(l10));
    }

    @Override
    public final void executeDelayed(@NonNull Runnable runnable, long l10, @NonNull TimeUnit timeUnit) {
        this.b.postDelayed(runnable, timeUnit.toMillis(l10));
    }

    @Override
    @NonNull
    public final Handler getHandler() {
        return this.b;
    }

    @Override
    @NonNull
    public final Looper getLooper() {
        return this.a;
    }

    @Override
    public final boolean isRunning() {
        Cb cb2 = this.c;
        synchronized (cb2) {
            boolean bl2 = cb2.a;
            return bl2;
        }
    }

    @Override
    public final void remove(@NonNull Runnable runnable) {
        this.b.removeCallbacks(runnable);
    }

    @Override
    public final void removeAll() {
        this.b.removeCallbacksAndMessages(null);
    }

    @Override
    public final void stopRunning() {
        Cb cb2 = this.c;
        synchronized (cb2) {
            cb2.a = false;
            ((Thread)((Object)cb2)).interrupt();
            return;
        }
    }

    @Override
    public final <T> Future<T> submit(Callable<T> object) {
        object = new FutureTask<T>(object);
        this.b.post((Runnable)object);
        return object;
    }
}

