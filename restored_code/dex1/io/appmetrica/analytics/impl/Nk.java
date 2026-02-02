/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.impl.Qk;
import io.appmetrica.analytics.impl.cl;
import io.appmetrica.analytics.impl.el;
import io.appmetrica.analytics.impl.v5;
import java.util.concurrent.atomic.AtomicLong;

public final class Nk {
    public final v5 a;
    public final el b;
    public final Qk c;
    public long d;
    public long e;
    public AtomicLong f;
    public boolean g;
    public volatile cl h;
    public long i;
    public long j;
    public final SystemTimeProvider k;

    public Nk(v5 v54, el el3, Qk qk3, SystemTimeProvider systemTimeProvider) {
        this.a = v54;
        this.b = el3;
        this.c = qk3;
        this.k = systemTimeProvider;
        this.a();
    }

    public final void a() {
        Object object = this.c;
        long l10 = this.k.elapsedRealtime();
        object = ((Qk)object).c;
        if (object != null) {
            l10 = (Long)object;
        }
        this.e = l10;
        object = this.c.b;
        l10 = object == null ? -1L : (Long)object;
        this.d = l10;
        object = this.c.e;
        long l11 = 0L;
        l10 = object == null ? 0L : (Long)object;
        this.f = new AtomicLong(l10);
        object = this.c.f;
        boolean bl2 = object == null ? true : (Boolean)object;
        this.g = bl2;
        object = this.c.g;
        l10 = object == null ? l11 : (Long)object;
        this.i = l10;
        object = this.c;
        l10 -= this.e;
        object = ((Qk)object).h;
        if (object != null) {
            l10 = (Long)object;
        }
        this.j = l10;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Session{id=");
        stringBuilder.append(this.d);
        stringBuilder.append(", creationTime=");
        stringBuilder.append(this.e);
        stringBuilder.append(", currentReportId=");
        stringBuilder.append(this.f);
        stringBuilder.append(", sessionRequestParams=");
        stringBuilder.append(this.h);
        stringBuilder.append(", sleepStart=");
        stringBuilder.append(this.i);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

