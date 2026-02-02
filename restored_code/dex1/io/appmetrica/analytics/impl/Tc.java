/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.services.FrameworkDetector;
import io.appmetrica.analytics.impl.Ck;
import io.appmetrica.analytics.impl.Gh;
import io.appmetrica.analytics.impl.Kj;
import io.appmetrica.analytics.impl.M4;
import io.appmetrica.analytics.impl.Na;
import io.appmetrica.analytics.impl.d9;
import io.appmetrica.analytics.impl.jk;
import io.appmetrica.analytics.impl.lk;
import io.appmetrica.analytics.impl.ma;
import io.appmetrica.analytics.impl.mh;
import io.appmetrica.analytics.impl.qb;
import io.appmetrica.analytics.impl.qf;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

public final class Tc
implements d9 {
    public final mh a;
    public final qf b;
    public final String c;
    public final AtomicBoolean d;

    public Tc(@NotNull mh mh3, @NotNull M4 m44, @NotNull qf qf3) {
        this.a = mh3;
        this.b = qf3;
        this.c = "activation_unlock_event_sending";
        boolean bl2 = false;
        if (qf3.a(false) || Tc.a(m44)) {
            bl2 = true;
        }
        this.d = new AtomicBoolean(bl2);
    }

    public static boolean a(M4 object) {
        object = ((M4)object).a;
        boolean bl2 = object != null && !y.e(object, "629a824d-c717-4ba5-bc0f-3f3968554d01");
        return bl2;
    }

    public final void a() {
        if (this.d.compareAndSet(false, true)) {
            this.b.b(true);
            this.a("timer");
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void a(String object) {
        JSONObject jSONObject;
        String string2;
        lk lk3;
        block6: {
            block5: {
                try {
                    lk3 = Kj.a;
                    string2 = this.c;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject = jSONObject.put("source", object).put("framework", (Object)FrameworkDetector.framework());
                    object = Na.F.h();
                    object = ((ma)object).d.getApplicationMetaData(((ma)object).a);
                    if (object == null) break block5;
                }
                catch (Throwable throwable) {
                    return;
                }
                object = object.getString("io.appmetrica.analytics.plugin_id");
                break block6;
            }
            object = null;
        }
        object = jSONObject.put("appmetrica_plugin_id", object);
        Ck ck3 = Na.F.D;
        String string3 = object.put("activation_offset", TimeUnit.SECONDS.convert(ck3.a.currentTimeMillis() - ck3.b, TimeUnit.MILLISECONDS)).toString();
        lk3.getClass();
        object = new jk(string2, string3);
        lk3.a((qb)object);
    }

    @Override
    public final boolean b() {
        String string2;
        if (!this.d.get() && (string2 = ((Gh)this.a.a()).m) != null && !y.e(string2, "629a824d-c717-4ba5-bc0f-3f3968554d01") && this.d.compareAndSet(false, true)) {
            this.b.b(true);
            this.a("activation");
        }
        return this.d.get();
    }
}

