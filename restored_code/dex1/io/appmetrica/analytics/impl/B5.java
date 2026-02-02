/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.impl.N4;
import io.appmetrica.analytics.impl.gb;
import io.appmetrica.analytics.impl.m8;
import io.appmetrica.analytics.impl.o5;
import java.util.HashMap;

public final class B5 {
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final Context c;

    public B5(Context context) {
        this.c = context.getApplicationContext();
    }

    public final gb a(o5 object, N4 object2, m8 m82, HashMap hashMap) {
        gb gb4 = (gb)hashMap.get(((o5)object).toString());
        if (gb4 == null) {
            object2 = m82.a(this.c, (o5)object, (N4)object2);
            hashMap.put(((o5)object).toString(), object2);
            object = object2;
        } else {
            gb4.a((N4)object2);
            object = gb4;
        }
        return object;
    }
}

