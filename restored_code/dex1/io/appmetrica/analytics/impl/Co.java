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
import io.appmetrica.analytics.impl.Ba;
import io.appmetrica.analytics.impl.Eo;
import io.appmetrica.analytics.impl.Gb;
import io.appmetrica.analytics.impl.Jg;
import io.appmetrica.analytics.impl.dp;
import io.appmetrica.analytics.impl.tf;
import kotlin.text.d;
import org.json.JSONObject;

public final class Co {
    public final Eo a;

    public Co(tf tf2, Ba ba4) {
        this.a = new Eo(tf2, ba4, new dp());
    }

    public static final JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("device_id", (Object)JsonUtils.optStringOrNullable(jSONObject2, "device_id", JsonUtils.optStringOrNull(jSONObject, "device_id")));
        jSONObject3.put("device_id_hash", (Object)JsonUtils.optStringOrNullable(jSONObject2, "device_id_hash", JsonUtils.optStringOrNull(jSONObject, "device_id_hash")));
        jSONObject3.put("referrer", (Object)JsonUtils.optStringOrNullable(jSONObject2, "referrer", JsonUtils.optStringOrNull(jSONObject, "referrer")));
        jSONObject3.put("referrer_checked", (Object)JsonUtils.optBooleanOrNullable(jSONObject2, "referrer_checked", JsonUtils.optBooleanOrNullable(jSONObject, "referrer_checked", Boolean.FALSE)));
        jSONObject3.put("last_migration_api_level", (Object)Gb.a(jSONObject2, "last_migration_api_level", Gb.a(jSONObject, "last_migration_api_level", -1)));
        return jSONObject3;
    }

    public final String a() {
        synchronized (this) {
            String string2 = JsonUtils.optStringOrNull(this.a.a(), "device_id_hash");
            return string2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(Jg object) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                JSONObject jSONObject;
                Eo eo3;
                block4: {
                    block3: {
                        try {
                            eo3 = this.a;
                            jSONObject = eo3.a();
                            if (object == null) break block3;
                            String string2 = new String(Base64.encode((byte[])((Jg)object).a(), (int)0), d.b);
                            object = string2;
                            break block4;
                        }
                        catch (Throwable throwable2) {
                            break block5;
                        }
                    }
                    object = null;
                }
                eo3.a(jSONObject.put("referrer", object));
                return;
            }
            throw throwable2;
        }
    }

    public final void a(String string2) {
        synchronized (this) {
            Eo eo3 = this.a;
            eo3.a(eo3.a().put("device_id", (Object)string2));
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Jg b() {
        synchronized (this) {
            Object object = JsonUtils.optStringOrNull(this.a.a(), "referrer");
            if (object == null) return null;
            try {
                object = Base64.decode((byte[])((String)object).getBytes(d.b), (int)0);
                if (object == null) return null;
                if (((Object)object).length != 0) return new Jg((byte[])object);
                return null;
            }
            catch (Throwable throwable) {}
            return null;
        }
    }

    public final void b(String string2) {
        synchronized (this) {
            Eo eo3 = this.a;
            eo3.a(eo3.a().put("device_id_hash", (Object)string2));
            return;
        }
    }

    public final boolean c() {
        synchronized (this) {
            boolean bl2 = this.a.a().optBoolean("referrer_checked", false);
            return bl2;
        }
    }

    public final void d() {
        synchronized (this) {
            Eo eo3 = this.a;
            eo3.a(eo3.a().put("referrer_checked", true));
            return;
        }
    }
}

