/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.impl.Gh;
import io.appmetrica.analytics.impl.Qi;
import io.appmetrica.analytics.impl.Tl;
import io.appmetrica.analytics.impl.qe;
import io.appmetrica.analytics.impl.sn;
import io.appmetrica.analytics.impl.v5;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;
import java.util.concurrent.TimeUnit;

public final class Ri
extends sn {
    public final Qi d = new Qi(this);
    public final ICommonExecutor e;

    public Ri(@NonNull v5 v54, @NonNull Tl tl3, @NonNull ICommonExecutor iCommonExecutor) {
        super(v54, tl3);
        this.e = iCommonExecutor;
    }

    @Override
    public final void a() {
        this.e.remove(this.d);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void f() {
        this.b.a();
        Object object = (Gh)((v5)this.a).k.a();
        if (!((Gh)object).k.a(((Gh)object).j)) return;
        object = ((Gh)object).m;
        if (TextUtils.isEmpty((CharSequence)object)) return;
        if ("-1".equals(object)) return;
        try {
            object = qe.a((v5)this.a);
            this.a((NetworkTask)object);
        }
        finally {
            return;
        }
    }

    @Override
    public final void g() {
        this.e.executeDelayed(this.d, TimeUnit.SECONDS.toMillis(1L));
    }

    public final void h() {
        if (!this.c.get()) {
            this.e.remove(this.d);
            if (((Gh)((v5)this.a).k.a()).g > 0) {
                long l10 = TimeUnit.SECONDS.toMillis(((Gh)((v5)this.a).k.a()).g);
                this.e.executeDelayed(this.d, l10);
            }
        }
    }
}

