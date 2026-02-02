/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.impl.Ba;
import io.appmetrica.analytics.impl.Co;
import io.appmetrica.analytics.impl.Na;
import io.appmetrica.analytics.impl.tf;
import io.appmetrica.analytics.impl.y7;
import java.util.LinkedHashMap;

public final class Go {
    public final Context a;
    public final LinkedHashMap b;
    public final Co c;
    public final Co d;

    public Go(Context context) {
        this.a = context;
        this.b = new LinkedHashMap();
        Ba ba4 = new Ba(context, "appmetrica_vital.dat");
        this.c = new Co(Na.j().x(), ba4);
        this.d = new Co(new tf(y7.a(context).d()), ba4);
    }

    public final Co a() {
        return this.c;
    }

    public final Co b() {
        return this.d;
    }
}

