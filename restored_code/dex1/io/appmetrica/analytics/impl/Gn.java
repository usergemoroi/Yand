/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 */
package io.appmetrica.analytics.impl;

import android.os.Looper;
import io.appmetrica.analytics.impl.In;
import java.util.Map;

public final class Gn
implements In {
    @Override
    public final Thread a() {
        return Looper.getMainLooper().getThread();
    }

    @Override
    public final StackTraceElement[] b() {
        return null;
    }

    @Override
    public final Map c() {
        return Thread.getAllStackTraces();
    }
}

