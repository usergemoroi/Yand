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

public final class B2
extends MessageNano {
    public static volatile B2[] f;
    public int a;
    public String b;
    public String c;
    public long d;
    public long e;

    public B2() {
        this.a();
    }

    public static B2 a(byte[] byArray) throws InvalidProtocolBufferNanoException {
        return MessageNano.mergeFrom(new B2(), byArray);
    }

    public static B2 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new B2().a(codedInputByteBufferNano);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static B2[] b() {
        if (f != null) return f;
        Object object = InternalNano.LAZY_INIT_LOCK;
        synchronized (object) {
            try {
                if (f != null) return f;
                f = new B2[0];
                return f;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final B2 a() {
        this.a = 1;
        this.b = "";
        this.c = "";
        this.d = 0L;
        this.e = 0L;
        this.cachedSize = -1;
        return this;
    }

    public final B2 a(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        int n10;
        while ((n10 = codedInputByteBufferNano.readTag()) != 0) {
            if (n10 != 8) {
                if (n10 != 18) {
                    if (n10 != 26) {
                        if (n10 != 32) {
                            if (n10 != 40) {
                                if (WireFormatNano.parseUnknownField(codedInputByteBufferNano, n10)) continue;
                                return this;
                            }
                            this.e = codedInputByteBufferNano.readUInt64();
                            continue;
                        }
                        this.d = codedInputByteBufferNano.readUInt64();
                        continue;
                    }
                    this.c = codedInputByteBufferNano.readString();
                    continue;
                }
                this.b = codedInputByteBufferNano.readString();
                continue;
            }
            n10 = codedInputByteBufferNano.readInt32();
            if (n10 != 1 && n10 != 2 && n10 != 3) continue;
            this.a = n10;
        }
        return this;
    }

    @Override
    public final int computeSerializedSize() {
        int n10 = super.computeSerializedSize();
        int n13 = CodedOutputByteBufferNano.computeInt32Size(1, this.a);
        int n14 = CodedOutputByteBufferNano.computeStringSize(2, this.b);
        int n15 = CodedOutputByteBufferNano.computeStringSize(3, this.c);
        int n16 = CodedOutputByteBufferNano.computeUInt64Size(4, this.d);
        return CodedOutputByteBufferNano.computeUInt64Size(5, this.e) + (n16 + (n15 + (n14 + (n13 + n10))));
    }

    @Override
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeInt32(1, this.a);
        codedOutputByteBufferNano.writeString(2, this.b);
        codedOutputByteBufferNano.writeString(3, this.c);
        codedOutputByteBufferNano.writeUInt64(4, this.d);
        codedOutputByteBufferNano.writeUInt64(5, this.e);
        super.writeTo(codedOutputByteBufferNano);
    }
}

