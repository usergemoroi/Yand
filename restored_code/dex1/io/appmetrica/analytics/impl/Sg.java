/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageInfo
 *  kotlin.collections.t
 *  kotlin.comparisons.a
 *  kotlin.math.a
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.pm.PackageInfo;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.impl.Ig;
import io.appmetrica.analytics.impl.Jg;
import io.appmetrica.analytics.impl.dd;
import io.appmetrica.analytics.impl.rb;
import io.appmetrica.analytics.impl.ro;
import io.appmetrica.analytics.impl.tp;
import io.appmetrica.analytics.impl.v1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import kotlin.collections.t;
import kotlin.math.a;
import kotlin.z;
import org.json.JSONArray;
import org.json.JSONObject;

public final class Sg {
    public final Context a;
    public final SafePackageManager b;
    public final rb c;
    public final dd d;
    public final long e;
    public final String f;
    public final String g;

    public /* synthetic */ Sg(Context context) {
        this(context, new SafePackageManager(), v1.a());
    }

    public Sg(Context object, SafePackageManager safePackageManager, rb rb2) {
        this.a = object;
        this.b = safePackageManager;
        this.c = rb2;
        object = new dd(0);
        ((dd)object).a((Object)Ig.d, 1);
        ((dd)object).a((Object)Ig.c, 2);
        this.d = object;
        this.e = TimeUnit.DAYS.toSeconds(1L);
        this.f = "com.android.vending";
        this.g = "com.huawei.appmarket";
    }

    public static final int a(Sg sg2, Jg jg3, Jg jg4) {
        int n10;
        int n13 = n10 = kotlin.math.a.b((long)(jg3.c - jg4.c));
        if (n10 == 0) {
            n13 = ((Number)sg2.d.a((Object)jg3.d)).intValue() - ((Number)sg2.d.a((Object)jg4.d)).intValue();
        }
        return n13;
    }

    public final Jg a(List object) {
        Object object2;
        Object object3;
        PackageInfo packageInfo;
        Object object4;
        Object object5;
        Object var7_3;
        block11: {
            block9: {
                block10: {
                    boolean bl2 = object.isEmpty();
                    var7_3 = null;
                    if (bl2) {
                        return null;
                    }
                    if (object.size() == 1) {
                        return (Jg)object.get(0);
                    }
                    object5 = this.b;
                    object4 = this.a;
                    packageInfo = ((SafePackageManager)object5).getPackageInfo((Context)object4, object4.getPackageName(), 0);
                    if (packageInfo == null) break block9;
                    long l10 = TimeUnit.MILLISECONDS.toSeconds(packageInfo.firstInstallTime);
                    object3 = object.iterator();
                    if (!object3.hasNext()) break block10;
                    object5 = (Jg)object3.next();
                    object5 = z.a(object5, Math.abs(((Jg)object5).c - l10));
                    while (object3.hasNext()) {
                        object4 = (Jg)object3.next();
                        object4 = z.a(object4, Math.abs(((Jg)object4).c - l10));
                        if (kotlin.comparisons.a.d((Comparable)((Comparable)((kotlin.t)object5).d()), (Comparable)((Comparable)((kotlin.t)object4).d())) <= 0) continue;
                        object5 = object4;
                    }
                    object4 = (Jg)((kotlin.t)object5).a();
                    if (((Number)((kotlin.t)object5).b()).longValue() >= this.e) break block9;
                    object5 = object4;
                    break block11;
                }
                throw new NoSuchElementException();
            }
            object5 = null;
        }
        object4 = object5;
        if (object5 == null) {
            object2 = new tp(this);
            object3 = object.iterator();
            if (object3.hasNext()) {
                object5 = (Jg)object3.next();
                while (object3.hasNext()) {
                    object4 = (Jg)object3.next();
                    if (object2.compare(object5, object4) >= 0) continue;
                    object5 = object4;
                }
                object4 = object5;
            } else {
                throw new NoSuchElementException();
            }
        }
        object5 = this.c;
        object3 = new JSONObject();
        object2 = new ArrayList(t.x((Iterable)object, (int)10));
        Iterator iterator = object.iterator();
        while (iterator.hasNext()) {
            object = (Jg)iterator.next();
            ((ArrayList)object2).add(new JSONObject().put("referrer", (Object)((Jg)object).a).put("install_timestamp_seconds", ((Jg)object).c).put("click_timestamp_seconds", ((Jg)object).b).put("source", (Object)((Jg)object).d.a));
        }
        object = ro.a((Collection)object2) ? null : new JSONArray((Collection)object2);
        object3 = object3.put("candidates", object).put("chosen", (Object)new JSONObject().put("referrer", (Object)((Jg)object4).a).put("install_timestamp_seconds", ((Jg)object4).c).put("click_timestamp_seconds", ((Jg)object4).b).put("source", (Object)((Jg)object4).d.a));
        object = var7_3;
        if (packageInfo != null) {
            object = packageInfo.firstInstallTime;
        }
        object5.reportEvent("several_filled_referrers", object3.putOpt("install_time", object).toString());
        return object4;
    }
}

