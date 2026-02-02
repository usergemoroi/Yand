/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfo;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public abstract class U5 {
    public static final Map a;

    static {
        HashMap<String, AdTrackingInfo.Provider> hashMap = new HashMap<String, AdTrackingInfo.Provider>();
        hashMap.put("google", AdTrackingInfo.Provider.GOOGLE);
        hashMap.put("huawei", AdTrackingInfo.Provider.HMS);
        hashMap.put("yandex", AdTrackingInfo.Provider.YANDEX);
        a = Collections.unmodifiableMap(hashMap);
    }
}

