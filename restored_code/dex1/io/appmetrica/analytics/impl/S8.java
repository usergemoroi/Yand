/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.P8;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

public final class S8
extends MessageNano {
    public static volatile S8[] b;
    public P8 a;

    public S8() {
        this.a();
    }

    public static S8 a(byte[] byArray) throws InvalidProtocolBufferNanoException {
        return MessageNano.mergeFrom(new S8(), byArray);
    }

    public static S8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new S8().a(codedInputByteBufferNano);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static S8[] b() {
        if (b != null) return b;
        Object object = InternalNano.LAZY_INIT_LOCK;
        synchronized (object) {
            try {
                if (b != null) return b;
                b = new S8[0];
                return b;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final S8 a() {
        this.a = null;
        this.cachedSize = -1;
        return this;
    }

    public final S8 a(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        int n10;
        while ((n10 = codedInputByteBufferNano.readTag()) != 0) {
            if (n10 != 10) {
                if (WireFormatNano.parseUnknownField(codedInputByteBufferNano, n10)) continue;
                return this;
            }
            if (this.a == null) {
                this.a = new P8();
            }
            codedInputByteBufferNano.readMessage(this.a);
        }
        return this;
    }

    @Override
    public final int computeSerializedSize() {
        int n10 = super.computeSerializedSize();
        P8 p84 = this.a;
        int n13 = n10;
        if (p84 != null) {
            n13 = n10 + CodedOutputByteBufferNano.computeMessageSize(1, p84);
        }
        return n13;
    }

    @Override
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        P8 p84 = this.a;
        if (p84 != null) {
            codedOutputByteBufferNano.writeMessage(1, p84);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}

