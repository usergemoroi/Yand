/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.location.LocationManager
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.LocationManager;

public final class G2 {
    public final LocationManager a;

    public G2(Context context) {
        this((LocationManager)context.getSystemService("location"));
    }

    public G2(LocationManager locationManager) {
        this.a = locationManager;
    }
}

