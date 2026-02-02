/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  kotlin.collections.t
 *  org.json.JSONObject
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.impl.A4;
import io.appmetrica.analytics.impl.Bb;
import io.appmetrica.analytics.impl.Cn;
import io.appmetrica.analytics.impl.D;
import io.appmetrica.analytics.impl.Gb;
import io.appmetrica.analytics.impl.Hn;
import io.appmetrica.analytics.impl.Kf;
import io.appmetrica.analytics.impl.La;
import io.appmetrica.analytics.impl.M9;
import io.appmetrica.analytics.impl.Mn;
import io.appmetrica.analytics.impl.Ob;
import io.appmetrica.analytics.impl.Of;
import io.appmetrica.analytics.impl.Q6;
import io.appmetrica.analytics.impl.Rh;
import io.appmetrica.analytics.impl.Si;
import io.appmetrica.analytics.impl.T6;
import io.appmetrica.analytics.impl.U;
import io.appmetrica.analytics.impl.U6;
import io.appmetrica.analytics.impl.V1;
import io.appmetrica.analytics.impl.Vd;
import io.appmetrica.analytics.impl.Vf;
import io.appmetrica.analytics.impl.W2;
import io.appmetrica.analytics.impl.W9;
import io.appmetrica.analytics.impl.Wf;
import io.appmetrica.analytics.impl.Wn;
import io.appmetrica.analytics.impl.X2;
import io.appmetrica.analytics.impl.Xl;
import io.appmetrica.analytics.impl.Xn;
import io.appmetrica.analytics.impl.Yl;
import io.appmetrica.analytics.impl.Zg;
import io.appmetrica.analytics.impl.Zi;
import io.appmetrica.analytics.impl.Zn;
import io.appmetrica.analytics.impl.ah;
import io.appmetrica.analytics.impl.b0;
import io.appmetrica.analytics.impl.b9;
import io.appmetrica.analytics.impl.bi;
import io.appmetrica.analytics.impl.c0;
import io.appmetrica.analytics.impl.c9;
import io.appmetrica.analytics.impl.d0;
import io.appmetrica.analytics.impl.db;
import io.appmetrica.analytics.impl.df;
import io.appmetrica.analytics.impl.e0;
import io.appmetrica.analytics.impl.g4;
import io.appmetrica.analytics.impl.jj;
import io.appmetrica.analytics.impl.jo;
import io.appmetrica.analytics.impl.kj;
import io.appmetrica.analytics.impl.l4;
import io.appmetrica.analytics.impl.lo;
import io.appmetrica.analytics.impl.ma;
import io.appmetrica.analytics.impl.nn;
import io.appmetrica.analytics.impl.o6;
import io.appmetrica.analytics.impl.oo;
import io.appmetrica.analytics.impl.ro;
import io.appmetrica.analytics.impl.wo;
import io.appmetrica.analytics.impl.x3;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.logger.common.BaseReleaseLogger;
import io.appmetrica.analytics.plugins.IPluginReporter;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import io.appmetrica.analytics.profile.UserProfile;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.collections.t;
import kotlin.r;
import org.json.JSONObject;

public abstract class Y2
implements db {
    public static final HashSet n = new HashSet<Integer>(Arrays.asList(1, 13));
    public static final W2 o = new W2();
    protected final Context a;
    protected final bi b;
    @NonNull
    protected final PublicLogger c;
    @NonNull
    protected final Xn d;
    @NonNull
    protected final ah e;
    @NonNull
    protected final U6 f;
    public final c0 g;
    protected final Si h;
    public Ob i;
    public final Wf j;
    public final ma k;
    public final df l;
    public final nn m;

    public Y2(Context context, Si object, bi bi2, ma ma2, Q6 q62, Xn xn3, ah ah3, U6 u63, c0 c04, df df3) {
        this.a = context = context.getApplicationContext();
        this.h = object;
        this.b = bi2;
        this.k = ma2;
        this.d = xn3;
        this.e = ah3;
        this.f = u63;
        this.g = c04;
        this.l = df3;
        this.c = object = LoggerStorage.getOrCreatePublicLogger(bi2.b().getApiKey());
        if (x3.a(bi2.b().isLogEnabled())) {
            ((BaseReleaseLogger)object).setEnabled(true);
        }
        this.j = q62;
        this.m = new nn(context);
    }

    public final Wn a(Throwable throwable) {
        Object object;
        Object var3_2 = null;
        if (throwable == null) {
            object = null;
            throwable = null;
        } else if (throwable instanceof V1) {
            object = throwable.getStackTrace();
            throwable = null;
        } else {
            object = null;
        }
        U u11 = new U(null, null, this.j.a());
        object = object == null ? var3_2 : Arrays.asList(object);
        return Zn.a(throwable, u11, (List)object, (String)this.k.b.a(), (Boolean)this.k.c.a());
    }

    @Override
    public final void a(@NonNull U object) {
        Object object2 = new b0((U)object, (String)this.k.b.a(), (Boolean)this.k.c.a());
        Object object3 = this.h;
        Object object4 = MessageNano.toByteArray(this.g.a((b0)object2));
        object2 = this.c;
        Object object5 = W9.a;
        object5 = Bb.c;
        object2 = new l4((byte[])object4, "", 5968, (PublicLogger)object2);
        object4 = this.b;
        object3.getClass();
        object5 = Si.a((o6)object2, (bi)object4);
        object2 = null;
        ((Si)object3).a((o6)object5, (bi)object4, 1, null);
        object4 = this.c;
        object3 = new StringBuilder("ANR was reported ");
        object5 = ((U)object).a;
        object = object2;
        if (object5 != null) {
            object = new StringBuilder("Thread[name=");
            ((StringBuilder)object).append(((Cn)object5).a);
            ((StringBuilder)object).append(",tid={");
            ((StringBuilder)object).append(((Cn)object5).c);
            ((StringBuilder)object).append(", priority=");
            ((StringBuilder)object).append(((Cn)object5).b);
            ((StringBuilder)object).append(", group=");
            ((StringBuilder)object).append(((Cn)object5).d);
            ((StringBuilder)object).append("}] at ");
            ((StringBuilder)object).append(t.B0((Iterable)((Cn)object5).f, (CharSequence)"\n", null, null, (int)0, null, null, (int)62, null));
            object = ((StringBuilder)object).toString();
        }
        ((StringBuilder)object3).append((String)object);
        ((BaseReleaseLogger)object4).info(((StringBuilder)object3).toString(), new Object[0]);
    }

    @Override
    public final void a(@NonNull Wn wn3) {
        Object object = this.h;
        Object object2 = ((Si)object).a(wn3, this.b);
        bi bi2 = ((Rh)object2).e;
        Yl yl3 = ((Si)object).e;
        if (yl3 != null) {
            bi2.b.setUuid(((Xl)yl3).g());
        } else {
            bi2.getClass();
        }
        ((Si)object).c.b((Rh)object2);
        object = this.c;
        object2 = new StringBuilder("Unhandled exception received: ");
        ((StringBuilder)object2).append(wn3);
        ((BaseReleaseLogger)object).info(((StringBuilder)object2).toString(), new Object[0]);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(String string2, String string3) {
        if (TextUtils.isEmpty((CharSequence)string2)) {
            this.c.warning("Invalid Error Environment (key,value) pair: (%s,%s).", string2, string3);
            return;
        }
        this.c.info("Put error environment pair <%s, %s>", string2, string3);
        bi bi2 = this.b;
        synchronized (bi2) {
            b9 b94 = bi2.c;
            b94.b.b(b94.a, string2, string3);
            return;
        }
    }

    public final void a(Map<String, String> object2) {
        if (!ro.a((Map)object2)) {
            for (Map.Entry entry : object2.entrySet()) {
                this.putAppEnvironmentValue((String)entry.getKey(), (String)entry.getValue());
            }
        }
    }

    @Override
    public final void b(@NonNull String object) {
        Si si3 = this.h;
        object = o6.a((String)object);
        bi bi2 = this.b;
        si3.getClass();
        si3.a(Si.a((o6)object, bi2), bi2, 1, null);
    }

    @Override
    public final void b(@NonNull String object, @Nullable String object2) {
        Object object3 = this.c;
        Object object4 = new StringBuilder("Event received: ");
        ((StringBuilder)object4).append(WrapUtils.wrapToTag(object));
        ((StringBuilder)object4).append(". With value: ");
        ((StringBuilder)object4).append(WrapUtils.wrapToTag(object2));
        ((BaseReleaseLogger)object3).info(((StringBuilder)object4).toString(), new Object[0]);
        object3 = this.h;
        object4 = this.c;
        Object object5 = W9.a;
        object5 = Bb.c;
        object = new l4((String)object2, (String)object, 1, 0, (PublicLogger)object4);
        ((o6)object).l = M9.c;
        object2 = this.b;
        object3.getClass();
        ((Si)object3).a(Si.a((o6)object, (bi)object2), (bi)object2, 1, null);
    }

    public final void b(Map<String, String> object) {
        if (!ro.a((Map)((Object)object))) {
            for (Map.Entry entry : object.entrySet()) {
                this.a((String)entry.getKey(), (String)entry.getValue());
            }
        }
    }

    @Override
    public final boolean b() {
        return this.b.f();
    }

    @Override
    public final void clearAppEnvironment() {
        this.c.info("Clear app environment", new Object[0]);
        Si si3 = this.h;
        bi bi2 = this.b;
        si3.getClass();
        o6 o63 = l4.n();
        Vf vf3 = new Vf(bi2.a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(bi2.b);
        b9 b94 = bi2.c;
        synchronized (bi2) {
            String string2 = bi2.f;
            // MONITOREXIT @DISABLED, blocks:[0, 1] lbl13 : MonitorExitStatement: MONITOREXIT : var1_3
            si3.a(new Rh(o63, false, 1, null, new bi(vf3, counterConfiguration, b94, string2)));
            return;
        }
    }

    public final void d(String object) {
        if (!this.b.f()) {
            this.h.d.c();
            Object object2 = this.i;
            Object object3 = ((Ob)object2).a;
            Object object4 = ((Ob)object2).b;
            object3.removeCallbacks((Runnable)((Ob)object2).c, (Object)((Y2)object4).b.b.getApiKey());
            this.b.e = true;
            object2 = this.h;
            object4 = this.c;
            object3 = W9.a;
            object3 = Bb.c;
            object = new l4("", (String)object, 3, 0, (PublicLogger)object4);
            object4 = this.b;
            object2.getClass();
            ((Si)object2).a(Si.a((o6)object, (bi)object4), (bi)object4, 1, null);
        }
    }

    public final void e(String object) {
        this.h.d.b();
        Object object2 = this.i;
        Ob.a(((Ob)object2).a, ((Ob)object2).b, ((Ob)object2).c);
        object2 = this.h;
        Object object3 = this.c;
        Object object4 = W9.a;
        object4 = Bb.c;
        object3 = new l4("", (String)object, 6400, 0, (PublicLogger)object3);
        object = this.b;
        object2.getClass();
        ((Si)object2).a(Si.a((o6)object3, (bi)object), (bi)object, 1, null);
        this.b.e = false;
    }

    @Override
    @NonNull
    public final IPluginReporter getPluginExtension() {
        return this;
    }

    public String j() {
        return "[BaseReporter]";
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void k() {
        String string2;
        Si si3 = this.h;
        bi bi2 = this.b;
        si3.getClass();
        Object object = bi2.d;
        synchronized (bi2) {
            string2 = bi2.f;
        }
        Object object2 = LoggerStorage.getOrCreatePublicLogger(bi2.b.getApiKey());
        Set set = W9.a;
        JSONObject jSONObject = new JSONObject();
        if (object != null && (object = ((Of)object).a) != null) {
            try {
                jSONObject.put("preloadInfo", (Object)((Kf)object).c());
            }
            catch (Throwable throwable) {}
        }
        object = jSONObject.toString();
        Bb bb4 = Bb.c;
        object2 = new l4((String)object, "", 6144, 0, (PublicLogger)object2);
        ((l4)object2).c(string2);
        si3.a(Si.a((o6)object2, bi2), bi2, 1, null);
    }

    @Override
    public final void pauseSession() {
        this.c.info("Pause session", new Object[0]);
        this.d(null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void putAppEnvironmentValue(String object, String object2) {
        String string2;
        Vf vf3;
        if (TextUtils.isEmpty((CharSequence)object)) {
            this.c.warning("Invalid App Environment (key,value) pair: (%s,%s).", object, vf3);
            return;
        }
        this.c.info("Put app environment: <%s, %s>", object, vf3);
        Si si3 = this.h;
        bi bi2 = this.b;
        si3.getClass();
        object = l4.b((String)object, (String)((Object)vf3));
        vf3 = new Vf(bi2.a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(bi2.b);
        b9 b94 = bi2.c;
        synchronized (bi2) {
            string2 = bi2.f;
        }
        si3.a(new Rh((o6)object, false, 1, null, new bi(vf3, counterConfiguration, b94, string2)));
    }

    @Override
    public final void reportAdRevenue(@NonNull AdRevenue adRevenue) {
        this.reportAdRevenue(adRevenue, false);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void reportAdRevenue(@NonNull AdRevenue adRevenue, boolean bl2) {
        String string2;
        void var2_2;
        Object object = this.h;
        Object object2 = new D(adRevenue, (boolean)var2_2, this.m, this.c);
        Object object3 = this.b;
        object.getClass();
        l4 l42 = l4.a(LoggerStorage.getOrCreatePublicLogger(((g4)object3).b.getApiKey()), (D)object2);
        Vf vf3 = new Vf(((g4)object3).a);
        object2 = new CounterConfiguration(((g4)object3).b);
        b9 b94 = ((bi)object3).c;
        synchronized (object3) {
            string2 = ((bi)object3).f;
        }
        ((Si)object).a(new Rh(l42, false, 1, null, new bi(vf3, (CounterConfiguration)object2, b94, string2)));
        object = this.c;
        object3 = new StringBuilder("AdRevenue Received: AdRevenue{adRevenue=");
        ((StringBuilder)object3).append(adRevenue.adRevenue);
        ((StringBuilder)object3).append(", currency='");
        ((StringBuilder)object3).append(WrapUtils.wrapToTag(adRevenue.currency.getCurrencyCode()));
        ((StringBuilder)object3).append("', adType=");
        ((StringBuilder)object3).append(WrapUtils.wrapToTag(adRevenue.adType));
        ((StringBuilder)object3).append(", adNetwork='");
        ((StringBuilder)object3).append(WrapUtils.wrapToTag(adRevenue.adNetwork));
        ((StringBuilder)object3).append("', adUnitId='");
        ((StringBuilder)object3).append(WrapUtils.wrapToTag(adRevenue.adUnitId));
        ((StringBuilder)object3).append("', adUnitName='");
        ((StringBuilder)object3).append(WrapUtils.wrapToTag(adRevenue.adUnitName));
        ((StringBuilder)object3).append("', adPlacementId='");
        ((StringBuilder)object3).append(WrapUtils.wrapToTag(adRevenue.adPlacementId));
        ((StringBuilder)object3).append("', adPlacementName='");
        ((StringBuilder)object3).append(WrapUtils.wrapToTag(adRevenue.adPlacementName));
        ((StringBuilder)object3).append("', precision='");
        ((StringBuilder)object3).append(WrapUtils.wrapToTag(adRevenue.precision));
        ((StringBuilder)object3).append("', payload=");
        ((StringBuilder)object3).append(Gb.b(adRevenue.payload));
        ((StringBuilder)object3).append(", autoCollected=");
        ((StringBuilder)object3).append((boolean)var2_2);
        ((StringBuilder)object3).append("}");
        ((BaseReleaseLogger)object).info(((StringBuilder)object3).toString(), new Object[0]);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void reportAnr(@NonNull Map<Thread, StackTraceElement[]> var1_1) {
        block9: {
            var8_5 = new d0(new e0(this, (Map)var1_1));
            var5_8 = new La();
            var6_9 = A4.l().a;
            var4_10 = var8_5.a();
            var2_11 = null;
            var1_1 = var3_12 = var8_5.b();
            if (var3_12 != null) ** GOTO lbl17
            var1_1 = var4_10.getStackTrace();
            catch (SecurityException var1_2) {
                var1_1 = null;
            }
            break block9;
            catch (SecurityException var1_3) {
                var1_1 = var3_12;
            }
        }
        var7_13 = (Cn)var5_8.apply(var4_10, var1_1);
        var3_12 = new ArrayList<E>();
        var9_14 = new TreeMap<K, V>(new Hn());
        try {
            var1_1 = var8_5.c();
        }
        catch (SecurityException var1_4) {
            var1_1 = var2_11;
        }
        if (var1_1 != null) {
            var9_14.putAll(var1_1);
        }
        var1_1 = var9_14.entrySet().iterator();
        while (true) {
            if (!var1_1.hasNext()) {
                this.a(new U(var7_13, (ArrayList)var3_12, var6_9.a()));
                return;
            }
            var8_7 = (Map.Entry)var1_1.next();
            var2_11 = (Thread)var8_7.getKey();
            if (var2_11 == var4_10 || var2_11 == null) continue;
            var3_12.add((Cn)var5_8.apply(var2_11, (StackTraceElement[])var8_7.getValue()));
        }
    }

    @Override
    public final void reportECommerce(@NonNull ECommerceEvent object) {
        Object object2 = this.c;
        Object object3 = new StringBuilder("E-commerce event received: ");
        ((StringBuilder)object3).append(((ECommerceEvent)object).getPublicDescription());
        ((BaseReleaseLogger)object2).info(((StringBuilder)object3).toString(), new Object[0]);
        object3 = this.h;
        object2 = this.b;
        object3.getClass();
        for (Object object4 : object.toProto()) {
            object = new l4(LoggerStorage.getOrCreatePublicLogger(((g4)object2).b.getApiKey()));
            Object object5 = Bb.c;
            ((o6)object).d = 41000;
            ((o6)object).b = ((l4)object).e(Base64Utils.compressBase64(MessageNano.toByteArray((MessageNano)((Zi)object4).a)));
            ((o6)object).g = ((Zi)object4).b.getBytesTruncated();
            object4 = new Vf(((g4)object2).a);
            object5 = new CounterConfiguration(((g4)object2).b);
            b9 b94 = ((bi)object2).c;
            synchronized (object2) {
                String string2 = ((bi)object2).f;
                // MONITOREXIT @DISABLED, blocks:[0, 1, 3] lbl24 : MonitorExitStatement: MONITOREXIT : var2_3
                ((Si)object3).a(new Rh((o6)object, false, 1, null, new bi((Vf)object4, (CounterConfiguration)object5, b94, string2)));
            }
        }
    }

    @Override
    public final void reportError(@NonNull PluginErrorDetails object, @Nullable String string2) {
        Object object2 = this.l;
        if (object != null) {
            object = ((df)object2).a((PluginErrorDetails)object);
        } else {
            object2.getClass();
            object = null;
        }
        object2 = new Zg(string2, (Wn)object);
        object = this.h;
        object2 = MessageNano.toByteArray(this.e.a((Zg)object2));
        Object object3 = this.c;
        Object object4 = W9.a;
        object4 = Bb.c;
        object3 = new l4((byte[])object2, string2, 5896, (PublicLogger)object3);
        object2 = this.b;
        object.getClass();
        ((Si)object).a(Si.a((o6)object3, (bi)object2), (bi)object2, 1, null);
        this.c.info("Error from plugin received: %s", WrapUtils.wrapToTag(string2));
    }

    @Override
    public final void reportError(@NonNull String string2, @Nullable String string3) {
        this.reportError(string2, string3, (Throwable)null);
    }

    @Override
    public final void reportError(@NonNull String string2, @Nullable String string3, @Nullable PluginErrorDetails object) {
        Object object2 = this.l;
        if (object != null) {
            object = ((df)object2).a((PluginErrorDetails)object);
        } else {
            object2.getClass();
            object = null;
        }
        object2 = new T6(new Zg(string3, (Wn)object), string2);
        object = this.h;
        object2 = MessageNano.toByteArray(this.f.a((T6)object2));
        Object object3 = this.c;
        Object object4 = W9.a;
        object4 = Bb.c;
        object2 = new l4((byte[])object2, string3, 5896, (PublicLogger)object3);
        object3 = this.b;
        object.getClass();
        ((Si)object).a(Si.a((o6)object2, (bi)object3), (bi)object3, 1, null);
        this.c.info("Error with identifier: %s from plugin received: %s", string2, WrapUtils.wrapToTag(string3));
    }

    @Override
    public final void reportError(@NonNull String string2, @Nullable String string3, @Nullable Throwable object) {
        Object object2 = new T6(new Zg(string3, this.a((Throwable)object)), string2);
        object = this.h;
        object2 = MessageNano.toByteArray(this.f.a((T6)object2));
        Object object3 = this.c;
        Object object4 = W9.a;
        object4 = Bb.c;
        object2 = new l4((byte[])object2, string3, 5896, (PublicLogger)object3);
        object3 = this.b;
        object.getClass();
        ((Si)object).a(Si.a((o6)object2, (bi)object3), (bi)object3, 1, null);
        this.c.info("Error received: id: %s, message: %s", WrapUtils.wrapToTag(string2), WrapUtils.wrapToTag(string3));
    }

    @Override
    public final void reportError(@NonNull String string2, @Nullable Throwable object) {
        Object object2 = new Zg(string2, this.a((Throwable)object));
        object = this.h;
        object2 = MessageNano.toByteArray(this.e.a((Zg)object2));
        Object object3 = this.c;
        Object object4 = W9.a;
        object4 = Bb.c;
        object3 = new l4((byte[])object2, string2, 5892, (PublicLogger)object3);
        object2 = this.b;
        object.getClass();
        ((Si)object).a(Si.a((o6)object3, (bi)object2), (bi)object2, 1, null);
        this.c.info("Error received: %s", WrapUtils.wrapToTag(string2));
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final void reportEvent(@NonNull ModuleEvent moduleEvent) {
        void var3_7;
        int n10 = moduleEvent.getType();
        if (n.contains(n10)) return;
        PublicLogger publicLogger = this.c;
        Set set = W9.a;
        String string2 = moduleEvent.getValue();
        String string3 = moduleEvent.getName();
        Bb bb4 = Bb.c;
        l4 l42 = new l4(string2, string3, 8192, moduleEvent.getType(), publicLogger);
        ModuleEvent.Category category = moduleEvent.getCategory();
        n10 = c9.a[category.ordinal()];
        if (n10 != 1) {
            if (n10 != 2) throw new r();
            M9 m94 = M9.d;
        } else {
            M9 m95 = M9.b;
        }
        l42.l = var3_7;
        l42.c = Gb.b(moduleEvent.getEnvironment());
        if (moduleEvent.getExtras() != null) {
            l42.p = moduleEvent.getExtras();
        }
        this.h.a(l42, this.b, moduleEvent.getServiceDataReporterType(), moduleEvent.getAttributes());
    }

    @Override
    public final void reportEvent(@NonNull String object) {
        Object object2 = this.c;
        Object object3 = new StringBuilder("Event received: ");
        ((StringBuilder)object3).append(WrapUtils.wrapToTag(object));
        ((BaseReleaseLogger)object2).info(((StringBuilder)object3).toString(), new Object[0]);
        object3 = this.h;
        object2 = this.c;
        Object object4 = W9.a;
        object4 = Bb.c;
        object = new l4("", (String)object, 1, 0, (PublicLogger)object2);
        object2 = this.b;
        object3.getClass();
        ((Si)object3).a(Si.a((o6)object, (bi)object2), (bi)object2, 1, null);
    }

    @Override
    public final void reportEvent(@NonNull String object, String object2) {
        PublicLogger publicLogger = this.c;
        Object object3 = new StringBuilder("Event received: ");
        ((StringBuilder)object3).append(WrapUtils.wrapToTag(object));
        ((StringBuilder)object3).append(". With value: ");
        ((StringBuilder)object3).append(WrapUtils.wrapToTag(object2));
        publicLogger.info(((StringBuilder)object3).toString(), new Object[0]);
        object3 = this.h;
        publicLogger = this.c;
        Object object4 = W9.a;
        object4 = Bb.c;
        object = new l4((String)object2, (String)object, 1, 0, publicLogger);
        object2 = this.b;
        object3.getClass();
        ((Si)object3).a(Si.a((o6)object, (bi)object2), (bi)object2, 1, null);
    }

    @Override
    public final void reportEvent(@NonNull String string2, @Nullable Map<String, Object> map2) {
        Object object = this.h;
        Object object2 = this.c;
        Object object3 = W9.a;
        object3 = Bb.c;
        ((Si)object).a(new l4("", string2, 1, 0, (PublicLogger)object2), this.b, 1, map2);
        object = this.c;
        object2 = new StringBuilder("Event received: ");
        ((StringBuilder)object2).append(WrapUtils.wrapToTag(string2));
        ((StringBuilder)object2).append(". With value: ");
        string2 = map2 == null ? null : map2.toString();
        ((StringBuilder)object2).append(WrapUtils.wrapToTag(string2));
        ((BaseReleaseLogger)object).info(((StringBuilder)object2).toString(), new Object[0]);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void reportRevenue(@NonNull Revenue object) {
        Object object2 = X2.a;
        object2.getClass();
        object2 = ((jj)object2).a((Revenue)object);
        if (((wo)object2).a) {
            String string2;
            Object object3 = this.h;
            Object object4 = new kj((Revenue)object, this.c);
            object2 = this.b;
            object3.getClass();
            l4 l42 = l4.a(LoggerStorage.getOrCreatePublicLogger(((g4)object2).b.getApiKey()), (kj)object4);
            Vf vf3 = new Vf(((g4)object2).a);
            CounterConfiguration counterConfiguration = new CounterConfiguration(((g4)object2).b);
            object4 = ((bi)object2).c;
            synchronized (object2) {
                string2 = ((bi)object2).f;
            }
            ((Si)object3).a(new Rh(l42, false, 1, null, new bi(vf3, counterConfiguration, (b9)object4, string2)));
            object3 = this.c;
            object2 = new StringBuilder("Revenue received for productID: ");
            ((StringBuilder)object2).append(WrapUtils.wrapToTag(((Revenue)object).productID));
            ((StringBuilder)object2).append(" of quantity: ");
            ((StringBuilder)object2).append(WrapUtils.wrapToTag(((Revenue)object).quantity));
            ((StringBuilder)object2).append(" with price (in micros): ");
            ((StringBuilder)object2).append(((Revenue)object).priceMicros);
            ((StringBuilder)object2).append(" ");
            ((StringBuilder)object2).append(((Revenue)object).currency);
            ((BaseReleaseLogger)object3).info(((StringBuilder)object2).toString(), new Object[0]);
            return;
        }
        PublicLogger object3 = this.c;
        object = new StringBuilder("Passed revenue is not valid. Reason: ");
        ((StringBuilder)object).append(((wo)object2).b);
        object3.warning(((StringBuilder)object).toString(), new Object[0]);
    }

    @Override
    public final void reportUnhandledException(@NonNull PluginErrorDetails pluginErrorDetails) {
        Object object = this.l.a(pluginErrorDetails);
        Si si3 = this.h;
        Object object2 = ((Wn)object).a;
        Object object3 = "";
        if (object2 != null) {
            object3 = WrapUtils.getOrDefault(((Mn)object2).a, "");
        }
        object2 = MessageNano.toByteArray(this.d.a((Wn)object));
        object = this.c;
        Object object4 = W9.a;
        object4 = Bb.c;
        object = new l4((byte[])object2, (String)object3, 5891, (PublicLogger)object);
        object3 = this.b;
        si3.getClass();
        si3.a(Si.a((o6)object, (bi)object3), (bi)object3, 1, null);
        this.c.info("Crash from plugin received: %s", WrapUtils.wrapToTag(pluginErrorDetails.getMessage()));
    }

    @Override
    public final void reportUnhandledException(@NonNull Throwable object) {
        object = Zn.a((Throwable)object, new U(null, null, this.j.a()), null, (String)this.k.b.a(), (Boolean)this.k.c.a());
        Object object2 = this.h;
        ((Si)object2).a(((Si)object2).a((Wn)object, this.b));
        object2 = this.c;
        StringBuilder stringBuilder = new StringBuilder("Unhandled exception received: ");
        stringBuilder.append(object);
        ((BaseReleaseLogger)object2).info(stringBuilder.toString(), new Object[0]);
    }

    @Override
    public final void reportUserProfile(@NonNull UserProfile object) {
        Object object2;
        Object object3 = new jo(jo.c);
        Object object4 = ((UserProfile)object).getUserProfileUpdates().iterator();
        while (object4.hasNext()) {
            object = object4.next().getUserProfileUpdatePatcher();
            ((Vd)object).e = object2 = this.c;
            object.a((jo)object3);
        }
        object2 = new oo();
        object = new ArrayList();
        for (int i14 = 0; i14 < ((jo)object3).a.size(); ++i14) {
            object4 = ((jo)object3).a;
            object4 = ((HashMap)object4.get(object4.keyAt(i14))).values().iterator();
            while (object4.hasNext()) {
                ((ArrayList)object).add((lo)object4.next());
            }
        }
        ((oo)object2).a = ((ArrayList)object).toArray(new lo[((ArrayList)object).size()]);
        object = o.a(object2);
        if (((wo)object).a) {
            object3 = this.h;
            object = this.b;
            object3.getClass();
            o6 o63 = l4.a((oo)object2);
            Vf vf3 = new Vf(((g4)object).a);
            object4 = new CounterConfiguration(((g4)object).b);
            object2 = ((bi)object).c;
            synchronized (object) {
                String string2 = ((bi)object).f;
                // MONITOREXIT @DISABLED, blocks:[0, 1, 7] lbl32 : MonitorExitStatement: MONITOREXIT : var1_1
                ((Si)object3).a(new Rh(o63, false, 1, null, new bi(vf3, (CounterConfiguration)object4, (b9)object2, string2)));
                this.c.info("User profile received", new Object[0]);
            }
        } else {
            object3 = this.c;
            object2 = new StringBuilder("UserInfo wasn't sent because ");
            ((StringBuilder)object2).append(((wo)object).b);
            ((BaseReleaseLogger)object3).warning(((StringBuilder)object2).toString(), new Object[0]);
        }
    }

    @Override
    public final void resumeSession() {
        this.e(null);
        this.c.info("Resume session", new Object[0]);
    }

    @Override
    public final void sendEventsBuffer() {
        this.c.info("Send event buffer", new Object[0]);
        Si si3 = this.h;
        Object object = Bb.c;
        object = this.c;
        Object object2 = W9.a;
        object2 = new l4("", "", 256, 0, (PublicLogger)object);
        object = this.b;
        si3.getClass();
        si3.a(Si.a((o6)object2, (bi)object), (bi)object, 1, null);
    }

    @Override
    public final void setDataSendingEnabled(boolean bl2) {
        this.b.b.setDataSendingEnabled(bl2);
        this.c.info("Updated data sending enabled: %s", bl2);
    }

    @Override
    public final void setSessionExtra(@NonNull String object, @Nullable byte[] byArray) {
        Si si3 = this.h;
        Object object2 = this.c;
        Object object3 = W9.a;
        object3 = Bb.c;
        object3 = new l4("", null, 8193, 0, (PublicLogger)object2);
        object2 = byArray;
        if (byArray == null) {
            object2 = new byte[0];
        }
        ((o6)object3).p = Collections.singletonMap(object, object2);
        object = this.b;
        si3.getClass();
        si3.a(Si.a((o6)object3, (bi)object), (bi)object, 1, null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void setUserProfileID(@Nullable String string2) {
        String string3;
        Object object = this.h;
        Object object2 = this.b;
        object.getClass();
        l4 l42 = new l4(LoggerStorage.getOrCreatePublicLogger(((g4)object2).b.getApiKey()));
        Object object3 = Bb.c;
        l42.d = 40962;
        l42.c(string2);
        l42.b = l42.e(string2);
        Vf vf3 = new Vf(((g4)object2).a);
        object3 = new CounterConfiguration(((g4)object2).b);
        b9 b94 = ((bi)object2).c;
        synchronized (object2) {
            string3 = ((bi)object2).f;
        }
        ((Si)object).a(new Rh(l42, false, 1, null, new bi(vf3, (CounterConfiguration)object3, b94, string3)));
        object2 = this.c;
        object = new StringBuilder("Set user profile ID: ");
        ((StringBuilder)object).append(WrapUtils.wrapToTag(string2));
        ((BaseReleaseLogger)object2).info(((StringBuilder)object).toString(), new Object[0]);
    }
}

