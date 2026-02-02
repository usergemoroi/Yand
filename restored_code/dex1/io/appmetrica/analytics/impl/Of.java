/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  org.json.JSONObject
 */
package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.PreloadInfo;
import io.appmetrica.analytics.impl.Kf;
import io.appmetrica.analytics.impl.q8;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import org.json.JSONObject;

public final class Of {
    public final Kf a;

    public Of(PreloadInfo preloadInfo, PublicLogger publicLogger, boolean bl2) {
        if (preloadInfo != null) {
            if (TextUtils.isEmpty((CharSequence)preloadInfo.getTrackingId())) {
                publicLogger.error("Required field \"PreloadInfo.trackingId\" is empty!\nThis preload info will be skipped.", new Object[0]);
            } else {
                this.a = new Kf(preloadInfo.getTrackingId(), new JSONObject(preloadInfo.getAdditionalParams()), true, bl2, q8.c);
            }
        }
    }
}

