/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.app.ActivityManager
 *  android.app.usage.UsageStatsManager
 *  android.content.Context
 */
package io.appmetrica.analytics.impl;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.annotations.DoNotInline;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import io.appmetrica.analytics.impl.L2;
import io.appmetrica.analytics.impl.M2;
import io.appmetrica.analytics.impl.k2;
import io.appmetrica.analytics.impl.lp;
import io.appmetrica.analytics.impl.mp;
import io.appmetrica.analytics.impl.np;
import io.appmetrica.analytics.impl.op;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a8\u0006\n"}, d2={"Lio/appmetrica/analytics/impl/J2;", "", "Landroid/content/Context;", "context", "Lio/appmetrica/analytics/impl/k2;", "converter", "Lio/appmetrica/analytics/impl/M2;", "a", "<init>", "()V", "analytics_binaryProdRelease"}, k=1, mv={1, 6, 0})
@TargetApi(value=28)
@DoNotInline
public final class J2 {
    @NotNull
    public static final J2 a = new J2();

    private J2() {
    }

    private static final L2 a(k2 object, UsageStatsManager usageStatsManager) {
        int n10 = mp.a(usageStatsManager);
        object.getClass();
        object = AndroidUtils.isApiAchieved(28) ? (AndroidUtils.isApiAchieved(30) && n10 == 45 ? L2.f : (n10 == 5 ? L2.a : (n10 == 10 ? L2.b : (n10 == 30 ? L2.d : (n10 == 20 ? L2.c : (n10 == 40 ? L2.e : L2.g)))))) : null;
        return object;
    }

    @JvmStatic
    @NotNull
    public static final M2 a(@NotNull Context context, @NotNull k2 k24) {
        return new M2((L2)((Object)SystemServiceUtils.accessSystemServiceByNameSafely(context, "usagestats", "getting app standby bucket", "usageStatsManager", new np(k24))), (Boolean)SystemServiceUtils.accessSystemServiceByNameSafely(context, "activity", "getting is background restricted", "activityManager", new op()));
    }

    private static final Boolean a(ActivityManager activityManager) {
        return lp.a(activityManager);
    }

    public static /* synthetic */ Boolean b(ActivityManager activityManager) {
        return J2.a(activityManager);
    }

    public static /* synthetic */ L2 c(k2 k24, UsageStatsManager usageStatsManager) {
        return J2.a(k24, usageStatsManager);
    }
}

