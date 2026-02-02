/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import java.util.HashMap;

public final class Be {
    public final HashMap a;

    public Be() {
        HashMap<String, String> hashMap;
        this.a = hashMap = new HashMap<String, String>();
        hashMap.put("google_aid", "g");
        hashMap.put("huawei_oaid", "h");
        hashMap.put("sim_info", "si");
        hashMap.put("features_collecting", "fc");
        hashMap.put("permissions_collecting", "pc");
        hashMap.put("retry_policy", "rp");
        hashMap.put("cache_control", "cc");
        hashMap.put("auto_inapp_collecting", "aic");
        hashMap.put("attribution", "at");
        hashMap.put("startup_update", "su");
        hashMap.put("ssl_pinning", "sp");
        hashMap.put("external_attribution", "exta");
    }

    public final String a(String string2) {
        String string3 = string2;
        if (this.a.containsKey(string2)) {
            string3 = (String)this.a.get(string2);
        }
        return string3;
    }
}

