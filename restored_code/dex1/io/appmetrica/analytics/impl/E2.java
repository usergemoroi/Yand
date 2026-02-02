/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.w7;
import org.jetbrains.annotations.NotNull;

public final class E2
implements w7 {
    public final String a;
    public final String b;

    public E2() {
        this.a = "auto_inapp.db";
        this.b = "metrica_aip.db";
    }

    @Override
    @NotNull
    public final String a() {
        return this.b;
    }

    @Override
    @NotNull
    public final String b() {
        return this.a;
    }
}

