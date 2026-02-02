/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import kotlin.jvm.internal.y;

public final class E0 {
    public final String a;
    public final String b;
    public final CounterConfigurationReporterType c;
    public final int d;
    public final String e;
    public final String f;

    public E0(String string2, String string3, CounterConfigurationReporterType counterConfigurationReporterType, int n10, String string4, String string5) {
        this.a = string2;
        this.b = string3;
        this.c = counterConfigurationReporterType;
        this.d = n10;
        this.e = string4;
        this.f = string5;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof E0)) {
            return false;
        }
        object = (E0)object;
        if (!y.e(this.a, ((E0)object).a)) {
            return false;
        }
        if (!y.e(this.b, ((E0)object).b)) {
            return false;
        }
        if (this.c != ((E0)object).c) {
            return false;
        }
        if (this.d != ((E0)object).d) {
            return false;
        }
        if (!y.e(this.e, ((E0)object).e)) {
            return false;
        }
        return y.e(this.f, ((E0)object).f);
    }

    public final int hashCode() {
        int n10 = this.a.hashCode();
        int n13 = this.b.hashCode();
        int n14 = ((Object)((Object)this.c)).hashCode();
        int n15 = this.d;
        int n16 = this.e.hashCode();
        String string2 = this.f;
        int n17 = string2 == null ? 0 : string2.hashCode();
        return (n16 + (n15 + (n14 + (n13 + n10 * 31) * 31) * 31) * 31) * 31 + n17;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("AppMetricaNativeCrashMetadata(apiKey=");
        stringBuilder.append(this.a);
        stringBuilder.append(", packageName=");
        stringBuilder.append(this.b);
        stringBuilder.append(", reporterType=");
        stringBuilder.append((Object)this.c);
        stringBuilder.append(", processID=");
        stringBuilder.append(this.d);
        stringBuilder.append(", processSessionID=");
        stringBuilder.append(this.e);
        stringBuilder.append(", errorEnvironment=");
        stringBuilder.append(this.f);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

