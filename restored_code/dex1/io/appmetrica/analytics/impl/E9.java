/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.C9;
import io.appmetrica.analytics.impl.D9;
import io.appmetrica.analytics.impl.z9;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

public final class E9
extends MessageNano {
    public static final int A = 17;
    public static final int B = 18;
    public static final int C = 19;
    public static final int D = 20;
    public static final int E = 21;
    public static final int F = 25;
    public static final int G = 26;
    public static final int H = 27;
    public static final int I = 29;
    public static final int J = 35;
    public static final int K = 38;
    public static final int L = 40;
    public static final int M = 42;
    public static final int N = 0;
    public static final int O = 1;
    public static final int P = 2;
    public static final int Q = 0;
    public static final int R = 1;
    public static final int S = 2;
    public static volatile E9[] T;
    public static final int t = 1;
    public static final int u = 2;
    public static final int v = 4;
    public static final int w = 5;
    public static final int x = 7;
    public static final int y = 13;
    public static final int z = 16;
    public long a;
    public long b;
    public int c;
    public String d;
    public byte[] e;
    public z9 f;
    public D9 g;
    public String h;
    public int i;
    public int j;
    public int k;
    public byte[] l;
    public int m;
    public long n;
    public long o;
    public int p;
    public boolean q;
    public long r;
    public C9[] s;

    public E9() {
        this.a();
    }

    public static E9 a(byte[] byArray) throws InvalidProtocolBufferNanoException {
        return MessageNano.mergeFrom(new E9(), byArray);
    }

    public static E9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new E9().a(codedInputByteBufferNano);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static E9[] b() {
        if (T != null) return T;
        Object object = InternalNano.LAZY_INIT_LOCK;
        synchronized (object) {
            try {
                if (T != null) return T;
                T = new E9[0];
                return T;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final E9 a() {
        this.a = 0L;
        this.b = 0L;
        this.c = 0;
        this.d = "";
        byte[] byArray = WireFormatNano.EMPTY_BYTES;
        this.e = byArray;
        this.f = null;
        this.g = null;
        this.h = "";
        this.i = 0;
        this.j = 0;
        this.k = -1;
        this.l = byArray;
        this.m = -1;
        this.n = 0L;
        this.o = 0L;
        this.p = 0;
        this.q = false;
        this.r = 1L;
        this.s = C9.b();
        this.cachedSize = -1;
        return this;
    }

    public final E9 a(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        block22: while (true) {
            int n10 = codedInputByteBufferNano.readTag();
            switch (n10) {
                default: {
                    if (WireFormatNano.parseUnknownField(codedInputByteBufferNano, n10)) continue block22;
                    return this;
                }
                case 202: {
                    int n13 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 202);
                    Object object = this.s;
                    n10 = object == null ? 0 : ((C9[])object).length;
                    int n14 = n13 + n10;
                    C9[] c9Array = new C9[n14];
                    n13 = n10;
                    if (n10 != 0) {
                        System.arraycopy(object, 0, c9Array, 0, n10);
                        n13 = n10;
                    }
                    while (n13 < n14 - 1) {
                        c9Array[n13] = object = new C9();
                        codedInputByteBufferNano.readMessage((MessageNano)object);
                        codedInputByteBufferNano.readTag();
                        ++n13;
                    }
                    c9Array[n13] = object = new C9();
                    codedInputByteBufferNano.readMessage((MessageNano)object);
                    this.s = c9Array;
                    continue block22;
                }
                case 192: {
                    this.r = codedInputByteBufferNano.readUInt64();
                    continue block22;
                }
                case 184: {
                    this.q = codedInputByteBufferNano.readBool();
                    continue block22;
                }
                case 176: {
                    n10 = codedInputByteBufferNano.readInt32();
                    if (n10 != 0 && n10 != 1 && n10 != 2) continue block22;
                    this.p = n10;
                    continue block22;
                }
                case 136: {
                    this.o = codedInputByteBufferNano.readUInt64();
                    continue block22;
                }
                case 128: {
                    this.n = codedInputByteBufferNano.readUInt64();
                    continue block22;
                }
                case 120: {
                    n10 = codedInputByteBufferNano.readInt32();
                    if (n10 != -1 && n10 != 0 && n10 != 1) continue block22;
                    this.m = n10;
                    continue block22;
                }
                case 114: {
                    this.l = codedInputByteBufferNano.readBytes();
                    continue block22;
                }
                case 104: {
                    n10 = codedInputByteBufferNano.readInt32();
                    if (n10 != -1 && n10 != 0 && n10 != 1) continue block22;
                    this.k = n10;
                    continue block22;
                }
                case 96: {
                    n10 = codedInputByteBufferNano.readInt32();
                    if (n10 != 0 && n10 != 1 && n10 != 2) continue block22;
                    this.j = n10;
                    continue block22;
                }
                case 80: {
                    this.i = codedInputByteBufferNano.readUInt32();
                    continue block22;
                }
                case 66: {
                    this.h = codedInputByteBufferNano.readString();
                    continue block22;
                }
                case 58: {
                    if (this.g == null) {
                        this.g = new D9();
                    }
                    codedInputByteBufferNano.readMessage(this.g);
                    continue block22;
                }
                case 50: {
                    if (this.f == null) {
                        this.f = new z9();
                    }
                    codedInputByteBufferNano.readMessage(this.f);
                    continue block22;
                }
                case 42: {
                    this.e = codedInputByteBufferNano.readBytes();
                    continue block22;
                }
                case 34: {
                    this.d = codedInputByteBufferNano.readString();
                    continue block22;
                }
                case 24: {
                    this.c = codedInputByteBufferNano.readUInt32();
                    continue block22;
                }
                case 16: {
                    this.b = codedInputByteBufferNano.readUInt64();
                    continue block22;
                }
                case 8: {
                    this.a = codedInputByteBufferNano.readUInt64();
                    continue block22;
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
        int n13 = CodedOutputByteBufferNano.computeUInt64Size(1, this.a);
        int n14 = CodedOutputByteBufferNano.computeUInt64Size(2, this.b);
        n10 = n13 = CodedOutputByteBufferNano.computeUInt32Size(3, this.c) + (n14 + (n13 + n10));
        if (!this.d.equals("")) {
            n10 = n13 + CodedOutputByteBufferNano.computeStringSize(4, this.d);
        }
        Object object = this.e;
        Object object2 = WireFormatNano.EMPTY_BYTES;
        n14 = n10;
        if (!Arrays.equals(object, object2)) {
            n14 = n10 + CodedOutputByteBufferNano.computeBytesSize(5, this.e);
        }
        object = this.f;
        n13 = n14;
        if (object != null) {
            n13 = n14 + CodedOutputByteBufferNano.computeMessageSize(6, (MessageNano)object);
        }
        object = this.g;
        n10 = n13;
        if (object != null) {
            n10 = n13 + CodedOutputByteBufferNano.computeMessageSize(7, (MessageNano)object);
        }
        n13 = n10;
        if (!this.h.equals("")) {
            n13 = n10 + CodedOutputByteBufferNano.computeStringSize(8, this.h);
        }
        n14 = this.i;
        n10 = n13;
        if (n14 != 0) {
            n10 = n13 + CodedOutputByteBufferNano.computeUInt32Size(10, n14);
        }
        n14 = this.j;
        n13 = n10;
        if (n14 != 0) {
            n13 = n10 + CodedOutputByteBufferNano.computeInt32Size(12, n14);
        }
        n14 = this.k;
        n10 = n13;
        if (n14 != -1) {
            n10 = n13 + CodedOutputByteBufferNano.computeInt32Size(13, n14);
        }
        n13 = n10;
        if (!Arrays.equals(this.l, object2)) {
            n13 = n10 + CodedOutputByteBufferNano.computeBytesSize(14, this.l);
        }
        n14 = this.m;
        n10 = n13;
        if (n14 != -1) {
            n10 = n13 + CodedOutputByteBufferNano.computeInt32Size(15, n14);
        }
        long l10 = this.n;
        n14 = n10;
        if (l10 != 0L) {
            n14 = n10 + CodedOutputByteBufferNano.computeUInt64Size(16, l10);
        }
        l10 = this.o;
        n13 = n14;
        if (l10 != 0L) {
            n13 = n14 + CodedOutputByteBufferNano.computeUInt64Size(17, l10);
        }
        n14 = this.p;
        n10 = n13;
        if (n14 != 0) {
            n10 = n13 + CodedOutputByteBufferNano.computeInt32Size(22, n14);
        }
        boolean bl2 = this.q;
        n13 = n10;
        if (bl2) {
            n13 = n10 + CodedOutputByteBufferNano.computeBoolSize(23, bl2);
        }
        l10 = this.r;
        n10 = n13;
        if (l10 != 1L) {
            n10 = n13 + CodedOutputByteBufferNano.computeUInt64Size(24, l10);
        }
        object2 = this.s;
        n14 = n10;
        if (object2 != null) {
            n14 = n10;
            if (((byte[])object2).length > 0) {
                n13 = 0;
                while (true) {
                    object2 = this.s;
                    n14 = n10;
                    if (n13 >= ((byte[])object2).length) break;
                    object2 = object2[n13];
                    n14 = n10;
                    if (object2 != null) {
                        n14 = CodedOutputByteBufferNano.computeMessageSize(25, (MessageNano)object2) + n10;
                    }
                    ++n13;
                    n10 = n14;
                }
            }
        }
        return n14;
    }

    @Override
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        boolean bl2;
        long l10;
        int n10;
        Object object;
        Object object2;
        codedOutputByteBufferNano.writeUInt64(1, this.a);
        codedOutputByteBufferNano.writeUInt64(2, this.b);
        codedOutputByteBufferNano.writeUInt32(3, this.c);
        if (!this.d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.d);
        }
        if (!Arrays.equals(object2 = this.e, object = WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(5, this.e);
        }
        if ((object2 = (Object)this.f) != null) {
            codedOutputByteBufferNano.writeMessage(6, (MessageNano)object2);
        }
        if ((object2 = (Object)this.g) != null) {
            codedOutputByteBufferNano.writeMessage(7, (MessageNano)object2);
        }
        if (!this.h.equals("")) {
            codedOutputByteBufferNano.writeString(8, this.h);
        }
        if ((n10 = this.i) != 0) {
            codedOutputByteBufferNano.writeUInt32(10, n10);
        }
        if ((n10 = this.j) != 0) {
            codedOutputByteBufferNano.writeInt32(12, n10);
        }
        if ((n10 = this.k) != -1) {
            codedOutputByteBufferNano.writeInt32(13, n10);
        }
        if (!Arrays.equals(this.l, object)) {
            codedOutputByteBufferNano.writeBytes(14, this.l);
        }
        if ((n10 = this.m) != -1) {
            codedOutputByteBufferNano.writeInt32(15, n10);
        }
        if ((l10 = this.n) != 0L) {
            codedOutputByteBufferNano.writeUInt64(16, l10);
        }
        if ((l10 = this.o) != 0L) {
            codedOutputByteBufferNano.writeUInt64(17, l10);
        }
        if ((n10 = this.p) != 0) {
            codedOutputByteBufferNano.writeInt32(22, n10);
        }
        if (bl2 = this.q) {
            codedOutputByteBufferNano.writeBool(23, bl2);
        }
        if ((l10 = this.r) != 1L) {
            codedOutputByteBufferNano.writeUInt64(24, l10);
        }
        if ((object = (Object)this.s) != null && ((byte[])object).length > 0) {
            for (n10 = 0; n10 < ((byte[])(object = (Object)this.s)).length; ++n10) {
                if ((object = (Object)object[n10]) == null) continue;
                codedOutputByteBufferNano.writeMessage(25, (MessageNano)object);
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}

