/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.A3;

public final class Zi
implements A3 {
    @NonNull
    public final Object a;
    @NonNull
    public final A3 b;

    public Zi(@NonNull Object object, @NonNull A3 a33) {
        this.a = object;
        this.b = a33;
    }

    @Override
    public final int getBytesTruncated() {
        return this.b.getBytesTruncated();
    }

    @NonNull
    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Result{result=");
        stringBuilder.append(this.a);
        stringBuilder.append(", metaInfo=");
        stringBuilder.append(this.b);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

