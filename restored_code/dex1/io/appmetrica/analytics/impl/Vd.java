/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.VisibleForTesting
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.impl.Un;
import io.appmetrica.analytics.impl.Z2;
import io.appmetrica.analytics.impl.jo;
import io.appmetrica.analytics.impl.ko;
import io.appmetrica.analytics.impl.lo;
import io.appmetrica.analytics.impl.mo;
import io.appmetrica.analytics.impl.no;
import io.appmetrica.analytics.impl.q2;
import io.appmetrica.analytics.impl.wo;
import io.appmetrica.analytics.impl.yo;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

public abstract class Vd
implements ko,
q2 {
    public final String a;
    public final int b;
    public final yo c;
    public final Z2 d;
    public PublicLogger e;

    public Vd(int n10, String string2, yo yo3, Z2 z24) {
        this.b = n10;
        this.a = string2;
        this.c = yo3;
        this.d = z24;
        this.e = PublicLogger.getAnonymousInstance();
    }

    @NonNull
    public final lo a() {
        lo lo3 = new lo();
        lo3.b = this.b;
        lo3.a = this.a.getBytes();
        lo3.d = new no();
        lo3.c = new mo();
        return lo3;
    }

    @Override
    public abstract /* synthetic */ void a(@NonNull jo var1);

    public final void a(@NonNull PublicLogger publicLogger) {
        this.e = publicLogger;
    }

    @NonNull
    public final Z2 b() {
        return this.d;
    }

    @NonNull
    public final String c() {
        return this.a;
    }

    @NonNull
    @VisibleForTesting
    public final yo d() {
        return this.c;
    }

    public final int e() {
        return this.b;
    }

    public final boolean f() {
        wo wo3 = this.c.a(this.a);
        if (wo3.a) {
            return true;
        }
        PublicLogger publicLogger = this.e;
        StringBuilder stringBuilder = new StringBuilder("Attribute ");
        stringBuilder.append(this.a);
        stringBuilder.append(" of type ");
        int n10 = this.b;
        stringBuilder.append((String)Un.a.get(n10));
        stringBuilder.append(" is skipped because ");
        stringBuilder.append(wo3.b);
        publicLogger.warning(stringBuilder.toString(), new Object[0]);
        return false;
    }
}

