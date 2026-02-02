/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.android.installreferrer.api.InstallReferrerClient
 *  com.android.installreferrer.api.InstallReferrerStateListener
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.impl.Dg;
import io.appmetrica.analytics.impl.Og;
import io.appmetrica.analytics.impl.gp;
import io.appmetrica.analytics.impl.ob;
import org.jetbrains.annotations.NotNull;

public final class Eg
implements ob {
    public final ICommonExecutor a;
    public final InstallReferrerClient b;

    public Eg(@NotNull Context context, @NotNull ICommonExecutor iCommonExecutor) {
        this.a = iCommonExecutor;
        this.b = InstallReferrerClient.newBuilder((Context)context).build();
    }

    public static final /* synthetic */ InstallReferrerClient a(Eg eg3) {
        return eg3.b;
    }

    public static final /* synthetic */ void a(Eg eg3, Og og2, Throwable throwable) {
        eg3.a(og2, throwable);
    }

    public static final /* synthetic */ ICommonExecutor b(Eg eg3) {
        return eg3.a;
    }

    public static final void b(Og og2, Throwable throwable) {
        og2.a(throwable);
    }

    @Override
    public final void a(@NotNull Og object) throws Throwable {
        object = new Dg(this, (Og)object);
        this.b.startConnection((InstallReferrerStateListener)object);
    }

    public final void a(Og og2, Throwable throwable) {
        this.a.execute(new gp(og2, throwable));
    }
}

