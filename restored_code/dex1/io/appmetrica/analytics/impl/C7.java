/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.impl.B7;
import io.appmetrica.analytics.impl.D7;
import io.appmetrica.analytics.impl.M7;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class C7
implements Converter {
    public final B7 a;

    public C7() {
        this(null, 1, null);
    }

    public C7(@NotNull B7 b74) {
        this.a = b74;
    }

    public /* synthetic */ C7(B7 b74, int n10, p p14) {
        if ((n10 & 1) != 0) {
            b74 = new B7(null, null, 3, null);
        }
        this(b74);
    }

    @NotNull
    public final D7 a(@Nullable byte[] object) {
        block4: {
            block3: {
                if (object == null) break block3;
                M7 m74 = new M7();
                m74 = MessageNano.mergeFrom(m74, object);
                object = m74;
                if (m74 != null) break block4;
            }
            try {
                object = new M7;
                object();
            }
            catch (InvalidProtocolBufferNanoException invalidProtocolBufferNanoException) {
                object = new M7();
            }
        }
        return this.a.a((M7)object);
    }

    @NotNull
    public final byte[] a(@NotNull D7 d72) {
        return MessageNano.toByteArray(this.a.a(d72));
    }

    public final Object fromModel(Object object) {
        object = (D7)object;
        return MessageNano.toByteArray(this.a.a((D7)object));
    }
}

