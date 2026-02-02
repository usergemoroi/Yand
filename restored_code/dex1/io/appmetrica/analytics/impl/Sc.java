/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.PreloadInfo;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.impl.A4;
import io.appmetrica.analytics.impl.Al;
import io.appmetrica.analytics.impl.Of;
import io.appmetrica.analytics.impl.Q6;
import io.appmetrica.analytics.impl.Si;
import io.appmetrica.analytics.impl.U6;
import io.appmetrica.analytics.impl.Vf;
import io.appmetrica.analytics.impl.Wd;
import io.appmetrica.analytics.impl.Xl;
import io.appmetrica.analytics.impl.Xn;
import io.appmetrica.analytics.impl.ah;
import io.appmetrica.analytics.impl.b9;
import io.appmetrica.analytics.impl.bi;
import io.appmetrica.analytics.impl.c0;
import io.appmetrica.analytics.impl.df;
import io.appmetrica.analytics.impl.m2;
import io.appmetrica.analytics.impl.ma;
import io.appmetrica.analytics.impl.p;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

public final class Sc {
    public final Context a;
    public final Si b;
    public final Wd c;
    public final ma d;
    public final b9 e;
    public final bi f;
    public final m2 g;
    public final Q6 h;
    public final p i;
    public final df j;
    public final Xn k;
    public final ah l;
    public final U6 m;
    public final c0 n;

    public Sc(Context object, Vf vf3, Si object2, Xl xl3) {
        this.a = object;
        this.b = object2;
        this.c = new Wd(vf3);
        this.d = object2 = new ma((Context)object);
        object = new b9(new Al(LoggerStorage.getMainPublicOrAnonymousLogger(), "Crash Environment"));
        this.e = object;
        this.f = new bi(vf3, new CounterConfiguration(CounterConfigurationReporterType.MAIN), (b9)object);
        this.g = new m2();
        this.h = A4.l().n();
        this.i = new p();
        this.j = new df((ma)object2);
        this.k = new Xn();
        this.l = new ah();
        this.m = new U6();
        this.n = new c0();
    }

    public final c0 a() {
        return this.n;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(AppMetricaConfig object, PublicLogger publicLogger) {
        void var2_2;
        this.f.b.applyFromConfig((AppMetricaConfig)object);
        Object object2 = this.f;
        Object object3 = ((AppMetricaConfig)object).userProfileID;
        synchronized (object2) {
            ((bi)object2).f = object3;
        }
        object3 = this.f;
        object2 = ((AppMetricaConfig)object).preloadInfo;
        Boolean bl2 = (Boolean)((AppMetricaConfig)object).additionalConfig.get("YMM_preloadInfoAutoTracking");
        boolean bl3 = bl2 != null ? bl2 : false;
        ((bi)object3).d = new Of((PreloadInfo)object2, (PublicLogger)var2_2, bl3);
        object3 = new StringBuilder("Actual session timeout is ");
        object = object2 = ((AppMetricaConfig)object).sessionTimeout;
        if (object2 == null) {
            object = 10;
        }
        ((StringBuilder)object3).append((Integer)object);
        var2_2.info(((StringBuilder)object3).toString(), new Object[0]);
    }

    public final Context b() {
        return this.a;
    }

    public final U6 c() {
        return this.m;
    }

    public final ma d() {
        return this.d;
    }

    public final df e() {
        return this.j;
    }

    public final Q6 f() {
        return this.h;
    }

    public final ah g() {
        return this.l;
    }

    public final bi h() {
        return this.f;
    }

    public final Si i() {
        return this.b;
    }

    public final Xn j() {
        return this.k;
    }
}

