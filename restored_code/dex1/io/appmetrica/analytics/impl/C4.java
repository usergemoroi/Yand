/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

public final class C4 {
    public final SystemTimeProvider a;

    public C4() {
        this(new SystemTimeProvider());
    }

    public C4(SystemTimeProvider systemTimeProvider) {
        this.a = systemTimeProvider;
    }

    public final void a() {
        this.a.elapsedRealtime();
    }
}

