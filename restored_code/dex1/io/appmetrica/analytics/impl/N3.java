/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 */
package io.appmetrica.analytics.impl;

import android.content.ComponentName;
import android.content.Context;
import io.appmetrica.analytics.impl.Y6;
import io.appmetrica.analytics.impl.Z5;
import io.appmetrica.analytics.internal.PreloadInfoContentProvider;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

public final class N3
implements Y6 {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void a(@NotNull Context object) {
        CountDownLatch countDownLatch = Z5.a;
        if (countDownLatch != null) {
            countDownLatch.await(1L, TimeUnit.SECONDS);
            try {
                countDownLatch = object.getPackageManager();
                ComponentName componentName = new ComponentName((Context)object, PreloadInfoContentProvider.class);
                countDownLatch.setComponentEnabledSetting(componentName, 2, 1);
                object = Z5.b;
                if (object != null) {
                    ((PreloadInfoContentProvider)((Object)object)).disable();
                }
            }
            catch (Throwable throwable) {}
            Z5.a = null;
        }
    }
}

