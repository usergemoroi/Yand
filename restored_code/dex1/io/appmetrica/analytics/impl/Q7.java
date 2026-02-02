/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.impl.O7;
import io.appmetrica.analytics.impl.P7;
import io.appmetrica.analytics.impl.R7;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class Q7
implements Converter {
    public final P7 a;

    public Q7() {
        this(null, 1, null);
    }

    public Q7(@NotNull P7 p73) {
        this.a = p73;
    }

    public /* synthetic */ Q7(P7 p73, int n10, p p14) {
        if ((n10 & 1) != 0) {
            p73 = new P7(null, 1, null);
        }
        this(p73);
    }

    @NotNull
    public final R7 a(@Nullable byte[] object) {
        block4: {
            block3: {
                if (object == null) break block3;
                O7 o73 = new O7();
                o73 = MessageNano.mergeFrom(o73, object);
                object = o73;
                if (o73 != null) break block4;
            }
            try {
                object = new O7;
                object();
            }
            catch (InvalidProtocolBufferNanoException invalidProtocolBufferNanoException) {
                object = new O7();
            }
        }
        return this.a.a((O7)object);
    }

    @NotNull
    public final byte[] a(@NotNull R7 r74) {
        return MessageNano.toByteArray(this.a.a(r74));
    }

    public final Object fromModel(Object object) {
        object = (R7)object;
        return MessageNano.toByteArray(this.a.a((R7)object));
    }
}

