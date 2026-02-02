/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.lo;
import io.appmetrica.analytics.impl.oo;
import io.appmetrica.analytics.impl.wo;
import io.appmetrica.analytics.impl.yo;

public final class W2
implements yo {
    @Override
    public final wo a(Object object) {
        object = ((oo)object).a;
        object = object != null && ((lo[])object).length != 0 ? new wo(this, true, "") : new wo(this, false, "attributes list is empty");
        return object;
    }
}

