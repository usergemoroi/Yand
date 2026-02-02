/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.ConnectivityManager
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import android.net.ConnectivityManager;
import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import io.appmetrica.analytics.impl.O5;
import io.appmetrica.analytics.impl.Ye;
import io.appmetrica.analytics.impl.Ze;
import io.appmetrica.analytics.impl.af;
import java.util.EnumSet;
import org.jetbrains.annotations.NotNull;

public final class N5
implements IExecutionPolicy {
    public final Context a;
    public final O5 b;
    public final EnumSet c;
    public final String d;

    public N5(@NotNull Context context) {
        this.a = context;
        this.b = new O5();
        this.c = EnumSet.of(Ze.m);
        this.d = "connection based";
    }

    @Override
    public final boolean canBeExecuted() {
        Object object = this.b;
        Object object2 = this.a;
        object.getClass();
        object = af.a;
        object2 = SystemServiceUtils.accessSystemServiceSafelyOrDefault((ConnectivityManager)object2.getSystemService("connectivity"), "getting connection type", "ConnectivityManager", Ze.n, new Ye());
        return this.c.contains(object2) ^ true;
    }

    @Override
    @NotNull
    public final String description() {
        return this.d;
    }
}

