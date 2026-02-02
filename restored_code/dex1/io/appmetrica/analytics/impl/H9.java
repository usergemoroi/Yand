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

public final class H9
extends MessageNano {
    public static volatile H9[] e;
    public int a;
    public int b;
    public String c;
    public boolean d;

    public H9() {
        this.a();
    }

    public static H9 a(byte[] byArray) throws InvalidProtocolBufferNanoException {
        return MessageNano.mergeFrom(new H9(), byArray);
    }

    public static H9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new H9().a(codedInputByteBufferNano);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static H9[] b() {
        if (e != null) return e;
        Object object = InternalNano.LAZY_INIT_LOCK;
        synchronized (object) {
            try {
                if (e != null) return e;
                e = new H9[0];
                return e;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final H9 a() {
        this.a = 0;
        this.b = 0;
        this.c = "";
        this.d = false;
        this.cachedSize = -1;
        return this;
    }

    public final H9 a(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        int n10;
        while ((n10 = codedInputByteBufferNano.readTag()) != 0) {
            if (n10 != 8) {
                if (n10 != 16) {
                    if (n10 != 26) {
                        if (n10 != 32) {
                            if (WireFormatNano.parseUnknownField(codedInputByteBufferNano, n10)) continue;
                            return this;
                        }
                        this.d = codedInputByteBufferNano.readBool();
                        continue;
                    }
                    this.c = codedInputByteBufferNano.readString();
                    continue;
                }
                this.b = codedInputByteBufferNano.readUInt32();
                continue;
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
        if (n13 != 0) {
            n14 = n10 + CodedOutputByteBufferNano.computeUInt32Size(1, n13);
        }
        n13 = this.b;
        n10 = n14;
        if (n13 != 0) {
            n10 = n14 + CodedOutputByteBufferNano.computeUInt32Size(2, n13);
        }
        n14 = n10;
        if (!this.c.equals("")) {
            n14 = n10 + CodedOutputByteBufferNano.computeStringSize(3, this.c);
        }
        boolean bl2 = this.d;
        n10 = n14;
        if (bl2) {
            n10 = n14 + CodedOutputByteBufferNano.computeBoolSize(4, bl2);
        }
        return n10;
    }

    @Override
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        boolean bl2;
        int n10 = this.a;
        if (n10 != 0) {
            codedOutputByteBufferNano.writeUInt32(1, n10);
        }
        if ((n10 = this.b) != 0) {
            codedOutputByteBufferNano.writeUInt32(2, n10);
        }
        if (!this.c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.c);
        }
        if (bl2 = this.d) {
            codedOutputByteBufferNano.writeBool(4, bl2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}

