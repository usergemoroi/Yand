/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.graphics.Point
 *  kotlin.ranges.j
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import io.appmetrica.analytics.coreapi.internal.model.AppVersionInfo;
import io.appmetrica.analytics.coreapi.internal.model.ScreenInfo;
import io.appmetrica.analytics.coreapi.internal.model.SdkEnvironment;
import io.appmetrica.analytics.coreapi.internal.model.SdkInfo;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.SdkEnvironmentProvider;
import io.appmetrica.analytics.coreutils.internal.services.FrameworkDetector;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.impl.Bj;
import io.appmetrica.analytics.impl.M5;
import io.appmetrica.analytics.impl.ic;
import io.appmetrica.analytics.impl.l8;
import io.appmetrica.analytics.impl.zj;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.y;
import kotlin.ranges.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class Aj
implements SdkEnvironmentProvider {
    public final Context a;
    public final ic b;
    public final CopyOnWriteArrayList c;
    public SdkEnvironment d;
    public String e;

    public Aj(@NotNull Context context) {
        this.a = context;
        this.b = new ic();
        this.c = new CopyOnWriteArrayList();
        this.d = new SdkEnvironment(new AppVersionInfo(PackageManagerUtils.getAppVersionName(context), PackageManagerUtils.getAppVersionCodeString(context)), FrameworkDetector.framework(), new ScreenInfo(0, 0, 0, 0.0f), new SdkInfo("7.12.0", "50139596", Bj.a()), "phone", ic.a(context.getResources().getConfiguration()));
    }

    public final void a(@NotNull Configuration object) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        this.b.getClass();
                        object = ic.a((Configuration)object);
                        if (y.e(this.getSdkEnvironment().getLocales(), object)) break block4;
                        this.d = SdkEnvironment.copy$default(this.getSdkEnvironment(), null, null, null, null, null, (List)object, 31, null);
                        object = this.c.iterator();
                        while (object.hasNext()) {
                            ((M5)((zj)object.next())).d();
                        }
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(@Nullable ScreenInfo iterator) {
        synchronized (this) {
            block10: {
                String string2;
                block11: {
                    block12: {
                        int n10;
                        int n13;
                        float f11;
                        block13: {
                            String string3;
                            if (iterator == null) break block10;
                            if (y.e(iterator, this.getSdkEnvironment().getScreenInfo())) break block10;
                            string2 = string3 = this.e;
                            if (string3 != null) break block11;
                            string2 = this.a;
                            string3 = new Point(((ScreenInfo)((Object)iterator)).getWidth(), ((ScreenInfo)((Object)iterator)).getHeight());
                            SafePackageManager safePackageManager = l8.a;
                            try {
                                f11 = string2.getResources().getDisplayMetrics().density;
                            }
                            catch (Throwable throwable) {
                                f11 = 0.0f;
                            }
                            if (Float.isNaN(f11) || f11 == 0.0f) break block12;
                            n13 = ((Point)string3).x;
                            n10 = ((Point)string3).y;
                            if (!l8.a((Context)string2)) break block13;
                            string2 = "tv";
                            break block11;
                        }
                        float f12 = (float)160 * f11;
                        float f13 = n13;
                        float f14 = f13 / f12;
                        float f15 = n10;
                        f12 = f15 / f12;
                        double d14 = Math.sqrt(f12 * f12 + f14 * f14);
                        f11 = j.h((float)(f13 / f11), (float)(f15 / f11));
                        string2 = !(d14 >= (double)7) && !(f11 >= (float)600) ? "phone" : "tablet";
                        break block11;
                    }
                    string2 = "phone";
                }
                try {
                    this.d = SdkEnvironment.copy$default(this.getSdkEnvironment(), null, null, (ScreenInfo)((Object)iterator), null, string2, null, 43, null);
                    iterator = this.c.iterator();
                    while (iterator.hasNext()) {
                        ((M5)((zj)iterator.next())).d();
                    }
                }
                catch (Throwable throwable) {}
                throw throwable;
            }
            return;
        }
    }

    public final void a(@NotNull zj zj3) {
        this.c.add(zj3);
    }

    public final void a(@Nullable String object) {
        synchronized (this) {
            if (object != null) {
                if (!y.e(object, this.e)) {
                    this.e = object;
                    if (!y.e(object, this.getSdkEnvironment().getDeviceType())) {
                        this.d = SdkEnvironment.copy$default(this.getSdkEnvironment(), null, null, null, null, (String)object, null, 47, null);
                        object = this.c.iterator();
                        while (object.hasNext()) {
                            ((M5)((zj)object.next())).d();
                        }
                    }
                }
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(@Nullable String object, @Nullable String object2) {
        synchronized (this) {
            Throwable throwable2;
            block7: {
                String string2 = object;
                if (object == null) {
                    try {
                        string2 = this.getSdkEnvironment().getAppVersionInfo().getAppVersionName();
                    }
                    catch (Throwable throwable2) {
                        break block7;
                    }
                }
                object = object2;
                if (object2 == null) {
                    object = this.getSdkEnvironment().getAppVersionInfo().getAppBuildNumber();
                }
                if (!y.e(((AppVersionInfo)(object2 = this.getSdkEnvironment().getAppVersionInfo())).getAppVersionName(), string2) || !y.e(((AppVersionInfo)object2).getAppBuildNumber(), object)) {
                    object2 = this.getSdkEnvironment();
                    AppVersionInfo appVersionInfo = new AppVersionInfo(string2, (String)object);
                    this.d = SdkEnvironment.copy$default((SdkEnvironment)object2, appVersionInfo, null, null, null, null, null, 62, null);
                    object = this.c.iterator();
                    while (object.hasNext()) {
                        ((M5)((zj)object.next())).d();
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    public final void b(@NotNull zj zj3) {
        this.c.remove(zj3);
    }

    @Override
    @NotNull
    public final SdkEnvironment getSdkEnvironment() {
        SdkEnvironment sdkEnvironment = this.d;
        if (sdkEnvironment != null) {
            return sdkEnvironment;
        }
        y.B("sdkEnvironment");
        return null;
    }
}

