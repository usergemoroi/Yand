/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.collections.t
 *  kotlin.jvm.functions.a
 *  kotlin.n
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.Bc;
import io.appmetrica.analytics.impl.M4;
import io.appmetrica.analytics.impl.R9;
import io.appmetrica.analytics.impl.Vc;
import io.appmetrica.analytics.impl.d9;
import io.appmetrica.analytics.impl.k7;
import io.appmetrica.analytics.impl.l5;
import io.appmetrica.analytics.impl.mh;
import io.appmetrica.analytics.impl.qf;
import java.util.Collection;
import java.util.List;
import kotlin.collections.t;
import kotlin.jvm.functions.a;
import kotlin.m;
import kotlin.n;
import org.jetbrains.annotations.NotNull;

public final class Cc {
    public final mh a;
    public final R9 b;
    public final M4 c;
    public final qf d;
    public final l5 e;
    public final Vc f;
    public final m g;

    public Cc(@NotNull k7 k74, @NotNull mh mh3, @NotNull R9 r92, @NotNull M4 m44, @NotNull qf qf3) {
        this.a = mh3;
        this.b = r92;
        this.c = m44;
        this.d = qf3;
        this.e = new l5(k74, mh3);
        this.f = new Vc();
        this.g = n.b((a)new Bc(this));
    }

    public static final /* synthetic */ mh a(Cc cc2) {
        return cc2.a;
    }

    public static final /* synthetic */ R9 b(Cc cc2) {
        return cc2.b;
    }

    public static final /* synthetic */ M4 c(Cc cc2) {
        return cc2.c;
    }

    public static final /* synthetic */ Vc d(Cc cc2) {
        return cc2.f;
    }

    public static final /* synthetic */ qf e(Cc cc2) {
        return cc2.d;
    }

    @NotNull
    public final List<d9> a() {
        return this.e.a();
    }

    @NotNull
    public final List<d9> b() {
        return t.M0((Collection)t.e((Object)this.e.c), (Iterable)t.e((Object)((d9)this.g.getValue())));
    }
}

