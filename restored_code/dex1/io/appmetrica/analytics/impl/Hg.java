/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.impl.Ag;
import io.appmetrica.analytics.impl.Co;
import io.appmetrica.analytics.impl.Jg;
import io.appmetrica.analytics.impl.Lg;
import io.appmetrica.analytics.impl.Na;
import io.appmetrica.analytics.impl.Og;
import io.appmetrica.analytics.impl.Rg;
import io.appmetrica.analytics.impl.Sg;
import io.appmetrica.analytics.impl.Za;
import io.appmetrica.analytics.impl.ob;
import java.util.HashSet;
import java.util.Iterator;

public final class Hg {
    public final HashSet a = new HashSet();
    public Jg b;
    public boolean c;
    public final Co d;
    public final Context e;

    public Hg(Context context, Co co3) {
        this.e = context;
        this.d = co3;
        this.b = co3.b();
        this.c = co3.c();
    }

    public final void a() {
        if (!this.c) {
            Object object = this.e;
            ob ob3 = Rg.a((Context)object, Na.F.d.a());
            object = (Og)new Ag((Hg)this, (Rg)new Rg((ob)ob3), (Za)new Za((Context)object), (Sg)new Sg((Context)object)).f.getValue();
            try {
                ob3.a((Og)object);
            }
            catch (Throwable throwable) {
                object.a(throwable);
            }
        }
    }

    public final void a(Jg jg3) {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                try {
                    Iterator iterator = this.a.iterator();
                    while (iterator.hasNext()) {
                        ((Lg)iterator.next()).a(jg3);
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                return;
            }
            throw throwable2;
        }
    }

    public final void a(Lg lg2) {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        this.a.add(lg2);
                        if (!this.c) break block3;
                        lg2.a(this.b);
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

