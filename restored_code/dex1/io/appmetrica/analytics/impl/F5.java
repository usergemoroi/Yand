/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.jvm.functions.l
 *  kotlin.jvm.internal.a0
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor;
import kotlin.jvm.functions.l;
import kotlin.jvm.internal.a0;

public final class F5
extends a0
implements l {
    public static final F5 a = new F5();

    public F5() {
        super(1);
    }

    public final Object invoke(Object object) {
        return ((ModuleAdRevenueProcessor)object).getDescription();
    }
}

