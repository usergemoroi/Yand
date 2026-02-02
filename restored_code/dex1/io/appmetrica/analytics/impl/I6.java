/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.ICrashTransformer;
import io.appmetrica.analytics.impl.Fc;
import io.appmetrica.analytics.impl.H6;
import io.appmetrica.analytics.impl.U;
import io.appmetrica.analytics.impl.Wn;
import io.appmetrica.analytics.impl.Xh;
import io.appmetrica.analytics.impl.Zn;
import io.appmetrica.analytics.impl.co;
import io.appmetrica.analytics.impl.fb;
import io.appmetrica.analytics.impl.ma;

public abstract class I6
implements fb {
    public final H6 a;
    public final ICrashTransformer b;
    public final ma c;

    public I6(H6 h63, ICrashTransformer iCrashTransformer, ma ma2) {
        this.a = h63;
        this.b = iCrashTransformer;
        this.c = ma2;
    }

    @Nullable
    @VisibleForTesting
    public final ICrashTransformer a() {
        return this.b;
    }

    @Override
    public final void a(@Nullable Throwable object, @NonNull U object2) {
        if (this.a.a((Throwable)object)) {
            ICrashTransformer iCrashTransformer = this.b;
            Throwable throwable = object;
            if (iCrashTransformer != null) {
                throwable = object;
                if (object != null) {
                    object = iCrashTransformer.process((Throwable)object);
                    throwable = object;
                    if (object == null) {
                        return;
                    }
                }
            }
            object = Zn.a(throwable, (U)object2, null, (String)this.c.b.a(), (Boolean)this.c.c.a());
            object2 = (Fc)((Xh)this).d;
            ((co)object2).a.a().a(((Fc)object2).b).a((Wn)object);
        }
    }

    @VisibleForTesting
    public final H6 b() {
        return this.a;
    }
}

