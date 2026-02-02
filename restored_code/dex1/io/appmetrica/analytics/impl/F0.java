/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Base64
 *  org.json.JSONObject
 */
package io.appmetrica.analytics.impl;

import android.util.Base64;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.impl.E0;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import kotlin.text.d;
import org.json.JSONObject;

public final class F0 {
    public static E0 a(String object) {
        try {
            String string2 = new String(Base64.decode((String)object, (int)0), d.b);
            JSONObject jSONObject = new JSONObject(string2);
            object = new E0(jSONObject.getString("apiKey"), jSONObject.getString("packageName"), CounterConfigurationReporterType.Companion.fromStringValue(jSONObject.getString("reporterType")), jSONObject.getInt("processID"), jSONObject.getString("processSessionID"), JsonUtils.optStringOrNull(jSONObject, "errorEnvironment"));
        }
        catch (Throwable throwable) {
            object = null;
        }
        return object;
    }

    public static String a(E0 object) {
        try {
            JSONObject jSONObject = new JSONObject();
            object = Base64.encodeToString((byte[])jSONObject.put("apiKey", (Object)((E0)object).a).put("packageName", (Object)((E0)object).b).put("reporterType", (Object)((E0)object).c.getStringValue()).put("processID", ((E0)object).d).put("processSessionID", (Object)((E0)object).e).put("errorEnvironment", (Object)((E0)object).f).toString().getBytes(d.b), (int)0);
        }
        catch (Throwable throwable) {
            object = "";
        }
        return object;
    }
}

