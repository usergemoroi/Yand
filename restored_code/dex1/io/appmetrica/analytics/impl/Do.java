/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.impl.Eo;
import io.appmetrica.analytics.impl.Gb;
import io.appmetrica.analytics.impl.Ho;
import io.appmetrica.analytics.impl.fp;
import io.appmetrica.analytics.impl.qf;
import org.json.JSONObject;

public final class Do {
    public final Eo a;

    public Do(qf qf3, Ho ho3, String string2) {
        this.a = new Eo(qf3, ho3, new fp());
    }

    public static final JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3 = new JSONObject();
        Comparable<Boolean> comparable = Boolean.FALSE;
        jSONObject3.put("first_event_done", (Object)JsonUtils.optBooleanOrNullable(jSONObject2, "first_event_done", JsonUtils.optBooleanOrNullable(jSONObject, "first_event_done", comparable)));
        jSONObject3.put("init_event_done", (Object)JsonUtils.optBooleanOrNullable(jSONObject2, "init_event_done", JsonUtils.optBooleanOrNullable(jSONObject, "init_event_done", comparable)));
        jSONObject3.put("report_request_id", (Object)Gb.a(jSONObject2, "report_request_id", Gb.a(jSONObject, "report_request_id", -1)));
        jSONObject3.put("global_number", (Object)JsonUtils.optLongOrDefault(jSONObject2, "global_number", JsonUtils.optLongOrDefault(jSONObject, "global_number", 0L)));
        Long l10 = -1L;
        jSONObject3.put("session_id", (Object)JsonUtils.optLongOrDefault(jSONObject2, "session_id", JsonUtils.optLongOrDefault(jSONObject, "session_id", l10)));
        jSONObject3.put("referrer_handled", (Object)JsonUtils.optBooleanOrNullable(jSONObject2, "referrer_handled", JsonUtils.optBooleanOrNullable(jSONObject, "referrer_handled", comparable)));
        jSONObject3.put("numbers_of_type", (Object)JsonUtils.optJsonObjectOrNullable(jSONObject2, "numbers_of_type", JsonUtils.optJsonObjectOrNull(jSONObject, "numbers_of_type")));
        comparable = 1;
        jSONObject3.put("open_id", (Object)Gb.a(jSONObject2, "open_id", Gb.a(jSONObject, "open_id", (Integer)comparable)));
        jSONObject3.put("attribution_id", (Object)Gb.a(jSONObject2, "attribution_id", Gb.a(jSONObject, "attribution_id", (Integer)comparable)));
        jSONObject3.put("last_migration_api_level", (Object)Gb.a(jSONObject2, "last_migration_api_level", Gb.a(jSONObject, "last_migration_api_level", 0)));
        jSONObject3.put("external_attribution_window_start", (Object)JsonUtils.optLongOrDefault(jSONObject2, "external_attribution_window_start", JsonUtils.optLongOrDefault(jSONObject, "external_attribution_window_start", l10)));
        return jSONObject3;
    }

    public final int a() {
        synchronized (this) {
            int n10 = this.a.a().optInt("attribution_id", 1);
            return n10;
        }
    }

    public final void a(int n10) {
        synchronized (this) {
            Eo eo3 = this.a;
            eo3.a(eo3.a().put("attribution_id", n10));
            return;
        }
    }

    public final void a(long l10) {
        synchronized (this) {
            Eo eo3 = this.a;
            eo3.a(eo3.a().put("external_attribution_window_start", l10));
            return;
        }
    }

    public final void a(JSONObject jSONObject) {
        synchronized (this) {
            Eo eo3 = this.a;
            eo3.a(eo3.a().put("numbers_of_type", (Object)jSONObject));
            return;
        }
    }

    public final int b() {
        synchronized (this) {
            int n10 = this.a.a().optInt("open_id", 1);
            return n10;
        }
    }

    public final void b(int n10) {
        synchronized (this) {
            Eo eo3 = this.a;
            eo3.a(eo3.a().put("last_migration_api_level", n10));
            return;
        }
    }

    public final void b(long l10) {
        synchronized (this) {
            Eo eo3 = this.a;
            eo3.a(eo3.a().put("global_number", l10));
            return;
        }
    }

    public final void c(int n10) {
        synchronized (this) {
            Eo eo3 = this.a;
            eo3.a(eo3.a().put("open_id", n10));
            return;
        }
    }

    public final void c(long l10) {
        synchronized (this) {
            Eo eo3 = this.a;
            eo3.a(eo3.a().put("session_id", l10));
            return;
        }
    }

    public final boolean c() {
        synchronized (this) {
            boolean bl2 = this.a.a().optBoolean("first_event_done", false);
            return bl2;
        }
    }

    public final boolean d() {
        synchronized (this) {
            boolean bl2 = this.a.a().optBoolean("init_event_done", false);
            return bl2;
        }
    }
}

