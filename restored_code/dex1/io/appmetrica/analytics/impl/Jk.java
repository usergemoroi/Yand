/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri$Builder
 *  android.os.Bundle
 *  android.os.Process
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import io.appmetrica.analytics.coreapi.internal.model.ScreenInfo;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.impl.A4;
import io.appmetrica.analytics.impl.Gb;
import io.appmetrica.analytics.impl.Vf;
import io.appmetrica.analytics.impl.k;
import io.appmetrica.analytics.impl.xj;
import io.appmetrica.analytics.internal.AppMetricaService;

public abstract class Jk {
    public static final SafePackageManager a = new SafePackageManager();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public static Intent a(Context context) {
        Bundle bundle;
        Object object = new Intent(context, AppMetricaService.class).setAction("io.appmetrica.analytics.IAppMetricaService").setData(new Uri.Builder().scheme("appmetrica").authority(context.getPackageName()).build()).addFlags(32);
        Object object2 = context.getPackageName();
        try {
            bundle = Jk.a.getApplicationInfo((Context)context, (String)object2, (int)128).metaData;
            object2 = bundle;
            if (bundle == null) {
                object2 = new Bundle();
            }
        }
        catch (Throwable throwable) {
            object2 = new Bundle();
        }
        bundle = object.putExtras((Bundle)object2);
        bundle.setData(bundle.getData().buildUpon().path("client").appendQueryParameter("pid", String.valueOf(Process.myPid())).appendQueryParameter("psid", Vf.c).build());
        object2 = A4.l();
        // MONITORENTER : object2
        if (((A4)object2).o == null) {
            object = new xj();
            ((A4)object2).o = object;
            ((A4)object2).h.a((k)object);
        }
        object = ((A4)object2).o;
        // MONITOREXIT : object2
        object2 = ((xj)object).a(context);
        object2 = object2 == null ? null : Gb.a((ScreenInfo)object2);
        bundle.putExtra("screen_size", (String)object2);
        return bundle.setPackage(context.getApplicationContext().getPackageName());
    }
}

