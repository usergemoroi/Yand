/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

public final class N8
extends MessageNano {
    public static volatile N8[] b;
    public byte[] a;

    public N8() {
        this.a();
    }

    public static N8 a(byte[] byArray) throws InvalidProtocolBufferNanoException {
        return MessageNano.mergeFrom(new N8(), byArray);
    }

    public static N8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new N8().a(codedInputByteBufferNano);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static N8[] b() {
        if (b != null) return b;
        Object object = InternalNano.LAZY_INIT_LOCK;
        synchronized (object) {
            try {
                if (b != null) return b;
                b = new N8[0];
                return b;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final N8 a() {
        this.a = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    public final N8 a(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        int n10;
        while ((n10 = codedInputByteBufferNano.readTag()) != 0) {
            if (n10 != 10) {
                if (WireFormatNano.parseUnknownField(codedInputByteBufferNano, n10)) continue;
                return this;
            }
            this.a = codedInputByteBufferNano.readBytes();
        }
        return this;
    }

    @Override
    public final int computeSerializedSize() {
        int n10;
        int n13 = n10 = super.computeSerializedSize();
        if (!Arrays.equals(this.a, WireFormatNano.EMPTY_BYTES)) {
            n13 = n10 + CodedOutputByteBufferNano.computeBytesSize(1, this.a);
        }
        return n13;
    }

    @Override
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!Arrays.equals(this.a, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.a);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}

