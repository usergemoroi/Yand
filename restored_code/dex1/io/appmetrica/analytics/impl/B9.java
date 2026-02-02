/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.A9;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

public final class B9
extends MessageNano {
    public static volatile B9[] n;
    public String a;
    public String b;
    public String c;
    public int d;
    public String e;
    public String f;
    public boolean g;
    public int h;
    public String i;
    public String j;
    public int k;
    public A9[] l;
    public String m;

    public B9() {
        this.a();
    }

    public static B9 a(byte[] byArray) throws InvalidProtocolBufferNanoException {
        return MessageNano.mergeFrom(new B9(), byArray);
    }

    public static B9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new B9().a(codedInputByteBufferNano);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static B9[] b() {
        if (n != null) return n;
        Object object = InternalNano.LAZY_INIT_LOCK;
        synchronized (object) {
            try {
                if (n != null) return n;
                n = new B9[0];
                return n;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final B9 a() {
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = 0;
        this.e = "";
        this.f = "";
        this.g = false;
        this.h = 0;
        this.i = "";
        this.j = "";
        this.k = 0;
        this.l = A9.b();
        this.m = "";
        this.cachedSize = -1;
        return this;
    }

    public final B9 a(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        block16: while (true) {
            int n10 = codedInputByteBufferNano.readTag();
            switch (n10) {
                default: {
                    if (WireFormatNano.parseUnknownField(codedInputByteBufferNano, n10)) continue block16;
                    return this;
                }
                case 194: {
                    this.m = codedInputByteBufferNano.readString();
                    continue block16;
                }
                case 186: {
                    int n13 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 186);
                    Object object = this.l;
                    n10 = object == null ? 0 : ((A9[])object).length;
                    int n14 = n13 + n10;
                    A9[] a9Array = new A9[n14];
                    n13 = n10;
                    if (n10 != 0) {
                        System.arraycopy(object, 0, a9Array, 0, n10);
                        n13 = n10;
                    }
                    while (n13 < n14 - 1) {
                        a9Array[n13] = object = new A9();
                        codedInputByteBufferNano.readMessage((MessageNano)object);
                        codedInputByteBufferNano.readTag();
                        ++n13;
                    }
                    a9Array[n13] = object = new A9();
                    codedInputByteBufferNano.readMessage((MessageNano)object);
                    this.l = a9Array;
                    continue block16;
                }
                case 176: {
                    this.k = codedInputByteBufferNano.readUInt32();
                    continue block16;
                }
                case 170: {
                    this.j = codedInputByteBufferNano.readString();
                    continue block16;
                }
                case 154: {
                    this.i = codedInputByteBufferNano.readString();
                    continue block16;
                }
                case 144: {
                    this.h = codedInputByteBufferNano.readUInt32();
                    continue block16;
                }
                case 136: {
                    this.g = codedInputByteBufferNano.readBool();
                    continue block16;
                }
                case 122: {
                    this.f = codedInputByteBufferNano.readString();
                    continue block16;
                }
                case 82: {
                    this.e = codedInputByteBufferNano.readString();
                    continue block16;
                }
                case 40: {
                    this.d = codedInputByteBufferNano.readUInt32();
                    continue block16;
                }
                case 34: {
                    this.c = codedInputByteBufferNano.readString();
                    continue block16;
                }
                case 18: {
                    this.b = codedInputByteBufferNano.readString();
                    continue block16;
                }
                case 10: {
                    this.a = codedInputByteBufferNano.readString();
                    continue block16;
                }
                case 0: 
            }
            break;
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
        n13 = n10;
        if (!this.c.equals("")) {
            n13 = n10 + CodedOutputByteBufferNano.computeStringSize(4, this.c);
        }
        int n14 = this.d;
        n10 = n13;
        if (n14 != 0) {
            n10 = n13 + CodedOutputByteBufferNano.computeUInt32Size(5, n14);
        }
        n14 = n10;
        if (!this.e.equals("")) {
            n14 = n10 + CodedOutputByteBufferNano.computeStringSize(10, this.e);
        }
        n13 = n14;
        if (!this.f.equals("")) {
            n13 = n14 + CodedOutputByteBufferNano.computeStringSize(15, this.f);
        }
        boolean bl2 = this.g;
        n10 = n13;
        if (bl2) {
            n10 = n13 + CodedOutputByteBufferNano.computeBoolSize(17, bl2);
        }
        n14 = this.h;
        n13 = n10;
        if (n14 != 0) {
            n13 = n10 + CodedOutputByteBufferNano.computeUInt32Size(18, n14);
        }
        n14 = n13;
        if (!this.i.equals("")) {
            n14 = n13 + CodedOutputByteBufferNano.computeStringSize(19, this.i);
        }
        n10 = n14;
        if (!this.j.equals("")) {
            n10 = n14 + CodedOutputByteBufferNano.computeStringSize(21, this.j);
        }
        n14 = this.k;
        n13 = n10;
        if (n14 != 0) {
            n13 = n10 + CodedOutputByteBufferNano.computeUInt32Size(22, n14);
        }
        Object object = this.l;
        n10 = n13;
        if (object != null) {
            n10 = n13;
            if (((A9[])object).length > 0) {
                n14 = 0;
                while (true) {
                    object = this.l;
                    n10 = n13;
                    if (n14 >= ((A9[])object).length) break;
                    object = object[n14];
                    n10 = n13;
                    if (object != null) {
                        n10 = CodedOutputByteBufferNano.computeMessageSize(23, (MessageNano)object) + n13;
                    }
                    ++n14;
                    n13 = n10;
                }
            }
        }
        n13 = n10;
        if (!this.m.equals("")) {
            n13 = n10 + CodedOutputByteBufferNano.computeStringSize(24, this.m);
        }
        return n13;
    }

    @Override
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        Object object;
        boolean bl2;
        int n10;
        if (!this.a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.a);
        }
        if (!this.b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.b);
        }
        if (!this.c.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.c);
        }
        if ((n10 = this.d) != 0) {
            codedOutputByteBufferNano.writeUInt32(5, n10);
        }
        if (!this.e.equals("")) {
            codedOutputByteBufferNano.writeString(10, this.e);
        }
        if (!this.f.equals("")) {
            codedOutputByteBufferNano.writeString(15, this.f);
        }
        if (bl2 = this.g) {
            codedOutputByteBufferNano.writeBool(17, bl2);
        }
        if ((n10 = this.h) != 0) {
            codedOutputByteBufferNano.writeUInt32(18, n10);
        }
        if (!this.i.equals("")) {
            codedOutputByteBufferNano.writeString(19, this.i);
        }
        if (!this.j.equals("")) {
            codedOutputByteBufferNano.writeString(21, this.j);
        }
        if ((n10 = this.k) != 0) {
            codedOutputByteBufferNano.writeUInt32(22, n10);
        }
        if ((object = this.l) != null && ((A9[])object).length > 0) {
            for (n10 = 0; n10 < ((A9[])(object = this.l)).length; ++n10) {
                if ((object = object[n10]) == null) continue;
                codedOutputByteBufferNano.writeMessage(23, (MessageNano)object);
            }
        }
        if (!this.m.equals("")) {
            codedOutputByteBufferNano.writeString(24, this.m);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}

