/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  kotlin.jvm.functions.a
 *  kotlin.jvm.internal.a0
 */
package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.services.FrameworkDetector;
import io.appmetrica.analytics.impl.Cc;
import io.appmetrica.analytics.impl.M4;
import io.appmetrica.analytics.impl.Na;
import io.appmetrica.analytics.impl.R9;
import io.appmetrica.analytics.impl.ef;
import io.appmetrica.analytics.impl.le;
import io.appmetrica.analytics.impl.ma;
import io.appmetrica.analytics.impl.mh;
import io.appmetrica.analytics.impl.qf;
import kotlin.jvm.functions.a;
import kotlin.jvm.internal.a0;

public final class Bc
extends a0
implements a {
    public final Cc a;

    public Bc(Cc cc2) {
        this.a = cc2;
        super(0);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invoke() {
        Object object = this.a;
        Object object2 = ((Cc)object).f;
        R9 r92 = ((Cc)object).b;
        mh mh3 = ((Cc)object).a;
        M4 m44 = ((Cc)object).c;
        object = ((Cc)object).d;
        object2.getClass();
        if (FrameworkDetector.isNative()) {
            object2 = Na.F.h();
            object2 = ((ma)object2).d.getApplicationMetaData(((ma)object2).a);
            object2 = object2 != null ? object2.getString("io.appmetrica.analytics.plugin_id") : null;
            if (TextUtils.isEmpty((CharSequence)object2)) {
                object2 = new le();
                return object2.a();
            }
        }
        object2 = new ef(r92, mh3, m44, (qf)object);
        return object2.a();
    }
}

