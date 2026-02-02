/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 */
package io.appmetrica.analytics.impl;

import android.os.Handler;
import io.appmetrica.analytics.impl.Bb;
import io.appmetrica.analytics.impl.Ob;
import io.appmetrica.analytics.impl.Si;
import io.appmetrica.analytics.impl.W9;
import io.appmetrica.analytics.impl.Y2;
import io.appmetrica.analytics.impl.bi;
import io.appmetrica.analytics.impl.l4;
import io.appmetrica.analytics.impl.o6;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.lang.ref.WeakReference;

public final class Pb
implements Runnable {
    public final WeakReference a;
    public final WeakReference b;

    public Pb(Handler handler, Y2 y23) {
        this.a = new WeakReference<Handler>(handler);
        this.b = new WeakReference<Y2>(y23);
    }

    @Override
    public final void run() {
        Handler handler = (Handler)this.a.get();
        Y2 y23 = (Y2)this.b.get();
        if (handler != null && y23 != null) {
            boolean bl2 = y23.b.f() ^ true;
            if (bl2) {
                Object object = y23.c;
                Object object2 = W9.a;
                object2 = Bb.c;
                object2 = new l4("", "", 3, 0, (PublicLogger)object);
                Si si3 = y23.h;
                object = y23.b;
                si3.getClass();
                si3.a(Si.a((o6)object2, (bi)object), (bi)object, 1, null);
            }
            if (bl2) {
                Ob.a(handler, y23, this);
            }
        }
    }
}

