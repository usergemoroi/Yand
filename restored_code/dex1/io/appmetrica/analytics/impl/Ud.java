/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class Ud
implements ThreadFactory {
    public static final AtomicInteger a = new AtomicInteger(0);

    public static int a() {
        return a.incrementAndGet();
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((String)null);
        stringBuilder.append("-");
        stringBuilder.append(a.incrementAndGet());
        return new InterruptionSafeThread(runnable, stringBuilder.toString());
    }
}

