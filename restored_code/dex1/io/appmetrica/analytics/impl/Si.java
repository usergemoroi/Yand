/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 *  org.json.JSONArray
 */
package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.impl.Bb;
import io.appmetrica.analytics.impl.Gb;
import io.appmetrica.analytics.impl.Mn;
import io.appmetrica.analytics.impl.Rh;
import io.appmetrica.analytics.impl.Ui;
import io.appmetrica.analytics.impl.Vf;
import io.appmetrica.analytics.impl.W9;
import io.appmetrica.analytics.impl.Wn;
import io.appmetrica.analytics.impl.Xl;
import io.appmetrica.analytics.impl.Yl;
import io.appmetrica.analytics.impl.Yn;
import io.appmetrica.analytics.impl.b9;
import io.appmetrica.analytics.impl.bi;
import io.appmetrica.analytics.impl.d5;
import io.appmetrica.analytics.impl.l4;
import io.appmetrica.analytics.impl.o0;
import io.appmetrica.analytics.impl.o6;
import io.appmetrica.analytics.impl.rk;
import io.appmetrica.analytics.impl.ro;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

public final class Si {
    public final d5 a;
    public final Yn b;
    public final Ui c;
    public final o0 d;
    public Yl e;
    public final rk f;

    public Si(o0 o02, Yn yn3, d5 d54, rk rk3) {
        this(o02, yn3, d54, rk3, new Ui(o02, rk3));
    }

    public Si(o0 o02, Yn yn3, d5 d54, rk rk3, Ui ui3) {
        this.d = o02;
        this.a = d54;
        this.b = yn3;
        this.f = rk3;
        this.c = ui3;
    }

    public static o6 a(o6 o63, bi bi2) {
        int n10 = o63.d;
        if (W9.a.contains(n10)) {
            o63.c = bi2.d();
        }
        return o63;
    }

    public final Rh a(Wn object, bi bi2) {
        this.d.b();
        Object object2 = this.b;
        object2.getClass();
        Object object3 = ((Wn)object).a;
        object3 = object3 == null ? "" : WrapUtils.getOrDefault(((Mn)object3).a, "");
        object2 = ((Yn)object2).a.a((Wn)object);
        object = LoggerStorage.getOrCreatePublicLogger(bi2.b.getApiKey());
        Object object4 = W9.a;
        object4 = Bb.c;
        object2 = new l4((byte[])object2, (String)object3, 5891, (PublicLogger)object);
        ((o6)object2).c = bi2.d();
        object4 = ((l4)object2).q;
        object = new Vf(bi2.a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(bi2.b);
        b9 b94 = bi2.c;
        synchronized (bi2) {
            object3 = bi2.f;
            return new Rh((o6)object2, true, 1, (HashMap)object4, new bi((Vf)object, counterConfiguration, b94, (String)object3));
        }
    }

    public final void a(Rh rh3) {
        bi bi2 = rh3.e;
        Yl yl3 = this.e;
        if (yl3 != null) {
            bi2.b.setUuid(((Xl)yl3).g());
        } else {
            bi2.getClass();
        }
        this.c.a(rh3);
    }

    public final void a(Xl xl3) {
        this.e = xl3;
        this.a.b.setUuid(xl3.g());
    }

    public final void a(o6 o63, bi bi2, int n10, Map object) {
        Object object2 = Bb.c;
        this.d.b();
        if (!ro.a((Map)object)) {
            o63.setValue(Gb.b((Map)object));
            Si.a(o63, bi2);
        }
        object2 = new Vf(bi2.a);
        object = new CounterConfiguration(bi2.b);
        b9 b94 = bi2.c;
        synchronized (bi2) {
            String string2 = bi2.f;
            // MONITOREXIT @DISABLED, blocks:[0, 1] lbl13 : MonitorExitStatement: MONITOREXIT : var2_3
            this.a(new Rh(o63, false, n10, null, new bi((Vf)object2, (CounterConfiguration)object, b94, string2)));
            return;
        }
    }

    public final void a(Boolean object, Boolean object2, Boolean bl2) {
        if (ro.a(object)) {
            this.a.b.setLocationTracking((Boolean)object);
        }
        if (ro.a(object2)) {
            this.a.b.setDataSendingEnabled((Boolean)object2);
        }
        if (ro.a(bl2)) {
            this.a.b.setAdvIdentifiersTracking(bl2);
        }
        object = o6.a();
        object2 = this.a;
        this.a(Si.a((o6)object, (bi)object2), (bi)object2, 1, null);
    }

    public final void a(String string2) {
        Vf vf3 = this.a.a;
        synchronized (vf3) {
            vf3.a.put("PROCESS_CFG_DISTRIBUTION_REFERRER", string2);
            return;
        }
    }

    public final void a(HashMap hashMap) {
        Vf vf3 = this.a.a;
        synchronized (vf3) {
            vf3.a.put("PROCESS_CFG_CLIDS", Gb.b(hashMap));
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(List object) {
        Vf vf3 = this.a.a;
        synchronized (vf3) {
            ContentValues contentValues = vf3.a;
            if (ro.a((Collection)object)) {
                object = null;
            } else {
                JSONArray jSONArray = new JSONArray((Collection)object);
                object = jSONArray.toString();
            }
            contentValues.put("PROCESS_CFG_CUSTOM_HOSTS", (String)object);
            return;
        }
    }

    public final void b(String string2) {
        Vf vf3 = this.a.a;
        synchronized (vf3) {
            vf3.a.put("PROCESS_CFG_INSTALL_REFERRER_SOURCE", string2);
            return;
        }
    }
}

