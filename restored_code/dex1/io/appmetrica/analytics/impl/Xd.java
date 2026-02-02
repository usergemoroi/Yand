/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.impl.Bb;
import io.appmetrica.analytics.impl.D0;
import io.appmetrica.analytics.impl.E0;
import io.appmetrica.analytics.impl.M4;
import io.appmetrica.analytics.impl.N4;
import io.appmetrica.analytics.impl.W9;
import io.appmetrica.analytics.impl.ge;
import io.appmetrica.analytics.impl.im;
import io.appmetrica.analytics.impl.l4;
import io.appmetrica.analytics.impl.o4;
import io.appmetrica.analytics.impl.o6;
import io.appmetrica.analytics.impl.oh;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import org.jetbrains.annotations.NotNull;

public final class Xd
implements Consumer {
    public final oh a;
    public final E0 b;
    public final ge c;

    public Xd(@NotNull oh oh3, @NotNull E0 e03, @NotNull ge ge2) {
        this.a = oh3;
        this.b = e03;
        this.c = ge2;
    }

    public final void a(@NotNull String string2) {
        oh oh3 = this.a;
        Object object = this.b;
        Object object2 = ((E0)object).a;
        Object object3 = ((E0)object).b;
        int n10 = ((E0)object).d;
        object = this.b;
        object3 = new o4((String)object2, (String)object3, n10, ((E0)object).e, ((E0)object).c);
        object2 = this.c;
        Bb bb4 = ((ge)object2).b;
        Object object4 = ((ge)object2).a;
        object = ((D0)object4).c;
        PublicLogger publicLogger = LoggerStorage.getOrCreatePublicLogger(((D0)object4).f.a);
        object4 = W9.a;
        object4 = new Bundle();
        object4.putString("payload_crash_id", (String)object);
        object = new l4("", "", bb4.a, publicLogger);
        if (string2 != null) {
            ((l4)object).f(string2);
        }
        ((o6)object).m = object4;
        ((o6)object).c = ((ge)object2).a.f.f;
        oh3.a((o4)object3, (o6)object, new N4(new im(), new M4(), null));
    }
}

