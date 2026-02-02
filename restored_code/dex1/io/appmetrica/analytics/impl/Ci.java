/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.impl.A4;
import io.appmetrica.analytics.impl.Ai;
import io.appmetrica.analytics.impl.Bi;
import io.appmetrica.analytics.impl.Mi;
import io.appmetrica.analytics.impl.U;
import io.appmetrica.analytics.impl.V1;
import io.appmetrica.analytics.impl.Wh;
import io.appmetrica.analytics.impl.Wn;
import io.appmetrica.analytics.impl.ci;
import io.appmetrica.analytics.impl.di;
import io.appmetrica.analytics.impl.ei;
import io.appmetrica.analytics.impl.fi;
import io.appmetrica.analytics.impl.gi;
import io.appmetrica.analytics.impl.hi;
import io.appmetrica.analytics.impl.if;
import io.appmetrica.analytics.impl.ii;
import io.appmetrica.analytics.impl.ji;
import io.appmetrica.analytics.impl.ki;
import io.appmetrica.analytics.impl.li;
import io.appmetrica.analytics.impl.mi;
import io.appmetrica.analytics.impl.ni;
import io.appmetrica.analytics.impl.oi;
import io.appmetrica.analytics.impl.pi;
import io.appmetrica.analytics.impl.qi;
import io.appmetrica.analytics.impl.rb;
import io.appmetrica.analytics.impl.ri;
import io.appmetrica.analytics.impl.si;
import io.appmetrica.analytics.impl.ti;
import io.appmetrica.analytics.impl.ui;
import io.appmetrica.analytics.impl.v0;
import io.appmetrica.analytics.impl.vi;
import io.appmetrica.analytics.impl.w0;
import io.appmetrica.analytics.impl.wi;
import io.appmetrica.analytics.impl.xi;
import io.appmetrica.analytics.impl.yi;
import io.appmetrica.analytics.impl.zi;
import io.appmetrica.analytics.plugins.IPluginReporter;
import io.appmetrica.analytics.profile.UserProfile;
import java.util.List;
import java.util.Map;

public final class Ci
implements rb {
    public final w0 a;
    public final Wh b;
    public final IHandlerExecutor c = A4.l().g().a();
    public final Context d;
    public final ReporterConfig e;
    public final Mi f;
    public final if g;

    public Ci(Context context, Wh wh2, w0 w04, Mi mi3, ReporterConfig reporterConfig) {
        this(context, wh2, w04, mi3, reporterConfig, new if(new mi(w04, context, reporterConfig)));
    }

    public Ci(Context context, Wh wh2, w0 w04, Mi mi3, ReporterConfig reporterConfig, if if_) {
        this.d = context;
        this.b = wh2;
        this.a = w04;
        this.f = mi3;
        this.e = reporterConfig;
        this.g = if_;
    }

    public Ci(Context context, String string2, w0 w04) {
        this(context, new Wh(), w04, new Mi(), ReporterConfig.newConfigBuilder(string2).build());
    }

    public Ci(@NonNull ICommonExecutor iCommonExecutor, @NonNull Context context, @NonNull String string2) {
        this(context.getApplicationContext(), string2, new w0());
    }

    public static rb a(w0 w04, Context context, ReporterConfig reporterConfig) {
        w04.getClass();
        return v0.a(context).f().c(reporterConfig);
    }

    public final void a(@NonNull ReporterConfig reporterConfig) {
        this.b.getClass();
        this.f.getClass();
        this.c.execute(new qi(this, reporterConfig));
    }

    @Override
    public final void a(@NonNull U u11) {
        this.b.getClass();
        this.f.getClass();
        this.c.execute(new wi(this, u11));
    }

    @Override
    public final void a(@NonNull Wn wn3) {
        this.b.d.a(wn3);
        this.f.getClass();
        this.c.execute(new ui(this, wn3));
    }

    @Override
    public final void clearAppEnvironment() {
        this.b.getClass();
        this.f.getClass();
        this.c.execute(new zi(this));
    }

    public final void d(@NonNull String object) {
        object = ReporterConfig.newConfigBuilder((String)object).build();
        this.b.getClass();
        this.f.getClass();
        this.c.execute(new pi(this, (ReporterConfig)object));
    }

    @Override
    @NonNull
    public final IPluginReporter getPluginExtension() {
        return this.g;
    }

    @Override
    public final void pauseSession() {
        this.b.getClass();
        this.f.getClass();
        this.c.execute(new hi(this));
    }

    @Override
    public final void putAppEnvironmentValue(@NonNull String string2, @Nullable String string3) {
        this.b.getClass();
        this.f.getClass();
        this.c.execute(new yi(this, string2, string3));
    }

    @Override
    public final void reportAdRevenue(@NonNull AdRevenue adRevenue) {
        this.b.h.a(adRevenue);
        this.f.getClass();
        this.c.execute(new li(this, adRevenue));
    }

    @Override
    public final void reportAdRevenue(@NonNull AdRevenue adRevenue, boolean bl2) {
        this.b.h.a(adRevenue);
        this.f.getClass();
        this.c.execute(new ti(this, adRevenue, bl2));
    }

    @Override
    public final void reportAnr(@NonNull Map<Thread, StackTraceElement[]> object) {
        this.b.j.a(object);
        this.f.getClass();
        object = CollectionUtils.getListFromMap(object);
        this.c.execute(new vi(this, (List)object));
    }

    @Override
    public final void reportECommerce(@NonNull ECommerceEvent eCommerceEvent) {
        this.b.i.a(eCommerceEvent);
        this.f.getClass();
        this.c.execute(new ni(this, eCommerceEvent));
    }

    @Override
    public final void reportError(@NonNull String string2, @Nullable String string3) {
        this.reportError(string2, string3, null);
    }

    @Override
    public final void reportError(@NonNull String string2, @Nullable String string3, @Nullable Throwable throwable) {
        this.b.c.a(string2);
        this.f.getClass();
        this.c.execute(new ei(this, string2, string3, throwable));
    }

    @Override
    public final void reportError(@NonNull String string2, @Nullable Throwable throwable) {
        this.b.b.a(string2);
        this.f.getClass();
        Throwable throwable2 = throwable;
        if (throwable == null) {
            throwable2 = new V1();
            throwable2.fillInStackTrace();
        }
        this.c.execute(new di(this, string2, throwable2));
    }

    @Override
    public final void reportEvent(@NonNull ModuleEvent moduleEvent) {
        this.b.getClass();
        this.f.getClass();
        this.c.execute(new ri(this, moduleEvent));
    }

    @Override
    public final void reportEvent(@NonNull String string2) {
        this.b.a.a(string2);
        this.f.getClass();
        this.c.execute(new Ai(this, string2));
    }

    @Override
    public final void reportEvent(@NonNull String string2, @Nullable String string3) {
        this.b.a.a(string2);
        this.f.getClass();
        this.c.execute(new Bi(this, string2, string3));
    }

    @Override
    public final void reportEvent(@NonNull String string2, @Nullable Map<String, Object> object) {
        this.b.a.a(string2);
        this.f.getClass();
        object = CollectionUtils.getListFromMap(object);
        this.c.execute(new ci(this, string2, (List)object));
    }

    @Override
    public final void reportRevenue(@NonNull Revenue revenue) {
        this.b.g.a(revenue);
        this.f.getClass();
        this.c.execute(new ki(this, revenue));
    }

    @Override
    public final void reportUnhandledException(@NonNull Throwable throwable) {
        this.b.e.a(throwable);
        this.f.getClass();
        this.c.execute(new fi(this, throwable));
    }

    @Override
    public final void reportUserProfile(@NonNull UserProfile userProfile) {
        this.b.f.a(userProfile);
        this.f.getClass();
        this.c.execute(new ji(this, userProfile));
    }

    @Override
    public final void resumeSession() {
        this.b.getClass();
        this.f.getClass();
        this.c.execute(new gi(this));
    }

    @Override
    public final void sendEventsBuffer() {
        this.b.getClass();
        this.f.getClass();
        this.c.execute(new xi(this));
    }

    @Override
    public final void setDataSendingEnabled(boolean bl2) {
        this.b.getClass();
        this.f.getClass();
        this.c.execute(new oi(this, bl2));
    }

    @Override
    public final void setSessionExtra(@NonNull String string2, @Nullable byte[] byArray) {
        this.b.getClass();
        this.f.getClass();
        this.c.execute(new si(this, string2, byArray));
    }

    @Override
    public final void setUserProfileID(@Nullable String string2) {
        this.b.getClass();
        this.f.getClass();
        this.c.execute(new ii(this, string2));
    }
}

