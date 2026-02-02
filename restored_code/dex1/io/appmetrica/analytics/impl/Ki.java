/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.impl.A4;
import io.appmetrica.analytics.impl.Ci;
import io.appmetrica.analytics.impl.Ii;
import io.appmetrica.analytics.impl.Ji;
import io.appmetrica.analytics.impl.Z9;
import io.appmetrica.analytics.impl.v0;
import io.appmetrica.analytics.impl.w0;
import java.util.HashMap;

public final class Ki {
    public final HashMap a = new HashMap();
    public final w0 b;

    public Ki(w0 w04) {
        this.b = w04;
    }

    public static Ki a() {
        return Ji.a;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Ci a(Context context, String string2) {
        Object object;
        Object object2 = object = (Ci)this.a.get(string2);
        if (object != null) return object2;
        HashMap hashMap = this.a;
        synchronized (hashMap) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        object2 = object = (Ci)this.a.get(string2);
                        if (object != null) return object2;
                        object2 = A4.l().c.a();
                        this.b.getClass();
                        if (v0.e != null) break block3;
                        object = new Ii(this, context);
                        ((Z9)object2).b.post((Runnable)object);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                context = context.getApplicationContext();
                object = new w0();
                object2 = new Ci(context, string2, (w0)object);
                this.a.put(string2, object2);
                ((Ci)object2).d(string2);
                return object2;
            }
            throw throwable2;
        }
    }
}

