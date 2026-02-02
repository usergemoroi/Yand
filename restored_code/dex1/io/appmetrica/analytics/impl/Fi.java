/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler
 *  androidx.annotation.WorkerThread
 *  kotlin.collections.t
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Handler;
import androidx.annotation.WorkerThread;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.impl.A4;
import io.appmetrica.analytics.impl.Ei;
import io.appmetrica.analytics.impl.Hc;
import io.appmetrica.analytics.impl.Hi;
import io.appmetrica.analytics.impl.K6;
import io.appmetrica.analytics.impl.Kn;
import io.appmetrica.analytics.impl.L6;
import io.appmetrica.analytics.impl.Ob;
import io.appmetrica.analytics.impl.Sc;
import io.appmetrica.analytics.impl.Si;
import io.appmetrica.analytics.impl.Vf;
import io.appmetrica.analytics.impl.Xl;
import io.appmetrica.analytics.impl.Y2;
import io.appmetrica.analytics.impl.Yc;
import io.appmetrica.analytics.impl.bi;
import io.appmetrica.analytics.impl.g4;
import io.appmetrica.analytics.impl.k0;
import io.appmetrica.analytics.impl.ma;
import io.appmetrica.analytics.impl.rb;
import io.appmetrica.analytics.impl.sb;
import io.appmetrica.analytics.impl.ub;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.t;
import org.jetbrains.annotations.NotNull;

public final class Fi
implements sb {
    public final Context a;
    public final Vf b;
    public final Si c;
    public final Handler d;
    public final Xl e;
    public final Sc f;
    public final LinkedHashMap g;
    public final Kn h;
    public final List i;
    public Hc j;
    public K6 k;

    public Fi(@NotNull Context object, @NotNull Vf vf3, @NotNull Si si3, @NotNull Handler handler, @NotNull Xl xl3) {
        this.a = object;
        this.b = vf3;
        this.c = si3;
        this.d = handler;
        this.e = xl3;
        this.f = new Sc((Context)object, vf3, si3, xl3);
        object = new LinkedHashMap();
        this.g = object;
        this.h = new Kn(new Hi((Map<String, ?>)object));
        this.i = t.p((Object[])new String[]{"20799a27-fa80-4b36-b2db-0f8141f24180", "0e5e9c33-f8c3-4568-86c5-2e4f57523f72"});
    }

    @Override
    public final sb a() {
        return this;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    @NotNull
    public final ub a(@NotNull AppMetricaConfig object) {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                Object object2;
                try {
                    object2 = this.k;
                    if (object2 != null) {
                        ((K6)object2).a((AppMetricaConfig)object);
                        return object2;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                object2 = new L6(this.b, this.f.e, this.c, (AppMetricaConfig)object);
                this.k = object = new K6((L6)object2);
                return object;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void a(@NotNull ReporterConfig reporterConfig) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    block3: {
                        try {
                            if (!this.g.containsKey(reporterConfig.apiKey)) break block3;
                            LoggerStorage.getOrCreatePublicLogger(reporterConfig.apiKey).warning("Reporter with apiKey=%s already exists.", ApiKeyUtils.createPartialApiKey(reporterConfig.apiKey));
                            break block4;
                        }
                        catch (Throwable throwable2) {
                            break block5;
                        }
                    }
                    this.b(reporterConfig);
                    ImportantLogger importantLogger = ImportantLogger.INSTANCE;
                    StringBuilder stringBuilder = new StringBuilder("Activate reporter with APIKey ");
                    stringBuilder.append(ApiKeyUtils.createPartialApiKey(reporterConfig.apiKey));
                    importantLogger.info("AppMetrica", stringBuilder.toString(), new Object[0]);
                }
                return;
            }
            throw throwable2;
        }
    }

    @NotNull
    public final Fi b() {
        return this;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    @NotNull
    public final rb b(@NotNull ReporterConfig reporterConfig) {
        synchronized (this) {
            Throwable throwable2;
            block7: {
                rb rb2;
                block5: {
                    Object object;
                    block6: {
                        try {
                            object = (rb)this.g.get(reporterConfig.apiKey);
                            rb2 = object;
                            if (object != null) break block5;
                            if (this.i.contains(reporterConfig.apiKey)) break block6;
                            this.e.i();
                        }
                        catch (Throwable throwable2) {
                            break block7;
                        }
                    }
                    Context context = this.a;
                    object = this.b;
                    Object object2 = this.c;
                    ma ma2 = new ma(context);
                    rb2 = new Yc(context, (Vf)object, reporterConfig, (Si)object2, ma2);
                    ((Y2)rb2).i = object = new Ob(this.d, (Y2)rb2);
                    object2 = this.e;
                    object = ((Y2)rb2).b;
                    if (object2 != null) {
                        ((g4)object).b.setUuid(((Xl)object2).g());
                    } else {
                        object.getClass();
                    }
                    ((Y2)rb2).k();
                    this.g.put(reporterConfig.apiKey, rb2);
                }
                return rb2;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @NotNull
    public final Hc c(@NotNull AppMetricaConfig object, @NotNull PublicLogger object2, @NotNull k0 object3) {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                Object object4;
                block5: {
                    block4: {
                        try {
                            object4 = this.j;
                            if (object4 != null) {
                                return object4;
                            }
                            this.h.a(((AppMetricaConfig)object).apiKey);
                            this.f.a((AppMetricaConfig)object, (PublicLogger)object2);
                            object2 = new Hc(this.f);
                            ((Y2)object2).i = object4 = new Ob(this.d, (Y2)object2);
                            Xl xl3 = this.e;
                            object4 = ((Y2)object2).b;
                            if (xl3 == null) break block4;
                            ((g4)object4).b.setUuid(xl3.g());
                            break block5;
                        }
                        catch (Throwable throwable2) {
                            break block6;
                        }
                    }
                    object4.getClass();
                }
                ((Hc)object2).a((AppMetricaConfig)object, (k0)object3);
                ((Hc)object2).k();
                object4 = this.c;
                ((Si)object4).f.c = object3 = new Ei((Hc)object2);
                this.g.put(((AppMetricaConfig)object).apiKey, object2);
                this.j = object2;
                return object2;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @WorkerThread
    @NotNull
    public final Hc d(@NotNull AppMetricaConfig object, @NotNull PublicLogger object2, @NotNull k0 object3) {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                Object object4;
                try {
                    object4 = this.j;
                    if (object4 != null) {
                        this.f.a((AppMetricaConfig)object, (PublicLogger)object2);
                        ((Hc)object4).a((AppMetricaConfig)object, (k0)object3);
                        A4.l().getClass();
                        this.g.put(((AppMetricaConfig)object).apiKey, object4);
                        return object4;
                    }
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                this.h.a(((AppMetricaConfig)object).apiKey);
                this.f.a((AppMetricaConfig)object, (PublicLogger)object2);
                object2 = new Hc(this.f);
                ((Y2)object2).i = object4 = new Ob(this.d, (Y2)object2);
                object4 = this.e;
                bi bi2 = ((Y2)object2).b;
                if (object4 != null) {
                    bi2.b.setUuid(((Xl)object4).g());
                } else {
                    bi2.getClass();
                }
                ((Hc)object2).a((AppMetricaConfig)object, (k0)object3);
                ((Hc)object2).k();
                object4 = this.c;
                ((Si)object4).f.c = object3 = new Ei((Hc)object2);
                this.g.put(((AppMetricaConfig)object).apiKey, object2);
                A4.l().getClass();
                this.j = object2;
                return object2;
            }
            throw throwable2;
        }
    }
}

