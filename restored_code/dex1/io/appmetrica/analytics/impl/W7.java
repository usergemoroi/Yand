/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.collection.a
 */
package io.appmetrica.analytics.impl;

import androidx.collection.a;

public final class W7 {
    public final long a;
    public final int b;

    public W7(int n10, long l10) {
        this.a = l10;
        this.b = n10;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof W7)) {
            return false;
        }
        object = (W7)object;
        if (this.a != ((W7)object).a) {
            return false;
        }
        return this.b == ((W7)object).b;
    }

    public final int hashCode() {
        int n10 = androidx.collection.a.a((long)this.a);
        return this.b + n10 * 31;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("DecimalProtoModel(mantissa=");
        stringBuilder.append(this.a);
        stringBuilder.append(", exponent=");
        stringBuilder.append(this.b);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

