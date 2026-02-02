/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  org.json.JSONObject
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import io.appmetrica.analytics.impl.Bb;
import io.appmetrica.analytics.impl.Do;
import io.appmetrica.analytics.impl.Eo;
import io.appmetrica.analytics.impl.Gh;
import io.appmetrica.analytics.impl.K9;
import io.appmetrica.analytics.impl.Kf;
import io.appmetrica.analytics.impl.Na;
import io.appmetrica.analytics.impl.Nf;
import io.appmetrica.analytics.impl.bl;
import io.appmetrica.analytics.impl.n8;
import io.appmetrica.analytics.impl.nh;
import io.appmetrica.analytics.impl.o6;
import io.appmetrica.analytics.impl.v5;
import org.json.JSONObject;

public final class Ih
extends nh {
    public final Nf b;
    public final Do c;
    public final SafePackageManager d;
    public final TimeProvider e;

    public Ih(@NonNull v5 v54) {
        this(v54, v54.u(), Na.j().s(), new SafePackageManager(), new SystemTimeProvider());
    }

    public Ih(v5 v54, Do do_, Nf nf3, SafePackageManager safePackageManager, SystemTimeProvider systemTimeProvider) {
        super(v54);
        this.c = do_;
        this.b = nf3;
        this.d = safePackageManager;
        this.e = systemTimeProvider;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final boolean a(@NonNull o6 object) {
        Object object2 = this.a;
        if (!this.c.d()) {
            object = ((Gh)((v5)object2).k.a()).e ? o6.a((o6)object, Bb.F) : o6.a((o6)object, Bb.d);
            JSONObject jSONObject = new JSONObject();
            Object object3 = WrapUtils.getOrDefault(this.d.getInstallerPackageName(((v5)object2).a, ((v5)object2).b.a), "");
            try {
                jSONObject.put("appInstaller", object3);
                object3 = this.b;
                ((n8)object3).h.a(((n8)object3).a);
                jSONObject.put("preloadInfo", (Object)((Kf)((n8)object3).c()).b());
            }
            catch (Throwable throwable) {}
            ((o6)object).setValue(jSONObject.toString());
            object2 = ((v5)object2).n;
            ((K9)object2).a((o6)object, bl.a(((K9)object2).c.b((o6)object), ((o6)object).i));
            object = this.c;
            synchronized (object) {
                object2 = ((Do)object).a;
                ((Eo)object2).a(((Eo)object2).a().put("init_event_done", true));
            }
            this.c.a(this.e.currentTimeMillis());
        }
        return false;
    }
}

