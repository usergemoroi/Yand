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

public final class U9
extends MessageNano {
    public static volatile U9[] e;
    public boolean a;
    public int b;
    public int c;
    public int[] d;

    public U9() {
        this.a();
    }

    public static U9 a(byte[] byArray) throws InvalidProtocolBufferNanoException {
        return MessageNano.mergeFrom(new U9(), byArray);
    }

    public static U9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new U9().a(codedInputByteBufferNano);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static U9[] b() {
        if (e != null) return e;
        Object object = InternalNano.LAZY_INIT_LOCK;
        synchronized (object) {
            try {
                if (e != null) return e;
                e = new U9[0];
                return e;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final U9 a() {
        this.a = false;
        this.b = 0;
        this.c = 0;
        this.d = WireFormatNano.EMPTY_INT_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    public final U9 a(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        int n10;
        while ((n10 = codedInputByteBufferNano.readTag()) != 0) {
            if (n10 != 8) {
                if (n10 != 16) {
                    if (n10 != 24) {
                        int[] nArray;
                        int[] nArray2;
                        int n13;
                        int n14;
                        if (n10 != 32) {
                            if (n10 != 34) {
                                if (WireFormatNano.parseUnknownField(codedInputByteBufferNano, n10)) continue;
                                return this;
                            }
                            n14 = codedInputByteBufferNano.pushLimit(codedInputByteBufferNano.readRawVarint32());
                            n10 = codedInputByteBufferNano.getPosition();
                            n13 = 0;
                            while (codedInputByteBufferNano.getBytesUntilLimit() > 0) {
                                codedInputByteBufferNano.readInt32();
                                ++n13;
                            }
                            codedInputByteBufferNano.rewindToPosition(n10);
                            nArray2 = this.d;
                            n10 = nArray2 == null ? 0 : nArray2.length;
                            int n15 = n13 + n10;
                            nArray = new int[n15];
                            n13 = n10;
                            if (n10 != 0) {
                                System.arraycopy(nArray2, 0, nArray, 0, n10);
                                n13 = n10;
                            }
                            while (n13 < n15) {
                                nArray[n13] = codedInputByteBufferNano.readInt32();
                                ++n13;
                            }
                            this.d = nArray;
                            codedInputByteBufferNano.popLimit(n14);
                            continue;
                        }
                        n13 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 32);
                        nArray2 = this.d;
                        n10 = nArray2 == null ? 0 : nArray2.length;
                        n14 = n13 + n10;
                        nArray = new int[n14];
                        n13 = n10;
                        if (n10 != 0) {
                            System.arraycopy(nArray2, 0, nArray, 0, n10);
                            n13 = n10;
                        }
                        while (n13 < n14 - 1) {
                            nArray[n13] = codedInputByteBufferNano.readInt32();
                            codedInputByteBufferNano.readTag();
                            ++n13;
                        }
                        nArray[n13] = codedInputByteBufferNano.readInt32();
                        this.d = nArray;
                        continue;
                    }
                    this.c = codedInputByteBufferNano.readUInt32();
                    continue;
                }
                this.b = codedInputByteBufferNano.readUInt32();
                continue;
            }
            this.a = codedInputByteBufferNano.readBool();
        }
        return this;
    }

    @Override
    public final int computeSerializedSize() {
        int n10 = super.computeSerializedSize();
        int n13 = CodedOutputByteBufferNano.computeBoolSize(1, this.a);
        int n14 = CodedOutputByteBufferNano.computeUInt32Size(2, this.b);
        n13 = CodedOutputByteBufferNano.computeUInt32Size(3, this.c) + (n14 + (n13 + n10));
        int[] nArray = this.d;
        n10 = n13;
        if (nArray != null) {
            n10 = n13;
            if (nArray.length > 0) {
                n10 = 0;
                for (n14 = 0; n14 < (nArray = this.d).length; ++n14) {
                    n10 += CodedOutputByteBufferNano.computeInt32SizeNoTag(nArray[n14]);
                }
                n10 = n13 + n10 + nArray.length;
            }
        }
        return n10;
    }

    @Override
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeBool(1, this.a);
        codedOutputByteBufferNano.writeUInt32(2, this.b);
        codedOutputByteBufferNano.writeUInt32(3, this.c);
        int[] nArray = this.d;
        if (nArray != null && nArray.length > 0) {
            for (int i14 = 0; i14 < (nArray = this.d).length; ++i14) {
                codedOutputByteBufferNano.writeInt32(4, nArray[i14]);
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}

