/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.Pk;
import io.appmetrica.analytics.impl.fl;

public final class Qk {
    public final fl a;
    public final Long b;
    public final Long c;
    public final Integer d;
    public final Long e;
    public final Boolean f;
    public final Long g;
    public final Long h;

    public Qk(Pk pk3) {
        this.a = Pk.a(pk3);
        this.d = Pk.b(pk3);
        this.b = Pk.c(pk3);
        this.c = Pk.d(pk3);
        this.e = Pk.e(pk3);
        this.f = Pk.f(pk3);
        this.g = Pk.g(pk3);
        this.h = pk3.a;
    }
}

