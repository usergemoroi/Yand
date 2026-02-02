/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.text.TextUtils
 */
package io.appmetrica.analytics.impl;

import android.net.Uri;
import android.text.TextUtils;
import io.appmetrica.analytics.impl.h8;
import java.util.HashMap;
import java.util.Iterator;

public final class Ng {
    public static h8 a(String string2) {
        String string3;
        HashMap<String, String> hashMap = Ng.b(string2);
        Object object = hashMap;
        if (hashMap.isEmpty()) {
            object = Ng.b(Uri.decode((String)string2));
        }
        if (!TextUtils.isEmpty((CharSequence)(string3 = Uri.decode((String)((String)object.get("appmetrica_deep_link")))))) {
            object = Ng.b(string3);
            hashMap = new HashMap<String, String>(((HashMap)object).size());
            Iterator iterator = ((HashMap)object).entrySet().iterator();
            while (true) {
                object = hashMap;
                if (iterator.hasNext()) {
                    object = iterator.next();
                    hashMap.put(Uri.decode((String)((String)object.getKey())), Uri.decode((String)((String)object.getValue())));
                    continue;
                }
                break;
            }
        } else {
            object = null;
        }
        return new h8(string3, (HashMap)object, string2);
    }

    public static HashMap b(String object2) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        if (object2 != null) {
            int n10 = ((String)object2).lastIndexOf(63);
            String[] stringArray = object2;
            if (n10 >= 0) {
                stringArray = ((String)object2).substring(n10 + 1);
            }
            if (stringArray.contains("=")) {
                for (String string2 : stringArray.split("&")) {
                    int n13 = string2.indexOf("=");
                    if (n13 >= 0) {
                        hashMap.put(string2.substring(0, n13), string2.substring(n13 + 1));
                        continue;
                    }
                    hashMap.put(string2, "");
                }
            }
        }
        return hashMap;
    }
}

