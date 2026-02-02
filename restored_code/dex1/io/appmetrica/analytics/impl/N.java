/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;

public abstract class N {
    public static final int[] a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int[] nArray = new int[IdentifierStatus.values().length];
        a = nArray;
        try {
            nArray[IdentifierStatus.OK.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            N.a[IdentifierStatus.NO_STARTUP.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            N.a[IdentifierStatus.FEATURE_DISABLED.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            N.a[IdentifierStatus.IDENTIFIER_PROVIDER_UNAVAILABLE.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            N.a[IdentifierStatus.INVALID_ADV_ID.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            N.a[IdentifierStatus.FORBIDDEN_BY_CLIENT_CONFIG.ordinal()] = 6;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

