/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.F8;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

public final class B8
extends MessageNano {
    public static volatile B8[] c;
    public byte[] a;
    public F8 b;

    public B8() {
        this.a();
    }

    public static B8 a(byte[] byArray) throws InvalidProtocolBufferNanoException {
        return MessageNano.mergeFrom(new B8(), byArray);
    }

    public static B8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new B8().a(codedInputByteBufferNano);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static B8[] b() {
        if (c != null) return c;
        Object object = InternalNano.LAZY_INIT_LOCK;
        synchronized (object) {
            try {
                if (c != null) return c;
                c = new B8[0];
                return c;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final B8 a() {
        this.a = WireFormatNano.EMPTY_BYTES;
        this.b = null;
        this.cachedSize = -1;
        return this;
    }

    public final B8 a(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        int n10;
        while ((n10 = codedInputByteBufferNano.readTag()) != 0) {
            if (n10 != 10) {
                if (n10 != 18) {
                    if (WireFormatNano.parseUnknownField(codedInputByteBufferNano, n10)) continue;
                    return this;
                }
                if (this.b == null) {
                    this.b = new F8();
                }
                codedInputByteBufferNano.readMessage(this.b);
                continue;
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
        F8 f84 = this.b;
        n10 = n13;
        if (f84 != null) {
            n10 = n13 + CodedOutputByteBufferNano.computeMessageSize(2, f84);
        }
        return n10;
    }

    @Override
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        F8 f84;
        if (!Arrays.equals(this.a, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.a);
        }
        if ((f84 = this.b) != null) {
            codedOutputByteBufferNano.writeMessage(2, f84);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}

