/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.impl.Gg;
import io.appmetrica.analytics.impl.Jg;
import io.appmetrica.analytics.impl.lb;
import io.appmetrica.analytics.impl.nb;

public class Lg {
    public final nb a;
    public final Gg b;
    public final lb c;

    public Lg(nb nb3, Gg gg3, lb lb3) {
        this.a = nb3;
        this.b = gg3;
        this.c = lb3;
    }

    @NonNull
    @VisibleForTesting(otherwise=5)
    public final nb a() {
        return this.a;
    }

    public final void a(@Nullable Jg jg3) {
        if (this.a.a(jg3)) {
            this.b.a(jg3);
            this.c.a();
        }
    }

    @NonNull
    @VisibleForTesting(otherwise=5)
    public final Gg b() {
        return this.b;
    }

    @NonNull
    @VisibleForTesting(otherwise=5)
    public final lb c() {
        return this.c;
    }
}

