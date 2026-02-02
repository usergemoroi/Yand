/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

public final class C3 {
    public final long a;

    public C3(long l10) {
        this.a = l10;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return true;
        }
        if (object != null && C3.class == object.getClass()) {
            object = (C3)object;
            if (this.a != ((C3)object).a) {
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
        StringBuilder stringBuilder = new StringBuilder("CacheControl{lastKnownLocationTtl=");
        stringBuilder.append(this.a);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

