/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.impl.A4;
import io.appmetrica.analytics.impl.L6;
import io.appmetrica.analytics.impl.Rh;
import io.appmetrica.analytics.impl.Si;
import io.appmetrica.analytics.impl.Wn;
import io.appmetrica.analytics.impl.Xl;
import io.appmetrica.analytics.impl.b9;
import io.appmetrica.analytics.impl.bi;
import io.appmetrica.analytics.impl.ub;
import io.appmetrica.analytics.logger.common.BaseReleaseLogger;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

public final class K6
implements ub {
    public final L6 a;
    public final bi b;

    public K6(@NotNull L6 l63) {
        this.a = l63;
        this.b = l63.a();
        A4.l().getClass();
    }

    public final void a(@NotNull AppMetricaConfig map2) {
        map2 = ((AppMetricaConfig)((Object)map2)).errorEnvironment;
        if (map2 != null) {
            for (Map.Entry<String, String> entry : map2.entrySet()) {
                map2 = this.b;
                String string2 = entry.getKey();
                String string3 = entry.getValue();
                synchronized (map2) {
                    b9 object = ((bi)((Object)map2)).c;
                    object.b.b(object.a, string2, string3);
                }
            }
        }
    }

    @Override
    public final void a(@NotNull Wn wn3) {
        Si si3 = this.a.a;
        Object object = si3.a(wn3, this.b);
        bi bi2 = ((Rh)object).e;
        Object object2 = si3.e;
        if (object2 != null) {
            bi2.b.setUuid(((Xl)object2).g());
        } else {
            bi2.getClass();
        }
        si3.c.b((Rh)object);
        object2 = LoggerStorage.getMainPublicOrAnonymousLogger();
        object = new StringBuilder("Unhandled exception received: ");
        ((StringBuilder)object).append(wn3);
        ((BaseReleaseLogger)object2).info(((StringBuilder)object).toString(), new Object[0]);
    }
}

