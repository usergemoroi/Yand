/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.A8;
import io.appmetrica.analytics.impl.C8;
import io.appmetrica.analytics.impl.D8;
import io.appmetrica.analytics.impl.G3;
import io.appmetrica.analytics.impl.I3;
import io.appmetrica.analytics.impl.T8;
import io.appmetrica.analytics.impl.Zi;
import io.appmetrica.analytics.impl.z3;
import java.util.Collections;
import java.util.List;

public final class H3
implements A8 {
    public final I3 a;

    public H3() {
        this(new I3());
    }

    public H3(I3 i33) {
        this.a = i33;
    }

    @NonNull
    public final G3 a(@NonNull List<Zi> list) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public final List<Zi> a(@NonNull G3 g32) {
        T8 t82 = new T8();
        t82.e = new C8();
        Zi zi3 = this.a.a(g32.b);
        t82.e.a = (D8)zi3.a;
        t82.a = g32.a;
        return Collections.singletonList(new Zi(t82, new z3(z3.b(zi3))));
    }

    @NonNull
    public final Object toModel(@NonNull Object object) {
        object = (List)object;
        throw new UnsupportedOperationException();
    }
}

