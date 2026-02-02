/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Savable;
import io.appmetrica.analytics.impl.I;
import org.jetbrains.annotations.NotNull;

public final class H
implements Savable {
    public final I a;

    public H(I i14) {
        this.a = i14;
    }

    @NotNull
    public final Boolean a() {
        return this.a.a.a(false);
    }

    public final void a(boolean bl2) {
        this.a.a.e(bl2);
    }
}

