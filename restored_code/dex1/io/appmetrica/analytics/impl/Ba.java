/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  kotlin.io.i
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import io.appmetrica.analytics.impl.Ho;
import java.io.File;
import kotlin.io.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class Ba
implements Ho {
    public final Context a;
    public final String b;

    public Ba(@NotNull Context context, @NotNull String string2) {
        this.a = context;
        this.b = string2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    @Nullable
    public final String a() {
        Object object;
        File file;
        File file2 = null;
        try {
            file = FileUtils.getFileFromSdkStorage(this.a, this.b);
            object = file2;
            if (file == null) return object;
        }
        catch (Throwable throwable) {
            return file2;
        }
        file.exists();
        object = FileUtils.getFileFromAppStorage(this.a, this.b);
        if (object == null) return i.j((File)file, null, (int)1, null);
        FileUtils.copyToNullable((File)object, file);
        return i.j((File)file, null, (int)1, null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void a(@NotNull String string2) {
        try {
            File file = FileUtils.getFileFromSdkStorage(this.a, this.b);
            if (file == null) return;
            i.m((File)file, (String)string2, null, (int)2, null);
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }
}

