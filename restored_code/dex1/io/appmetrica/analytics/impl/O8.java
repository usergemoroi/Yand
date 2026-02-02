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
import java.util.Arrays;

public final class O8
extends MessageNano {
    public static volatile O8[] d;
    public byte[] a;
    public byte[] b;
    public P8 c;

    public O8() {
        this.a();
    }

    public static O8 a(byte[] byArray) throws InvalidProtocolBufferNanoException {
        return MessageNano.mergeFrom(new O8(), byArray);
    }

    public static O8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new O8().a(codedInputByteBufferNano);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static O8[] b() {
        if (d != null) return d;
        Object object = InternalNano.LAZY_INIT_LOCK;
        synchronized (object) {
            try {
                if (d != null) return d;
                d = new O8[0];
                return d;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final O8 a() {
        byte[] byArray = WireFormatNano.EMPTY_BYTES;
        this.a = byArray;
        this.b = byArray;
        this.c = null;
        this.cachedSize = -1;
        return this;
    }

    public final O8 a(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        int n10;
        while ((n10 = codedInputByteBufferNano.readTag()) != 0) {
            if (n10 != 10) {
                if (n10 != 18) {
                    if (n10 != 26) {
                        if (WireFormatNano.parseUnknownField(codedInputByteBufferNano, n10)) continue;
                        return this;
                    }
                    if (this.c == null) {
                        this.c = new P8();
                    }
                    codedInputByteBufferNano.readMessage(this.c);
                    continue;
                }
                this.b = codedInputByteBufferNano.readBytes();
                continue;
            }
            this.a = codedInputByteBufferNano.readBytes();
        }
        return this;
    }

    @Override
    public final int computeSerializedSize() {
        int n10 = super.computeSerializedSize();
        Object object = this.a;
        byte[] byArray = WireFormatNano.EMPTY_BYTES;
        int n13 = n10;
        if (!Arrays.equals(object, byArray)) {
            n13 = n10 + CodedOutputByteBufferNano.computeBytesSize(1, this.a);
        }
        n10 = n13;
        if (!Arrays.equals(this.b, byArray)) {
            n10 = n13 + CodedOutputByteBufferNano.computeBytesSize(2, this.b);
        }
        object = this.c;
        n13 = n10;
        if (object != null) {
            n13 = n10 + CodedOutputByteBufferNano.computeMessageSize(3, (MessageNano)object);
        }
        return n13;
    }

    @Override
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] byArray = this.a;
        Object object = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(byArray, object)) {
            codedOutputByteBufferNano.writeBytes(1, this.a);
        }
        if (!Arrays.equals(this.b, object)) {
            codedOutputByteBufferNano.writeBytes(2, this.b);
        }
        if ((object = (Object)this.c) != null) {
            codedOutputByteBufferNano.writeMessage(3, (MessageNano)object);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}

