/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;

public abstract class Bj {
    public static String a() {
        StringBuilder stringBuilder = new StringBuilder("public");
        if (!TextUtils.isEmpty((CharSequence)"binary")) {
            stringBuilder.append("_binary");
        }
        if (!TextUtils.isEmpty((CharSequence)"")) {
            stringBuilder.append("_");
        }
        return stringBuilder.toString();
    }

    public static void a(String string2, Object ... objectArray) {
        ImportantLogger.INSTANCE.info("AppMetrica-Attribution", String.format(string2, objectArray), new Object[0]);
    }
}

