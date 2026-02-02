/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  androidx.annotation.NonNull
 *  org.json.JSONObject
 */
package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.impl.Ff;
import io.appmetrica.analytics.impl.Jf;
import io.appmetrica.analytics.impl.Kf;
import org.json.JSONObject;

public final class Lf
implements ProtobufConverter {
    public final Jf a = new Jf();

    @NonNull
    public final Ff a(@NonNull Kf kf3) {
        Ff ff3 = new Ff();
        if (!TextUtils.isEmpty((CharSequence)kf3.a)) {
            ff3.a = kf3.a;
        }
        ff3.b = kf3.b.toString();
        ff3.c = kf3.c;
        ff3.d = kf3.d;
        ff3.e = this.a.a(kf3.e);
        return ff3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @NonNull
    public final Kf a(@NonNull Ff ff3) {
        JSONObject jSONObject;
        String string2 = ff3.a;
        String string3 = ff3.b;
        if (!TextUtils.isEmpty((CharSequence)string3)) {
            try {
                jSONObject = new JSONObject(string3);
                return new Kf(string2, jSONObject, ff3.c, ff3.d, this.a.a(ff3.e));
            }
            catch (Throwable throwable) {}
        }
        jSONObject = new JSONObject();
        return new Kf(string2, jSONObject, ff3.c, ff3.d, this.a.a(ff3.e));
    }
}

