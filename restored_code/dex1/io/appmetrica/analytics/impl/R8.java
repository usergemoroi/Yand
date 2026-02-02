/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.M8;
import io.appmetrica.analytics.impl.O8;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

public final class R8
extends MessageNano {
    public static volatile R8[] c;
    public M8 a;
    public O8 b;

    public R8() {
        this.a();
    }

    public static R8 a(byte[] byArray) throws InvalidProtocolBufferNanoException {
        return MessageNano.mergeFrom(new R8(), byArray);
    }

    public static R8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new R8().a(codedInputByteBufferNano);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static R8[] b() {
        if (c != null) return c;
        Object object = InternalNano.LAZY_INIT_LOCK;
        synchronized (object) {
            try {
                if (c != null) return c;
                c = new R8[0];
                return c;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final R8 a() {
        this.a = null;
        this.b = null;
        this.cachedSize = -1;
        return this;
    }

    public final R8 a(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        int n10;
        while ((n10 = codedInputByteBufferNano.readTag()) != 0) {
            if (n10 != 10) {
                if (n10 != 18) {
                    if (WireFormatNano.parseUnknownField(codedInputByteBufferNano, n10)) continue;
                    return this;
                }
                if (this.b == null) {
                    this.b = new O8();
                }
                codedInputByteBufferNano.readMessage(this.b);
                continue;
            }
            if (this.a == null) {
                this.a = new M8();
            }
            codedInputByteBufferNano.readMessage(this.a);
        }
        return this;
    }

    @Override
    public final int computeSerializedSize() {
        int n10 = super.computeSerializedSize();
        MessageNano messageNano = this.a;
        int n13 = n10;
        if (messageNano != null) {
            n13 = n10 + CodedOutputByteBufferNano.computeMessageSize(1, messageNano);
        }
        messageNano = this.b;
        n10 = n13;
        if (messageNano != null) {
            n10 = n13 + CodedOutputByteBufferNano.computeMessageSize(2, messageNano);
        }
        return n10;
    }

    @Override
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        MessageNano messageNano = this.a;
        if (messageNano != null) {
            codedOutputByteBufferNano.writeMessage(1, messageNano);
        }
        if ((messageNano = this.b) != null) {
            codedOutputByteBufferNano.writeMessage(2, messageNano);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}

