/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.location.LocationManager
 */
package io.appmetrica.analytics.impl;

import android.location.LocationManager;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;

public final class F2
implements FunctionWithThrowable {
    public final Object apply(Object object) {
        return ((LocationManager)object).getProviders(true);
    }
}

