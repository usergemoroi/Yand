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

public final class Dm
extends MessageNano {
    public static volatile Dm[] c;
    public long a;
    public long b;

    public Dm() {
        this.a();
    }

    public static Dm a(byte[] byArray) throws InvalidProtocolBufferNanoException {
        return MessageNano.mergeFrom(new Dm(), byArray);
    }

    public static Dm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Dm().a(codedInputByteBufferNano);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Dm[] b() {
        if (c != null) return c;
        Object object = InternalNano.LAZY_INIT_LOCK;
        synchronized (object) {
            try {
                if (c != null) return c;
                c = new Dm[0];
                return c;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final Dm a() {
        this.a = 86400L;
        this.b = 432000L;
        this.cachedSize = -1;
        return this;
    }

    public final Dm a(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        int n10;
        while ((n10 = codedInputByteBufferNano.readTag()) != 0) {
            if (n10 != 8) {
                if (n10 != 16) {
                    if (WireFormatNano.parseUnknownField(codedInputByteBufferNano, n10)) continue;
                    return this;
                }
                this.b = codedInputByteBufferNano.readInt64();
                continue;
            }
            this.a = codedInputByteBufferNano.readInt64();
        }
        return this;
    }

    @Override
    public final int computeSerializedSize() {
        int n10 = super.computeSerializedSize();
        int n13 = CodedOutputByteBufferNano.computeInt64Size(1, this.a);
        return CodedOutputByteBufferNano.computeInt64Size(2, this.b) + (n13 + n10);
    }

    @Override
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeInt64(1, this.a);
        codedOutputByteBufferNano.writeInt64(2, this.b);
        super.writeTo(codedOutputByteBufferNano);
    }
}

