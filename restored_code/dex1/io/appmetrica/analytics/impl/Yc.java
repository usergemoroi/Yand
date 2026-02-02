/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.impl.A4;
import io.appmetrica.analytics.impl.Al;
import io.appmetrica.analytics.impl.Q6;
import io.appmetrica.analytics.impl.Si;
import io.appmetrica.analytics.impl.U6;
import io.appmetrica.analytics.impl.Vf;
import io.appmetrica.analytics.impl.Xn;
import io.appmetrica.analytics.impl.Y2;
import io.appmetrica.analytics.impl.ah;
import io.appmetrica.analytics.impl.b9;
import io.appmetrica.analytics.impl.bi;
import io.appmetrica.analytics.impl.c0;
import io.appmetrica.analytics.impl.df;
import io.appmetrica.analytics.impl.ma;
import io.appmetrica.analytics.internal.CounterConfiguration;

public final class Yc
extends Y2 {
    public Yc(Context context, Si si3, bi bi2, ma ma2, Q6 q62, Xn xn3, ah ah3, U6 u63, c0 c04, df df3) {
        super(context, si3, bi2, ma2, q62, xn3, ah3, u63, c04, df3);
        A4.l().getClass();
    }

    public Yc(Context context, Vf vf3, ReporterConfig reporterConfig, Si si3, ma ma2) {
        this(context, si3, new bi(vf3, new CounterConfiguration(reporterConfig), new b9(new Al(LoggerStorage.getOrCreatePublicLogger(reporterConfig.apiKey), "Crash Environment")), reporterConfig.userProfileID), ma2, A4.l().n(), new Xn(), new ah(), new U6(), new c0(), new df(ma2));
    }

    @Override
    public final String j() {
        return "[ManualReporter]";
    }
}

