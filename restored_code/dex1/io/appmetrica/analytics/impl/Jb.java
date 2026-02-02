/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Base64
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package io.appmetrica.analytics.impl;

import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.impl.Gb;
import io.appmetrica.analytics.impl.Vf;
import io.appmetrica.analytics.impl.g4;
import io.appmetrica.analytics.impl.k4;
import io.appmetrica.analytics.impl.o6;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class Jb {
    public final byte[] a;
    public final String b;
    public final int c;
    public final HashMap d;
    public final String e;
    public final Integer f;
    public final String g;
    public final String h;
    public final CounterConfigurationReporterType i;
    public final String j;

    public Jb(@NonNull o6 o63, @NonNull g4 object, @Nullable HashMap<k4, Integer> object2) {
        this.a = o63.getValueBytes();
        this.b = o63.getName();
        this.c = o63.getBytesTruncated();
        this.d = object2 != null ? object2 : new HashMap();
        object2 = ((g4)object).a();
        this.e = ((Vf)object2).e();
        this.f = ((Vf)object2).f();
        this.g = ((Vf)object2).g();
        object = ((g4)object).b();
        this.h = ((CounterConfiguration)object).getApiKey();
        this.i = ((CounterConfiguration)object).getReporterType();
        this.j = o63.f();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Jb(@NonNull String string2) throws JSONException {
        string2 = new JSONObject(string2);
        Object object = string2.getJSONObject("event");
        this.a = Base64.decode((String)object.getString("jvm_crash"), (int)0);
        this.b = object.getString("name");
        this.c = object.getInt("bytes_truncated");
        this.j = JsonUtils.optStringOrNull((JSONObject)object, "environment");
        object = object.optString("trimmed_fields");
        this.d = new HashMap();
        if (object != null) {
            try {
                object = Gb.c((String)object);
                if (object != null) {
                    for (Map.Entry entry : ((HashMap)object).entrySet()) {
                        this.d.put(k4.valueOf((String)entry.getKey()), Integer.parseInt((String)entry.getValue()));
                    }
                }
            }
            catch (Throwable throwable) {}
        }
        object = string2.getJSONObject("process_configuration");
        this.e = object.getString("package_name");
        this.f = object.getInt("pid");
        this.g = object.getString("psid");
        string2 = string2.getJSONObject("reporter_configuration");
        this.h = string2.getString("api_key");
        this.i = Jb.a((JSONObject)string2);
    }

    public static CounterConfigurationReporterType a(JSONObject jSONObject) {
        if (jSONObject.has("reporter_type")) {
            return CounterConfigurationReporterType.fromStringValue(jSONObject.getString("reporter_type"));
        }
        return CounterConfigurationReporterType.MAIN;
    }

    public final String a() {
        return this.h;
    }

    public final int b() {
        return this.c;
    }

    public final byte[] c() {
        return this.a;
    }

    @Nullable
    public final String d() {
        return this.j;
    }

    public final String e() {
        return this.b;
    }

    public final String f() {
        return this.e;
    }

    public final Integer g() {
        return this.f;
    }

    public final String h() {
        return this.g;
    }

    @NonNull
    public final CounterConfigurationReporterType i() {
        return this.i;
    }

    @NonNull
    public final HashMap<k4, Integer> j() {
        return this.d;
    }

    public final String k() throws JSONException {
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        for (Map.Entry entry : this.d.entrySet()) {
            hashMap.put(((k4)((Object)entry.getKey())).name(), (Integer)entry.getValue());
        }
        return new JSONObject().put("process_configuration", (Object)new JSONObject().put("pid", (Object)this.f).put("psid", (Object)this.g).put("package_name", (Object)this.e)).put("reporter_configuration", (Object)new JSONObject().put("api_key", (Object)this.h).put("reporter_type", (Object)this.i.getStringValue())).put("event", (Object)new JSONObject().put("jvm_crash", (Object)Base64.encodeToString((byte[])this.a, (int)0)).put("name", (Object)this.b).put("bytes_truncated", this.c).put("trimmed_fields", (Object)Gb.b(hashMap)).putOpt("environment", (Object)this.j)).toString();
    }
}

