/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.parsing.ParseUtils;
import io.appmetrica.analytics.impl.ro;
import java.util.HashMap;
import java.util.Map;

public abstract class Pm {
    public static String a(Map object) {
        if (!ro.a((Map)object)) {
            StringBuilder stringBuilder = new StringBuilder();
            for (Map.Entry entry : object.entrySet()) {
                stringBuilder.append((String)entry.getKey());
                stringBuilder.append(":");
                stringBuilder.append((String)entry.getValue());
                stringBuilder.append(",");
            }
            stringBuilder.setLength(stringBuilder.length() - 1);
            object = stringBuilder.toString();
        } else {
            object = "";
        }
        return object;
    }

    public static HashMap a(String stringArray) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        if (!TextUtils.isEmpty((CharSequence)stringArray)) {
            for (String string2 : stringArray.split(",")) {
                int n10 = string2.indexOf(":");
                if (n10 == -1) continue;
                hashMap.put(string2.substring(0, n10), string2.substring(n10 + 1));
            }
        }
        return hashMap;
    }

    public static boolean a(HashMap object) {
        if (object != null && !((HashMap)((Object)object)).isEmpty()) {
            for (Map.Entry entry : ((HashMap)((Object)object)).entrySet()) {
                try {
                    Integer.parseInt((String)entry.getValue());
                }
                catch (Throwable throwable) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static HashMap b(Map object) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        if (object != null) {
            for (Map.Entry entry : object.entrySet()) {
                String string2 = (String)entry.getKey();
                if (TextUtils.isEmpty((CharSequence)string2) || string2.contains(":") || string2.contains(",") || string2.contains("&") || TextUtils.isEmpty((CharSequence)(string2 = (String)entry.getValue())) || ParseUtils.parseLong(string2, -1L) == -1L) continue;
                hashMap.put((String)entry.getKey(), (String)entry.getValue());
            }
        }
        return hashMap;
    }
}

