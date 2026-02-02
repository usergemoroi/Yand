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

public final class I9
extends MessageNano {
    public static volatile I9[] e;
    public long a;
    public int b;
    public long c;
    public boolean d;

    public I9() {
        this.a();
    }

    public static I9 a(byte[] byArray) throws InvalidProtocolBufferNanoException {
        return MessageNano.mergeFrom(new I9(), byArray);
    }

    public static I9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new I9().a(codedInputByteBufferNano);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static I9[] b() {
        if (e != null) return e;
        Object object = InternalNano.LAZY_INIT_LOCK;
        synchronized (object) {
            try {
                if (e != null) return e;
                e = new I9[0];
                return e;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final I9 a() {
        this.a = 0L;
        this.b = 0;
        this.c = 0L;
        this.d = false;
        this.cachedSize = -1;
        return this;
    }

    public final I9 a(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        int n10;
        while ((n10 = codedInputByteBufferNano.readTag()) != 0) {
            if (n10 != 8) {
                if (n10 != 16) {
                    if (n10 != 24) {
                        if (n10 != 32) {
                            if (WireFormatNano.parseUnknownField(codedInputByteBufferNano, n10)) continue;
                            return this;
                        }
                        this.d = codedInputByteBufferNano.readBool();
                        continue;
                    }
                    this.c = codedInputByteBufferNano.readInt64();
                    continue;
                }
                this.b = codedInputByteBufferNano.readSInt32();
                continue;
            }
            this.a = codedInputByteBufferNano.readUInt64();
        }
        return this;
    }

    @Override
    public final int computeSerializedSize() {
        int n10 = super.computeSerializedSize();
        int n13 = CodedOutputByteBufferNano.computeUInt64Size(1, this.a);
        n13 = CodedOutputByteBufferNano.computeSInt32Size(2, this.b) + (n13 + n10);
        long l10 = this.c;
        n10 = n13;
        if (l10 != 0L) {
            n10 = n13 + CodedOutputByteBufferNano.computeInt64Size(3, l10);
        }
        boolean bl2 = this.d;
        n13 = n10;
        if (bl2) {
            n13 = n10 + CodedOutputByteBufferNano.computeBoolSize(4, bl2);
        }
        return n13;
    }

    @Override
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        boolean bl2;
        codedOutputByteBufferNano.writeUInt64(1, this.a);
        codedOutputByteBufferNano.writeSInt32(2, this.b);
        long l10 = this.c;
        if (l10 != 0L) {
            codedOutputByteBufferNano.writeInt64(3, l10);
        }
        if (bl2 = this.d) {
            codedOutputByteBufferNano.writeBool(4, bl2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}

