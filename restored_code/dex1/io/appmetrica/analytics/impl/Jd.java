/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.impl.A4;
import io.appmetrica.analytics.impl.Bd;
import io.appmetrica.analytics.impl.Jc;
import io.appmetrica.analytics.impl.Pd;
import io.appmetrica.analytics.impl.ib;
import io.appmetrica.analytics.impl.v0;
import io.appmetrica.analytics.impl.w0;
import kotlin.jvm.internal.y;

public final class Jd {
    public final w0 a;
    public final Bd b;
    public final Pd c;
    public final IHandlerExecutor d;

    public Jd() {
        w0 w04;
        this.a = w04 = A4.l().d();
        this.b = new Bd(w04);
        this.c = new Pd();
        this.d = A4.l().g().a();
    }

    public static final ib a(Jd object) {
        ((Jd)object).a.getClass();
        object = v0.e;
        y.g(object);
        object = ((v0)object).f().i();
        y.g(object);
        return ((Jc)object).a;
    }
}

