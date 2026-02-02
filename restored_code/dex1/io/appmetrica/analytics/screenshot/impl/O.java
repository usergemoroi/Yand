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
import io.appmetrica.analytics.screenshot.impl.N;
import java.io.IOException;

public final class O
extends MessageNano {
    public static volatile O[] c;
    public boolean a;
    public N b;

    public O() {
        this.a();
    }

    public static O a(byte[] byArray) throws InvalidProtocolBufferNanoException {
        return MessageNano.mergeFrom(new O(), byArray);
    }

    public static O b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new O().a(codedInputByteBufferNano);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static O[] b() {
        if (c != null) return c;
        Object object = InternalNano.LAZY_INIT_LOCK;
        synchronized (object) {
            try {
                if (c != null) return c;
                c = new O[0];
                return c;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final O a() {
        this.a = true;
        this.b = null;
        this.cachedSize = -1;
        return this;
    }

    public final O a(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        int n10;
        while ((n10 = codedInputByteBufferNano.readTag()) != 0) {
            if (n10 != 8) {
                if (n10 != 18) {
                    if (WireFormatNano.parseUnknownField(codedInputByteBufferNano, n10)) continue;
                    return this;
                }
                if (this.b == null) {
                    this.b = new N();
                }
                codedInputByteBufferNano.readMessage(this.b);
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
        N n14 = this.b;
        n10 = n13;
        if (n14 != null) {
            n10 = n13 + CodedOutputByteBufferNano.computeMessageSize(2, n14);
        }
        return n10;
    }

    @Override
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        N n10;
        boolean bl2 = this.a;
        if (!bl2) {
            codedOutputByteBufferNano.writeBool(1, bl2);
        }
        if ((n10 = this.b) != null) {
            codedOutputByteBufferNano.writeMessage(2, n10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}

