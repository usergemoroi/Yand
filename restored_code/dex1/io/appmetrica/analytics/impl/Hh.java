/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;
import io.appmetrica.analytics.impl.Aj;
import io.appmetrica.analytics.impl.Gb;
import io.appmetrica.analytics.impl.Kj;
import io.appmetrica.analytics.impl.Lj;
import io.appmetrica.analytics.impl.M4;
import io.appmetrica.analytics.impl.N4;
import io.appmetrica.analytics.impl.Na;
import io.appmetrica.analytics.impl.g4;
import io.appmetrica.analytics.impl.im;
import io.appmetrica.analytics.impl.lk;
import io.appmetrica.analytics.impl.o4;
import io.appmetrica.analytics.impl.o6;
import io.appmetrica.analytics.impl.z4;

public final class Hh
implements Runnable {
    public final Context a;
    public final o6 b;
    public final Bundle c;
    public final z4 d;

    public Hh(Context context, o6 o63, Bundle bundle, z4 z42) {
        this.a = context;
        this.b = o63;
        this.c = bundle;
        this.d = z42;
    }

    @Override
    public final void run() {
        Object object;
        block3: {
            object = g4.a(this.a, this.c);
            if (object != null) break block3;
            return;
        }
        try {
            o4 o44 = o4.a((g4)object);
            Object object2 = Na.F.u();
            ((Aj)object2).a(((g4)object).b.getAppVersion(), ((g4)object).b.getAppBuildNumber());
            ((Aj)object2).a(((g4)object).b.getDeviceType());
            im im3 = new im((g4)object);
            object2 = new M4(((g4)object).b, Gb.c(((g4)object).a.a.getAsString("PROCESS_CFG_CLIDS")));
            N4 n42 = new N4(im3, (M4)object2, ((g4)object).a.b);
            this.d.a(o44, n42).a(this.b, n42);
        }
        catch (Throwable throwable) {
            object = Kj.a;
            CharSequence charSequence = new StringBuilder("Exception during processing event with type: ");
            charSequence.append(this.b.d);
            charSequence.append(" (");
            charSequence.append(this.b.e);
            charSequence.append("): ");
            charSequence.append(throwable.getMessage());
            charSequence = charSequence.toString();
            object.getClass();
            ((lk)object).a(new Lj((String)charSequence, throwable));
        }
    }
}

