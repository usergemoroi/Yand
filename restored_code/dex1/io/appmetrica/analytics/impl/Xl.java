/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Parcelable
 *  android.text.TextUtils
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.AdvIdentifiersResult;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.StartupParamsItem;
import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.impl.A4;
import io.appmetrica.analytics.impl.Bb;
import io.appmetrica.analytics.impl.Gb;
import io.appmetrica.analytics.impl.O;
import io.appmetrica.analytics.impl.Pm;
import io.appmetrica.analytics.impl.Si;
import io.appmetrica.analytics.impl.Sl;
import io.appmetrica.analytics.impl.Ul;
import io.appmetrica.analytics.impl.Vl;
import io.appmetrica.analytics.impl.W9;
import io.appmetrica.analytics.impl.Wl;
import io.appmetrica.analytics.impl.Yl;
import io.appmetrica.analytics.impl.Z6;
import io.appmetrica.analytics.impl.a7;
import io.appmetrica.analytics.impl.bi;
import io.appmetrica.analytics.impl.fm;
import io.appmetrica.analytics.impl.l4;
import io.appmetrica.analytics.impl.o0;
import io.appmetrica.analytics.impl.o6;
import io.appmetrica.analytics.impl.pf;
import io.appmetrica.analytics.impl.r4;
import io.appmetrica.analytics.impl.ro;
import io.appmetrica.analytics.impl.ta;
import io.appmetrica.analytics.impl.va;
import io.appmetrica.analytics.impl.vo;
import io.appmetrica.analytics.impl.xa;
import io.appmetrica.analytics.impl.xb;
import io.appmetrica.analytics.internal.IdentifiersResult;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.logger.common.BaseReleaseLogger;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

public final class Xl
implements Yl {
    public static final Map k = Collections.unmodifiableMap(new Ul());
    public final List a = Arrays.asList("appmetrica_uuid", "appmetrica_device_id", "appmetrica_device_id_hash", "appmetrica_get_ad_url", "appmetrica_report_ad_url", "appmetrica_clids");
    public final Si b;
    public final fm c;
    public final Handler d;
    public PublicLogger e;
    public final Vl f;
    public final Object g = new Object();
    public final WeakHashMap h = new WeakHashMap();
    public HashMap i;
    public boolean j = false;

    public Xl(@NonNull Context context, Si si3, pf pf3, @NonNull Handler handler) {
        this(si3, new fm(context, pf3), handler);
    }

    public Xl(Si si3, fm fm3, Handler handler) {
        this.b = si3;
        this.c = fm3;
        this.d = handler;
        this.f = new Vl(this);
    }

    @NonNull
    public final AdvIdentifiersResult a() {
        Object object = this.c;
        O o11 = ((fm)object).j;
        IdentifiersResult identifiersResult = (IdentifiersResult)((fm)object).b.get("appmetrica_google_adv_id");
        IdentifiersResult identifiersResult2 = (IdentifiersResult)((fm)object).b.get("appmetrica_huawei_oaid");
        object = (IdentifiersResult)((fm)object).b.get("appmetrica_yandex_adv_id");
        o11.getClass();
        return new AdvIdentifiersResult(O.a(identifiersResult), O.a(identifiersResult2), O.a((IdentifiersResult)object));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final StartupParamsCallback.Result a(List list) {
        HashMap<String, StartupParamsItem> hashMap = new HashMap<String, StartupParamsItem>();
        fm fm3 = this.c;
        synchronized (fm3) {
            try {
                Iterator iterator = list.iterator();
                while (true) {
                    if (!iterator.hasNext()) {
                        fm3.l.a(list, hashMap);
                        fm3.m.a(list, hashMap);
                        return new StartupParamsCallback.Result(hashMap);
                    }
                    String string2 = (String)iterator.next();
                    IdentifiersResult identifiersResult = (IdentifiersResult)fm3.b.get(string2);
                    if (identifiersResult == null) continue;
                    hashMap.put(string2, fm3.c.a(identifiersResult));
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final void a(@NonNull Bundle bundle) {
        this.b(bundle, null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(Bundle object, StartupParamsCallback object2) {
        block11: {
            PublicLogger publicLogger;
            List list;
            block13: {
                block12: {
                    block10: {
                        if (!this.h.containsKey(object2)) return;
                        list = (List)this.h.get(object2);
                        if (!this.c.a((Collection)list)) break block10;
                        object2.onReceive(this.a(list));
                        break block11;
                    }
                    boolean bl2 = object.containsKey("startup_error_key_code");
                    publicLogger = null;
                    if (!bl2) break block12;
                    int n10 = object.getInt("startup_error_key_code");
                    object = Sl.b;
                    if (n10 != 1) {
                        if (n10 == 2) {
                            object = Sl.d;
                        }
                        break block13;
                    } else {
                        object = Sl.c;
                    }
                    break block13;
                }
                object = null;
            }
            Object object3 = object;
            Object object4 = publicLogger;
            if (object == null) {
                if (!this.c.a()) {
                    object4 = this.e;
                    if (object4 != null) {
                        ((BaseReleaseLogger)object4).warning("Clids error. Passed clids: %s, and clids from server are empty.", this.i);
                    }
                    object4 = new StartupParamsCallback.Reason("INCONSISTENT_CLIDS");
                    object3 = object;
                } else {
                    object3 = Sl.b;
                    object4 = publicLogger;
                }
            }
            object = object4;
            if (object4 == null) {
                object = CollectionUtils.getOrDefault(k, object3, StartupParamsCallback.Reason.UNKNOWN);
            }
            object2.onRequestError((StartupParamsCallback.Reason)object, this.a(list));
        }
        this.h.remove(object2);
        if (!this.h.isEmpty()) return;
        object2 = this.b.d;
        object = ((o0)object2).f;
        synchronized (object) {
            ((o0)object2).c = false;
            ((o0)object2).c();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(StartupParamsCallback startupParamsCallback, List list) {
        if (this.h.isEmpty()) {
            o0 o02 = this.b.d;
            Object object = o02.f;
            synchronized (object) {
                o02.c = true;
                o02.b();
            }
        }
        this.h.put(startupParamsCallback, list);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(@NonNull StartupParamsCallback startupParamsCallback, @NonNull List<String> bundle, @Nullable Map<String, String> map2) {
        Object object = this.g;
        synchronized (object) {
            Throwable throwable2;
            block6: {
                Object object2;
                block5: {
                    try {
                        HashMap<String, String> hashMap;
                        object2 = this.c;
                        object2.getClass();
                        if (ro.a(map2) || ro.a(map2, ((fm)object2).e)) break block5;
                        ((fm)object2).e = hashMap = new HashMap<String, String>(map2);
                        ((fm)object2).g = true;
                        ((fm)object2).c();
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                }
                this.a(startupParamsCallback, (List)bundle);
                if (this.c.a((List)bundle)) {
                    object2 = new Wl(this, startupParamsCallback);
                    this.a((List)bundle, (Z6)object2, map2, true);
                } else {
                    bundle = new Bundle();
                    this.a(bundle, startupParamsCallback);
                }
                return;
            }
            throw throwable2;
        }
    }

    public final void a(@NonNull PublicLogger publicLogger) {
        this.e = publicLogger;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(String string2) {
        Object object = this.g;
        synchronized (object) {
            this.b.a(string2);
            return;
        }
    }

    public final void a(List object, Z6 object2, Map object3, boolean bl2) {
        a7 a74 = new a7(this.d, (Z6)object2);
        object2 = this.b;
        object2.getClass();
        Bundle bundle = new Bundle();
        bundle.putParcelable("io.appmetrica.analytics.impl.IdentifiersData", (Parcelable)new xb(a74, (List)object, (Map)object3, bl2));
        object = Bb.c;
        object = PublicLogger.getAnonymousInstance();
        object3 = W9.a;
        object = new l4("", "", 1536, 0, (PublicLogger)object);
        ((o6)object).m = bundle;
        object3 = ((Si)object2).a;
        ((Si)object2).a(Si.a((o6)object, (bi)object3), (bi)object3, 1, null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(Map<String, String> hashMap) {
        if (ro.a(hashMap)) return;
        Object object = this.g;
        synchronized (object) {
            try {
                HashMap hashMap2;
                this.i = hashMap2 = Pm.b(hashMap);
                this.b.a(hashMap2);
                fm fm3 = this.c;
                fm3.getClass();
                if (ro.a(hashMap2)) return;
                if (ro.a(hashMap2, fm3.e)) return;
                fm3.e = hashMap = new HashMap(hashMap2);
                fm3.g = true;
                fm3.c();
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final Map<String, String> b() {
        Object object = (IdentifiersResult)this.c.b.get("appmetrica_clids");
        object = object == null ? null : ((IdentifiersResult)object).id;
        object = !TextUtils.isEmpty((CharSequence)object) ? Gb.a((String)object) : this.i;
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(Bundle object) {
        IdentifiersResult identifiersResult = r4.a((Bundle)object, "Uuid");
        IdentifiersResult identifiersResult2 = r4.a((Bundle)object, "DeviceId");
        IdentifiersResult identifiersResult3 = r4.a((Bundle)object, "DeviceIdHash");
        IdentifiersResult identifiersResult4 = r4.a((Bundle)object, "AdUrlReport");
        IdentifiersResult identifiersResult5 = r4.a((Bundle)object, "AdUrlGet");
        IdentifiersResult identifiersResult6 = r4.a((Bundle)object, "Clids");
        Object object2 = r4.a((Bundle)object, "RequestClids");
        IdentifiersResult identifiersResult7 = r4.a((Bundle)object, "GAID");
        Object object3 = r4.a((Bundle)object, "HOAID");
        Object object4 = r4.a((Bundle)object, "YANDEX_ADV_ID");
        IdentifiersResult identifiersResult8 = r4.a((Bundle)object, "CUSTOM_SDK_HOSTS");
        long l10 = object.getLong("ServerTimeOffset");
        long l11 = object.getLong("NextStartupTime");
        va va4 = r4.a((Bundle)object);
        Bundle bundle = object.getBundle("module_configs");
        object = this.c;
        synchronized (object) {
            try {
                block10: {
                    block9: {
                        Object object5 = (IdentifiersResult)((fm)object).b.get("appmetrica_uuid");
                        if (object5 == null) break block9;
                        vo vo3 = ((fm)object).o;
                        object5 = ((IdentifiersResult)object5).id;
                        vo3.getClass();
                        if (vo.a((String)object5)) break block10;
                    }
                    ((fm)object).c(identifiersResult);
                }
                ((fm)object).a("appmetrica_device_id", identifiersResult2);
                ((fm)object).a("appmetrica_device_id_hash", identifiersResult3);
                ((fm)object).b.put("appmetrica_google_adv_id", identifiersResult7);
                ((fm)object).b.put("appmetrica_huawei_oaid", object3);
                ((fm)object).b.put("appmetrica_yandex_adv_id", object4);
                ((fm)object).l.a(identifiersResult8);
                ((fm)object).m.a(va4);
                if (!fm.a(identifiersResult5)) {
                    ((fm)object).b.put("appmetrica_get_ad_url", identifiersResult5);
                }
                if (!fm.a(identifiersResult4)) {
                    ((fm)object).b.put("appmetrica_report_ad_url", identifiersResult4);
                }
                ((fm)object).f = l10;
                object4 = ((fm)object).k;
                object3 = ((fm)object).e;
                object2 = Gb.a(((IdentifiersResult)object2).id);
                object4.getClass();
                boolean bl2 = ro.a((Map)object3) ? ro.a((Map)object2) : object3.equals(object2);
                if (bl2) {
                    ((fm)object).b.put("appmetrica_clids", identifiersResult6);
                    ((fm)object).g = false;
                }
                ((fm)object).h = l11;
                ((fm)object).c();
                // MONITOREXIT @DISABLED, blocks:[0, 1] lbl56 : MonitorExitStatement: MONITOREXIT : var1_1
                object = new SdkIdentifiers(identifiersResult.id, identifiersResult2.id, identifiersResult3.id);
                A4.l().m().a(bundle, (SdkIdentifiers)object);
                this.h();
                return;
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
    public final void b(@NonNull Bundle bundle, @Nullable StartupParamsCallback startupParamsCallback) {
        Object object = this.g;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        this.b(bundle);
                        this.h();
                        if (startupParamsCallback == null) break block3;
                        this.a(bundle, startupParamsCallback);
                    }
                    catch (Throwable throwable2) {
                        break block4;
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
     */
    public final void b(@Nullable String string2) {
        Object object = this.g;
        synchronized (object) {
            this.b.b(string2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(List<String> object) {
        Object object2 = this.g;
        synchronized (object2) {
            Throwable throwable2;
            block8: {
                block7: {
                    Object object3;
                    block6: {
                        try {
                            object3 = this.c.d;
                            if (!ro.a(object)) break block6;
                            if (!ro.a((Collection)object3)) {
                                object = this.c;
                                ((fm)object).d = null;
                                ((fm)object).i.a((List<String>)null);
                                this.b.a((List)null);
                            }
                            break block7;
                        }
                        catch (Throwable throwable2) {
                            break block8;
                        }
                    }
                    if (!ro.a(object, object3)) {
                        object3 = this.c;
                        ((fm)object3).d = object;
                        ((fm)object3).i.a((List<String>)object);
                        this.b.a((List)object);
                    } else {
                        this.b.a((List)object3);
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    @NonNull
    @VisibleForTesting(otherwise=5)
    public final Z6 c() {
        return this.f;
    }

    public final String d() {
        Object object = (IdentifiersResult)this.c.b.get("appmetrica_device_id");
        object = object == null ? null : ((IdentifiersResult)object).id;
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @NonNull
    public final xa e() {
        va va4;
        Object object = this.c;
        Object object2 = ((fm)object).n;
        object = ((fm)object).m;
        synchronized (object) {
            va4 = ((ta)object).b;
        }
        object2.getClass();
        object2 = va4.a;
        return new xa();
    }

    public final long f() {
        return this.c.f;
    }

    public final String g() {
        Object object = (IdentifiersResult)this.c.b.get("appmetrica_uuid");
        object = object == null ? null : ((IdentifiersResult)object).id;
        return object;
    }

    public final void h() {
        WeakHashMap<StartupParamsCallback, List> weakHashMap = new WeakHashMap<StartupParamsCallback, List>();
        for (Map.Entry object : this.h.entrySet()) {
            List list = (List)object.getValue();
            if (!this.c.a((Collection)list)) continue;
            weakHashMap.put((StartupParamsCallback)object.getKey(), list);
        }
        Iterator iterator = weakHashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            StartupParamsCallback startupParamsCallback = (StartupParamsCallback)iterator.next().getKey();
            if (startupParamsCallback == null) continue;
            this.a(new Bundle(), startupParamsCallback);
        }
        weakHashMap.clear();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void i() {
        Object object = this.g;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        if (this.j && !this.c.b()) break block3;
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                    this.j = true;
                    HashMap hashMap = this.i;
                    this.a(this.a, this.f, hashMap, false);
                }
                return;
            }
            throw throwable2;
        }
    }
}

