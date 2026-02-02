/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.impl.X9;

public abstract class Rd {
    public static X9 a;

    public static final X9 a(Context context) {
        synchronized (Rd.class) {
            Throwable throwable2;
            block5: {
                X9 x94;
                block4: {
                    try {
                        X9 x95;
                        x94 = x95 = a;
                        if (x95 != null) break block4;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    a = x94 = new X9(context, "uuid.dat");
                }
                return x94;
            }
            throw throwable2;
        }
    }
}

