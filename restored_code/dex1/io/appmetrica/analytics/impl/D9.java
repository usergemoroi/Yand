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

public final class D9
extends MessageNano {
    public static volatile D9[] c;
    public int a;
    public String b;

    public D9() {
        this.a();
    }

    public static D9 a(byte[] byArray) throws InvalidProtocolBufferNanoException {
        return MessageNano.mergeFrom(new D9(), byArray);
    }

    public static D9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new D9().a(codedInputByteBufferNano);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static D9[] b() {
        if (c != null) return c;
        Object object = InternalNano.LAZY_INIT_LOCK;
        synchronized (object) {
            try {
                if (c != null) return c;
                c = new D9[0];
                return c;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final D9 a() {
        this.a = 2;
        this.b = "";
        this.cachedSize = -1;
        return this;
    }

    public final D9 a(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        int n10;
        block3: while ((n10 = codedInputByteBufferNano.readTag()) != 0) {
            if (n10 != 24) {
                if (n10 != 34) {
                    if (WireFormatNano.parseUnknownField(codedInputByteBufferNano, n10)) continue;
                    return this;
                }
                this.b = codedInputByteBufferNano.readString();
                continue;
            }
            n10 = codedInputByteBufferNano.readInt32();
            switch (n10) {
                default: {
                    continue block3;
                }
                case 0: 
                case 1: 
                case 2: 
                case 3: 
                case 4: 
                case 5: 
                case 6: 
                case 7: 
                case 8: 
                case 9: 
                case 10: 
                case 11: 
                case 12: 
            }
            this.a = n10;
        }
        return this;
    }

    @Override
    public final int computeSerializedSize() {
        int n10 = super.computeSerializedSize();
        int n13 = this.a;
        int n14 = n10;
        if (n13 != 2) {
            n14 = n10 + CodedOutputByteBufferNano.computeInt32Size(3, n13);
        }
        n10 = n14;
        if (!this.b.equals("")) {
            n10 = n14 + CodedOutputByteBufferNano.computeStringSize(4, this.b);
        }
        return n10;
    }

    @Override
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int n10 = this.a;
        if (n10 != 2) {
            codedOutputByteBufferNano.writeInt32(3, n10);
        }
        if (!this.b.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}

