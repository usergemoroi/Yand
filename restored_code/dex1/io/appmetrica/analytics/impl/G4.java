/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.Ac;
import io.appmetrica.analytics.impl.E4;
import io.appmetrica.analytics.impl.Ej;
import io.appmetrica.analytics.impl.F4;
import io.appmetrica.analytics.impl.Hj;
import io.appmetrica.analytics.impl.Lc;
import io.appmetrica.analytics.impl.Yh;
import io.appmetrica.analytics.impl.ai;
import io.appmetrica.analytics.impl.nk;
import io.appmetrica.analytics.impl.o4;
import kotlin.r;

public final class G4 {
    public static E4 a(o4 object) {
        object = ((o4)object).e;
        switch (F4.a[((Enum)object).ordinal()]) {
            default: {
                throw new r();
            }
            case 7: {
                object = new Lc();
                break;
            }
            case 6: {
                object = new Lc();
                break;
            }
            case 5: {
                object = new Yh(new nk());
                break;
            }
            case 4: {
                object = new Yh(new ai());
                break;
            }
            case 3: {
                object = new Hj();
                break;
            }
            case 2: {
                object = new Ej();
                break;
            }
            case 1: {
                object = new Ac();
            }
        }
        return object;
    }
}

