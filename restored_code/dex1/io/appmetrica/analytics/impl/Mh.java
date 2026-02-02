/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.I5;
import io.appmetrica.analytics.impl.Nk;
import io.appmetrica.analytics.impl.bl;
import io.appmetrica.analytics.impl.el;
import io.appmetrica.analytics.impl.nh;
import io.appmetrica.analytics.impl.o6;
import io.appmetrica.analytics.impl.v5;

public final class Mh
extends nh {
    public Mh(v5 v54) {
        super(v54);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final boolean a(@NonNull o6 o63) {
        ((I5)this.a.p).e();
        bl bl2 = this.a.j;
        synchronized (bl2) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        Object object = bl2.b(o63);
                        if (!((Nk)object).g) break block4;
                        ((Nk)object).g = false;
                        object = ((Nk)object).b;
                        ((el)object).a("SESSION_IS_ALIVE_REPORT_NEEDED", Boolean.FALSE);
                        ((el)object).b();
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                if (bl2.g != 1) {
                    bl2.b(bl2.f, o63);
                }
                bl2.g = 1;
                return true;
            }
            throw throwable2;
        }
    }
}

