/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.impl.Eg;
import io.appmetrica.analytics.impl.Qg;
import io.appmetrica.analytics.impl.ob;

public final class Rg {
    public Rg(ob ob3) {
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ob a(Context object, IHandlerExecutor object2) {
        void var0_4;
        Qg qg3;
        if (ReflectionUtils.detectClassExists("com.android.installreferrer.api.InstallReferrerClient")) {
            try {
                Eg eg3;
                Eg eg4 = eg3 = new Eg((Context)object, (ICommonExecutor)((Object)qg3));
            }
            catch (Throwable throwable) {}
        }
        Object var0_3 = null;
        qg3 = var0_4;
        if (var0_4 != null) return qg3;
        return new Qg();
    }
}

