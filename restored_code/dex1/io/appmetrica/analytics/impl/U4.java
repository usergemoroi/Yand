/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.ResultReceiver
 */
package io.appmetrica.analytics.impl;

import android.os.ResultReceiver;
import io.appmetrica.analytics.impl.Bg;
import io.appmetrica.analytics.impl.Jg;
import io.appmetrica.analytics.impl.Pg;

public final class U4
implements Bg {
    public final ResultReceiver a;

    public U4(ResultReceiver resultReceiver) {
        this.a = resultReceiver;
    }

    @Override
    public final void a(Jg jg3) {
        Pg.a(this.a, jg3);
    }
}

