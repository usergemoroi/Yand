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
import io.appmetrica.analytics.coreapi.internal.backport.Provider;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfo;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.impl.J;
import io.appmetrica.analytics.impl.K;
import io.appmetrica.analytics.impl.L;
import io.appmetrica.analytics.impl.cj;

public final class M
implements J {
    public final J a;

    public M(@NonNull J j10) {
        this.a = j10;
    }

    public static AdTrackingInfoResult a(Provider object) {
        AdTrackingInfoResult adTrackingInfoResult = (AdTrackingInfoResult)object.get();
        AdTrackingInfo adTrackingInfo = adTrackingInfoResult.mAdTrackingInfo;
        object = adTrackingInfoResult;
        if (adTrackingInfo != null) {
            object = adTrackingInfoResult;
            if ("00000000-0000-0000-0000-000000000000".equals(adTrackingInfo.advId)) {
                object = new AdTrackingInfoResult(null, IdentifierStatus.INVALID_ADV_ID, "AdvId is invalid: 00000000-0000-0000-0000-000000000000");
            }
        }
        return object;
    }

    @Override
    @NonNull
    public final AdTrackingInfoResult a(@NonNull Context context) {
        return M.a(new K(this, context));
    }

    @Override
    @NonNull
    public final AdTrackingInfoResult a(@NonNull Context context, @NonNull cj cj3) {
        return M.a(new L(this, context, cj3));
    }
}

