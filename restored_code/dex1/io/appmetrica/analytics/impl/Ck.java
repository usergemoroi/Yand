/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

public final class Ck {
    public final SystemTimeProvider a;
    public final long b;

    public Ck() {
        SystemTimeProvider systemTimeProvider;
        this.a = systemTimeProvider = new SystemTimeProvider();
        this.b = systemTimeProvider.currentTimeMillis();
    }
}

