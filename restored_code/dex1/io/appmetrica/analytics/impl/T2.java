/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateSerializer;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

public abstract class T2
implements ProtobufStateSerializer {
    @NonNull
    public abstract MessageNano a();

    @NonNull
    public final byte[] a(@NonNull MessageNano messageNano) {
        return MessageNano.toByteArray(messageNano);
    }

    @Override
    @NonNull
    public final byte[] toByteArray(@NonNull Object object) {
        return MessageNano.toByteArray((MessageNano)object);
    }
}

