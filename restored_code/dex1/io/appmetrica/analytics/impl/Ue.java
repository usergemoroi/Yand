/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  kotlin.text.p
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import io.appmetrica.analytics.impl.jb;
import io.appmetrica.analytics.impl.uo;
import io.appmetrica.analytics.impl.vo;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Locale;
import java.util.UUID;
import kotlin.text.p;

public final class Ue {
    public final Context a;
    public final uo b;
    public final vo c;

    public Ue(Context context) {
        this(context, new uo(), new vo());
    }

    public Ue(Context context, uo uo3, vo vo3) {
        this.a = context;
        this.b = uo3;
        this.c = vo3;
    }

    public final String a(String string2) {
        block4: {
            File file;
            try {
                this.c.getClass();
                if (!vo.a(string2)) {
                    this.b.getClass();
                    string2 = p.I((String)UUID.randomUUID().toString(), (String)"-", (String)"", (boolean)false, (int)4, null).toLowerCase(Locale.US);
                }
                file = FileUtils.getFileFromSdkStorage(this.a, "uuid.dat");
                if (file == null || string2 == null) break block4;
            }
            catch (Throwable throwable) {
                return null;
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            jb.a(string2, fileOutputStream);
        }
        return string2;
    }

    public final void a() {
        File file;
        File file2 = FileUtils.getFileFromSdkStorage(this.a, "uuid.dat");
        if (file2 == null) {
            return;
        }
        if (!file2.exists() && (file = FileUtils.getFileFromAppStorage(this.a, "uuid.dat")) != null && file.exists()) {
            FileUtils.copyToNullable(file, file2);
        }
    }
}

