/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.ResultReceiver
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.impl.Hg;
import io.appmetrica.analytics.impl.Km;
import io.appmetrica.analytics.impl.M4;
import io.appmetrica.analytics.impl.Mg;
import io.appmetrica.analytics.impl.N4;
import io.appmetrica.analytics.impl.Na;
import io.appmetrica.analytics.impl.Pm;
import io.appmetrica.analytics.impl.Ql;
import io.appmetrica.analytics.impl.S4;
import io.appmetrica.analytics.impl.Sl;
import io.appmetrica.analytics.impl.U4;
import io.appmetrica.analytics.impl.Vh;
import io.appmetrica.analytics.impl.X4;
import io.appmetrica.analytics.impl.Zl;
import io.appmetrica.analytics.impl.a7;
import io.appmetrica.analytics.impl.b5;
import io.appmetrica.analytics.impl.c5;
import io.appmetrica.analytics.impl.eb;
import io.appmetrica.analytics.impl.gb;
import io.appmetrica.analytics.impl.lm;
import io.appmetrica.analytics.impl.o5;
import io.appmetrica.analytics.impl.o6;
import io.appmetrica.analytics.impl.om;
import io.appmetrica.analytics.impl.p5;
import io.appmetrica.analytics.impl.r4;
import io.appmetrica.analytics.impl.s4;
import io.appmetrica.analytics.impl.sn;
import io.appmetrica.analytics.impl.t4;
import io.appmetrica.analytics.impl.vb;
import io.appmetrica.analytics.impl.xb;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class V4
implements eb,
Zl,
gb {
    public final Context a;
    public final o5 b;
    public final Km c;
    public final Vh d;
    public final c5 e;
    public final sn f;
    public ArrayList g = new ArrayList();
    public final p5 h;
    public final Hg i;
    public final s4 j;
    public final Mg k;
    public final Object l = new Object();

    public V4(@NonNull Context context, @NonNull Ql ql3, @NonNull o5 o54, @NonNull N4 n42, @NonNull Hg hg3) {
        this(context, ql3, o54, n42, new Vh(n42.b), hg3, new p5(), new X4(), new Mg());
    }

    public V4(Context object, Ql ql3, o5 o54, N4 n42, Vh vh3, Hg hg3, p5 p54, X4 x44, Mg mg2) {
        this.a = object = object.getApplicationContext();
        this.b = o54;
        this.d = vh3;
        this.h = p54;
        this.e = X4.a(this);
        V4.b(n42);
        object = ql3.a((Context)object, o54, n42.a);
        this.c = object;
        this.j = t4.a((Km)object, Na.j().b());
        this.f = x44.a(this, (Km)object);
        this.i = hg3;
        this.k = mg2;
        ql3.a(o54, this);
    }

    public static void b(N4 object) {
        object = ((N4)object).b.n;
        boolean bl2 = Boolean.FALSE.equals(object);
        Na.F.b().b(bl2 ^ true);
    }

    @NonNull
    public final s4 a() {
        return this.j;
    }

    public final void a(@Nullable ResultReceiver resultReceiver) {
        this.k.a(new U4(resultReceiver));
    }

    @Override
    public final void a(@NonNull M4 m44) {
        Vh vh3 = this.d;
        vh3.a = vh3.a.b(m44);
    }

    @Override
    public final void a(@NonNull N4 n42) {
        this.c.a(n42.a);
        this.a(n42.b);
    }

    public final void a(@NonNull S4 s42) {
        synchronized (this) {
            this.h.a.add(s42);
            Object object = Pm.a(this.c.e().l);
            object = this.j.a((HashMap)object);
            a7.a(s42.c, (r4)object);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void a(@NonNull Sl sl3, @Nullable om object) {
        object = this.l;
        synchronized (object) {
            try {
                Iterator iterator = this.g.iterator();
                while (true) {
                    if (!iterator.hasNext()) {
                        this.g.clear();
                        return;
                    }
                    xb xb3 = (xb)iterator.next();
                    a7.a(xb3.a, sl3, this.j.a(xb3.c));
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final void a(@NonNull o6 o63, @NonNull S4 s42) {
        c5 c54 = this.e;
        c54.getClass();
        c54.a(o63, new b5(s42));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void a(@NonNull om arrayList) {
        Object object = this.l;
        synchronized (object) {
            ArrayList<Object> arrayList2;
            Object object2;
            Object object32;
            block8: {
                Throwable throwable2;
                block7: {
                    try {
                        for (Object object32 : this.h.a) {
                            object2 = Pm.a(((om)((Object)arrayList)).l);
                            object2 = this.j.a((HashMap)object2);
                            a7.a(((S4)object32).c, (r4)object2);
                        }
                    }
                    catch (Throwable throwable2) {
                        break block7;
                    }
                    arrayList2 = new ArrayList<Object>();
                    object32 = this.g.iterator();
                    break block8;
                }
                throw throwable2;
            }
            while (object32.hasNext()) {
                object2 = (xb)object32.next();
                List list = ((xb)object2).b;
                HashMap hashMap = ((xb)object2).c;
                vb vb2 = new vb();
                if (lm.a(arrayList, list, hashMap, vb2)) {
                    hashMap = ((xb)object2).a;
                    object2 = ((xb)object2).c;
                    a7.a((ResultReceiver)hashMap, this.j.a((HashMap)object2));
                    continue;
                }
                arrayList2.add(object2);
            }
            this.g = arrayList = new ArrayList(arrayList2);
            if (!arrayList2.isEmpty()) {
                this.f.c();
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void a(@Nullable xb xb3) {
        Object object;
        List list;
        HashMap hashMap = new HashMap();
        if (xb3 != null) {
            list = xb3.b;
            object = xb3.a;
            hashMap = xb3.c;
        } else {
            object = null;
            list = null;
        }
        boolean bl2 = this.c.a(list, hashMap);
        if (!bl2) {
            a7.a(object, this.j.a(hashMap));
        }
        if (!this.c.g()) {
            if (!bl2) return;
            a7.a(object, this.j.a(hashMap));
            return;
        }
        object = this.l;
        // MONITORENTER : object
        if (bl2 && xb3 != null) {
            this.g.add(xb3);
            // MONITOREXIT : object
        }
        this.f.c();
    }

    @Override
    @NonNull
    public final o5 b() {
        return this.b;
    }

    public final void b(@NonNull S4 s42) {
        synchronized (this) {
            this.h.a.remove(s42);
            return;
        }
    }

    @Override
    @NonNull
    public final CounterConfigurationReporterType c() {
        return CounterConfigurationReporterType.COMMUTATION;
    }

    @NonNull
    public final M4 d() {
        return this.d.a;
    }

    @NonNull
    public final Hg e() {
        return this.i;
    }

    @Override
    @NonNull
    public final Context getContext() {
        return this.a;
    }
}

