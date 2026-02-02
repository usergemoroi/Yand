/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.location.Location
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.AnrListener;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.ExternalAttribution;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import io.appmetrica.analytics.impl.A4;
import io.appmetrica.analytics.impl.Bb;
import io.appmetrica.analytics.impl.E0;
import io.appmetrica.analytics.impl.F0;
import io.appmetrica.analytics.impl.Gb;
import io.appmetrica.analytics.impl.Gc;
import io.appmetrica.analytics.impl.Ic;
import io.appmetrica.analytics.impl.Kn;
import io.appmetrica.analytics.impl.Mo;
import io.appmetrica.analytics.impl.Sc;
import io.appmetrica.analytics.impl.Si;
import io.appmetrica.analytics.impl.Vf;
import io.appmetrica.analytics.impl.W9;
import io.appmetrica.analytics.impl.Wd;
import io.appmetrica.analytics.impl.Y2;
import io.appmetrica.analytics.impl.bi;
import io.appmetrica.analytics.impl.ib;
import io.appmetrica.analytics.impl.k0;
import io.appmetrica.analytics.impl.l2;
import io.appmetrica.analytics.impl.l4;
import io.appmetrica.analytics.impl.m;
import io.appmetrica.analytics.impl.m2;
import io.appmetrica.analytics.impl.o;
import io.appmetrica.analytics.impl.o6;
import io.appmetrica.analytics.impl.ue;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.logger.common.BaseReleaseLogger;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashClientConfig;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashClientModule;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.y;

public final class Hc
extends Y2
implements ib {
    public static final Long s = TimeUnit.SECONDS.toMillis(1L);
    public final Kn p = new Kn(new ue("Referral url"));
    public final Sc q;
    public final Ic r;

    public Hc(Sc sc3) {
        super(sc3.b(), sc3.i(), sc3.h(), sc3.d(), sc3.f(), sc3.j(), sc3.g(), sc3.c(), sc3.a(), sc3.e());
        this.q = sc3;
        this.r = new Ic(this);
        this.l();
    }

    @Override
    public final void a(@Nullable Activity object) {
        if (this.q.i.a((Activity)object, io.appmetrica.analytics.impl.o.a)) {
            this.c.info("Resume session", new Object[0]);
            object = object != null ? object.getClass().getSimpleName() : null;
            this.e((String)object);
            object = this.q.g;
            synchronized (object) {
                try {
                    for (Object object2 : object.a) {
                        if (!((l2)object2).d) continue;
                        ((l2)object2).d = false;
                        ((l2)object2).b.remove(((l2)object2).e);
                        Object object3 = ((l2)object2).a.a;
                        object2 = ((Y2)object3).h;
                        object3 = ((Y2)object3).b.a;
                        ((Si)object2).c.b((Vf)object3);
                    }
                }
                catch (Throwable throwable) {
                }
                throw throwable;
            }
        }
    }

    @Override
    public final void a(@Nullable Location location) {
        this.b.b.setManualLocation(location);
        this.c.info("Set location: %s", location);
    }

    @Override
    public final void a(@NonNull AnrListener anrListener) {
        this.r.a(anrListener);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(AppMetricaConfig object, k0 object2) {
        Object object3;
        if (((k0)object2).b) {
            this.clearAppEnvironment();
        }
        if (!CollectionUtils.isNullOrEmpty(object2 = ((k0)object2).a)) {
            this.b.b.addAutoCollectedDataSubscribers((List<String>)object2);
        }
        this.a(((AppMetricaConfig)object).appEnvironment);
        this.b(((AppMetricaConfig)object).errorEnvironment);
        object2 = WrapUtils.getOrDefault(((AppMetricaConfig)object).nativeCrashReporting, Boolean.TRUE);
        boolean bl2 = (Boolean)object2;
        this.c.info("native crash reporting enabled: %b", object2);
        if (bl2) {
            Object object4 = this.q.c;
            Context context = this.a;
            object2 = this.b.b.getApiKey();
            object3 = this.b.d();
            ((Wd)object4).d = new E0((String)object2, ((Wd)object4).a.a.getAsString("PROCESS_CFG_PACKAGE_NAME"), CounterConfigurationReporterType.MAIN, ((Wd)object4).a.a.getAsInteger("PROCESS_CFG_PROCESS_ID"), ((Wd)object4).a.a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID"), (String)object3);
            object2 = FileUtils.getNativeCrashDirectory(context);
            object3 = null;
            if ((object2 = object2 != null ? ((File)object2).getAbsolutePath() : null) != null) {
                NativeCrashClientModule nativeCrashClientModule = ((Wd)object4).b;
                F0 f04 = ((Wd)object4).c;
                object4 = ((Wd)object4).d;
                if (object4 == null) {
                    y.B("nativeCrashMetadata");
                } else {
                    object3 = object4;
                }
                f04.getClass();
                nativeCrashClientModule.initHandling(context, new NativeCrashClientConfig((String)object2, F0.a((E0)object3)));
            }
        }
        object3 = this.r;
        synchronized (object3) {
            Throwable throwable2;
            block12: {
                int n10;
                try {
                    object2 = ((AppMetricaConfig)object).anrMonitoringTimeout;
                    n10 = object2 != null ? (Integer)object2 : 5;
                }
                catch (Throwable throwable2) {
                    break block12;
                }
                ((Ic)object3).a = n10;
                object = object2 = ((AppMetricaConfig)object).anrMonitoring;
                if (object2 == null) {
                    object = Boolean.FALSE;
                }
                if (((Boolean)object).booleanValue()) {
                    ((Ic)object3).b.a(((Ic)object3).a);
                } else {
                    ((Ic)object3).b.b();
                }
                return;
            }
            throw throwable2;
        }
    }

    @Override
    public final void a(@NonNull ExternalAttribution object) {
        this.c.info("External attribution received: %s", object);
        Si si3 = this.h;
        Object object2 = object.toBytes();
        object = this.c;
        Object object3 = W9.a;
        object3 = Bb.c;
        object2 = new l4((byte[])object2, "", 42, (PublicLogger)object);
        object = this.b;
        si3.getClass();
        si3.a(Si.a((o6)object2, (bi)object), (bi)object, 1, null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void a(@NonNull Mo mo3) {
        PublicLogger publicLogger = this.c;
        synchronized (mo3) {
            mo3.b = publicLogger;
        }
        Iterator iterator = mo3.a.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                mo3.a.clear();
                return;
            }
            ((Consumer)iterator.next()).consume(publicLogger);
        }
    }

    @Override
    public final void a(@NonNull m m12) {
        if (m12 == io.appmetrica.analytics.impl.m.b) {
            this.c.info("Enable activity auto tracking", new Object[0]);
        } else {
            PublicLogger publicLogger = this.c;
            StringBuilder stringBuilder = new StringBuilder("Could not enable activity auto tracking. ");
            stringBuilder.append(m12.a);
            publicLogger.warning(stringBuilder.toString(), new Object[0]);
        }
    }

    @Override
    public final void a(@NonNull String string2) {
        this.c.info("Add auto collected data subscriber: %s", string2);
        this.b.b.addAutoCollectedDataSubscriber(string2);
    }

    @Override
    public final void a(String object, String object2) {
        super.a((String)object, (String)object2);
        object = this.q.c;
        object2 = this.b.d();
        Object object3 = ((Wd)object).d;
        if (object3 != null) {
            ((Wd)object).d = object2 = new E0(((E0)object3).a, ((E0)object3).b, ((E0)object3).c, ((E0)object3).d, ((E0)object3).e, (String)object2);
            object3 = ((Wd)object).b;
            ((Wd)object).c.getClass();
            ((NativeCrashClientModule)object3).updateAppMetricaMetadata(F0.a((E0)object2));
        }
    }

    @Override
    public final void a(@NonNull String object, boolean bl2) {
        Object object2 = this.c;
        Object object3 = new StringBuilder("App opened via deeplink: ");
        ((StringBuilder)object3).append(WrapUtils.wrapToTag(object));
        ((BaseReleaseLogger)object2).info(((StringBuilder)object3).toString(), new Object[0]);
        object3 = this.h;
        object2 = this.c;
        Object object4 = W9.a;
        object4 = new HashMap();
        ((HashMap)object4).put("type", "open");
        ((HashMap)object4).put("link", object);
        ((HashMap)object4).put("auto", bl2);
        object4 = Gb.b((Map)object4);
        object = Bb.c;
        object = new l4((String)object4, "", 8208, 0, (PublicLogger)object2);
        object2 = this.b;
        object3.getClass();
        ((Si)object3).a(Si.a((o6)object, (bi)object2), (bi)object2, 1, null);
    }

    @Override
    public final void a(boolean bl2) {
        this.b.b.setLocationTracking(bl2);
    }

    @Override
    public final void b(@Nullable Activity object) {
        if (this.q.i.a((Activity)object, io.appmetrica.analytics.impl.o.b)) {
            this.c.info("Pause session", new Object[0]);
            object = object != null ? object.getClass().getSimpleName() : null;
            this.d((String)object);
            object = this.q.g;
            synchronized (object) {
                try {
                    for (l2 l22 : object.a) {
                        if (l22.d) continue;
                        l22.d = true;
                        l22.b.executeDelayed(l22.e, l22.c);
                    }
                }
                catch (Throwable throwable) {
                }
                throw throwable;
            }
        }
    }

    @Override
    public final void b(boolean bl2) {
        this.c.info("Set advIdentifiersTracking to %s", bl2);
        this.b.b.setAdvIdentifiersTracking(bl2);
    }

    @Override
    public final void c() {
        Ic ic3 = this.r;
        synchronized (ic3) {
            ic3.b.a(ic3.a);
            return;
        }
    }

    @Override
    public final void c(@NonNull String string2) {
        this.p.a(string2);
        Object object = this.h;
        Object object2 = this.c;
        Object object3 = W9.a;
        object3 = new HashMap();
        ((HashMap)object3).put("type", "referral");
        ((HashMap)object3).put("link", string2);
        ((HashMap)object3).put("auto", Boolean.FALSE);
        String string3 = Gb.b((Map)object3);
        object3 = Bb.c;
        object3 = new l4(string3, "", 8208, 0, (PublicLogger)object2);
        object2 = this.b;
        object.getClass();
        ((Si)object).a(Si.a((o6)object3, (bi)object2), (bi)object2, 1, null);
        object2 = this.c;
        object = new StringBuilder("Referral URL received: ");
        ((StringBuilder)object).append(WrapUtils.wrapToTag(string2));
        ((BaseReleaseLogger)object2).info(((StringBuilder)object).toString(), new Object[0]);
    }

    @Override
    public final List<String> f() {
        return this.b.a.b();
    }

    @Override
    public final String j() {
        return "[MainReporter]";
    }

    @Override
    public final void k() {
        super.k();
        A4.l().m().c();
    }

    public final void l() {
        Object object = this.h;
        Object object2 = this.b.a;
        ((Si)object).c.a((Vf)object2);
        object = this.q.g;
        object2 = new Gc(this);
        long l10 = s;
        synchronized (object) {
            ((m2)object).a((Gc)object2, l10);
            return;
        }
    }
}

