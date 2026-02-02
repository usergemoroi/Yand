/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  org.json.JSONObject
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.impl.q8;
import io.appmetrica.analytics.impl.r8;
import kotlin.jvm.internal.y;
import org.json.JSONObject;

public final class Kf
implements r8 {
    @Nullable
    public final String a;
    @NonNull
    public final JSONObject b;
    public final boolean c;
    public final boolean d;
    @NonNull
    public final q8 e;

    public Kf(@Nullable String string2, @NonNull JSONObject jSONObject, boolean bl2, boolean bl3, @NonNull q8 q84) {
        this.a = string2;
        this.b = jSONObject;
        this.c = bl2;
        this.d = bl3;
        this.e = q84;
    }

    /*
     * WARNING - void declaration
     */
    @NonNull
    public static Kf a(@Nullable JSONObject object2) {
        void var0_6;
        void var0_4;
        boolean bl2;
        boolean bl3;
        JSONObject jSONObject;
        String string2;
        block3: {
            string2 = JsonUtils.optStringOrNull((JSONObject)object2, "trackingId");
            jSONObject = JsonUtils.optJsonObjectOrDefault((JSONObject)object2, "additionalParams", new JSONObject());
            bl3 = JsonUtils.optBooleanOrDefault((JSONObject)object2, "wasSet", false);
            bl2 = JsonUtils.optBooleanOrDefault((JSONObject)object2, "autoTracking", false);
            String string3 = JsonUtils.optStringOrNull((JSONObject)object2, "source");
            for (q8 q84 : q8.values()) {
                if (!y.e(q84.a, string3)) {
                    continue;
                }
                break block3;
            }
            Object var0_3 = null;
        }
        if (var0_4 == null) {
            q8 q85 = q8.b;
        }
        return new Kf(string2, jSONObject, bl3, bl2, (q8)var0_6);
    }

    @Override
    @NonNull
    public final q8 a() {
        return this.e;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Nullable
    public final JSONObject b() {
        if (!this.c) return null;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("trackingId", (Object)this.a);
            JSONObject jSONObject2 = jSONObject;
            if (this.b.length() <= 0) return jSONObject2;
            jSONObject.put("additionalParams", (Object)this.b);
        }
        finally {
            return jSONObject;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @NonNull
    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("trackingId", (Object)this.a);
            jSONObject.put("additionalParams", (Object)this.b);
            jSONObject.put("wasSet", this.c);
            jSONObject.put("autoTracking", this.d);
            jSONObject.put("source", (Object)this.e.a);
            return jSONObject;
        }
        catch (Throwable throwable) {
            return jSONObject;
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("PreloadInfoState{trackingId='");
        stringBuilder.append(this.a);
        stringBuilder.append("', additionalParameters=");
        stringBuilder.append(this.b);
        stringBuilder.append(", wasSet=");
        stringBuilder.append(this.c);
        stringBuilder.append(", autoTrackingEnabled=");
        stringBuilder.append(this.d);
        stringBuilder.append(", source=");
        stringBuilder.append((Object)this.e);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

