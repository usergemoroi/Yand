/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

public final class Qm {
    public final long a;

    public Qm(long l10) {
        this.a = l10;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return true;
        }
        if (object != null && Qm.class == object.getClass()) {
            object = (Qm)object;
            if (this.a != ((Qm)object).a) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        long l10 = this.a;
        return (int)(l10 ^ l10 >>> 32);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("StatSending{disabledReportingInterval=");
        stringBuilder.append(this.a);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

