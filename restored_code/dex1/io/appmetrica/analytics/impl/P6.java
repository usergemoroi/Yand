/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.impl.Wf;
import io.appmetrica.analytics.impl.Xf;
import io.appmetrica.analytics.impl.Yf;

public final class P6 {
    public static Wf a() {
        Wf wf3 = AndroidUtils.isApiAchieved(28) ? new Yf() : new Xf();
        return wf3;
    }
}

