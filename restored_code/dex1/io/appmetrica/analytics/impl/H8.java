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

public final class H8
extends MessageNano {
    public static volatile H8[] c;
    public int a;
    public D8 b;

    public H8() {
        this.a();
    }

    public static H8 a(byte[] byArray) throws InvalidProtocolBufferNanoException {
        return MessageNano.mergeFrom(new H8(), byArray);
    }

    public static H8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new H8().a(codedInputByteBufferNano);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static H8[] b() {
        if (c != null) return c;
        Object object = InternalNano.LAZY_INIT_LOCK;
        synchronized (object) {
            try {
                if (c != null) return c;
                c = new H8[0];
                return c;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final H8 a() {
        this.a = 0;
        this.b = null;
        this.cachedSize = -1;
        return this;
    }

    public final H8 a(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        int n10;
        while ((n10 = codedInputByteBufferNano.readTag()) != 0) {
            if (n10 != 8) {
                if (n10 != 18) {
                    if (WireFormatNano.parseUnknownField(codedInputByteBufferNano, n10)) continue;
                    return this;
                }
                if (this.b == null) {
                    this.b = new D8();
                }
                codedInputByteBufferNano.readMessage(this.b);
                continue;
            }
            this.a = codedInputByteBufferNano.readUInt32();
        }
        return this;
    }

    @Override
    public final int computeSerializedSize() {
        int n10 = super.computeSerializedSize();
        int n13 = this.a;
        int n14 = n10;
        if (n13 != 0) {
            n14 = n10 + CodedOutputByteBufferNano.computeUInt32Size(1, n13);
        }
        D8 d84 = this.b;
        n10 = n14;
        if (d84 != null) {
            n10 = n14 + CodedOutputByteBufferNano.computeMessageSize(2, d84);
        }
        return n10;
    }

    @Override
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        D8 d84;
        int n10 = this.a;
        if (n10 != 0) {
            codedOutputByteBufferNano.writeUInt32(1, n10);
        }
        if ((d84 = this.b) != null) {
            codedOutputByteBufferNano.writeMessage(2, d84);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}

