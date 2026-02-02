/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler
 *  android.os.ResultReceiver
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Handler;
import android.os.ResultReceiver;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.impl.A4;
import io.appmetrica.analytics.impl.Fg;
import io.appmetrica.analytics.impl.Fi;
import io.appmetrica.analytics.impl.Lb;
import io.appmetrica.analytics.impl.Si;
import io.appmetrica.analytics.impl.Vf;
import io.appmetrica.analytics.impl.Xl;
import io.appmetrica.analytics.impl.Yn;
import io.appmetrica.analytics.impl.a7;
import io.appmetrica.analytics.impl.d5;
import io.appmetrica.analytics.impl.fm;
import io.appmetrica.analytics.impl.o0;
import io.appmetrica.analytics.impl.pf;
import io.appmetrica.analytics.impl.rk;
import io.appmetrica.analytics.impl.z0;

public abstract class A0 {
    public static Fg a(Si si3, pf pf3, Handler handler) {
        return new Fg(si3, pf3, handler, pf3.s());
    }

    public static Fi a(Context context, Vf vf3, Si si3, Handler handler, Xl xl3) {
        return new Fi(context, vf3, si3, handler, xl3);
    }

    public static Si a(Vf vf3, Context context, ICommonExecutor object) {
        object = new o0(context, (ICommonExecutor)object, A4.l().e());
        return new Si((o0)object, new Yn(new Lb()), new d5(vf3), new rk(context, (o0)object));
    }

    public static Vf a(Context context, a7 a74) {
        return new Vf(context, (ResultReceiver)a74);
    }

    public static Xl a(Context context, Si si3, pf pf3, Handler handler) {
        return new Xl(si3, new fm(context, pf3), handler);
    }

    public static a7 a(Handler handler, z0 z02) {
        return new a7(handler, z02);
    }
}

