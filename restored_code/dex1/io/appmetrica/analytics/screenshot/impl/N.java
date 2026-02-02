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
import io.appmetrica.analytics.screenshot.impl.K;
import io.appmetrica.analytics.screenshot.impl.L;
import io.appmetrica.analytics.screenshot.impl.M;
import java.io.IOException;

public final class N
extends MessageNano {
    public static volatile N[] d;
    public K a;
    public M b;
    public L c;

    public N() {
        this.a();
    }

    public static N a(byte[] byArray) throws InvalidProtocolBufferNanoException {
        return MessageNano.mergeFrom(new N(), byArray);
    }

    public static N b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new N().a(codedInputByteBufferNano);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static N[] b() {
        if (d != null) return d;
        Object object = InternalNano.LAZY_INIT_LOCK;
        synchronized (object) {
            try {
                if (d != null) return d;
                d = new N[0];
                return d;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final N a() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.cachedSize = -1;
        return this;
    }

    public final N a(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        int n10;
        while ((n10 = codedInputByteBufferNano.readTag()) != 0) {
            if (n10 != 10) {
                if (n10 != 18) {
                    if (n10 != 26) {
                        if (WireFormatNano.parseUnknownField(codedInputByteBufferNano, n10)) continue;
                        return this;
                    }
                    if (this.c == null) {
                        this.c = new L();
                    }
                    codedInputByteBufferNano.readMessage(this.c);
                    continue;
                }
                if (this.b == null) {
                    this.b = new M();
                }
                codedInputByteBufferNano.readMessage(this.b);
                continue;
            }
            if (this.a == null) {
                this.a = new K();
            }
            codedInputByteBufferNano.readMessage(this.a);
        }
        return this;
    }

    @Override
    public final int computeSerializedSize() {
        int n10 = super.computeSerializedSize();
        MessageNano messageNano = this.a;
        int n13 = n10;
        if (messageNano != null) {
            n13 = n10 + CodedOutputByteBufferNano.computeMessageSize(1, messageNano);
        }
        messageNano = this.b;
        n10 = n13;
        if (messageNano != null) {
            n10 = n13 + CodedOutputByteBufferNano.computeMessageSize(2, messageNano);
        }
        messageNano = this.c;
        n13 = n10;
        if (messageNano != null) {
            n13 = n10 + CodedOutputByteBufferNano.computeMessageSize(3, messageNano);
        }
        return n13;
    }

    @Override
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        MessageNano messageNano = this.a;
        if (messageNano != null) {
            codedOutputByteBufferNano.writeMessage(1, messageNano);
        }
        if ((messageNano = this.b) != null) {
            codedOutputByteBufferNano.writeMessage(2, messageNano);
        }
        if ((messageNano = this.c) != null) {
            codedOutputByteBufferNano.writeMessage(3, messageNano);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}

