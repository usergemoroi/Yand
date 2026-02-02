/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdvIdentifiersResult;
import io.appmetrica.analytics.impl.N;
import io.appmetrica.analytics.internal.IdentifiersResult;

public final class O {
    public static AdvIdentifiersResult.AdvId a(IdentifiersResult object) {
        AdvIdentifiersResult.Details details;
        Object var3_1 = null;
        String string2 = object == null ? null : ((IdentifiersResult)object).id;
        if (object == null) {
            details = AdvIdentifiersResult.Details.INTERNAL_ERROR;
        } else {
            switch (N.a[((IdentifiersResult)object).status.ordinal()]) {
                default: {
                    details = AdvIdentifiersResult.Details.INTERNAL_ERROR;
                    break;
                }
                case 6: {
                    details = AdvIdentifiersResult.Details.FORBIDDEN_BY_CLIENT_CONFIG;
                    break;
                }
                case 5: {
                    details = AdvIdentifiersResult.Details.INVALID_ADV_ID;
                    break;
                }
                case 4: {
                    details = AdvIdentifiersResult.Details.IDENTIFIER_PROVIDER_UNAVAILABLE;
                    break;
                }
                case 3: {
                    details = AdvIdentifiersResult.Details.FEATURE_DISABLED;
                    break;
                }
                case 2: {
                    details = AdvIdentifiersResult.Details.NO_STARTUP;
                    break;
                }
                case 1: {
                    details = AdvIdentifiersResult.Details.OK;
                }
            }
        }
        object = object == null ? var3_1 : ((IdentifiersResult)object).errorExplanation;
        return new AdvIdentifiersResult.AdvId(string2, details, (String)object);
    }
}

