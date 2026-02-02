/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.ConnectivityManager
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import android.net.ConnectivityManager;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import io.appmetrica.analytics.impl.Ve;
import io.appmetrica.analytics.impl.Ye;
import io.appmetrica.analytics.impl.Ze;
import io.appmetrica.analytics.impl.af;

public final class O5 {
    public final Ze a(@NonNull Context context) {
        Ve ve2 = af.a;
        return SystemServiceUtils.accessSystemServiceSafelyOrDefault((ConnectivityManager)context.getSystemService("connectivity"), "getting connection type", "ConnectivityManager", Ze.n, new Ye());
    }
}

