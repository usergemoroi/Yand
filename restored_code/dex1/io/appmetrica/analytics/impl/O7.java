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

public final class O7
extends MessageNano {
    public static volatile O7[] d;
    public long a;
    public long b;
    public int c;

    public O7() {
        this.a();
    }

    public static O7 a(byte[] byArray) throws InvalidProtocolBufferNanoException {
        return MessageNano.mergeFrom(new O7(), byArray);
    }

    public static O7 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new O7().a(codedInputByteBufferNano);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static O7[] b() {
        if (d != null) return d;
        Object object = InternalNano.LAZY_INIT_LOCK;
        synchronized (object) {
            try {
                if (d != null) return d;
                d = new O7[0];
                return d;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final O7 a() {
        this.a = -1L;
        this.b = -1L;
        this.c = -1;
        this.cachedSize = -1;
        return this;
    }

    public final O7 a(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        int n10;
        while ((n10 = codedInputByteBufferNano.readTag()) != 0) {
            if (n10 != 8) {
                if (n10 != 16) {
                    if (n10 != 24) {
                        if (WireFormatNano.parseUnknownField(codedInputByteBufferNano, n10)) continue;
                        return this;
                    }
                    n10 = codedInputByteBufferNano.readInt32();
                    if (n10 != -1 && n10 != 0 && n10 != 1) continue;
                    this.c = n10;
                    continue;
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
        long l10 = this.a;
        int n13 = n10;
        if (l10 != -1L) {
            n13 = n10 + CodedOutputByteBufferNano.computeInt64Size(1, l10);
        }
        l10 = this.b;
        n10 = n13;
        if (l10 != -1L) {
            n10 = n13 + CodedOutputByteBufferNano.computeInt64Size(2, l10);
        }
        int n14 = this.c;
        n13 = n10;
        if (n14 != -1) {
            n13 = n10 + CodedOutputByteBufferNano.computeInt32Size(3, n14);
        }
        return n13;
    }

    @Override
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int n10;
        long l10 = this.a;
        if (l10 != -1L) {
            codedOutputByteBufferNano.writeInt64(1, l10);
        }
        if ((l10 = this.b) != -1L) {
            codedOutputByteBufferNano.writeInt64(2, l10);
        }
        if ((n10 = this.c) != -1) {
            codedOutputByteBufferNano.writeInt32(3, n10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}

