/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.impl.A5;
import io.appmetrica.analytics.impl.M4;
import io.appmetrica.analytics.impl.Na;
import io.appmetrica.analytics.impl.S9;
import io.appmetrica.analytics.impl.Uh;
import io.appmetrica.analytics.impl.d7;
import io.appmetrica.analytics.impl.j0;
import io.appmetrica.analytics.impl.o5;
import io.appmetrica.analytics.impl.om;
import io.appmetrica.analytics.impl.t5;
import io.appmetrica.analytics.impl.v5;

public final class Zh
extends v5 {
    public final String w;
    public final d7 x;

    public Zh(@NonNull Context context, @NonNull o5 o54, @NonNull M4 m44, @NonNull d7 d72, @NonNull om om3, @NonNull t5 t54, @NonNull S9 s92) {
        this(context, o54, new j0(), new TimePassedChecker(), new A5(context, o54, m44, t54, om3, new Uh(d72), Na.j().w().d(), PackageManagerUtils.getAppVersionCodeInt(context), Na.j().k(), s92), d72, m44);
    }

    public Zh(Context context, o5 o54, j0 j04, TimePassedChecker timePassedChecker, A5 a52, d7 d72, M4 m44) {
        super(context, o54, j04, timePassedChecker, a52, m44);
        this.w = o54.b();
        this.x = d72;
    }

    @Override
    public final void a(@NonNull M4 m44) {
        synchronized (this) {
            super.a(m44);
            this.x.a(this.w, m44.i);
            return;
        }
    }
}

