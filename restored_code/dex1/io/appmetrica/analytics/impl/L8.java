/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.B8;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

public final class L8
extends MessageNano {
    public static volatile L8[] c;
    public B8 a;
    public B8[] b;

    public L8() {
        this.a();
    }

    public static L8 a(byte[] byArray) throws InvalidProtocolBufferNanoException {
        return MessageNano.mergeFrom(new L8(), byArray);
    }

    public static L8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new L8().a(codedInputByteBufferNano);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static L8[] b() {
        if (c != null) return c;
        Object object = InternalNano.LAZY_INIT_LOCK;
        synchronized (object) {
            try {
                if (c != null) return c;
                c = new L8[0];
                return c;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final L8 a() {
        this.a = null;
        this.b = B8.b();
        this.cachedSize = -1;
        return this;
    }

    public final L8 a(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        int n10;
        while ((n10 = codedInputByteBufferNano.readTag()) != 0) {
            if (n10 != 10) {
                if (n10 != 18) {
                    if (WireFormatNano.parseUnknownField(codedInputByteBufferNano, n10)) continue;
                    return this;
                }
                int n13 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                Object object = this.b;
                n10 = object == null ? 0 : ((B8[])object).length;
                int n14 = n13 + n10;
                B8[] b8Array = new B8[n14];
                n13 = n10;
                if (n10 != 0) {
                    System.arraycopy(object, 0, b8Array, 0, n10);
                    n13 = n10;
                }
                while (n13 < n14 - 1) {
                    b8Array[n13] = object = new B8();
                    codedInputByteBufferNano.readMessage((MessageNano)object);
                    codedInputByteBufferNano.readTag();
                    ++n13;
                }
                b8Array[n13] = object = new B8();
                codedInputByteBufferNano.readMessage((MessageNano)object);
                this.b = b8Array;
                continue;
            }
            if (this.a == null) {
                this.a = new B8();
            }
            codedInputByteBufferNano.readMessage(this.a);
        }
        return this;
    }

    @Override
    public final int computeSerializedSize() {
        int n10 = super.computeSerializedSize();
        Object object = this.a;
        int n13 = n10;
        if (object != null) {
            n13 = n10 + CodedOutputByteBufferNano.computeMessageSize(1, (MessageNano)object);
        }
        object = this.b;
        int n14 = n13;
        if (object != null) {
            n14 = n13;
            if (((B8[])object).length > 0) {
                n10 = 0;
                while (true) {
                    object = this.b;
                    n14 = n13;
                    if (n10 >= ((B8[])object).length) break;
                    object = object[n10];
                    n14 = n13;
                    if (object != null) {
                        n14 = CodedOutputByteBufferNano.computeMessageSize(2, (MessageNano)object) + n13;
                    }
                    ++n10;
                    n13 = n14;
                }
            }
        }
        return n14;
    }

    @Override
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        Object object = this.a;
        if (object != null) {
            codedOutputByteBufferNano.writeMessage(1, (MessageNano)object);
        }
        if ((object = this.b) != null && ((B8[])object).length > 0) {
            for (int i14 = 0; i14 < ((B8[])(object = this.b)).length; ++i14) {
                if ((object = object[i14]) == null) continue;
                codedOutputByteBufferNano.writeMessage(2, (MessageNano)object);
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}

