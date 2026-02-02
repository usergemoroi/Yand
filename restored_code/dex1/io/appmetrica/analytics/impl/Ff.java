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

public final class Ff
extends MessageNano {
    public static volatile Ff[] f;
    public String a;
    public String b;
    public boolean c;
    public boolean d;
    public int e;

    public Ff() {
        this.a();
    }

    public static Ff a(byte[] byArray) throws InvalidProtocolBufferNanoException {
        return MessageNano.mergeFrom(new Ff(), byArray);
    }

    public static Ff b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Ff().a(codedInputByteBufferNano);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Ff[] b() {
        if (f != null) return f;
        Object object = InternalNano.LAZY_INIT_LOCK;
        synchronized (object) {
            try {
                if (f != null) return f;
                f = new Ff[0];
                return f;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final Ff a() {
        this.a = "";
        this.b = "";
        this.c = false;
        this.d = false;
        this.e = 0;
        this.cachedSize = -1;
        return this;
    }

    public final Ff a(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        int n10;
        while ((n10 = codedInputByteBufferNano.readTag()) != 0) {
            if (n10 != 10) {
                if (n10 != 18) {
                    if (n10 != 24) {
                        if (n10 != 32) {
                            if (n10 != 40) {
                                if (WireFormatNano.parseUnknownField(codedInputByteBufferNano, n10)) continue;
                                return this;
                            }
                            n10 = codedInputByteBufferNano.readInt32();
                            if (n10 != 0 && n10 != 1 && n10 != 2 && n10 != 3) continue;
                            this.e = n10;
                            continue;
                        }
                        this.d = codedInputByteBufferNano.readBool();
                        continue;
                    }
                    this.c = codedInputByteBufferNano.readBool();
                    continue;
                }
                this.b = codedInputByteBufferNano.readString();
                continue;
            }
            this.a = codedInputByteBufferNano.readString();
        }
        return this;
    }

    @Override
    public final int computeSerializedSize() {
        int n10;
        int n13 = n10 = super.computeSerializedSize();
        if (!this.a.equals("")) {
            n13 = n10 + CodedOutputByteBufferNano.computeStringSize(1, this.a);
        }
        n10 = n13;
        if (!this.b.equals("")) {
            n10 = n13 + CodedOutputByteBufferNano.computeStringSize(2, this.b);
        }
        boolean bl2 = this.c;
        n13 = n10;
        if (bl2) {
            n13 = n10 + CodedOutputByteBufferNano.computeBoolSize(3, bl2);
        }
        bl2 = this.d;
        n10 = n13;
        if (bl2) {
            n10 = n13 + CodedOutputByteBufferNano.computeBoolSize(4, bl2);
        }
        return CodedOutputByteBufferNano.computeInt32Size(5, this.e) + n10;
    }

    @Override
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        boolean bl2;
        if (!this.a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.a);
        }
        if (!this.b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.b);
        }
        if (bl2 = this.c) {
            codedOutputByteBufferNano.writeBool(3, bl2);
        }
        if (bl2 = this.d) {
            codedOutputByteBufferNano.writeBool(4, bl2);
        }
        codedOutputByteBufferNano.writeInt32(5, this.e);
        super.writeTo(codedOutputByteBufferNano);
    }
}

