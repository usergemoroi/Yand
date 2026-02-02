/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.D8;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

public final class C8
extends MessageNano {
    public static volatile C8[] b;
    public D8 a;

    public C8() {
        this.a();
    }

    public static C8 a(byte[] byArray) throws InvalidProtocolBufferNanoException {
        return MessageNano.mergeFrom(new C8(), byArray);
    }

    public static C8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C8().a(codedInputByteBufferNano);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static C8[] b() {
        if (b != null) return b;
        Object object = InternalNano.LAZY_INIT_LOCK;
        synchronized (object) {
            try {
                if (b != null) return b;
                b = new C8[0];
                return b;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final C8 a() {
        this.a = null;
        this.cachedSize = -1;
        return this;
    }

    public final C8 a(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        int n10;
        while ((n10 = codedInputByteBufferNano.readTag()) != 0) {
            if (n10 != 10) {
                if (WireFormatNano.parseUnknownField(codedInputByteBufferNano, n10)) continue;
                return this;
            }
            if (this.a == null) {
                this.a = new D8();
            }
            codedInputByteBufferNano.readMessage(this.a);
        }
        return this;
    }

    @Override
    public final int computeSerializedSize() {
        int n10 = super.computeSerializedSize();
        D8 d84 = this.a;
        int n13 = n10;
        if (d84 != null) {
            n13 = n10 + CodedOutputByteBufferNano.computeMessageSize(1, d84);
        }
        return n13;
    }

    @Override
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        D8 d84 = this.a;
        if (d84 != null) {
            codedOutputByteBufferNano.writeMessage(1, d84);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}

