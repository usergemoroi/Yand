/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.z3;

public final class L4
extends z3 {
    public final int b;

    public L4(int n10, int n13) {
        super(n13);
        this.b = n10;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("CollectionTrimInfo{itemsDropped=");
        stringBuilder.append(this.b);
        stringBuilder.append(", bytesTruncated=");
        stringBuilder.append(this.a);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

