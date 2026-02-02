/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

public final class K
extends MessageNano {
    public static volatile K[] b;
    public boolean a;

    public K() {
        this.a();
    }

    public static K a(byte[] byArray) throws InvalidProtocolBufferNanoException {
        return MessageNano.mergeFrom(new K(), byArray);
    }

    public static K b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new K().a(codedInputByteBufferNano);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static K[] b() {
        if (b != null) return b;
        Object object = InternalNano.LAZY_INIT_LOCK;
        synchronized (object) {
            try {
                if (b != null) return b;
                b = new K[0];
                return b;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final K a() {
        this.a = true;
        this.cachedSize = -1;
        return this;
    }

    public final K a(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        int n10;
        while ((n10 = codedInputByteBufferNano.readTag()) != 0) {
            if (n10 != 8) {
                if (WireFormatNano.parseUnknownField(codedInputByteBufferNano, n10)) continue;
                return this;
            }
            this.a = codedInputByteBufferNano.readBool();
        }
        return this;
    }

    @Override
    public final int computeSerializedSize() {
        int n10 = super.computeSerializedSize();
        boolean bl2 = this.a;
        int n13 = n10;
        if (!bl2) {
            n13 = n10 + CodedOutputByteBufferNano.computeBoolSize(1, bl2);
        }
        return n13;
    }

    @Override
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        boolean bl2 = this.a;
        if (!bl2) {
            codedOutputByteBufferNano.writeBool(1, bl2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}

