/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.VisibleForTesting
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.impl.Bb;
import io.appmetrica.analytics.impl.D4;
import io.appmetrica.analytics.impl.Km;
import io.appmetrica.analytics.impl.M4;
import io.appmetrica.analytics.impl.N4;
import io.appmetrica.analytics.impl.Ql;
import io.appmetrica.analytics.impl.Sl;
import io.appmetrica.analytics.impl.W9;
import io.appmetrica.analytics.impl.Zl;
import io.appmetrica.analytics.impl.gb;
import io.appmetrica.analytics.impl.o5;
import io.appmetrica.analytics.impl.o6;
import io.appmetrica.analytics.impl.om;
import io.appmetrica.analytics.impl.p5;
import io.appmetrica.analytics.impl.pb;
import io.appmetrica.analytics.impl.v5;
import io.appmetrica.analytics.impl.w5;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class Xg
implements Zl,
gb {
    public final Context a;
    public final o5 b;
    public final p5 c;
    public final Km d;
    public final pb e;

    public Xg(@NotNull Context context, @NotNull o5 o54, @NotNull N4 n42, @NotNull w5 w54) {
        this(context, o54, n42, w54, new p5(), Ql.a());
    }

    public Xg(@NotNull Context context, @NotNull o5 o54, @NotNull N4 n42, @NotNull w5 w54, @NotNull p5 object, @NotNull Ql ql3) {
        this.a = context;
        this.b = o54;
        this.c = object;
        this.d = object = ql3.a(context, o54, n42.a);
        this.e = w54.a(context, o54, n42.b, (Km)object);
        ql3.a(o54, this);
    }

    @VisibleForTesting
    @NotNull
    public final o5 a() {
        return this.b;
    }

    public final void a(@NotNull D4 d44) {
        this.c.a.add(d44);
    }

    @Override
    public final void a(@NotNull N4 object) {
        this.d.a(((N4)object).a);
        object = ((N4)object).b;
        this.e.a((M4)object);
    }

    @Override
    public final void a(@NotNull Sl sl3, @Nullable om om3) {
        ((v5)this.e).getClass();
    }

    public final void a(@NotNull o6 o63, @NotNull N4 object) {
        int n10 = o63.d;
        if (!W9.c.contains((Object)Bb.a(n10))) {
            object = ((N4)object).b;
            this.e.a((M4)object);
        }
        ((v5)this.e).a(o63);
    }

    @Override
    public final void a(@NotNull om om3) {
        this.e.a(om3);
    }

    @VisibleForTesting
    @NotNull
    public final Context b() {
        return this.a;
    }

    public final void b(@NotNull D4 d44) {
        this.c.a.remove(d44);
    }
}

