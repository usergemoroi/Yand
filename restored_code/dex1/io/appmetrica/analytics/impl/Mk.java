/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.ServiceConnection
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import io.appmetrica.analytics.impl.Lk;
import io.appmetrica.analytics.internal.AppMetricaService;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceWakeLock;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;

public final class Mk
implements ServiceWakeLock {
    public final Context a;
    public final Lk b;
    public final HashMap c;

    public Mk(@NotNull Context context, @NotNull Lk lk3) {
        this.a = context;
        this.b = lk3;
        this.c = new HashMap();
    }

    @NotNull
    public final String a(@NotNull String string2) {
        StringBuilder stringBuilder = new StringBuilder("io.appmetrica.analytics.ACTION_SERVICE_WAKELOCK.");
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final boolean acquireWakeLock(@NotNull String string2) {
        synchronized (this) {
            Throwable throwable2;
            block7: {
                boolean bl2;
                block6: {
                    Context context;
                    Lk lk3;
                    HashMap hashMap;
                    Object object;
                    try {
                        object = this.c.get(string2);
                        bl2 = true;
                        if (object != null) break block6;
                        hashMap = this.c;
                        lk3 = this.b;
                        context = this.a;
                        object = this.a(string2);
                        lk3.a.getClass();
                        lk3 = new Intent(context, AppMetricaService.class);
                        lk3.setAction((String)object);
                        object = new Object();
                    }
                    catch (Throwable throwable2) {
                        break block7;
                    }
                    try {
                        context.bindService((Intent)lk3, object, 1);
                    }
                    catch (Throwable throwable3) {
                        object = null;
                    }
                    hashMap.put(string2, object);
                }
                if ((string2 = this.c.get(string2)) == null) return false;
                return bl2;
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
    public final void releaseWakeLock(@NotNull String string2) {
        synchronized (this) {
            Throwable throwable2;
            block7: {
                block6: {
                    Context context;
                    ServiceConnection serviceConnection;
                    try {
                        serviceConnection = (ServiceConnection)this.c.get(string2);
                        if (serviceConnection == null) break block6;
                        Lk lk3 = this.b;
                        this.a(string2);
                        context = this.a;
                        lk3.getClass();
                    }
                    catch (Throwable throwable2) {
                        break block7;
                    }
                    try {
                        context.unbindService(serviceConnection);
                    }
                    catch (Throwable throwable3) {}
                    string2 = (ServiceConnection)this.c.remove(string2);
                }
                return;
            }
            throw throwable2;
        }
    }
}

