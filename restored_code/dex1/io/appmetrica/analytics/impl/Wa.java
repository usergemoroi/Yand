/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.oe;
import io.appmetrica.analytics.impl.tf;
import io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider;
import org.jetbrains.annotations.NotNull;

public final class Wa
implements HostRetryInfoProvider {
    public final tf a;
    public final oe b;

    public Wa(@NotNull tf tf2, @NotNull oe oe2) {
        this.a = tf2;
        this.b = oe2;
    }

    @NotNull
    public final oe a() {
        return this.b;
    }

    @Override
    public final long getLastAttemptTimeSeconds() {
        return this.a.a(this.b, 0L);
    }

    @Override
    public final int getNextSendAttemptNumber() {
        return this.a.a(this.b, 1);
    }

    @Override
    public final void saveLastAttemptTimeSeconds(long l10) {
        this.a.b(this.b, l10).b();
    }

    @Override
    public final void saveNextSendAttemptNumber(int n10) {
        this.a.b(this.b, n10).b();
    }
}

