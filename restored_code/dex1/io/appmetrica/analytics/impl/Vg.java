/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfo;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.identifiers.internal.AdvIdentifiersProvider;
import io.appmetrica.analytics.impl.J;
import io.appmetrica.analytics.impl.Pn;
import io.appmetrica.analytics.impl.U5;
import io.appmetrica.analytics.impl.Ug;
import io.appmetrica.analytics.impl.cj;
import io.appmetrica.analytics.impl.se;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class Vg
implements J {
    public final String a;
    public final Ug b;

    public Vg(@NonNull String string2) {
        this(string2, new Ug());
    }

    public Vg(String string2, Ug ug3) {
        this.a = string2;
        this.b = ug3;
    }

    @Override
    @NonNull
    public final AdTrackingInfoResult a(@NonNull Context context) {
        return this.a(context, new se());
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    @NonNull
    public final AdTrackingInfoResult a(@NonNull Context object, @NonNull cj cj3) {
        void var1_4;
        Object object2;
        if (!ReflectionUtils.detectClassExists("io.appmetrica.analytics.identifiers.internal.AdvIdentifiersProvider")) {
            object2 = new AdTrackingInfoResult(null, IdentifierStatus.IDENTIFIER_PROVIDER_UNAVAILABLE, "Module io.appmetrica.analytics:analytics-identifiers does not exist");
        } else {
            void var2_5;
            Pn pn3 = (Pn)var2_5;
            pn3.c = 0;
            object2 = null;
            while (pn3.b()) {
                Object object3;
                try {
                    return this.b((Context)object);
                }
                catch (Throwable throwable) {
                    object3 = IdentifierStatus.UNKNOWN;
                    object2 = new StringBuilder("exception while fetching ");
                    ((StringBuilder)object2).append(this.a);
                    ((StringBuilder)object2).append(" adv_id: ");
                    ((StringBuilder)object2).append(throwable.getMessage());
                    object2 = new AdTrackingInfoResult(null, (IdentifierStatus)((Object)object3), ((StringBuilder)object2).toString());
                }
                catch (InvocationTargetException invocationTargetException) {
                    object2 = invocationTargetException.getTargetException() != null ? invocationTargetException.getTargetException().getMessage() : null;
                    IdentifierStatus identifierStatus = IdentifierStatus.UNKNOWN;
                    object3 = new StringBuilder("exception while fetching ");
                    ((StringBuilder)object3).append(this.a);
                    ((StringBuilder)object3).append(" adv_id: ");
                    ((StringBuilder)object3).append((String)object2);
                    object2 = new AdTrackingInfoResult(null, identifierStatus, ((StringBuilder)object3).toString());
                }
                try {
                    Thread.sleep(((Pn)var2_5).b);
                }
                catch (InterruptedException interruptedException) {}
            }
        }
        AdTrackingInfoResult adTrackingInfoResult = object2;
        if (object2 != null) return var1_4;
        AdTrackingInfoResult adTrackingInfoResult2 = new AdTrackingInfoResult();
        return var1_4;
    }

    public final AdTrackingInfoResult b(Context object) {
        int n10 = AdvIdentifiersProvider.a;
        Method method = AdvIdentifiersProvider.class.getMethod("requestIdentifiers", Context.class, Bundle.class);
        Bundle bundle = new Bundle();
        bundle.putString("io.appmetrica.analytics.identifiers.extra.PROVIDER", this.a);
        Object object2 = this.b;
        AdTrackingInfo.Provider provider = null;
        Bundle bundle2 = null;
        Object var3_8 = null;
        method = (Bundle)method.invoke(null, object, bundle);
        object2.getClass();
        object = bundle2;
        if (method != null) {
            bundle2 = method.getBundle("io.appmetrica.analytics.identifiers.extra.TRACKING_INFO");
            object = provider;
            if (bundle2 != null) {
                object = U5.a.get(bundle2.getString("io.appmetrica.analytics.identifiers.extra.PROVIDER"));
                if (object != null) {
                    provider = (AdTrackingInfo.Provider)((Object)object);
                    object2 = bundle2.getString("io.appmetrica.analytics.identifiers.extra.ID");
                    object = var3_8;
                    if (bundle2.containsKey("io.appmetrica.analytics.identifiers.extra.LIMITED")) {
                        object = bundle2.getBoolean("io.appmetrica.analytics.identifiers.extra.LIMITED");
                    }
                    object = new AdTrackingInfo(provider, (String)object2, (Boolean)object);
                } else {
                    object = new StringBuilder("Provider ");
                    object.append(bundle2.getString("io.appmetrica.analytics.identifiers.extra.PROVIDER"));
                    object.append(" is invalid");
                    throw new IllegalArgumentException(object.toString().toString());
                }
            }
            object = new AdTrackingInfoResult((AdTrackingInfo)object, IdentifierStatus.Companion.from(method.getString("io.appmetrica.analytics.identifiers.extra.STATUS")), method.getString("io.appmetrica.analytics.identifiers.extra.ERROR_MESSAGE"));
        }
        return object;
    }
}

