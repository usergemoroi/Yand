/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.impl.Km;
import io.appmetrica.analytics.impl.Lm;
import io.appmetrica.analytics.impl.Ol;
import io.appmetrica.analytics.impl.Pa;
import io.appmetrica.analytics.impl.Pl;
import io.appmetrica.analytics.impl.Zl;
import io.appmetrica.analytics.impl.im;
import io.appmetrica.analytics.impl.o5;
import io.appmetrica.analytics.impl.om;
import java.util.HashMap;

public final class Ql {
    public final Pa a = new Pa();
    public final HashMap b = new HashMap();
    public om c = null;
    public final Ol d = new Ol(this);

    public static final Ql a() {
        return Pl.a;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Km a(Context context, o5 o54, im im3) {
        Km km3;
        boolean bl2;
        block7: {
            Object object = (Km)this.b.get(o54.a);
            bl2 = true;
            boolean bl3 = true;
            km3 = object;
            if (object == null) {
                HashMap hashMap = this.b;
                synchronized (hashMap) {
                    Throwable throwable2;
                    block6: {
                        block5: {
                            try {
                                object = (Km)this.b.get(o54.a);
                                km3 = object;
                                bl2 = bl3;
                                if (object != null) break block5;
                                object = new Lm(context, o54.a, im3, this.d);
                                km3 = new Km((Lm)object);
                                km3.f();
                                this.b.put(o54.a, km3);
                                bl2 = false;
                            }
                            catch (Throwable throwable2) {
                                break block6;
                            }
                        }
                        break block7;
                    }
                    throw throwable2;
                }
            }
        }
        if (bl2) {
            km3.a(im3);
        }
        return km3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(o5 object, Zl zl3) {
        HashMap hashMap = this.b;
        synchronized (hashMap) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        this.a.a(((o5)object).a, zl3);
                        object = this.c;
                        if (object == null) break block3;
                        zl3.a((om)object);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }
}

