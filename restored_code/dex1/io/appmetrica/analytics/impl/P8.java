/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.E8;
import io.appmetrica.analytics.impl.K8;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

public final class P8
extends MessageNano {
    public static volatile P8[] e;
    public byte[] a;
    public E8 b;
    public byte[] c;
    public K8 d;

    public P8() {
        this.a();
    }

    public static P8 a(byte[] byArray) throws InvalidProtocolBufferNanoException {
        return MessageNano.mergeFrom(new P8(), byArray);
    }

    public static P8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new P8().a(codedInputByteBufferNano);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static P8[] b() {
        if (e != null) return e;
        Object object = InternalNano.LAZY_INIT_LOCK;
        synchronized (object) {
            try {
                if (e != null) return e;
                e = new P8[0];
                return e;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final P8 a() {
        byte[] byArray = WireFormatNano.EMPTY_BYTES;
        this.a = byArray;
        this.b = null;
        this.c = byArray;
        this.d = null;
        this.cachedSize = -1;
        return this;
    }

    public final P8 a(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        int n10;
        while ((n10 = codedInputByteBufferNano.readTag()) != 0) {
            if (n10 != 10) {
                if (n10 != 18) {
                    if (n10 != 26) {
                        if (n10 != 34) {
                            if (WireFormatNano.parseUnknownField(codedInputByteBufferNano, n10)) continue;
                            return this;
                        }
                        if (this.d == null) {
                            this.d = new K8();
                        }
                        codedInputByteBufferNano.readMessage(this.d);
                        continue;
                    }
                    this.c = codedInputByteBufferNano.readBytes();
                    continue;
                }
                if (this.b == null) {
                    this.b = new E8();
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
        int n10 = super.computeSerializedSize();
        Object object = this.a;
        Object object2 = WireFormatNano.EMPTY_BYTES;
        int n13 = n10;
        if (!Arrays.equals(object, object2)) {
            n13 = n10 + CodedOutputByteBufferNano.computeBytesSize(1, this.a);
        }
        object = this.b;
        n10 = n13;
        if (object != null) {
            n10 = n13 + CodedOutputByteBufferNano.computeMessageSize(2, (MessageNano)object);
        }
        n13 = n10;
        if (!Arrays.equals(this.c, object2)) {
            n13 = n10 + CodedOutputByteBufferNano.computeBytesSize(3, this.c);
        }
        object2 = this.d;
        n10 = n13;
        if (object2 != null) {
            n10 = n13 + CodedOutputByteBufferNano.computeMessageSize(4, (MessageNano)object2);
        }
        return n10;
    }

    @Override
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        Object object = this.a;
        Object object2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(object, object2)) {
            codedOutputByteBufferNano.writeBytes(1, this.a);
        }
        if ((object = (Object)this.b) != null) {
            codedOutputByteBufferNano.writeMessage(2, (MessageNano)object);
        }
        if (!Arrays.equals(this.c, object2)) {
            codedOutputByteBufferNano.writeBytes(3, this.c);
        }
        if ((object2 = (Object)this.d) != null) {
            codedOutputByteBufferNano.writeMessage(4, (MessageNano)object2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}

