/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.NonNull
 *  kotlin.collections.t
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.impl.Ba;
import io.appmetrica.analytics.impl.Bh;
import io.appmetrica.analytics.impl.Dh;
import io.appmetrica.analytics.impl.Do;
import io.appmetrica.analytics.impl.Eh;
import io.appmetrica.analytics.impl.F7;
import io.appmetrica.analytics.impl.Go;
import io.appmetrica.analytics.impl.Ha;
import io.appmetrica.analytics.impl.Ho;
import io.appmetrica.analytics.impl.K9;
import io.appmetrica.analytics.impl.L3;
import io.appmetrica.analytics.impl.M4;
import io.appmetrica.analytics.impl.Na;
import io.appmetrica.analytics.impl.O2;
import io.appmetrica.analytics.impl.Pi;
import io.appmetrica.analytics.impl.Q9;
import io.appmetrica.analytics.impl.Ri;
import io.appmetrica.analytics.impl.S9;
import io.appmetrica.analytics.impl.Tk;
import io.appmetrica.analytics.impl.V9;
import io.appmetrica.analytics.impl.Zf;
import io.appmetrica.analytics.impl.al;
import io.appmetrica.analytics.impl.b4;
import io.appmetrica.analytics.impl.bl;
import io.appmetrica.analytics.impl.el;
import io.appmetrica.analytics.impl.f9;
import io.appmetrica.analytics.impl.fc;
import io.appmetrica.analytics.impl.g7;
import io.appmetrica.analytics.impl.i0;
import io.appmetrica.analytics.impl.k7;
import io.appmetrica.analytics.impl.k9;
import io.appmetrica.analytics.impl.mh;
import io.appmetrica.analytics.impl.o5;
import io.appmetrica.analytics.impl.om;
import io.appmetrica.analytics.impl.p9;
import io.appmetrica.analytics.impl.q5;
import io.appmetrica.analytics.impl.qf;
import io.appmetrica.analytics.impl.r9;
import io.appmetrica.analytics.impl.s9;
import io.appmetrica.analytics.impl.t5;
import io.appmetrica.analytics.impl.u5;
import io.appmetrica.analytics.impl.v1;
import io.appmetrica.analytics.impl.v5;
import io.appmetrica.analytics.impl.w2;
import io.appmetrica.analytics.impl.x5;
import io.appmetrica.analytics.impl.x9;
import io.appmetrica.analytics.impl.y5;
import io.appmetrica.analytics.impl.y7;
import io.appmetrica.analytics.impl.z5;
import java.util.LinkedHashMap;
import kotlin.collections.t;
import kotlin.z;

public class A5 {
    public final y5 a;
    public final z5 b;
    @NonNull
    protected final Context c;
    public final o5 d;
    public final M4 e;
    public final t5 f;
    @NonNull
    protected final om g;
    public final Dh h;
    public final f9 i;
    public final ICommonExecutor j;
    public final fc k;
    public final S9 l;
    public final int m;

    public A5(Context context, o5 o54, M4 m44, t5 t54, om om3, Dh dh3, ICommonExecutor iCommonExecutor, int n10, fc fc3, S9 s92) {
        this(context, o54, m44, t54, om3, dh3, iCommonExecutor, new f9(), n10, new y5(m44.a), new z5(context, o54), fc3, s92);
    }

    public A5(Context context, o5 o54, M4 m44, t5 t54, om om3, Dh dh3, ICommonExecutor iCommonExecutor, f9 f94, int n10, y5 y54, z5 z54, fc fc3, S9 s92) {
        this.c = context;
        this.d = o54;
        this.e = m44;
        this.f = t54;
        this.g = om3;
        this.h = dh3;
        this.j = iCommonExecutor;
        this.i = f94;
        this.m = n10;
        this.a = y54;
        this.b = z54;
        this.k = fc3;
        this.l = s92;
    }

    public static Pi a(v5 v54, x9 x94) {
        return new Pi((Zf)x94, v54);
    }

    public static bl a(v5 v54, Do object, u5 u54) {
        object = new al((Do)object);
        return new bl(v54, (al)object, u54, new Ha(v54, (al)object, new el(v54.h(), "foreground"), v1.a(), new SystemTimeProvider()), new O2(v54, (al)object, new el(v54.h(), "background"), v1.a(), new SystemTimeProvider()));
    }

    public static q5 b() {
        return new q5();
    }

    public static x9 c(v5 v54) {
        return new x9(v54);
    }

    public final K9 a(qf qf3, Do do_, bl bl2, k7 k74, i0 i04, Tk tk3, Ri ri2) {
        return new K9(qf3, do_, bl2, k74, i04, this.i, tk3, this.m, new x5(ri2), new r9(do_, new s9(do_)), new SystemTimeProvider());
    }

    public Q9 a(V9 v94, k7 k74, mh mh3, M4 m44, o5 o54, qf qf3) {
        return this.l.a(v94, k74, mh3, m44, o54, qf3).a();
    }

    public final k9 a() {
        Context context = this.c;
        o5 o54 = this.d;
        int n10 = this.m;
        return new k9(new p9(context, o54), n10);
    }

    public final mh a(v5 v54) {
        return new mh(new Eh(v54, this.h, new b4()), this.g, new Bh(this.e));
    }

    public final w2 a(qf qf3) {
        return new w2(this.d, qf3);
    }

    public final L3 b(qf qf3) {
        Context context = this.c;
        return new L3(context, qf3, context.getPackageName(), new SafePackageManager());
    }

    public final k7 b(v5 v54) {
        return new k7(v54, y7.a(this.c).c(this.d), new g7(v54.c()), new F7());
    }

    public final Tk c() {
        return new Tk(this.c, this.d);
    }

    public final Ri d(v5 object) {
        Ri ri2 = new Ri((v5)object, this.f.a(), this.j);
        object = this.k;
        synchronized (object) {
            ((fc)object).c.add(ri2);
            return ri2;
        }
    }

    public final y5 d() {
        return this.a;
    }

    public final z5 e() {
        return this.b;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Do f() {
        Go go3 = Na.F.B();
        Object object = this.d;
        synchronized (go3) {
            Throwable throwable2;
            block5: {
                qf qf3;
                Object object2;
                Object object3;
                LinkedHashMap linkedHashMap;
                String string2;
                block4: {
                    block3: {
                        try {
                            string2 = String.valueOf(object);
                            linkedHashMap = go3.b;
                            object2 = object3 = linkedHashMap.get(string2);
                            if (object3 != null) return (Do)object2;
                            qf3 = new qf(y7.a(go3.a).b((o5)object));
                            if (!((o5)object).d()) break block3;
                            object2 = new Object("appmetrica_vital_");
                            ((StringBuilder)object2).append(((o5)object).b);
                            ((StringBuilder)object2).append(".dat");
                            Object object4 = ((StringBuilder)object2).toString();
                            object = new Ba(go3.a, (String)object4);
                            object4 = z.a(object4, object);
                            object = new Ba(go3.a, "appmetrica_vital_main.dat");
                            object2 = new Object(t.p((Object[])new kotlin.t[]{object4, z.a("appmetrica_vital_main.dat", object)}));
                            break block4;
                        }
                        catch (Throwable throwable2) {
                            break block5;
                        }
                    }
                    Context context = go3.a;
                    object2 = new Object("appmetrica_vital_");
                    ((StringBuilder)object2).append(((o5)object).b);
                    ((StringBuilder)object2).append(".dat");
                    object2 = new Ba(context, ((StringBuilder)object2).toString());
                }
                object3 = new Object(qf3, (Ho)object2, string2);
                linkedHashMap.put(string2, object3);
                object2 = object3;
                return (Do)object2;
            }
            throw throwable2;
        }
    }
}

