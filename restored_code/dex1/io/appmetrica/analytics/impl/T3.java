/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.V3;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

public final class T3
extends MessageNano {
    public static volatile T3[] c;
    public V3 a;
    public int b;

    public T3() {
        this.a();
    }

    public static T3 a(byte[] byArray) throws InvalidProtocolBufferNanoException {
        return MessageNano.mergeFrom(new T3(), byArray);
    }

    public static T3 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new T3().a(codedInputByteBufferNano);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static T3[] b() {
        if (c != null) return c;
        Object object = InternalNano.LAZY_INIT_LOCK;
        synchronized (object) {
            try {
                if (c != null) return c;
                c = new T3[0];
                return c;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final T3 a() {
        this.a = null;
        this.b = 0;
        this.cachedSize = -1;
        return this;
    }

    public final T3 a(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        int n10;
        while ((n10 = codedInputByteBufferNano.readTag()) != 0) {
            if (n10 != 10) {
                if (n10 != 16) {
                    if (WireFormatNano.parseUnknownField(codedInputByteBufferNano, n10)) continue;
                    return this;
                }
                n10 = codedInputByteBufferNano.readInt32();
                if (n10 != 0 && n10 != 1 && n10 != 2 && n10 != 3) continue;
                this.b = n10;
                continue;
            }
            if (this.a == null) {
                this.a = new V3();
            }
            codedInputByteBufferNano.readMessage(this.a);
        }
        return this;
    }

    @Override
    public final int computeSerializedSize() {
        int n10 = super.computeSerializedSize();
        V3 v33 = this.a;
        int n13 = n10;
        if (v33 != null) {
            n13 = n10 + CodedOutputByteBufferNano.computeMessageSize(1, v33);
        }
        int n14 = this.b;
        n10 = n13;
        if (n14 != 0) {
            n10 = n13 + CodedOutputByteBufferNano.computeInt32Size(2, n14);
        }
        return n10;
    }

    @Override
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int n10;
        V3 v33 = this.a;
        if (v33 != null) {
            codedOutputByteBufferNano.writeMessage(1, v33);
        }
        if ((n10 = this.b) != 0) {
            codedOutputByteBufferNano.writeInt32(2, n10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}

