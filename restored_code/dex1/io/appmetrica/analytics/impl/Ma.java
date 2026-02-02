/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.Bk;
import io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator;

public final class Ma
implements Bk {
    @Override
    public final void onCreate() {
        NetworkServiceLocator.getInstance().onCreate();
    }

    @Override
    public final void onDestroy() {
        NetworkServiceLocator.getInstance().onDestroy();
    }
}

