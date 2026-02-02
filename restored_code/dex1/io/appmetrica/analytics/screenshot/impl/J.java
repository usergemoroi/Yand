/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.screenshot.impl.G;
import io.appmetrica.analytics.screenshot.impl.O;
import io.appmetrica.analytics.screenshot.impl.T;
import io.appmetrica.analytics.screenshot.impl.V;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;

public final class J
implements Converter {
    public final V a;

    public J() {
        this(null, 1, null);
    }

    public J(@NotNull V v14) {
        this.a = v14;
    }

    public /* synthetic */ J(V v14, int n10, p p14) {
        if ((n10 & 1) != 0) {
            v14 = new V(null, null, null, 7, null);
        }
        this(v14);
    }

    @NotNull
    public final G a(@NotNull O o11) {
        return new G(o11.a, this.a.a(o11.b));
    }

    @NotNull
    public final O a(@NotNull G object) {
        O o11 = new O();
        o11.a = ((G)object).a;
        object = ((G)object).b;
        object = object != null ? this.a.a((T)object) : null;
        o11.b = object;
        return o11;
    }
}

