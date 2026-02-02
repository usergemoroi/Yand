/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.jvm.functions.l
 *  kotlin.jvm.internal.a0
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.Fb;
import io.appmetrica.analytics.impl.yd;
import java.util.Map;
import kotlin.jvm.functions.l;
import kotlin.jvm.internal.a0;

public final class Md
extends a0
implements l {
    public final Fb a;

    public Md(Fb fb2) {
        this.a = fb2;
        super(1);
    }

    public final Object invoke(Object object) {
        yd yd3 = (yd)((Map.Entry)object).getValue();
        object = this.a;
        return yd3.b.parse(object);
    }
}

