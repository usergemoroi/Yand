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

public final class E8
extends MessageNano {
    public static volatile E8[] b;
    public byte[][] a;

    public E8() {
        this.a();
    }

    public static E8 a(byte[] byArray) throws InvalidProtocolBufferNanoException {
        return MessageNano.mergeFrom(new E8(), byArray);
    }

    public static E8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new E8().a(codedInputByteBufferNano);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static E8[] b() {
        if (b != null) return b;
        Object object = InternalNano.LAZY_INIT_LOCK;
        synchronized (object) {
            try {
                if (b != null) return b;
                b = new E8[0];
                return b;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final E8 a() {
        this.a = WireFormatNano.EMPTY_BYTES_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    public final E8 a(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        int n10;
        while ((n10 = codedInputByteBufferNano.readTag()) != 0) {
            if (n10 != 10) {
                if (WireFormatNano.parseUnknownField(codedInputByteBufferNano, n10)) continue;
                return this;
            }
            int n13 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
            byte[][] byArray = this.a;
            n10 = byArray == null ? 0 : byArray.length;
            int n14 = n13 + n10;
            byte[][] byArrayArray = new byte[n14][];
            n13 = n10;
            if (n10 != 0) {
                System.arraycopy(byArray, 0, byArrayArray, 0, n10);
                n13 = n10;
            }
            while (n13 < n14 - 1) {
                byArrayArray[n13] = codedInputByteBufferNano.readBytes();
                codedInputByteBufferNano.readTag();
                ++n13;
            }
            byArrayArray[n13] = codedInputByteBufferNano.readBytes();
            this.a = byArrayArray;
        }
        return this;
    }

    @Override
    public final int computeSerializedSize() {
        int n10 = super.computeSerializedSize();
        Object object = this.a;
        int n13 = n10;
        if (object != null) {
            n13 = n10;
            if (((byte[][])object).length > 0) {
                int n14 = 0;
                int n15 = 0;
                for (int i14 = 0; i14 < ((byte[][])(object = this.a)).length; ++i14) {
                    object = object[i14];
                    int n16 = n14;
                    n13 = n15;
                    if (object != null) {
                        n13 = n15 + 1;
                        n16 = CodedOutputByteBufferNano.computeBytesSizeNoTag((byte[])object) + n14;
                    }
                    n14 = n16;
                    n15 = n13;
                }
                n13 = n10 + n14 + n15;
            }
        }
        return n13;
    }

    @Override
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        Object object = this.a;
        if (object != null && ((byte[][])object).length > 0) {
            for (int i14 = 0; i14 < ((byte[][])(object = this.a)).length; ++i14) {
                if ((object = (Object)object[i14]) == null) continue;
                codedOutputByteBufferNano.writeBytes(1, (byte[])object);
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}

