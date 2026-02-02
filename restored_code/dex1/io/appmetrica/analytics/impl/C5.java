/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.jvm.functions.l
 *  kotlin.jvm.internal.a0
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;
import kotlin.jvm.functions.l;
import kotlin.jvm.internal.a0;

public final class C5
extends a0
implements l {
    public static final C5 a = new C5();

    public C5() {
        super(1);
    }

    public final Object invoke(Object object) {
        return ((IExecutionPolicy)object).description();
    }
}

