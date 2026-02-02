/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.H8;
import io.appmetrica.analytics.impl.K8;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

public final class G8
extends MessageNano {
    public static volatile G8[] f;
    public byte[] a;
    public byte[] b;
    public K8 c;
    public H8[] d;
    public int e;

    public G8() {
        this.a();
    }

    public static G8 a(byte[] byArray) throws InvalidProtocolBufferNanoException {
        return MessageNano.mergeFrom(new G8(), byArray);
    }

    public static G8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new G8().a(codedInputByteBufferNano);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static G8[] b() {
        if (f != null) return f;
        Object object = InternalNano.LAZY_INIT_LOCK;
        synchronized (object) {
            try {
                if (f != null) return f;
                f = new G8[0];
                return f;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final G8 a() {
        byte[] byArray = WireFormatNano.EMPTY_BYTES;
        this.a = byArray;
        this.b = byArray;
        this.c = null;
        this.d = H8.b();
        this.e = 0;
        this.cachedSize = -1;
        return this;
    }

    public final G8 a(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        int n10;
        while ((n10 = codedInputByteBufferNano.readTag()) != 0) {
            if (n10 != 10) {
                if (n10 != 18) {
                    if (n10 != 26) {
                        if (n10 != 34) {
                            if (n10 != 40) {
                                if (WireFormatNano.parseUnknownField(codedInputByteBufferNano, n10)) continue;
                                return this;
                            }
                            this.e = codedInputByteBufferNano.readUInt32();
                            continue;
                        }
                        int n13 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 34);
                        Object object = this.d;
                        n10 = object == null ? 0 : ((H8[])object).length;
                        int n14 = n13 + n10;
                        H8[] h8Array = new H8[n14];
                        n13 = n10;
                        if (n10 != 0) {
                            System.arraycopy(object, 0, h8Array, 0, n10);
                            n13 = n10;
                        }
                        while (n13 < n14 - 1) {
                            h8Array[n13] = object = new H8();
                            codedInputByteBufferNano.readMessage((MessageNano)object);
                            codedInputByteBufferNano.readTag();
                            ++n13;
                        }
                        h8Array[n13] = object = new H8();
                        codedInputByteBufferNano.readMessage((MessageNano)object);
                        this.d = h8Array;
                        continue;
                    }
                    if (this.c == null) {
                        this.c = new K8();
                    }
                    codedInputByteBufferNano.readMessage(this.c);
                    continue;
                }
                this.b = codedInputByteBufferNano.readBytes();
                continue;
            }
            this.a = codedInputByteBufferNano.readBytes();
        }
        return this;
    }

    @Override
    public final int computeSerializedSize() {
        int n10;
        int n13 = super.computeSerializedSize();
        byte[] byArray = this.a;
        Object object = WireFormatNano.EMPTY_BYTES;
        int n14 = n13;
        if (!Arrays.equals(byArray, object)) {
            n14 = n13 + CodedOutputByteBufferNano.computeBytesSize(1, this.a);
        }
        n13 = n14;
        if (!Arrays.equals(this.b, object)) {
            n13 = n14 + CodedOutputByteBufferNano.computeBytesSize(2, this.b);
        }
        object = this.c;
        n14 = n13;
        if (object != null) {
            n14 = n13 + CodedOutputByteBufferNano.computeMessageSize(3, (MessageNano)object);
        }
        object = this.d;
        n13 = n14;
        if (object != null) {
            n13 = n14;
            if (((byte[])object).length > 0) {
                n10 = 0;
                while (true) {
                    object = this.d;
                    n13 = n14;
                    if (n10 >= ((byte[])object).length) break;
                    object = object[n10];
                    n13 = n14;
                    if (object != null) {
                        n13 = CodedOutputByteBufferNano.computeMessageSize(4, (MessageNano)object) + n14;
                    }
                    ++n10;
                    n14 = n13;
                }
            }
        }
        n10 = this.e;
        n14 = n13;
        if (n10 != 0) {
            n14 = n13 + CodedOutputByteBufferNano.computeUInt32Size(5, n10);
        }
        return n14;
    }

    @Override
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int n10;
        byte[] byArray = this.a;
        Object object = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(byArray, object)) {
            codedOutputByteBufferNano.writeBytes(1, this.a);
        }
        if (!Arrays.equals(this.b, object)) {
            codedOutputByteBufferNano.writeBytes(2, this.b);
        }
        if ((object = (Object)this.c) != null) {
            codedOutputByteBufferNano.writeMessage(3, (MessageNano)object);
        }
        if ((object = (Object)this.d) != null && ((byte[])object).length > 0) {
            for (n10 = 0; n10 < ((byte[])(object = (Object)this.d)).length; ++n10) {
                if ((object = (Object)object[n10]) == null) continue;
                codedOutputByteBufferNano.writeMessage(4, (MessageNano)object);
            }
        }
        if ((n10 = this.e) != 0) {
            codedOutputByteBufferNano.writeUInt32(5, n10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}

