/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.ResultReceiver
 */
package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import io.appmetrica.analytics.impl.Bg;
import io.appmetrica.analytics.impl.Jg;

public final class Pg
extends ResultReceiver {
    public final Bg a;

    public Pg(Handler handler, Bg bg3) {
        super(handler);
        this.a = bg3;
    }

    public static void a(ResultReceiver resultReceiver, Jg object) {
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            object = object == null ? null : (Object)((Jg)object).a();
            bundle.putByteArray("referrer", (byte[])object);
            resultReceiver.send(1, bundle);
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onReceiveResult(int n10, Bundle object) {
        if (n10 == 1) {
            void var2_6;
            block5: {
                Object var3_9 = null;
                try {
                    byte[] byArray = object.getByteArray("referrer");
                    Object var2_3 = var3_9;
                    if (byArray == null) break block5;
                    if (byArray.length == 0) {
                        Object var2_4 = var3_9;
                    } else {
                        Jg jg3 = new Jg(byArray);
                    }
                }
                catch (Throwable throwable) {
                    Object var2_8 = var3_9;
                }
            }
            this.a.a((Jg)var2_6);
        }
    }
}

