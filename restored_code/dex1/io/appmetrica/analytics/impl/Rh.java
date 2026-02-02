/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.bi;
import io.appmetrica.analytics.impl.o6;
import java.util.HashMap;

public final class Rh {
    public final o6 a;
    public final boolean b;
    public final int c;
    public final HashMap d;
    public final bi e;

    public Rh(o6 o63, boolean bl2, int n10, HashMap hashMap, bi bi2) {
        this.a = o63;
        this.b = bl2;
        this.c = n10;
        this.d = hashMap;
        this.e = bi2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ReportToSend(report=");
        stringBuilder.append(this.a);
        stringBuilder.append(", serviceDataReporterType=");
        stringBuilder.append(this.c);
        stringBuilder.append(", environment=");
        stringBuilder.append(this.e);
        stringBuilder.append(", isCrashReport=");
        stringBuilder.append(this.b);
        stringBuilder.append(", trimmedFields=");
        stringBuilder.append(this.d);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

