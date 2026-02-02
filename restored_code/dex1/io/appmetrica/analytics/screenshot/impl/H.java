/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.screenshot.impl.G;
import io.appmetrica.analytics.screenshot.impl.J;
import io.appmetrica.analytics.screenshot.impl.O;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;

public final class H
implements Converter {
    public final J a;

    public H() {
        this(null, 1, null);
    }

    public H(@NotNull J j10) {
        this.a = j10;
    }

    public /* synthetic */ H(J j10, int n10, p p14) {
        if ((n10 & 1) != 0) {
            j10 = new J(null, 1, null);
        }
        this(j10);
    }

    @NotNull
    public final G a(@NotNull byte[] object) {
        try {
            O o11 = new O();
            object = MessageNano.mergeFrom(o11, object);
        }
        catch (Throwable throwable) {
            object = new O();
        }
        return this.a.a((O)object);
    }

    @NotNull
    public final byte[] a(@NotNull G g11) {
        return MessageNano.toByteArray(this.a.a(g11));
    }

    public final Object fromModel(Object object) {
        object = (G)object;
        return MessageNano.toByteArray(this.a.a((G)object));
    }
}

