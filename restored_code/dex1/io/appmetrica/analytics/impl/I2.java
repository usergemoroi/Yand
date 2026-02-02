/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 */
package io.appmetrica.analytics.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import io.appmetrica.analytics.coreapi.internal.backport.BiConsumer;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.impl.H2;
import io.appmetrica.analytics.impl.d3;

public final class I2
extends BroadcastReceiver {
    public final BiConsumer a;
    public final ICommonExecutor b;

    public I2(d3 d34, ICommonExecutor iCommonExecutor) {
        this.a = d34;
        this.b = iCommonExecutor;
    }

    public final void onReceive(Context context, Intent intent) {
        this.b.execute(new H2(this, context, intent));
    }
}

