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

public final class Gf
extends MessageNano {
    public static volatile Gf[] d;
    public String a;
    public String b;
    public int c;

    public Gf() {
        this.a();
    }

    public static Gf a(byte[] byArray) throws InvalidProtocolBufferNanoException {
        return MessageNano.mergeFrom(new Gf(), byArray);
    }

    public static Gf b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Gf().a(codedInputByteBufferNano);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Gf[] b() {
        if (d != null) return d;
        Object object = InternalNano.LAZY_INIT_LOCK;
        synchronized (object) {
            try {
                if (d != null) return d;
                d = new Gf[0];
                return d;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final Gf a() {
        this.a = "";
        this.b = "";
        this.c = 0;
        this.cachedSize = -1;
        return this;
    }

    public final Gf a(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        int n10;
        while ((n10 = codedInputByteBufferNano.readTag()) != 0) {
            if (n10 != 10) {
                if (n10 != 18) {
                    if (n10 != 24) {
                        if (WireFormatNano.parseUnknownField(codedInputByteBufferNano, n10)) continue;
                        return this;
                    }
                    n10 = codedInputByteBufferNano.readInt32();
                    if (n10 != 0 && n10 != 1 && n10 != 2 && n10 != 3) continue;
                    this.c = n10;
                    continue;
                }
                this.b = codedInputByteBufferNano.readString();
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
        if (!this.b.equals("")) {
            n10 = n13 + CodedOutputByteBufferNano.computeStringSize(2, this.b);
        }
        return CodedOutputByteBufferNano.computeInt32Size(3, this.c) + n10;
    }

    @Override
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.a);
        }
        if (!this.b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.b);
        }
        codedOutputByteBufferNano.writeInt32(3, this.c);
        super.writeTo(codedOutputByteBufferNano);
    }
}

