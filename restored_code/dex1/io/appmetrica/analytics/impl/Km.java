/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.VisibleForTesting
 *  kotlin.collections.t
 *  kotlin.text.p
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.executors.SynchronizedBlockingExecutor;
import io.appmetrica.analytics.impl.Be;
import io.appmetrica.analytics.impl.Im;
import io.appmetrica.analytics.impl.Jm;
import io.appmetrica.analytics.impl.Lm;
import io.appmetrica.analytics.impl.M5;
import io.appmetrica.analytics.impl.N5;
import io.appmetrica.analytics.impl.Na;
import io.appmetrica.analytics.impl.Ol;
import io.appmetrica.analytics.impl.Pm;
import io.appmetrica.analytics.impl.Ql;
import io.appmetrica.analytics.impl.Rl;
import io.appmetrica.analytics.impl.Sl;
import io.appmetrica.analytics.impl.Y3;
import io.appmetrica.analytics.impl.Zl;
import io.appmetrica.analytics.impl.am;
import io.appmetrica.analytics.impl.b4;
import io.appmetrica.analytics.impl.gm;
import io.appmetrica.analytics.impl.im;
import io.appmetrica.analytics.impl.km;
import io.appmetrica.analytics.impl.lm;
import io.appmetrica.analytics.impl.mm;
import io.appmetrica.analytics.impl.nm;
import io.appmetrica.analytics.impl.o5;
import io.appmetrica.analytics.impl.oe;
import io.appmetrica.analytics.impl.om;
import io.appmetrica.analytics.impl.pk;
import io.appmetrica.analytics.impl.qe;
import io.appmetrica.analytics.impl.rm;
import io.appmetrica.analytics.impl.ro;
import io.appmetrica.analytics.impl.sm;
import io.appmetrica.analytics.impl.vo;
import io.appmetrica.analytics.networktasks.internal.AllHostsExponentialBackoffPolicy;
import io.appmetrica.analytics.networktasks.internal.ConfigProvider;
import io.appmetrica.analytics.networktasks.internal.DefaultResponseValidityChecker;
import io.appmetrica.analytics.networktasks.internal.FullUrlFormer;
import io.appmetrica.analytics.networktasks.internal.IParamsAppender;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;
import io.appmetrica.analytics.networktasks.internal.RequestDataHolder;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import io.appmetrica.analytics.networktasks.internal.ResponseValidityChecker;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.t;
import kotlin.k0;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class Km {
    public final Lm a;
    public volatile NetworkTask b;

    public Km(@NotNull Lm lm3) {
        this.a = lm3;
    }

    public static final /* synthetic */ Lm a(Km km3) {
        return km3.a;
    }

    @NotNull
    public final o5 a() {
        return this.a.f;
    }

    @VisibleForTesting
    @NotNull
    public final om a(@NotNull mm mm3, @NotNull km object, long l10) {
        Object object2;
        boolean bl2;
        String string2;
        String string3;
        Map map2;
        String string4;
        block7: {
            block6: {
                string4 = Pm.a(((km)object).h);
                map2 = ((km)object).i.a;
                string3 = mm3.j;
                string2 = this.e().k;
                bl2 = Pm.a(Pm.a(string3));
                object2 = null;
                if (!bl2) {
                    string3 = Pm.a(Pm.a(string2)) ? string2 : null;
                }
                if ((string2 = this.e().a) == null) break block6;
                if (p.h0((CharSequence)string2) ^ true) {
                    object2 = string2;
                }
                string2 = object2;
                if (object2 != null) break block7;
            }
            string2 = mm3.h;
        }
        object2 = new rm(mm3.b);
        String string5 = mm3.i;
        ((rm)object2).o = this.a.i.currentTimeSeconds();
        ((rm)object2).a = this.e().d;
        ((rm)object2).c = mm3.d;
        ((rm)object2).f = mm3.c;
        ((rm)object2).g = ((km)object).e;
        ((rm)object2).b = mm3.e;
        ((rm)object2).d = mm3.f;
        ((rm)object2).e = mm3.g;
        ((rm)object2).h = mm3.n;
        ((rm)object2).i = mm3.o;
        ((rm)object2).j = string3;
        ((rm)object2).k = string4;
        this.a.k.getClass();
        object = Pm.a(string3);
        bl2 = ro.a(map2) ? ro.a((Map)object) : object.equals(map2);
        ((rm)object2).q = bl2;
        ((rm)object2).l = Pm.a(map2);
        ((rm)object2).r = mm3.m;
        ((rm)object2).n = mm3.k;
        ((rm)object2).s = mm3.p;
        ((rm)object2).p = true;
        ((rm)object2).t = l10;
        object = this.d();
        if (((km)object).n == 0L) {
            ((km)object).n = l10;
        }
        ((rm)object2).u = ((km)object).n;
        ((rm)object2).v = false;
        ((rm)object2).w = mm3.q;
        ((rm)object2).y = mm3.s;
        ((rm)object2).x = mm3.r;
        ((rm)object2).z = mm3.t;
        ((rm)object2).A = mm3.u;
        ((rm)object2).B = mm3.v;
        ((rm)object2).C = mm3.w;
        return new om(string2, string5, new sm((rm)object2));
    }

    public final void a(@NotNull Sl sl3) {
        synchronized (this) {
            this.b = null;
            // MONITOREXIT @DISABLED, blocks:[0, 1] lbl4 : MonitorExitStatement: MONITOREXIT : this
            Lm lm3 = this.a;
            lm3.d.a(lm3.f.a, sl3, this.e());
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(@NotNull im object) {
        synchronized (this) {
            Throwable throwable2;
            block7: {
                block5: {
                    Object object2;
                    block6: {
                        try {
                            this.a.l.a((im)object);
                            object = this.d();
                            if (!((km)object).k) break block5;
                            object2 = ((km)object).j;
                            if (object2 == null || object2.isEmpty()) break block6;
                            if (!ro.a(object2, ((km)object).e)) {
                                Object object3 = this.e();
                                object = ((om)object3).c;
                                object = ((sm)object).a(((sm)object).m);
                                String string2 = ((om)object3).a;
                                object3 = ((om)object3).b;
                                ((rm)object).g = object2;
                                sm sm3 = new sm((rm)object);
                                object2 = new om(string2, (String)object3, sm3);
                                this.b((om)object2);
                                this.a((om)object2);
                            }
                            break block5;
                        }
                        catch (Throwable throwable2) {
                            break block7;
                        }
                    }
                    object = ((km)object).e;
                    if (object != null && object.isEmpty() ^ true) {
                        Object object4 = this.e();
                        object = ((om)object4).c;
                        object = ((sm)object).a(((sm)object).m);
                        object2 = ((om)object4).a;
                        object4 = ((om)object4).b;
                        ((rm)object).g = null;
                        sm sm4 = new sm((rm)object);
                        om om3 = new om((String)object2, (String)object4, sm4);
                        this.b(om3);
                        this.a(om3);
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void a(@NotNull mm object, @NotNull km object2, @Nullable Map<String, ? extends List<String>> object3) {
        long l10;
        block7: {
            block6: {
                boolean bl2;
                // MONITORENTER : this
                if (ro.a((Map)object3) || (bl2 = ro.a((Collection)(object3 = (List)CollectionUtils.getFromMapIgnoreCase(object3, "Date"))))) break block6;
                try {
                    String string2 = (String)object3.get(0);
                    object3 = new SimpleDateFormat("E, d MMM yyyy HH:mm:ss z", Locale.US);
                    object3 = ((DateFormat)object3).parse(string2).getTime();
                }
                catch (Throwable throwable) {}
            }
            object3 = null;
            if (object3 == null) break block7;
            l10 = (Long)object3;
        }
        l10 = 0L;
        object3 = ((mm)object).l;
        pk.a.a(l10, (Long)object3);
        object = this.a((mm)object, (km)object2, l10);
        this.h();
        this.b((om)object);
        object2 = k0.a;
        // MONITOREXIT : this
        this.a((om)object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void a(om om3) {
        Object object = this.a;
        Object object2 = ((Lm)object).d;
        object = ((Lm)object).b;
        HashMap hashMap = ((Ol)object2).a.b;
        // MONITORENTER : hashMap
        object2 = ((Ol)object2).a;
        ((Ql)object2).c = om3;
        object = (Collection)((Ql)object2).a.a.get(object);
        object = object == null ? new ArrayList() : new ArrayList(object);
        object = ((ArrayList)object).iterator();
        while (object.hasNext()) {
            ((Zl)object.next()).a(om3);
        }
    }

    public final boolean a(@Nullable List<String> list, @NotNull Map<String, String> map2) {
        synchronized (this) {
            om om3 = this.e();
            Jm jm3 = new Jm(this);
            boolean bl2 = lm.a(om3, list, map2, jm3);
            return bl2 ^ true;
        }
    }

    @NotNull
    public final Context b() {
        return this.a.a;
    }

    public final void b(om om3) {
        synchronized (this) {
            this.a.l.a(om3);
            nm nm3 = this.a.g;
            nm3.b.a(om3.a);
            nm3.b.b(om3.b);
            nm3.a.save(om3.c);
            this.a.e.a(om3);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Nullable
    public final NetworkTask c() {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                Object object;
                Object object2;
                block3: {
                    try {
                        if (!this.g()) return null;
                        object2 = this.b;
                        if (object2 == null) break block3;
                        object = object2;
                        if (!((NetworkTask)object2).isRemoved()) return object;
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                object = this.d();
                object2 = qe.a;
                object2 = new Object();
                Object object3 = new gm((Be)object2, Na.F.o());
                object2 = new Object(object);
                SynchronizedBlockingExecutor synchronizedBlockingExecutor = new SynchronizedBlockingExecutor();
                N5 n54 = new N5(this.a.a);
                AllHostsExponentialBackoffPolicy allHostsExponentialBackoffPolicy = new AllHostsExponentialBackoffPolicy(qe.a.a(oe.b));
                FullUrlFormer<Object> fullUrlFormer = new FullUrlFormer<Object>((IParamsAppender<Object>)object3, (ConfigProvider<Object>)object2);
                RequestDataHolder requestDataHolder = new RequestDataHolder();
                Object object4 = new DefaultResponseValidityChecker();
                object3 = new ResponseDataHolder((ResponseValidityChecker)object4);
                object4 = new am();
                Im im3 = new Im(this, (am)object4, fullUrlFormer, requestDataHolder, (ResponseDataHolder)object3, (ConfigProvider)object2);
                this.b = object = new NetworkTask(synchronizedBlockingExecutor, n54, allHostsExponentialBackoffPolicy, im3, t.m(), qe.c);
                return object;
            }
            throw throwable2;
        }
    }

    @NotNull
    public final km d() {
        return (km)this.a.l.a();
    }

    @NotNull
    public final om e() {
        Rl rl3 = this.a.l;
        synchronized (rl3) {
            om om3 = rl3.c.a;
            return om3;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void f() {
        List<String> list;
        Object object = this.a.l;
        synchronized (object) {
            list = ((M5)object).c.a;
        }
        object = ((om)((Object)list)).c;
        rm rm3 = ((sm)object).a(((sm)object).m);
        String string3 = ((om)((Object)list)).a;
        object = ((om)((Object)list)).b;
        vo vo3 = this.a.n;
        String string2 = ((om)((Object)list)).d;
        vo3.getClass();
        if (!vo.a(string2)) {
            rm3.a = this.a.m.a().id;
        }
        if ((list = ((om)((Object)list)).a) == null || ((String)((Object)list)).length() == 0) {
            string3 = this.a.h.a();
            object = "";
        }
        if ((list = this.a.c.e) == null || !(list.isEmpty() ^ true)) {
            list = null;
        }
        rm3.g = list;
        object = new om(string3, (String)object, new sm(rm3));
        this.b((om)object);
        this.a((om)object);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean g() {
        synchronized (this) {
            Throwable throwable2;
            block10: {
                boolean bl2;
                boolean bl3;
                block9: {
                    try {
                        bl3 = Na.F.g().isRestrictedForSdk();
                        bl2 = false;
                        if (!bl3) break block9;
                    }
                    catch (Throwable throwable2) {
                        break block10;
                    }
                    return false;
                }
                om om3 = this.e();
                Object object = lm.a;
                bl3 = om3.w;
                boolean bl4 = true;
                if (bl3) return true;
                long l10 = om3.o;
                long l11 = om3.A.a;
                if (lm.b.currentTimeSeconds() > l10 + l11) {
                    return true;
                }
                bl3 = false;
                if (bl3) return bl3;
                boolean bl5 = bl2;
                if (lm.a(om3.d)) {
                    bl5 = bl2;
                    if (lm.a(om3.a)) {
                        bl5 = bl2;
                        if (lm.a(om3.b)) {
                            bl5 = true;
                        }
                    }
                }
                bl3 = bl5 ^ true;
                {
                    b4 b44 = this.a.k;
                    Map map2 = this.d().h;
                    object = this.a.j;
                    b44.getClass();
                    boolean bl6 = b4.a(map2, om3, (Y3)object);
                    if (bl3) return bl3;
                    if (bl6) return bl3;
                    return bl4;
                }
            }
            throw throwable2;
        }
    }

    public final void h() {
        synchronized (this) {
            this.b = null;
            return;
        }
    }
}

