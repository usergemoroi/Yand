/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.Gb;
import java.util.ArrayList;
import java.util.HashSet;
import org.json.JSONObject;

public final class Xa {
    public static final HashSet a;

    static {
        HashSet<String> hashSet;
        a = hashSet = new HashSet<String>();
        hashSet.add("get_ad");
        hashSet.add("report");
        hashSet.add("report_ad");
        hashSet.add("startup");
        hashSet.add("diagnostic");
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ArrayList a(JSONObject object, String string2) {
        void var0_5;
        try {
            void var1_7;
            JSONObject jSONObject = object.optJSONObject((String)var1_7);
            if (jSONObject != null) {
                ArrayList arrayList = Gb.a(jSONObject.getJSONArray("urls"));
                return var0_5;
            }
        }
        catch (Throwable throwable) {}
        Object var0_4 = null;
        return var0_5;
    }
}

