/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.database.sqlite.SQLiteOpenHelper
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;
import io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import io.appmetrica.analytics.impl.Dl;
import io.appmetrica.analytics.impl.Zb;
import io.appmetrica.analytics.impl.bn;
import io.appmetrica.analytics.impl.xd;
import io.appmetrica.analytics.impl.y7;
import io.appmetrica.analytics.impl.yn;
import io.appmetrica.analytics.impl.zl;
import io.appmetrica.analytics.impl.zn;
import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class Ik
implements ServiceStorageProvider {
    public final Context a;
    public final Dl b;
    public final SQLiteOpenHelper c;

    public Ik(@NotNull Context context, @NotNull Dl dl2, @NotNull SQLiteOpenHelper sQLiteOpenHelper) {
        this.a = context;
        this.b = dl2;
        this.c = sQLiteOpenHelper;
    }

    @Override
    @Nullable
    public final File getAppDataStorage() {
        return FileUtils.getAppDataDir(this.a);
    }

    @Override
    @Nullable
    public final File getAppFileStorage() {
        return FileUtils.getAppStorageDirectory(this.a);
    }

    @Override
    @NotNull
    public final SQLiteOpenHelper getDbStorage() {
        return this.c;
    }

    @Override
    @Nullable
    public final File getSdkDataStorage() {
        return FileUtils.sdkStorage(this.a);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    @NotNull
    public final TempCacheStorage getTempCacheStorage() {
        y7 y74 = y7.a(this.a);
        synchronized (y74) {
            Throwable throwable2;
            block4: {
                zn zn3;
                bn bn3;
                Context context;
                block3: {
                    try {
                        yn yn3;
                        if (y74.o != null) return y74.o;
                        context = y74.e;
                        bn3 = bn.a;
                        if (y74.n != null) break block3;
                        zl zl3 = new zl(y74.h());
                        y74.n = yn3 = new yn(zl3, "temp_cache");
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                y74.o = zn3 = new zn(context, bn3, y74.n);
                return y74.o;
            }
            throw throwable2;
        }
    }

    @Override
    @NotNull
    public final ModulePreferences legacyModulePreferences() {
        return new Zb(this.b);
    }

    @Override
    @NotNull
    public final ModulePreferences modulePreferences(@NotNull String string2) {
        return new xd(string2, this.b);
    }
}

