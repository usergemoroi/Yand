/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.model.ScreenInfo;
import io.appmetrica.analytics.impl.ro;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class Gb {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Integer a(JSONObject jSONObject, String string2, Integer n10) {
        Integer n13 = n10;
        if (jSONObject == null) return n13;
        n13 = n10;
        if (!jSONObject.has(string2)) return n13;
        try {
            return jSONObject.getInt(string2);
        }
        catch (Throwable throwable) {
            return n10;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String a(ScreenInfo object) {
        Object var1_2 = null;
        if (object == null) {
            object = null;
        } else {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("width", ((ScreenInfo)object).getWidth()).put("height", ((ScreenInfo)object).getHeight()).put("dpi", ((ScreenInfo)object).getDpi()).put("scaleFactor", (double)((ScreenInfo)object).getScaleFactor());
                object = jSONObject;
            }
            catch (Throwable throwable) {
                object = jSONObject;
            }
        }
        if (object != null) return object.toString();
        return var1_2;
    }

    public static String a(HashMap hashMap) {
        if (hashMap == null) {
            return null;
        }
        if (hashMap.isEmpty()) {
            return "";
        }
        return Gb.b(hashMap);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String a(Map object) {
        if (object == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            Iterator iterator = object.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry entry = iterator.next();
                object = (List)entry.getValue();
                object = ro.a((Collection)object) ? null : new JSONArray((Collection)object);
                if (object == null) continue;
                jSONObject.put((String)entry.getKey(), (Object)object.toString());
            }
            return jSONObject.toString();
        }
        catch (Throwable throwable) {
            return jSONObject.toString();
        }
    }

    public static ArrayList a(JSONArray jSONArray) {
        ArrayList<String> arrayList;
        if (jSONArray != null && jSONArray.length() > 0) {
            ArrayList<String> arrayList2 = new ArrayList<String>(jSONArray.length());
            int n10 = 0;
            while (true) {
                arrayList = arrayList2;
                if (n10 < jSONArray.length()) {
                    arrayList2.add(jSONArray.getString(n10));
                    ++n10;
                    continue;
                }
                break;
            }
        } else {
            arrayList = null;
        }
        return arrayList;
    }

    public static HashMap a(String string2) {
        if (string2 == null) {
            return null;
        }
        if (string2.isEmpty()) {
            return new HashMap();
        }
        return Gb.c(string2);
    }

    public static String b(Map map2) {
        if (ro.a(map2)) {
            return null;
        }
        return new JSONObject(map2).toString();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ArrayList b(String arrayList) {
        int n10;
        ArrayList<String> arrayList2;
        JSONArray jSONArray;
        if (TextUtils.isEmpty(arrayList)) return null;
        try {
            jSONArray = new JSONArray(arrayList);
            arrayList2 = new ArrayList<String>(jSONArray.length());
            n10 = 0;
        }
        catch (Throwable throwable) {}
        return null;
        while (true) {
            arrayList = arrayList2;
            try {
                if (n10 >= jSONArray.length()) return arrayList;
                arrayList2.add(jSONArray.getString(n10));
                ++n10;
            }
            catch (Throwable throwable) {
                return arrayList2;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static HashMap c(String object) {
        if (TextUtils.isEmpty((CharSequence)object)) return null;
        try {
            JSONObject jSONObject = new JSONObject((String)object);
            HashMap<String, String> hashMap = new HashMap<String, String>();
            if (JSONObject.NULL.equals(jSONObject)) return hashMap;
            object = jSONObject.keys();
            while (object.hasNext()) {
                String string2 = (String)object.next();
                hashMap.put(string2, jSONObject.optString(string2));
            }
            return hashMap;
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    public static HashMap d(String object) {
        JSONObject jSONObject = new JSONObject((String)object);
        object = new HashMap();
        if (!JSONObject.NULL.equals(jSONObject)) {
            Iterator iterator = jSONObject.keys();
            while (iterator.hasNext()) {
                String string2 = (String)iterator.next();
                ((HashMap)object).put(string2, jSONObject.optString(string2));
            }
        }
        return object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static ScreenInfo e(String object) {
        try {
            if (TextUtils.isEmpty((CharSequence)object)) return null;
            JSONObject jSONObject = new JSONObject((String)object);
            return new ScreenInfo(jSONObject.optInt("width"), jSONObject.optInt("height"), jSONObject.optInt("dpi"), (float)jSONObject.optDouble("scaleFactor", 0.0));
        }
        catch (Throwable throwable) {
            return null;
        }
    }
}

