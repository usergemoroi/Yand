/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.impl.Ge;
import io.appmetrica.analytics.impl.O7;
import io.appmetrica.analytics.impl.R7;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;

public final class P7
implements ProtobufConverter {
    public final Ge a;

    public P7() {
        this(null, 1, null);
    }

    public P7(@NotNull Ge ge2) {
        this.a = ge2;
    }

    public /* synthetic */ P7(Ge ge2, int n10, p p14) {
        if ((n10 & 1) != 0) {
            ge2 = new Ge();
        }
        this(ge2);
    }

    @NotNull
    public final O7 a(@NotNull R7 object) {
        O7 o73 = new O7();
        Long l10 = ((R7)object).a;
        if (l10 != null) {
            o73.a = l10;
        }
        if ((l10 = ((R7)object).b) != null) {
            o73.b = l10;
        }
        if ((object = ((R7)object).c) != null) {
            o73.c = this.a.a((Boolean)object);
        }
        return o73;
    }

    @NotNull
    public final R7 a(@NotNull O7 o73) {
        O7 o74 = new O7();
        long l10 = o73.a;
        Long l11 = l10;
        long l13 = o74.a;
        Long l14 = null;
        if (l10 == l13) {
            l11 = null;
        }
        l13 = o73.b;
        if (l13 != o74.b) {
            l14 = l13;
        }
        return new R7(l11, l14, this.a.a(o73.c));
    }
}

