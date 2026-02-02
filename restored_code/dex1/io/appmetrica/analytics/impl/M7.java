/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.N7;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

public final class M7
extends MessageNano {
    public static volatile M7[] s;
    public int a;
    public String b;
    public String c;
    public long d;
    public N7 e;
    public String f;
    public String g;
    public long h;
    public int i;
    public int j;
    public String k;
    public int l;
    public String m;
    public int n;
    public int o;
    public int p;
    public int q;
    public byte[] r;

    public M7() {
        this.a();
    }

    public static M7 a(byte[] byArray) throws InvalidProtocolBufferNanoException {
        return MessageNano.mergeFrom(new M7(), byArray);
    }

    public static M7 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new M7().a(codedInputByteBufferNano);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static M7[] b() {
        if (s != null) return s;
        Object object = InternalNano.LAZY_INIT_LOCK;
        synchronized (object) {
            try {
                if (s != null) return s;
                s = new M7[0];
                return s;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final M7 a() {
        this.a = -1;
        this.b = "";
        this.c = "";
        this.d = -1L;
        this.e = null;
        this.f = "";
        this.g = "";
        this.h = -1L;
        this.i = -1;
        this.j = -1;
        this.k = "";
        this.l = -1;
        this.m = "";
        this.n = -1;
        this.o = -1;
        this.p = -1;
        this.q = -1;
        this.r = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    public final M7 a(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        block21: while (true) {
            int n10 = codedInputByteBufferNano.readTag();
            switch (n10) {
                default: {
                    if (WireFormatNano.parseUnknownField(codedInputByteBufferNano, n10)) continue block21;
                    return this;
                }
                case 146: {
                    this.r = codedInputByteBufferNano.readBytes();
                    continue block21;
                }
                case 136: {
                    this.q = codedInputByteBufferNano.readInt32();
                    continue block21;
                }
                case 128: {
                    n10 = codedInputByteBufferNano.readInt32();
                    if (n10 != -1 && n10 != 0 && n10 != 1) continue block21;
                    this.p = n10;
                    continue block21;
                }
                case 120: {
                    this.o = codedInputByteBufferNano.readInt32();
                    continue block21;
                }
                case 112: {
                    this.n = codedInputByteBufferNano.readInt32();
                    continue block21;
                }
                case 106: {
                    this.m = codedInputByteBufferNano.readString();
                    continue block21;
                }
                case 96: {
                    this.l = codedInputByteBufferNano.readInt32();
                    continue block21;
                }
                case 90: {
                    this.k = codedInputByteBufferNano.readString();
                    continue block21;
                }
                case 80: {
                    this.j = codedInputByteBufferNano.readInt32();
                    continue block21;
                }
                case 72: {
                    this.i = codedInputByteBufferNano.readInt32();
                    continue block21;
                }
                case 64: {
                    this.h = codedInputByteBufferNano.readInt64();
                    continue block21;
                }
                case 58: {
                    this.g = codedInputByteBufferNano.readString();
                    continue block21;
                }
                case 50: {
                    this.f = codedInputByteBufferNano.readString();
                    continue block21;
                }
                case 42: {
                    if (this.e == null) {
                        this.e = new N7();
                    }
                    codedInputByteBufferNano.readMessage(this.e);
                    continue block21;
                }
                case 32: {
                    this.d = codedInputByteBufferNano.readInt64();
                    continue block21;
                }
                case 26: {
                    this.c = codedInputByteBufferNano.readString();
                    continue block21;
                }
                case 18: {
                    this.b = codedInputByteBufferNano.readString();
                    continue block21;
                }
                case 8: {
                    this.a = codedInputByteBufferNano.readInt32();
                    continue block21;
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
        n13 = n14;
        if (!this.b.equals("")) {
            n13 = n14 + CodedOutputByteBufferNano.computeStringSize(2, this.b);
        }
        n10 = n13;
        if (!this.c.equals("")) {
            n10 = n13 + CodedOutputByteBufferNano.computeStringSize(3, this.c);
        }
        long l10 = this.d;
        n14 = n10;
        if (l10 != -1L) {
            n14 = n10 + CodedOutputByteBufferNano.computeInt64Size(4, l10);
        }
        N7 n73 = this.e;
        n10 = n14;
        if (n73 != null) {
            n10 = n14 + CodedOutputByteBufferNano.computeMessageSize(5, n73);
        }
        n14 = n10;
        if (!this.f.equals("")) {
            n14 = n10 + CodedOutputByteBufferNano.computeStringSize(6, this.f);
        }
        n13 = n14;
        if (!this.g.equals("")) {
            n13 = n14 + CodedOutputByteBufferNano.computeStringSize(7, this.g);
        }
        l10 = this.h;
        n10 = n13;
        if (l10 != -1L) {
            n10 = n13 + CodedOutputByteBufferNano.computeInt64Size(8, l10);
        }
        n13 = this.i;
        n14 = n10;
        if (n13 != -1) {
            n14 = n10 + CodedOutputByteBufferNano.computeInt32Size(9, n13);
        }
        n13 = this.j;
        n10 = n14;
        if (n13 != -1) {
            n10 = n14 + CodedOutputByteBufferNano.computeInt32Size(10, n13);
        }
        n14 = n10;
        if (!this.k.equals("")) {
            n14 = n10 + CodedOutputByteBufferNano.computeStringSize(11, this.k);
        }
        n10 = this.l;
        n13 = n14;
        if (n10 != -1) {
            n13 = n14 + CodedOutputByteBufferNano.computeInt32Size(12, n10);
        }
        n10 = n13;
        if (!this.m.equals("")) {
            n10 = n13 + CodedOutputByteBufferNano.computeStringSize(13, this.m);
        }
        n13 = this.n;
        n14 = n10;
        if (n13 != -1) {
            n14 = n10 + CodedOutputByteBufferNano.computeInt32Size(14, n13);
        }
        n13 = this.o;
        n10 = n14;
        if (n13 != -1) {
            n10 = n14 + CodedOutputByteBufferNano.computeInt32Size(15, n13);
        }
        n13 = this.p;
        n14 = n10;
        if (n13 != -1) {
            n14 = n10 + CodedOutputByteBufferNano.computeInt32Size(16, n13);
        }
        n13 = this.q;
        n10 = n14;
        if (n13 != -1) {
            n10 = n14 + CodedOutputByteBufferNano.computeInt32Size(17, n13);
        }
        n14 = n10;
        if (!Arrays.equals(this.r, WireFormatNano.EMPTY_BYTES)) {
            n14 = n10 + CodedOutputByteBufferNano.computeBytesSize(18, this.r);
        }
        return n14;
    }

    @Override
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        N7 n73;
        long l10;
        int n10 = this.a;
        if (n10 != -1) {
            codedOutputByteBufferNano.writeInt32(1, n10);
        }
        if (!this.b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.b);
        }
        if (!this.c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.c);
        }
        if ((l10 = this.d) != -1L) {
            codedOutputByteBufferNano.writeInt64(4, l10);
        }
        if ((n73 = this.e) != null) {
            codedOutputByteBufferNano.writeMessage(5, n73);
        }
        if (!this.f.equals("")) {
            codedOutputByteBufferNano.writeString(6, this.f);
        }
        if (!this.g.equals("")) {
            codedOutputByteBufferNano.writeString(7, this.g);
        }
        if ((l10 = this.h) != -1L) {
            codedOutputByteBufferNano.writeInt64(8, l10);
        }
        if ((n10 = this.i) != -1) {
            codedOutputByteBufferNano.writeInt32(9, n10);
        }
        if ((n10 = this.j) != -1) {
            codedOutputByteBufferNano.writeInt32(10, n10);
        }
        if (!this.k.equals("")) {
            codedOutputByteBufferNano.writeString(11, this.k);
        }
        if ((n10 = this.l) != -1) {
            codedOutputByteBufferNano.writeInt32(12, n10);
        }
        if (!this.m.equals("")) {
            codedOutputByteBufferNano.writeString(13, this.m);
        }
        if ((n10 = this.n) != -1) {
            codedOutputByteBufferNano.writeInt32(14, n10);
        }
        if ((n10 = this.o) != -1) {
            codedOutputByteBufferNano.writeInt32(15, n10);
        }
        if ((n10 = this.p) != -1) {
            codedOutputByteBufferNano.writeInt32(16, n10);
        }
        if ((n10 = this.q) != -1) {
            codedOutputByteBufferNano.writeInt32(17, n10);
        }
        if (!Arrays.equals(this.r, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(18, this.r);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}

