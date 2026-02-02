/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.location.Location
 *  android.net.ConnectivityManager
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.Location;
import android.net.ConnectivityManager;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import io.appmetrica.analytics.impl.D7;
import io.appmetrica.analytics.impl.Do;
import io.appmetrica.analytics.impl.G7;
import io.appmetrica.analytics.impl.Gh;
import io.appmetrica.analytics.impl.I7;
import io.appmetrica.analytics.impl.K7;
import io.appmetrica.analytics.impl.Na;
import io.appmetrica.analytics.impl.No;
import io.appmetrica.analytics.impl.X8;
import io.appmetrica.analytics.impl.Ye;
import io.appmetrica.analytics.impl.Ze;
import io.appmetrica.analytics.impl.af;
import io.appmetrica.analytics.impl.dl;
import io.appmetrica.analytics.impl.g9;
import io.appmetrica.analytics.impl.h0;
import io.appmetrica.analytics.impl.h9;
import io.appmetrica.analytics.impl.o6;
import io.appmetrica.analytics.impl.r9;
import io.appmetrica.analytics.impl.un;
import kotlin.jvm.internal.u0;

public final class H7 {
    public final Context a;
    public final int b;
    public final r9 c;
    public final X8 d;
    public final h0 e;
    public final h9 f;
    public final K7 g;
    public final o6 h;

    public /* synthetic */ H7(Context context, dl dl2, int n10, r9 r92, X8 x84, Gh gh3, h0 h03) {
        this(context, dl2, n10, r92, x84, h03, new h9(), new K7(gh3));
    }

    public H7(Context context, dl dl2, int n10, r9 r92, X8 x84, h0 h03, h9 h94, K7 k74) {
        this.a = context;
        this.b = n10;
        this.c = r92;
        this.d = x84;
        this.e = h03;
        this.f = h94;
        this.g = k74;
        this.h = x84.a;
    }

    public static String b() {
        u0 u04 = new u0();
        un un3 = Na.F.A();
        G7 g74 = new G7(u04);
        synchronized (un3) {
            un3.b.a(g74);
            return (String)u04.c;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final D7 a() {
        Object object;
        int n10 = this.h.e;
        String string2 = this.h.getName();
        String string3 = this.h.getValue();
        Object object2 = this.c;
        int n13 = this.b;
        Object object3 = ((r9)object2).a.a;
        synchronized (object3) {
            object = ((Do)object3).a.a().optJSONObject("numbers_of_type");
        }
        long l10 = object != null ? object.optLong(String.valueOf(n13)) : 0L;
        ((r9)object2).a.a(n13, 1L + l10);
        object2 = this.g;
        object2.getClass();
        object = Na.F.l();
        object3 = object.getUserLocation();
        String string4 = null;
        if (object3 != null) {
            n13 = No.b;
            object = new Location((Location)object3);
            object3 = object.getProvider();
            object.setProvider("");
            object3 = new No((Location)object, (String)object3);
        } else {
            object3 = object.getSystemLocation();
            object3 = object3 != null ? new No(new Location((Location)object3), "") : null;
        }
        boolean bl2 = ((K7)object2).a.d;
        object2 = object3 != null ? Double.valueOf(object3.getLatitude()) : null;
        object = object3 != null ? Double.valueOf(object3.getLongitude()) : null;
        Object object4 = object3 != null ? Long.valueOf(object3.getTime()) : null;
        Object object5 = object3 != null ? Integer.valueOf((int)object3.getAccuracy()) : null;
        Integer n14 = object3 != null ? Integer.valueOf((int)object3.getBearing()) : null;
        Object object6 = object3 != null ? Integer.valueOf((int)object3.getSpeed()) : null;
        Integer n15 = object3 != null ? Integer.valueOf((int)object3.getAltitude()) : null;
        String string5 = object3 != null ? object3.getProvider() : null;
        if (object3 != null) {
            string4 = ((No)((Object)object3)).a;
        }
        object = new I7(bl2, (Double)object, (Double)object2, n15, n14, (Integer)object5, (Integer)object6, (Long)object4, string5, string4);
        object2 = this.h.c;
        object4 = this.e;
        object3 = ((h0)object4).a;
        long l11 = ((h0)object4).b;
        n13 = this.h.g;
        object4 = this.a;
        object5 = af.a;
        object4 = SystemServiceUtils.accessSystemServiceSafelyOrDefault((ConnectivityManager)object4.getSystemService("connectivity"), "getting connection type", "ConnectivityManager", Ze.n, new Ye());
        n14 = (Integer)af.c.a(object4);
        n14.intValue();
        object6 = H7.b();
        object4 = this.d.b;
        object5 = this.h;
        return new D7(n10, string2, string3, l10, (I7)object, (String)object2, (String)object3, l11, n13, n14, (String)object6, (g9)((Object)object4), ((o6)object5).h, ((o6)object5).k, ((o6)object5).l, ((o6)object5).n, ((o6)object5).o, this.f.a(((o6)object5).p));
    }
}

