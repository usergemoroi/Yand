/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.ConnectivityManager
 */
package io.appmetrica.analytics.impl;

import android.net.ConnectivityManager;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.impl.Ze;
import io.appmetrica.analytics.impl.af;

public final class Ye
implements FunctionWithThrowable {
    public final Object apply(Object object) {
        object = (ConnectivityManager)object;
        object = AndroidUtils.isApiAchieved(23) ? af.a((ConnectivityManager)object) : ((object = object.getActiveNetworkInfo()) != null && object.isConnected() ? (Ze)((Object)af.a.a(object.getType())) : Ze.m);
        return object;
    }
}

