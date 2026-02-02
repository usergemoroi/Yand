/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.impl.Dm;
import io.appmetrica.analytics.impl.Re;

public final class Se
implements ProtobufConverter {
    @NonNull
    public final Dm a(@NonNull Re re3) {
        Dm dm3 = new Dm();
        dm3.a = re3.a;
        dm3.b = re3.b;
        return dm3;
    }

    @NonNull
    public final Re a(@NonNull Dm dm3) {
        return new Re(dm3.a, dm3.b);
    }

    @Override
    @NonNull
    public final Object toModel(@NonNull Object object) {
        object = (Dm)object;
        return new Re(((Dm)object).a, ((Dm)object).b);
    }
}

