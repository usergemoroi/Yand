/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.impl.Sl;
import java.util.AbstractMap;
import java.util.HashMap;

public final class Ul
extends HashMap {
    public Ul() {
        ((AbstractMap)this).put(Sl.b, StartupParamsCallback.Reason.UNKNOWN);
        ((AbstractMap)this).put(Sl.c, StartupParamsCallback.Reason.NETWORK);
        ((AbstractMap)this).put(Sl.d, StartupParamsCallback.Reason.INVALID_RESPONSE);
    }
}

