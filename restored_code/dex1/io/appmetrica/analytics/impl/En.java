/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class En
implements Thread.UncaughtExceptionHandler {
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    @Override
    public final void uncaughtException(Thread thread, Throwable throwable) {
        Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((Thread.UncaughtExceptionHandler)iterator.next()).uncaughtException(thread, throwable);
        }
    }
}

