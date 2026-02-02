/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import java.io.File;
import kotlin.k0;

public final class Ca {
    public volatile Boolean a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(Context object) {
        if (this.a != null) return;
        synchronized (this) {
            Throwable throwable2;
            block10: {
                block8: {
                    boolean bl2;
                    block9: {
                        boolean bl3;
                        Comparable<Boolean> comparable;
                        try {
                            comparable = this.a;
                            if (comparable != null) break block8;
                            bl3 = false;
                        }
                        catch (Throwable throwable2) {
                            break block10;
                        }
                        try {
                            comparable = FileUtils.getFileFromAppStorage((Context)object, "uuid.dat");
                            bl2 = comparable != null ? ((File)comparable).exists() : false;
                            object = FileUtils.getFileFromSdkStorage((Context)object, "uuid.dat");
                            boolean bl4 = object != null ? ((File)object).exists() : false;
                            if (!bl2) {
                                bl2 = bl3;
                                if (!bl4) break block9;
                            }
                            bl2 = true;
                        }
                        catch (Throwable throwable3) {
                            bl2 = bl3;
                        }
                    }
                    this.a = bl2;
                }
                object = k0.a;
                return;
            }
            throw throwable2;
        }
    }
}

