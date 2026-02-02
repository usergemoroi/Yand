/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 *  android.text.TextUtils
 *  org.json.JSONObject
 */
package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.parsing.ParseUtils;
import io.appmetrica.analytics.impl.Bj;
import io.appmetrica.analytics.impl.Kf;
import io.appmetrica.analytics.impl.X5;
import io.appmetrica.analytics.impl.q8;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

public final class Af
implements X5 {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Nullable
    public final Kf a(@NotNull ContentValues object) {
        Throwable throwable2;
        block6: {
            String string2 = object.getAsString("tracking_id");
            if (TextUtils.isEmpty((CharSequence)string2)) {
                Bj.a("Tracking id is empty", new Object[0]);
                return null;
            }
            if (ParseUtils.parseLong(string2) == null) {
                Bj.a("Tracking id from preload info content provider is not a number", new Object[0]);
                return null;
            }
            try {
                object = object.getAsString("additional_params");
                if (TextUtils.isEmpty((CharSequence)object)) {
                    Bj.a("No additional params", new Object[0]);
                    return null;
                }
            }
            catch (Throwable throwable2) {
                break block6;
            }
            JSONObject jSONObject = new JSONObject((String)object);
            if (jSONObject.length() == 0) {
                Bj.a("Additional params are empty", new Object[0]);
                return null;
            }
            Bj.a("Successfully parsed preload info. Tracking id = %s, additionalParams = %s", string2, jSONObject);
            return new Kf(string2, jSONObject, true, false, q8.e);
        }
        ImportantLogger importantLogger = ImportantLogger.INSTANCE;
        object = new StringBuilder();
        ((StringBuilder)object).append(String.format("Could not parse additional parameters", new Object[0]));
        ((StringBuilder)object).append("\n");
        ((StringBuilder)object).append(StringUtils.throwableToString(throwable2));
        importantLogger.info("AppMetrica-Attribution", ((StringBuilder)object).toString(), new Object[0]);
        return null;
    }
}

