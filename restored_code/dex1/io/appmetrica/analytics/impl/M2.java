/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.L2;

public final class M2 {
    public final L2 a;
    public final Boolean b;

    public M2(L2 l22, Boolean bl2) {
        this.a = l22;
        this.b = bl2;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return true;
        }
        if (object != null && M2.class == object.getClass()) {
            M2 m24 = (M2)object;
            if (this.a != m24.a) {
                return false;
            }
            object = this.b;
            if (object != null) {
                bl2 = ((Boolean)object).equals(m24.b);
            } else if (m24.b != null) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        Object object = this.a;
        int n10 = 0;
        int n13 = object != null ? object.hashCode() : 0;
        object = this.b;
        if (object != null) {
            n10 = ((Boolean)object).hashCode();
        }
        return n13 * 31 + n10;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("BackgroundRestrictionsState{mAppStandByBucket=");
        stringBuilder.append((Object)this.a);
        stringBuilder.append(", mBackgroundRestricted=");
        stringBuilder.append(this.b);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

