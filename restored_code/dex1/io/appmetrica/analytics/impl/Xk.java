/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.impl.Sk;
import io.appmetrica.analytics.impl.Uk;
import io.appmetrica.analytics.impl.Wk;
import io.appmetrica.analytics.impl.o5;
import io.appmetrica.analytics.impl.y7;
import java.util.Map;

public final class Xk {
    public final String a;
    public final Sk b;
    public final Wk c;
    public final IBinaryDataHelper d;

    public Xk(Context context, o5 o54) {
        o54.a();
        this.a = "session_extras";
        this.b = new Sk();
        this.c = new Wk();
        this.d = y7.a(context).a(o54);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Map a() {
        Object object;
        block3: {
            try {
                boolean bl2;
                object = this.d.get(this.a);
                if (object == null || !((bl2 = ((byte[])object).length == 0) ^ true)) break block3;
                return this.b.a(this.c.a((byte[])object));
            }
            catch (Throwable throwable) {}
        }
        object = this.b;
        this.c.getClass();
        return ((Sk)object).a(new Uk());
    }
}

