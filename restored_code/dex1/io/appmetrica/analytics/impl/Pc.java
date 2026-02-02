/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.impl.Bb;
import io.appmetrica.analytics.impl.Do;
import io.appmetrica.analytics.impl.Ec;
import io.appmetrica.analytics.impl.Eo;
import io.appmetrica.analytics.impl.Hg;
import io.appmetrica.analytics.impl.Kc;
import io.appmetrica.analytics.impl.Lg;
import io.appmetrica.analytics.impl.M4;
import io.appmetrica.analytics.impl.Na;
import io.appmetrica.analytics.impl.Rc;
import io.appmetrica.analytics.impl.d7;
import io.appmetrica.analytics.impl.dh;
import io.appmetrica.analytics.impl.j0;
import io.appmetrica.analytics.impl.lb;
import io.appmetrica.analytics.impl.mb;
import io.appmetrica.analytics.impl.o5;
import io.appmetrica.analytics.impl.om;
import io.appmetrica.analytics.impl.q3;
import io.appmetrica.analytics.impl.t5;
import io.appmetrica.analytics.impl.v5;
import io.appmetrica.analytics.impl.x9;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

public final class Pc
extends v5
implements mb,
lb {
    public final Hg w;
    public final Lg x;
    public final d7 y;
    public final q3 z;

    public Pc(Context object, o5 o54, om om3, M4 m44, j0 j04, TimePassedChecker timePassedChecker, Rc rc3, Hg hg3, d7 d72) {
        super((Context)object, o54, j04, timePassedChecker, rc3, m44);
        this.w = hg3;
        object = this.k();
        ((x9)object).a(Bb.e, new dh(((x9)object).b()));
        this.x = rc3.b(this);
        this.y = d72;
        this.z = object = rc3.a(this);
        ((q3)object).a(om3, m44.m);
    }

    public Pc(@NonNull Context context, @NonNull om om3, @NonNull o5 o54, @NonNull M4 m44, @NonNull Hg hg3, @NonNull d7 d72, @NonNull t5 t54) {
        this(context, o54, om3, m44, new j0(), new TimePassedChecker(), new Rc(context, o54, m44, t54, om3, new Kc(d72), Na.j().w().d(), PackageManagerUtils.getAppVersionCodeInt(context), Na.j().w(), Na.j().k(), new Ec()), hg3, d72);
    }

    @Override
    public final void C() {
        this.w.a(this.x);
    }

    public final boolean D() {
        Do do_ = this.t;
        synchronized (do_) {
            boolean bl2 = do_.a.a().optBoolean("referrer_handled", false);
            return bl2;
        }
    }

    @Override
    public final void a() {
        Do do_ = this.t;
        synchronized (do_) {
            Eo eo3 = do_.a;
            eo3.a(eo3.a().put("referrer_handled", true));
            return;
        }
    }

    @Override
    public final void a(@NonNull M4 m44) {
        synchronized (this) {
            super.a(m44);
            this.y.a(m44.i);
            return;
        }
    }

    @Override
    public final void a(@NonNull om om3) {
        super.a(om3);
        this.z.a(om3);
    }

    @Override
    @NonNull
    public final CounterConfigurationReporterType c() {
        return CounterConfigurationReporterType.MAIN;
    }
}

