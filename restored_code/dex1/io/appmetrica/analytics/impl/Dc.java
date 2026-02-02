/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.Cc;
import io.appmetrica.analytics.impl.I5;
import io.appmetrica.analytics.impl.M4;
import io.appmetrica.analytics.impl.Q9;
import io.appmetrica.analytics.impl.R9;
import io.appmetrica.analytics.impl.V9;
import io.appmetrica.analytics.impl.k7;
import io.appmetrica.analytics.impl.mh;
import io.appmetrica.analytics.impl.o5;
import io.appmetrica.analytics.impl.qf;
import org.jetbrains.annotations.NotNull;

public final class Dc
implements R9 {
    public final I5 a;

    public Dc(@NotNull V9 v94, @NotNull k7 object, @NotNull mh mh3, @NotNull M4 m44, @NotNull o5 o54, @NotNull qf qf3) {
        object = new Cc((k7)object, mh3, this, m44, qf3);
        this.a = new I5(v94, ((Cc)object).a(), ((Cc)object).b(), o54);
    }

    @Override
    public final Q9 a() {
        return this.a;
    }

    @NotNull
    public final I5 b() {
        return this.a;
    }
}

