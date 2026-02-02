/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.Q5;
import io.appmetrica.analytics.impl.R5;
import io.appmetrica.analytics.impl.S5;
import io.appmetrica.analytics.impl.T5;
import java.util.HashMap;
import java.util.List;

public final class U7 {
    public final HashMap a;

    public U7() {
        HashMap<String, List> hashMap;
        this.a = hashMap = new HashMap<String, List>();
        hashMap.put("events", R5.a);
        hashMap.put("sessions", T5.a);
        hashMap.put("preferences", S5.a);
        hashMap.put("binary_data", Q5.a);
    }
}

