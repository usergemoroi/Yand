/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

public final class M
extends MessageNano {
    public static volatile M[] c;
    public boolean a;
    public long b;

    public M() {
        this.a();
    }

    public static M a(byte[] byArray) throws InvalidProtocolBufferNanoException {
        return MessageNano.mergeFrom(new M(), byArray);
    }

    public static M b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new M().a(codedInputByteBufferNano);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static M[] b() {
        if (c != null) return c;
        Object object = InternalNano.LAZY_INIT_LOCK;
        synchronized (object) {
            try {
                if (c != null) return c;
                c = new M[0];
                return c;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final M a() {
        this.a = true;
        this.b = 1L;
        this.cachedSize = -1;
        return this;
    }

    public final M a(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
            this.a = codedInputByteBufferNano.readBool();
        }
        return this;
    }

    @Override
    public final int computeSerializedSize() {
        int n10 = super.computeSerializedSize();
        boolean bl2 = this.a;
        int n13 = n10;
        if (!bl2) {
            n13 = n10 + CodedOutputByteBufferNano.computeBoolSize(1, bl2);
        }
        long l10 = this.b;
        n10 = n13;
        if (l10 != 1L) {
            n10 = n13 + CodedOutputByteBufferNano.computeInt64Size(2, l10);
        }
        return n10;
    }

    @Override
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        long l10;
        boolean bl2 = this.a;
        if (!bl2) {
            codedOutputByteBufferNano.writeBool(1, bl2);
        }
        if ((l10 = this.b) != 1L) {
            codedOutputByteBufferNano.writeInt64(2, l10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}

