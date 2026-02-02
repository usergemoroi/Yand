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

public final class Cm
extends MessageNano {
    public static volatile Cm[] c;
    public String a;
    public byte[] b;

    public Cm() {
        this.a();
    }

    public static Cm a(byte[] byArray) throws InvalidProtocolBufferNanoException {
        return MessageNano.mergeFrom(new Cm(), byArray);
    }

    public static Cm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Cm().a(codedInputByteBufferNano);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Cm[] b() {
        if (c != null) return c;
        Object object = InternalNano.LAZY_INIT_LOCK;
        synchronized (object) {
            try {
                if (c != null) return c;
                c = new Cm[0];
                return c;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final Cm a() {
        this.a = "";
        this.b = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    public final Cm a(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        int n10;
        while ((n10 = codedInputByteBufferNano.readTag()) != 0) {
            if (n10 != 10) {
                if (n10 != 18) {
                    if (WireFormatNano.parseUnknownField(codedInputByteBufferNano, n10)) continue;
                    return this;
                }
                this.b = codedInputByteBufferNano.readBytes();
                continue;
            }
            this.a = codedInputByteBufferNano.readString();
        }
        return this;
    }

    @Override
    public final int computeSerializedSize() {
        int n10;
        int n13 = n10 = super.computeSerializedSize();
        if (!this.a.equals("")) {
            n13 = n10 + CodedOutputByteBufferNano.computeStringSize(1, this.a);
        }
        n10 = n13;
        if (!Arrays.equals(this.b, WireFormatNano.EMPTY_BYTES)) {
            n10 = n13 + CodedOutputByteBufferNano.computeBytesSize(2, this.b);
        }
        return n10;
    }

    @Override
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.a);
        }
        if (!Arrays.equals(this.b, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(2, this.b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}

