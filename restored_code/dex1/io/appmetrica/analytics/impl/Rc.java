/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.NonNull
 *  kotlin.text.p
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.billinginterface.internal.BillingType;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.impl.A5;
import io.appmetrica.analytics.impl.Ak;
import io.appmetrica.analytics.impl.Dh;
import io.appmetrica.analytics.impl.Fe;
import io.appmetrica.analytics.impl.Lg;
import io.appmetrica.analytics.impl.M4;
import io.appmetrica.analytics.impl.Na;
import io.appmetrica.analytics.impl.Oc;
import io.appmetrica.analytics.impl.Pc;
import io.appmetrica.analytics.impl.Q9;
import io.appmetrica.analytics.impl.S9;
import io.appmetrica.analytics.impl.V9;
import io.appmetrica.analytics.impl.Zm;
import io.appmetrica.analytics.impl.fc;
import io.appmetrica.analytics.impl.k7;
import io.appmetrica.analytics.impl.l3;
import io.appmetrica.analytics.impl.m3;
import io.appmetrica.analytics.impl.mh;
import io.appmetrica.analytics.impl.o5;
import io.appmetrica.analytics.impl.om;
import io.appmetrica.analytics.impl.q3;
import io.appmetrica.analytics.impl.qf;
import io.appmetrica.analytics.impl.t5;
import io.appmetrica.analytics.impl.z2;
import java.lang.reflect.Field;
import java.util.Objects;
import java.util.concurrent.Executor;
import kotlin.text.p;

public final class Rc
extends A5 {
    public final Ak n;

    public Rc(@NonNull Context context, @NonNull o5 o54, @NonNull M4 m44, @NonNull t5 t54, @NonNull om om3, @NonNull Dh dh3, @NonNull ICommonExecutor iCommonExecutor, int n10, @NonNull Ak ak3, @NonNull fc fc3, @NonNull S9 s92) {
        super(context, o54, m44, t54, om3, dh3, iCommonExecutor, n10, fc3, s92);
        this.n = ak3;
    }

    @Override
    @NonNull
    public final Q9 a(@NonNull V9 v94, @NonNull k7 k74, @NonNull mh mh3, @NonNull M4 m44, @NonNull o5 o54, @NonNull qf qf3) {
        return this.l.a(v94, k74, mh3, m44, o54, qf3).a();
    }

    @NonNull
    public final q3 a(@NonNull Pc pc3) {
        Object object;
        Executor executor;
        IHandlerExecutor iHandlerExecutor;
        Context context;
        block6: {
            block5: {
                context = this.c;
                iHandlerExecutor = this.n.a();
                executor = this.n.f();
                object = ReflectionUtils.findClass("com.android.billingclient.BuildConfig");
                if (object == null) break block5;
                object = object.getField("VERSION_NAME");
                if (object == null) break block5;
                object = ((Field)object).get(null);
                break block6;
            }
            object = null;
        }
        try {
            object = (String)object;
        }
        catch (Throwable throwable) {
            object = null;
        }
        object = object != null && !p.h0(object) ? (p.M(object, (String)"2.", (boolean)false, (int)2, null) ? BillingType.NONE : (p.M((String)object, (String)"3.", (boolean)false, (int)2, null) ? BillingType.NONE : (p.M(object, (String)"4.", (boolean)false, (int)2, null) ? BillingType.NONE : (p.M(object, (String)"5.", (boolean)false, (int)2, null) ? BillingType.LIBRARY_V6 : (p.M(object, (String)"6.", (boolean)false, (int)2, null) ? BillingType.LIBRARY_V6 : (p.M(object, (String)"7.", (boolean)false, (int)2, null) ? BillingType.LIBRARY_V6 : (p.M(object, (String)"8.", (boolean)false, (int)2, null) ? BillingType.LIBRARY_V8 : BillingType.LIBRARY_V8))))))) : BillingType.NONE;
        Context context2 = this.c;
        return new q3(context, iHandlerExecutor, executor, (BillingType)((Object)object), new m3(Zm.a(z2.class).a(context2)), new l3(pc3, Na.j().w().e()));
    }

    @NonNull
    public final Lg b(@NonNull Pc pc3) {
        Fe fe2 = new Fe(pc3);
        Objects.requireNonNull(pc3);
        return new Lg(fe2, new Oc(pc3), pc3);
    }
}

