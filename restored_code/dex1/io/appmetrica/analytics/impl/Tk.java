/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  kotlin.collections.s0
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.impl.Xk;
import io.appmetrica.analytics.impl.o5;
import java.util.Map;
import kotlin.collections.s0;

public final class Tk {
    public final Xk a;
    public final Map b;

    public Tk(Context object, o5 o54) {
        o54.a();
        object = new Xk((Context)object, o54);
        this.a = object;
        this.b = s0.C((Map)((Xk)object).a());
    }
}

