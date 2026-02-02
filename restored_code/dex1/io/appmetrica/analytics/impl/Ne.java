/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.Oe;
import io.appmetrica.analytics.impl.k7;
import io.appmetrica.analytics.impl.q9;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.jetbrains.annotations.NotNull;

public final class Ne
implements q9,
Oe {
    public final k7 a;
    public final AtomicLong b;

    public Ne(@NotNull k7 k74) {
        this.a = k74;
        this.b = new AtomicLong(k74.b());
        k74.a(this);
    }

    @Override
    public final void a() {
        this.b.set(this.a.b());
    }

    public final void a(@NotNull List<Integer> list) {
        this.b.addAndGet(list.size());
    }

    public final long b() {
        return this.b.get();
    }

    public final void b(@NotNull List<Integer> list) {
        this.b.addAndGet(-((long)list.size()));
    }
}

