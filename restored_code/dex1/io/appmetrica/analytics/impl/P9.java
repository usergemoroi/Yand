/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.impl.N9;
import io.appmetrica.analytics.impl.O9;

public final class P9
implements ProtobufConverter {
    @NonNull
    public final N9 a(@NonNull O9 object) {
        N9 n94 = new N9();
        object = ((O9)object).a;
        if (object != null) {
            n94.a = ((String)object).getBytes();
        }
        return n94;
    }

    @NonNull
    public final O9 a(@NonNull N9 n94) {
        return new O9(new String(n94.a));
    }
}

