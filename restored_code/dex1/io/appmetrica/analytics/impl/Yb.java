/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.jvm.functions.a
 *  kotlin.n
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.Gh;
import io.appmetrica.analytics.impl.Xb;
import io.appmetrica.analytics.impl.v5;
import io.appmetrica.analytics.networktasks.internal.ConfigProvider;
import kotlin.jvm.functions.a;
import kotlin.m;
import kotlin.n;
import org.jetbrains.annotations.NotNull;

public final class Yb
implements ConfigProvider {
    public final v5 a;
    public final m b;

    public Yb(@NotNull v5 v54) {
        this.a = v54;
        this.b = n.b((a)new Xb(this));
    }

    public static final /* synthetic */ v5 a(Yb yb3) {
        return yb3.a;
    }

    @NotNull
    public final Gh a() {
        return (Gh)this.b.getValue();
    }
}

