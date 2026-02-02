/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.Fo;
import io.appmetrica.analytics.impl.Ho;
import kotlin.jvm.internal.y;
import org.json.JSONObject;

public final class Eo {
    public final Ho a;
    public final Ho b;
    public final Fo c;
    public JSONObject d;

    public Eo(Ho ho3, Ho ho4, Fo fo3) {
        this.a = ho3;
        this.b = ho4;
        this.c = fo3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static JSONObject a(Ho ho3) {
        String string2;
        try {
            string2 = ho3.a();
            if (string2 == null) return new JSONObject();
        }
        catch (Throwable throwable) {
            return new JSONObject();
        }
        return new JSONObject(string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final JSONObject a() {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                JSONObject jSONObject;
                JSONObject jSONObject2;
                block3: {
                    try {
                        if (this.d != null) break block3;
                        jSONObject2 = Eo.a(this.a);
                        jSONObject = Eo.a(this.b);
                        this.d = jSONObject2 = this.c.a(jSONObject2, jSONObject);
                        this.a(jSONObject2);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                jSONObject2 = jSONObject = this.d;
                if (jSONObject != null) return jSONObject2;
                y.B("fileContents");
                return null;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(JSONObject object) {
        synchronized (this) {
            String string2 = object.toString();
            Ho ho3 = this.a;
            try {
                ho3.a(string2);
            }
            catch (Throwable throwable) {}
            ho3 = this.b;
            try {
                ho3.a(string2);
            }
            catch (Throwable throwable) {}
            return;
        }
    }
}

