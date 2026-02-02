/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.aa;
import io.appmetrica.analytics.impl.ja;
import kotlin.r;
import kotlin.text.d;
import org.json.JSONObject;

public final class Db {
    public static final aa a(Db object, ja ja4, JSONObject jSONObject) {
        int n10;
        object.getClass();
        object = new aa();
        switch (ja4.ordinal()) {
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
        ((aa)object).b = jSONObject.toString().getBytes(d.b);
        return object;
    }
}

