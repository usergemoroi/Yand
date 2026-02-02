/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

public abstract class F4 {
    public static final int[] a;

    static {
        int[] nArray = new int[CounterConfigurationReporterType.values().length];
        nArray[CounterConfigurationReporterType.COMMUTATION.ordinal()] = 1;
        nArray[CounterConfigurationReporterType.SELF_DIAGNOSTIC_MAIN.ordinal()] = 2;
        nArray[CounterConfigurationReporterType.SELF_DIAGNOSTIC_MANUAL.ordinal()] = 3;
        nArray[CounterConfigurationReporterType.MANUAL.ordinal()] = 4;
        nArray[CounterConfigurationReporterType.SELF_SDK.ordinal()] = 5;
        nArray[CounterConfigurationReporterType.MAIN.ordinal()] = 6;
        nArray[CounterConfigurationReporterType.CRASH.ordinal()] = 7;
        a = nArray;
    }
}

