/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.De;
import io.appmetrica.analytics.impl.aa;
import io.appmetrica.analytics.impl.ja;
import java.lang.reflect.Field;
import kotlin.r;
import kotlin.text.d;
import org.json.JSONObject;

public final class Ce {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final aa a(Ce object, ja ja4, Object object2) {
        object.getClass();
        object = new aa();
        int n10 = ja4.ordinal();
        int n13 = 0;
        switch (n10) {
            default: {
                throw new r();
            }
            case 6: {
                n10 = 6;
                break;
            }
            case 5: {
                n10 = 5;
                break;
            }
            case 4: {
                n10 = 4;
                break;
            }
            case 3: {
                n10 = 3;
                break;
            }
            case 2: {
                n10 = 2;
                break;
            }
            case 1: {
                n10 = 1;
                break;
            }
            case 0: {
                n10 = 0;
            }
        }
        ((aa)object).a = n10;
        De.b.getClass();
        ja4 = new JSONObject();
        Field[] fieldArray = object2.getClass().getFields();
        int n14 = fieldArray.length;
        n10 = n13;
        while (true) {
            if (n10 >= n14) {
                ((aa)object).b = ja4.toString().getBytes(d.b);
                return object;
            }
            Field field = fieldArray[n10];
            try {
                ja4.put(field.getName(), field.get(object2));
            }
            catch (Throwable throwable) {}
            ++n10;
        }
    }
}

