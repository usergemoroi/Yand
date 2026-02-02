/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.Kf;
import io.appmetrica.analytics.impl.Sm;
import io.appmetrica.analytics.impl.wf;
import io.appmetrica.analytics.impl.xf;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public final class Mf
implements Sm {
    @NotNull
    public final xf a(@NotNull Kf kf3, @NotNull List<? extends wf> list) {
        return new xf(kf3, list);
    }

    @Override
    public final Object invoke(Object object, Object object2) {
        return new xf((Kf)object, (List)object2);
    }
}

