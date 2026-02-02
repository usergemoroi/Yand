/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

public final class Mm {
    public final int a;

    public Mm(int n10) {
        this.a = n10;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof Mm)) {
            return false;
        }
        object = (Mm)object;
        return this.a == ((Mm)object).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("StartupUpdateConfig(intervalSeconds=");
        stringBuilder.append(this.a);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

