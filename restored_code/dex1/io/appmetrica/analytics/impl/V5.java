/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.impl.U7;
import io.appmetrica.analytics.impl.l7;
import io.appmetrica.analytics.impl.pn;
import io.appmetrica.analytics.impl.v7;

public abstract class V5 {
    public static final Boolean a = Boolean.FALSE;
    public static final int b = AppMetrica.getLibraryApiLevel();
    public static final l7 c = new l7(new v7(), new U7(), new pn());

    public static l7 a() {
        return c;
    }
}

