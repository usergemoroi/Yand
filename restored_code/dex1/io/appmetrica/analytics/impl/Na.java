/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.identifiers.PlatformIdentifiers;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.coreutils.internal.ReferenceHolder;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.coreutils.internal.services.UtilityServiceProvider;
import io.appmetrica.analytics.coreutils.internal.services.WaitForActivationDelayBarrier;
import io.appmetrica.analytics.impl.Aj;
import io.appmetrica.analytics.impl.Ak;
import io.appmetrica.analytics.impl.Ck;
import io.appmetrica.analytics.impl.Cl;
import io.appmetrica.analytics.impl.Df;
import io.appmetrica.analytics.impl.Ef;
import io.appmetrica.analytics.impl.Go;
import io.appmetrica.analytics.impl.Hg;
import io.appmetrica.analytics.impl.Hk;
import io.appmetrica.analytics.impl.If;
import io.appmetrica.analytics.impl.Ij;
import io.appmetrica.analytics.impl.Jl;
import io.appmetrica.analytics.impl.M3;
import io.appmetrica.analytics.impl.Ma;
import io.appmetrica.analytics.impl.Mf;
import io.appmetrica.analytics.impl.N3;
import io.appmetrica.analytics.impl.Nf;
import io.appmetrica.analytics.impl.Qd;
import io.appmetrica.analytics.impl.R3;
import io.appmetrica.analytics.impl.T;
import io.appmetrica.analytics.impl.Y3;
import io.appmetrica.analytics.impl.Y6;
import io.appmetrica.analytics.impl.Z3;
import io.appmetrica.analytics.impl.Zm;
import io.appmetrica.analytics.impl.a3;
import io.appmetrica.analytics.impl.a4;
import io.appmetrica.analytics.impl.an;
import io.appmetrica.analytics.impl.c4;
import io.appmetrica.analytics.impl.c7;
import io.appmetrica.analytics.impl.d7;
import io.appmetrica.analytics.impl.e3;
import io.appmetrica.analytics.impl.fc;
import io.appmetrica.analytics.impl.h3;
import io.appmetrica.analytics.impl.i2;
import io.appmetrica.analytics.impl.j2;
import io.appmetrica.analytics.impl.je;
import io.appmetrica.analytics.impl.kc;
import io.appmetrica.analytics.impl.lc;
import io.appmetrica.analytics.impl.ma;
import io.appmetrica.analytics.impl.mc;
import io.appmetrica.analytics.impl.o2;
import io.appmetrica.analytics.impl.p8;
import io.appmetrica.analytics.impl.pc;
import io.appmetrica.analytics.impl.pj;
import io.appmetrica.analytics.impl.qm;
import io.appmetrica.analytics.impl.sc;
import io.appmetrica.analytics.impl.sd;
import io.appmetrica.analytics.impl.tf;
import io.appmetrica.analytics.impl.to;
import io.appmetrica.analytics.impl.ud;
import io.appmetrica.analytics.impl.un;
import io.appmetrica.analytics.impl.vf;
import io.appmetrica.analytics.impl.vk;
import io.appmetrica.analytics.impl.xf;
import io.appmetrica.analytics.impl.y7;
import io.appmetrica.analytics.impl.yf;
import io.appmetrica.analytics.locationapi.internal.LocationClient;
import io.appmetrica.analytics.locationapi.internal.LocationProvider;

public final class Na {
    public static volatile Na F;
    public final je A;
    public final UtilityServiceProvider B;
    public volatile ma C;
    public final Ck D;
    public final ReferenceHolder E;
    public final Context a;
    public volatile Hg b;
    public volatile d7 c;
    public final Ak d;
    public volatile h3 e;
    public volatile Ij f;
    public volatile T g;
    public volatile i2 h;
    public volatile PlatformIdentifiers i;
    public volatile Nf j;
    public volatile Y3 k;
    public volatile tf l;
    public volatile Go m;
    public volatile Aj n;
    public volatile fc o;
    public Jl p;
    public final Ma q = new Ma();
    public volatile Hk r;
    public final sd s = new sd();
    public final ud t = new ud();
    public final qm u = new qm();
    public final vk v = new vk();
    public volatile kc w;
    public volatile un x;
    public volatile Cl y;
    public volatile Qd z;

    public Na(Context context) {
        this.A = new je();
        this.B = new UtilityServiceProvider();
        this.D = new Ck();
        this.E = new ReferenceHolder();
        this.a = context;
        this.d = new Ak();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(Context context) {
        if (F != null) return;
        synchronized (Na.class) {
            try {
                Na na4;
                if (F != null) return;
                F = na4 = new Na(context.getApplicationContext());
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public static Na j() {
        return F;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final un A() {
        un un3;
        un un4 = un3 = this.x;
        if (un3 != null) return un4;
        synchronized (this) {
            try {
                un4 = un3 = this.x;
                if (un3 != null) return un4;
                this.x = un4 = new un(this.a);
                return un4;
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
    public final Go B() {
        synchronized (this) {
            try {
                Go go3;
                if (this.m != null) return this.m;
                this.m = go3 = new Go(this.a);
                return this.m;
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
    public final void C() {
        if (this.j != null) return;
        synchronized (this) {
            try {
                if (this.j != null) return;
                Object object = Zm.a(xf.class);
                Object object2 = this.a;
                ProtobufStateStorage<Object> protobufStateStorage = ((an)object).a((Context)object2, ((an)object).c((Context)object2));
                object = (xf)protobufStateStorage.read();
                Context context = this.a;
                Ef ef3 = new Ef();
                vf vf3 = new vf((xf)object);
                Mf mf2 = new Mf();
                Df df3 = new Df(this.a);
                If if_ = new If(Na.j().x());
                yf yf2 = new yf();
                object2 = new Nf(context, protobufStateStorage, ef3, vf3, mf2, df3, if_, yf2, (xf)object, "[PreloadInfoStorage]");
                this.j = object2;
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final WaitForActivationDelayBarrier a() {
        return this.B.getActivationBarrier();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final T b() {
        T t13;
        T t14 = t13 = this.g;
        if (t13 != null) return t14;
        synchronized (this) {
            try {
                t14 = t13 = this.g;
                if (t13 != null) return t14;
                t14 = new T(this.a, this.d.a(), this.u.b());
                this.u.a(t14);
                this.g = t14;
                return t14;
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
    public final i2 c() {
        i2 i23;
        i2 i24 = i23 = this.h;
        if (i23 != null) return i24;
        synchronized (this) {
            try {
                i24 = i23 = this.h;
                if (i23 != null) return i24;
                this.h = i24 = new i2(this.a, j2.a());
                return i24;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final o2 d() {
        return this.k().b;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Y3 e() {
        if (this.k != null) return this.k;
        synchronized (this) {
            try {
                Y3 y34;
                if (this.k != null) return this.k;
                Object object = Zm.a(R3.class);
                Object object2 = this.a;
                ProtobufStateStorage<Object> protobufStateStorage = ((an)object).a((Context)object2, ((an)object).c((Context)object2));
                Context context = this.a;
                object2 = new Z3();
                M3 m33 = new M3();
                c4 c44 = new c4();
                pj pj3 = new pj(this.a);
                a4 a44 = new a4(this.x());
                object = new N3();
                this.k = y34 = new Y3(context, protobufStateStorage, (p8)object2, m33, c44, pj3, a44, (Y6)object, (R3)protobufStateStorage.read(), "[ClidsInfoStorage]");
                return this.k;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final Context f() {
        return this.a;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final d7 g() {
        if (this.c != null) return this.c;
        synchronized (this) {
            try {
                d7 d72;
                if (this.c != null) return this.c;
                c7 c74 = new c7(this.x());
                this.c = d72 = new d7(c74);
                return this.c;
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
    public final ma h() {
        ma ma2;
        ma ma4 = ma2 = this.C;
        if (ma2 != null) return ma4;
        synchronized (this) {
            try {
                ma4 = ma2 = this.C;
                if (ma2 != null) return ma4;
                this.C = ma4 = new ma(this.a);
                return ma4;
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
    public final PermissionExtractor i() {
        Cl cl2 = this.y;
        if (cl2 != null) {
            return cl2;
        }
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    cl2 = this.y;
                    if (cl2 != null) {
                        return cl2;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                this.y = cl2 = new Cl(this.o().c.getAskForPermissionStrategy());
                return cl2;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final fc k() {
        Object object = this.o;
        fc fc3 = object;
        if (object != null) return fc3;
        synchronized (this) {
            try {
                object = this.o;
                fc3 = object;
                if (object != null) return fc3;
                Context context = this.a;
                Object object2 = this.d.a();
                object = new e3(context, (ICommonExecutor)object2);
                object2 = new o2();
                this.o = fc3 = new fc((e3)object, (o2)object2);
                return fc3;
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
    public final kc l() {
        LocationProvider locationProvider = this.w;
        Object object = locationProvider;
        if (locationProvider != null) return object;
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    Context context;
                    block3: {
                        try {
                            locationProvider = this.w;
                            object = locationProvider;
                            if (locationProvider != null) return object;
                            context = this.a;
                            locationProvider = ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor("io.appmetrica.analytics.location.internal.LocationClientImpl", LocationClient.class);
                            if (locationProvider != null) break block3;
                            object = new mc();
                            break block4;
                        }
                        catch (Throwable throwable2) {
                            break block5;
                        }
                    }
                    object = new sc();
                    object = new lc(context, (pc)object, (LocationClient)locationProvider);
                }
                this.w = object;
                return object;
            }
            throw throwable2;
        }
    }

    public final kc m() {
        return this.l();
    }

    public final ud n() {
        return this.t;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Hk o() {
        Hk hk3;
        Hk hk4 = hk3 = this.r;
        if (hk3 != null) return hk4;
        synchronized (this) {
            try {
                hk4 = hk3 = this.r;
                if (hk3 != null) return hk4;
                this.r = hk4 = new Hk();
                return hk4;
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
    public final Qd p() {
        Qd qd2;
        Qd qd3 = qd2 = this.z;
        if (qd2 != null) return qd3;
        synchronized (this) {
            try {
                qd3 = qd2 = this.z;
                if (qd2 != null) return qd3;
                qd2 = this.a;
                to to3 = new to();
                this.z = qd3 = new Qd((Context)qd2, to3);
                return qd3;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final je q() {
        return this.A;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final PlatformIdentifiers r() {
        PlatformIdentifiers platformIdentifiers;
        PlatformIdentifiers platformIdentifiers2 = platformIdentifiers = this.i;
        if (platformIdentifiers != null) return platformIdentifiers2;
        synchronized (this) {
            try {
                platformIdentifiers2 = platformIdentifiers = this.i;
                if (platformIdentifiers != null) return platformIdentifiers2;
                this.i = platformIdentifiers2 = new PlatformIdentifiers(this.b(), this.c());
                return platformIdentifiers2;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final Nf s() {
        this.C();
        return this.j;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Hg t() {
        if (this.b != null) return this.b;
        synchronized (this) {
            try {
                Hg hg3;
                if (this.b != null) return this.b;
                this.b = hg3 = new Hg(this.a, Na.F.B().c);
                return this.b;
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
    public final Aj u() {
        Aj aj2;
        Aj aj3 = aj2 = this.n;
        if (aj2 != null) return aj3;
        synchronized (this) {
            try {
                aj3 = aj2 = this.n;
                if (aj2 != null) return aj3;
                this.n = aj3 = new Aj(this.a);
                return aj3;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final Ij v() {
        synchronized (this) {
            Ij ij3 = this.f;
            return ij3;
        }
    }

    public final Ak w() {
        return this.d;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final tf x() {
        if (this.l != null) return this.l;
        synchronized (this) {
            try {
                tf tf2;
                if (this.l != null) return this.l;
                this.l = tf2 = new tf(y7.a(this.a).c());
                return this.l;
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
    public final a3 y() {
        synchronized (this) {
            try {
                Jl jl2;
                if (this.p != null) return this.p;
                this.p = jl2 = new Jl(this.a);
                this.u.a(jl2);
                return this.p;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final qm z() {
        return this.u;
    }
}

