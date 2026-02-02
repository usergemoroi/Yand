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

public final class Bm
extends MessageNano {
    public static volatile Bm[] g;
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public int f;

    public Bm() {
        this.a();
    }

    public static Bm a(byte[] byArray) throws InvalidProtocolBufferNanoException {
        return MessageNano.mergeFrom(new Bm(), byArray);
    }

    public static Bm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Bm().a(codedInputByteBufferNano);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Bm[] b() {
        if (g != null) return g;
        Object object = InternalNano.LAZY_INIT_LOCK;
        synchronized (object) {
            try {
                if (g != null) return g;
                g = new Bm[0];
                return g;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final Bm a() {
        this.a = false;
        this.b = false;
        this.c = false;
        this.d = false;
        this.e = false;
        this.f = -1;
        this.cachedSize = -1;
        return this;
    }

    public final Bm a(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        int n10;
        while ((n10 = codedInputByteBufferNano.readTag()) != 0) {
            if (n10 != 8) {
                if (n10 != 16) {
                    if (n10 != 24) {
                        if (n10 != 32) {
                            if (n10 != 40) {
                                if (n10 != 48) {
                                    if (WireFormatNano.parseUnknownField(codedInputByteBufferNano, n10)) continue;
                                    return this;
                                }
                                n10 = codedInputByteBufferNano.readInt32();
                                if (n10 != -1 && n10 != 0 && n10 != 1) continue;
                                this.f = n10;
                                continue;
                            }
                            this.e = codedInputByteBufferNano.readBool();
                            continue;
                        }
                        this.d = codedInputByteBufferNano.readBool();
                        continue;
                    }
                    this.c = codedInputByteBufferNano.readBool();
                    continue;
                }
                this.b = codedInputByteBufferNano.readBool();
                continue;
            }
            this.a = codedInputByteBufferNano.readBool();
        }
        return this;
    }

    @Override
    public final int computeSerializedSize() {
        int n10 = super.computeSerializedSize();
        int n13 = CodedOutputByteBufferNano.computeBoolSize(1, this.a);
        int n14 = CodedOutputByteBufferNano.computeBoolSize(2, this.b);
        int n15 = CodedOutputByteBufferNano.computeBoolSize(3, this.c);
        n10 = CodedOutputByteBufferNano.computeBoolSize(4, this.d) + (n15 + (n14 + (n13 + n10)));
        boolean bl2 = this.e;
        n15 = n10;
        if (bl2) {
            n15 = n10 + CodedOutputByteBufferNano.computeBoolSize(5, bl2);
        }
        n13 = this.f;
        n10 = n15;
        if (n13 != -1) {
            n10 = n15 + CodedOutputByteBufferNano.computeInt32Size(6, n13);
        }
        return n10;
    }

    @Override
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int n10;
        codedOutputByteBufferNano.writeBool(1, this.a);
        codedOutputByteBufferNano.writeBool(2, this.b);
        codedOutputByteBufferNano.writeBool(3, this.c);
        codedOutputByteBufferNano.writeBool(4, this.d);
        boolean bl2 = this.e;
        if (bl2) {
            codedOutputByteBufferNano.writeBool(5, bl2);
        }
        if ((n10 = this.f) != -1) {
            codedOutputByteBufferNano.writeInt32(6, n10);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}

