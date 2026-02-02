/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.impl.T6;
import io.appmetrica.analytics.impl.ah;
import io.appmetrica.analytics.impl.v6;
import io.appmetrica.analytics.impl.w6;

public final class U6
implements ProtobufConverter {
    public final ah a;

    public U6() {
        this(new ah());
    }

    public U6(ah ah3) {
        this.a = ah3;
    }

    @NonNull
    public final T6 a(@NonNull w6 w64) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public final w6 a(@NonNull T6 t64) {
        v6 v64;
        w6 w64 = this.a.a(t64.a);
        w64.g = 1;
        w64.h = v64 = new v6();
        v64.a = StringUtils.correctIllFormedString(t64.b);
        return w64;
    }

    @Override
    @NonNull
    public final Object toModel(@NonNull Object object) {
        object = (w6)object;
        throw new UnsupportedOperationException();
    }
}

