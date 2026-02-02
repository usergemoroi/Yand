/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.I9;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

public final class F9
extends MessageNano {
    public static final int d = 0;
    public static final int e = 1;
    public static final int f = 2;
    public static volatile F9[] g;
    public I9 a;
    public String b;
    public int c;

    public F9() {
        this.a();
    }

    public static F9 a(byte[] byArray) throws InvalidProtocolBufferNanoException {
        return MessageNano.mergeFrom(new F9(), byArray);
    }

    public static F9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new F9().a(codedInputByteBufferNano);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static F9[] b() {
        if (g != null) return g;
        Object object = InternalNano.LAZY_INIT_LOCK;
        synchronized (object) {
            try {
                if (g != null) return g;
                g = new F9[0];
                return g;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final F9 a() {
        this.a = null;
        this.b = "";
        this.c = 0;
        this.cachedSize = -1;
        return this;
    }

    public final F9 a(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        int n10;
        while ((n10 = codedInputByteBufferNano.readTag()) != 0) {
            if (n10 != 10) {
                if (n10 != 18) {
                    if (n10 != 40) {
                        if (WireFormatNano.parseUnknownField(codedInputByteBufferNano, n10)) continue;
                        return this;
                    }
                    n10 = codedInputByteBufferNano.readInt32();
                    if (n10 != 0 && n10 != 1 && n10 != 2) continue;
                    this.c = n10;
                    continue;
                }
                this.b = codedInputByteBufferNano.readString();
                continue;
            }
            if (this.a == null) {
                this.a = new I9();
            }
            codedInputByteBufferNano.readMessage(this.a);
        }
        return this;
    }

    @Override
    public final int computeSerializedSize() {
        int n10 = super.computeSerializedSize();
        I9 i94 = this.a;
        int n13 = n10;
        if (i94 != null) {
            n13 = n10 + CodedOutputByteBufferNano.computeMessageSize(1, i94);
        }
        n10 = CodedOutputByteBufferNano.computeStringSize(2, this.b) + n13;
        int n14 = this.c;
        n13 = n10;
        if (n14 != 0) {
            n13 = n10 + CodedOutputByteBufferNano.computeInt32Size(5, n14);
        }
        return n13;
    }

    @Override
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        I9 i94 = this.a;
        if (i94 != null) {
            codedOutputByteBufferNano.writeMessage(1, i94);
        }
        codedOutputByteBufferNano.writeString(2, this.b);
        int n10 = this.c;
        if (n10 != 0) {
            codedOutputByteBufferNano.writeInt32(5, n10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}

