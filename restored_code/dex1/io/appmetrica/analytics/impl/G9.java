/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.E9;
import io.appmetrica.analytics.impl.F9;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

public final class G9
extends MessageNano {
    public static final int d = 0;
    public static final int e = 1;
    public static final int f = 2;
    public static final int g = 3;
    public static final int h = 4;
    public static final int i = 5;
    public static final int j = 6;
    public static final int k = 7;
    public static final int l = 8;
    public static final int m = 9;
    public static final int n = 10;
    public static final int o = 11;
    public static final int p = 12;
    public static volatile G9[] q;
    public long a;
    public F9 b;
    public E9[] c;

    public G9() {
        this.a();
    }

    public static G9 a(byte[] byArray) throws InvalidProtocolBufferNanoException {
        return MessageNano.mergeFrom(new G9(), byArray);
    }

    public static G9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new G9().a(codedInputByteBufferNano);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static G9[] b() {
        if (q != null) return q;
        Object object = InternalNano.LAZY_INIT_LOCK;
        synchronized (object) {
            try {
                if (q != null) return q;
                q = new G9[0];
                return q;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final G9 a() {
        this.a = 0L;
        this.b = null;
        this.c = E9.b();
        this.cachedSize = -1;
        return this;
    }

    public final G9 a(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        int n10;
        while ((n10 = codedInputByteBufferNano.readTag()) != 0) {
            if (n10 != 8) {
                if (n10 != 18) {
                    if (n10 != 26) {
                        if (WireFormatNano.parseUnknownField(codedInputByteBufferNano, n10)) continue;
                        return this;
                    }
                    int n13 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                    Object object = this.c;
                    n10 = object == null ? 0 : ((E9[])object).length;
                    int n14 = n13 + n10;
                    E9[] e9Array = new E9[n14];
                    n13 = n10;
                    if (n10 != 0) {
                        System.arraycopy(object, 0, e9Array, 0, n10);
                        n13 = n10;
                    }
                    while (n13 < n14 - 1) {
                        e9Array[n13] = object = new E9();
                        codedInputByteBufferNano.readMessage((MessageNano)object);
                        codedInputByteBufferNano.readTag();
                        ++n13;
                    }
                    e9Array[n13] = object = new E9();
                    codedInputByteBufferNano.readMessage((MessageNano)object);
                    this.c = e9Array;
                    continue;
                }
                if (this.b == null) {
                    this.b = new F9();
                }
                codedInputByteBufferNano.readMessage(this.b);
                continue;
            }
            this.a = codedInputByteBufferNano.readUInt64();
        }
        return this;
    }

    @Override
    public final int computeSerializedSize() {
        int n10 = super.computeSerializedSize();
        int n13 = CodedOutputByteBufferNano.computeUInt64Size(1, this.a) + n10;
        Object object = this.b;
        n10 = n13;
        if (object != null) {
            n10 = n13 + CodedOutputByteBufferNano.computeMessageSize(2, (MessageNano)object);
        }
        object = this.c;
        int n14 = n10;
        if (object != null) {
            n14 = n10;
            if (((E9[])object).length > 0) {
                n13 = 0;
                while (true) {
                    object = this.c;
                    n14 = n10;
                    if (n13 >= ((E9[])object).length) break;
                    object = object[n13];
                    n14 = n10;
                    if (object != null) {
                        n14 = CodedOutputByteBufferNano.computeMessageSize(3, (MessageNano)object) + n10;
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
        codedOutputByteBufferNano.writeUInt64(1, this.a);
        Object object = this.b;
        if (object != null) {
            codedOutputByteBufferNano.writeMessage(2, (MessageNano)object);
        }
        if ((object = this.c) != null && ((E9[])object).length > 0) {
            for (int i14 = 0; i14 < ((E9[])(object = this.c)).length; ++i14) {
                if ((object = object[i14]) == null) continue;
                codedOutputByteBufferNano.writeMessage(3, (MessageNano)object);
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}

