/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.Zk;
import io.appmetrica.analytics.impl.fl;

public final class Yk {
    public final fl a;
    public Integer b;

    public Yk(fl fl3) {
        this.a = fl3;
    }

    public static /* synthetic */ fl a(Yk yk2) {
        return yk2.a;
    }

    public static /* synthetic */ Integer b(Yk yk2) {
        return yk2.b;
    }

    public final Zk a() {
        return new Zk(this);
    }

    public final Yk b() {
        this.b = 3600;
        return this;
    }
}

