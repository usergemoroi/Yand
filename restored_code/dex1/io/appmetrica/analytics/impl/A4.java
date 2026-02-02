/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.impl.Ca;
import io.appmetrica.analytics.impl.P1;
import io.appmetrica.analytics.impl.Q6;
import io.appmetrica.analytics.impl.Qd;
import io.appmetrica.analytics.impl.T1;
import io.appmetrica.analytics.impl.a0;
import io.appmetrica.analytics.impl.c8;
import io.appmetrica.analytics.impl.d6;
import io.appmetrica.analytics.impl.d8;
import io.appmetrica.analytics.impl.gl;
import io.appmetrica.analytics.impl.l;
import io.appmetrica.analytics.impl.ma;
import io.appmetrica.analytics.impl.n;
import io.appmetrica.analytics.impl.pf;
import io.appmetrica.analytics.impl.q0;
import io.appmetrica.analytics.impl.q4;
import io.appmetrica.analytics.impl.sd;
import io.appmetrica.analytics.impl.so;
import io.appmetrica.analytics.impl.tn;
import io.appmetrica.analytics.impl.w0;
import io.appmetrica.analytics.impl.x4;
import io.appmetrica.analytics.impl.xj;
import io.appmetrica.analytics.impl.y7;

public final class A4 {
    public static volatile A4 u;
    public final Q6 a;
    public final d8 b;
    public final q4 c;
    public final P1 d;
    public final n e;
    public final gl f;
    public final d6 g;
    public final l h;
    public final tn i;
    public Qd j;
    public final q0 k;
    public volatile x4 l;
    public final sd m = new sd();
    public volatile pf n;
    public xj o;
    public final w0 p = new w0();
    public final T1 q = new T1();
    public final Ca r = new Ca();
    public volatile a0 s;
    public volatile ma t;

    public A4(Q6 q62, d8 d84, q4 q44, l l10, P1 p14, n n10, gl gl2, d6 d64, tn tn3, q0 q02) {
        new c8();
        this.a = q62;
        this.b = d84;
        this.c = q44;
        this.h = l10;
        this.d = p14;
        this.e = n10;
        this.f = gl2;
        this.g = d64;
        this.i = tn3;
        this.k = q02;
    }

    public A4(Q6 q62, n n10, q4 q44) {
        this(q62, n10, q44, new l(n10));
    }

    public A4(Q6 q62, n n10, q4 q44, l l10) {
        this(q62, new d8(), q44, l10, new P1(), n10, new gl(n10, l10), new d6(n10), new tn(), new q0());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static A4 l() {
        if (u != null) return u;
        synchronized (A4.class) {
            try {
                A4 a44;
                if (u != null) return u;
                Q6 q62 = new Q6();
                n n10 = new n();
                q4 q44 = new q4();
                u = a44 = new A4(q62, n10, q44);
                return u;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Qd a(Context object) {
        synchronized (this) {
            try {
                Qd qd2;
                if (this.j != null) return this.j;
                so so3 = new so();
                this.j = qd2 = new Qd((Context)object, so3);
                return this.j;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final n a() {
        return this.e;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final a0 b() {
        a0 a04;
        a0 a05 = a04 = this.s;
        if (a04 != null) return a05;
        synchronized (this) {
            try {
                a05 = a04 = this.s;
                if (a04 != null) return a05;
                this.s = a05 = new a0(this.p, this.f, this.c);
                return a05;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final pf b(Context context) {
        pf pf3;
        pf pf4 = pf3 = this.n;
        if (pf3 != null) return pf4;
        synchronized (this) {
            try {
                pf4 = pf3 = this.n;
                if (pf3 != null) return pf4;
                this.n = pf4 = new pf(y7.a(context).a());
                return pf4;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final q0 c() {
        return this.k;
    }

    public final w0 d() {
        return this.p;
    }

    public final P1 e() {
        return this.d;
    }

    public final T1 f() {
        return this.q;
    }

    public final q4 g() {
        return this.c;
    }

    public final d6 h() {
        return this.g;
    }

    public final Q6 i() {
        return this.a;
    }

    public final d8 j() {
        return this.b;
    }

    public final Ca k() {
        return this.r;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final x4 m() {
        x4 x44;
        x4 x45 = x44 = this.l;
        if (x44 != null) return x45;
        synchronized (this) {
            try {
                x45 = x44 = this.l;
                if (x44 != null) return x45;
                this.l = x45 = new x4();
                return x45;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final Q6 n() {
        return this.a;
    }

    public final gl o() {
        return this.f;
    }
}

