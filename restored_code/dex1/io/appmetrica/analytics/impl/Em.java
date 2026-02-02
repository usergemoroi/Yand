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

public final class Em
extends MessageNano {
    public static volatile Em[] b;
    public int a;

    public Em() {
        this.a();
    }

    public static Em a(byte[] byArray) throws InvalidProtocolBufferNanoException {
        return MessageNano.mergeFrom(new Em(), byArray);
    }

    public static Em b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Em().a(codedInputByteBufferNano);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Em[] b() {
        if (b != null) return b;
        Object object = InternalNano.LAZY_INIT_LOCK;
        synchronized (object) {
            try {
                if (b != null) return b;
                b = new Em[0];
                return b;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final Em a() {
        this.a = 86400;
        this.cachedSize = -1;
        return this;
    }

    public final Em a(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        int n10;
        while ((n10 = codedInputByteBufferNano.readTag()) != 0) {
            if (n10 != 8) {
                if (WireFormatNano.parseUnknownField(codedInputByteBufferNano, n10)) continue;
                return this;
            }
            this.a = codedInputByteBufferNano.readUInt32();
        }
        return this;
    }

    @Override
    public final int computeSerializedSize() {
        int n10 = super.computeSerializedSize();
        int n13 = this.a;
        int n14 = n10;
        if (n13 != 86400) {
            n14 = n10 + CodedOutputByteBufferNano.computeUInt32Size(1, n13);
        }
        return n14;
    }

    @Override
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int n10 = this.a;
        if (n10 != 86400) {
            codedOutputByteBufferNano.writeUInt32(1, n10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}

