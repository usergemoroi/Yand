/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.J8;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

public final class K8
extends MessageNano {
    public static volatile K8[] c;
    public J8[] a;
    public int b;

    public K8() {
        this.a();
    }

    public static K8 a(byte[] byArray) throws InvalidProtocolBufferNanoException {
        return MessageNano.mergeFrom(new K8(), byArray);
    }

    public static K8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new K8().a(codedInputByteBufferNano);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static K8[] b() {
        if (c != null) return c;
        Object object = InternalNano.LAZY_INIT_LOCK;
        synchronized (object) {
            try {
                if (c != null) return c;
                c = new K8[0];
                return c;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final K8 a() {
        this.a = J8.b();
        this.b = 0;
        this.cachedSize = -1;
        return this;
    }

    public final K8 a(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        int n10;
        while ((n10 = codedInputByteBufferNano.readTag()) != 0) {
            if (n10 != 10) {
                if (n10 != 16) {
                    if (WireFormatNano.parseUnknownField(codedInputByteBufferNano, n10)) continue;
                    return this;
                }
                this.b = codedInputByteBufferNano.readUInt32();
                continue;
            }
            int n13 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
            Object object = this.a;
            n10 = object == null ? 0 : ((J8[])object).length;
            int n14 = n13 + n10;
            J8[] j8Array = new J8[n14];
            n13 = n10;
            if (n10 != 0) {
                System.arraycopy(object, 0, j8Array, 0, n10);
                n13 = n10;
            }
            while (n13 < n14 - 1) {
                j8Array[n13] = object = new J8();
                codedInputByteBufferNano.readMessage((MessageNano)object);
                codedInputByteBufferNano.readTag();
                ++n13;
            }
            j8Array[n13] = object = new J8();
            codedInputByteBufferNano.readMessage((MessageNano)object);
            this.a = j8Array;
        }
        return this;
    }

    @Override
    public final int computeSerializedSize() {
        int n10;
        int n13 = super.computeSerializedSize();
        Object object = this.a;
        int n14 = n13;
        if (object != null) {
            n14 = n13;
            if (((J8[])object).length > 0) {
                n10 = 0;
                while (true) {
                    object = this.a;
                    n14 = n13;
                    if (n10 >= ((J8[])object).length) break;
                    object = object[n10];
                    n14 = n13;
                    if (object != null) {
                        n14 = CodedOutputByteBufferNano.computeMessageSize(1, (MessageNano)object) + n13;
                    }
                    ++n10;
                    n13 = n14;
                }
            }
        }
        n10 = this.b;
        n13 = n14;
        if (n10 != 0) {
            n13 = n14 + CodedOutputByteBufferNano.computeUInt32Size(2, n10);
        }
        return n13;
    }

    @Override
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int n10;
        Object object = this.a;
        if (object != null && ((J8[])object).length > 0) {
            for (n10 = 0; n10 < ((J8[])(object = this.a)).length; ++n10) {
                if ((object = object[n10]) == null) continue;
                codedOutputByteBufferNano.writeMessage(1, (MessageNano)object);
            }
        }
        if ((n10 = this.b) != 0) {
            codedOutputByteBufferNano.writeUInt32(2, n10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}

