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

public final class N7
extends MessageNano {
    public static volatile N7[] k;
    public int a;
    public double b;
    public double c;
    public int d;
    public int e;
    public int f;
    public int g;
    public long h;
    public String i;
    public String j;

    public N7() {
        this.a();
    }

    public static N7 a(byte[] byArray) throws InvalidProtocolBufferNanoException {
        return MessageNano.mergeFrom(new N7(), byArray);
    }

    public static N7 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new N7().a(codedInputByteBufferNano);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static N7[] b() {
        if (k != null) return k;
        Object object = InternalNano.LAZY_INIT_LOCK;
        synchronized (object) {
            try {
                if (k != null) return k;
                k = new N7[0];
                return k;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final N7 a() {
        this.a = -1;
        this.b = -1.0;
        this.c = -1.0;
        this.d = -1;
        this.e = -1;
        this.f = -1;
        this.g = -1;
        this.h = -1L;
        this.i = "";
        this.j = "";
        this.cachedSize = -1;
        return this;
    }

    public final N7 a(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        block13: while (true) {
            int n10 = codedInputByteBufferNano.readTag();
            switch (n10) {
                default: {
                    if (WireFormatNano.parseUnknownField(codedInputByteBufferNano, n10)) continue block13;
                    return this;
                }
                case 82: {
                    this.j = codedInputByteBufferNano.readString();
                    continue block13;
                }
                case 74: {
                    this.i = codedInputByteBufferNano.readString();
                    continue block13;
                }
                case 64: {
                    this.h = codedInputByteBufferNano.readInt64();
                    continue block13;
                }
                case 56: {
                    this.g = codedInputByteBufferNano.readInt32();
                    continue block13;
                }
                case 48: {
                    this.f = codedInputByteBufferNano.readInt32();
                    continue block13;
                }
                case 40: {
                    this.e = codedInputByteBufferNano.readInt32();
                    continue block13;
                }
                case 32: {
                    this.d = codedInputByteBufferNano.readInt32();
                    continue block13;
                }
                case 25: {
                    this.c = codedInputByteBufferNano.readDouble();
                    continue block13;
                }
                case 17: {
                    this.b = codedInputByteBufferNano.readDouble();
                    continue block13;
                }
                case 8: {
                    n10 = codedInputByteBufferNano.readInt32();
                    if (n10 != -1 && n10 != 0 && n10 != 1) continue block13;
                    this.a = n10;
                    continue block13;
                }
                case 0: 
            }
            break;
        }
        return this;
    }

    @Override
    public final int computeSerializedSize() {
        int n10 = super.computeSerializedSize();
        int n13 = this.a;
        int n14 = n10;
        if (n13 != -1) {
            n14 = n10 + CodedOutputByteBufferNano.computeInt32Size(1, n13);
        }
        n10 = n14;
        if (Double.doubleToLongBits(this.b) != Double.doubleToLongBits(-1.0)) {
            n10 = n14 + CodedOutputByteBufferNano.computeDoubleSize(2, this.b);
        }
        n14 = n10;
        if (Double.doubleToLongBits(this.c) != Double.doubleToLongBits(-1.0)) {
            n14 = n10 + CodedOutputByteBufferNano.computeDoubleSize(3, this.c);
        }
        n13 = this.d;
        n10 = n14;
        if (n13 != -1) {
            n10 = n14 + CodedOutputByteBufferNano.computeInt32Size(4, n13);
        }
        n13 = this.e;
        n14 = n10;
        if (n13 != -1) {
            n14 = n10 + CodedOutputByteBufferNano.computeInt32Size(5, n13);
        }
        n13 = this.f;
        n10 = n14;
        if (n13 != -1) {
            n10 = n14 + CodedOutputByteBufferNano.computeInt32Size(6, n13);
        }
        n13 = this.g;
        n14 = n10;
        if (n13 != -1) {
            n14 = n10 + CodedOutputByteBufferNano.computeInt32Size(7, n13);
        }
        long l10 = this.h;
        n10 = n14;
        if (l10 != -1L) {
            n10 = n14 + CodedOutputByteBufferNano.computeInt64Size(8, l10);
        }
        n14 = n10;
        if (!this.i.equals("")) {
            n14 = n10 + CodedOutputByteBufferNano.computeStringSize(9, this.i);
        }
        n10 = n14;
        if (!this.j.equals("")) {
            n10 = n14 + CodedOutputByteBufferNano.computeStringSize(10, this.j);
        }
        return n10;
    }

    @Override
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        long l10;
        int n10 = this.a;
        if (n10 != -1) {
            codedOutputByteBufferNano.writeInt32(1, n10);
        }
        if (Double.doubleToLongBits(this.b) != Double.doubleToLongBits(-1.0)) {
            codedOutputByteBufferNano.writeDouble(2, this.b);
        }
        if (Double.doubleToLongBits(this.c) != Double.doubleToLongBits(-1.0)) {
            codedOutputByteBufferNano.writeDouble(3, this.c);
        }
        if ((n10 = this.d) != -1) {
            codedOutputByteBufferNano.writeInt32(4, n10);
        }
        if ((n10 = this.e) != -1) {
            codedOutputByteBufferNano.writeInt32(5, n10);
        }
        if ((n10 = this.f) != -1) {
            codedOutputByteBufferNano.writeInt32(6, n10);
        }
        if ((n10 = this.g) != -1) {
            codedOutputByteBufferNano.writeInt32(7, n10);
        }
        if ((l10 = this.h) != -1L) {
            codedOutputByteBufferNano.writeInt64(8, l10);
        }
        if (!this.i.equals("")) {
            codedOutputByteBufferNano.writeString(9, this.i);
        }
        if (!this.j.equals("")) {
            codedOutputByteBufferNano.writeString(10, this.j);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}

