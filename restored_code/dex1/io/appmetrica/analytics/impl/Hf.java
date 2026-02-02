/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.Ff;
import io.appmetrica.analytics.impl.Gf;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

public final class Hf
extends MessageNano {
    public static final int c = 0;
    public static final int d = 1;
    public static final int e = 2;
    public static final int f = 3;
    public static volatile Hf[] g;
    public Ff a;
    public Gf[] b;

    public Hf() {
        this.a();
    }

    public static Hf a(byte[] byArray) throws InvalidProtocolBufferNanoException {
        return MessageNano.mergeFrom(new Hf(), byArray);
    }

    public static Hf b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Hf().a(codedInputByteBufferNano);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Hf[] b() {
        if (g != null) return g;
        Object object = InternalNano.LAZY_INIT_LOCK;
        synchronized (object) {
            try {
                if (g != null) return g;
                g = new Hf[0];
                return g;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final Hf a() {
        this.a = null;
        this.b = Gf.b();
        this.cachedSize = -1;
        return this;
    }

    public final Hf a(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        int n10;
        while ((n10 = codedInputByteBufferNano.readTag()) != 0) {
            if (n10 != 10) {
                if (n10 != 18) {
                    if (WireFormatNano.parseUnknownField(codedInputByteBufferNano, n10)) continue;
                    return this;
                }
                int n13 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                Object object = this.b;
                n10 = object == null ? 0 : ((Gf[])object).length;
                int n14 = n13 + n10;
                Gf[] gfArray = new Gf[n14];
                n13 = n10;
                if (n10 != 0) {
                    System.arraycopy(object, 0, gfArray, 0, n10);
                    n13 = n10;
                }
                while (n13 < n14 - 1) {
                    gfArray[n13] = object = new Gf();
                    codedInputByteBufferNano.readMessage((MessageNano)object);
                    codedInputByteBufferNano.readTag();
                    ++n13;
                }
                gfArray[n13] = object = new Gf();
                codedInputByteBufferNano.readMessage((MessageNano)object);
                this.b = gfArray;
                continue;
            }
            if (this.a == null) {
                this.a = new Ff();
            }
            codedInputByteBufferNano.readMessage(this.a);
        }
        return this;
    }

    @Override
    public final int computeSerializedSize() {
        int n10 = super.computeSerializedSize();
        Object object = this.a;
        int n13 = n10;
        if (object != null) {
            n13 = n10 + CodedOutputByteBufferNano.computeMessageSize(1, (MessageNano)object);
        }
        object = this.b;
        int n14 = n13;
        if (object != null) {
            n14 = n13;
            if (((Gf[])object).length > 0) {
                n10 = 0;
                while (true) {
                    object = this.b;
                    n14 = n13;
                    if (n10 >= ((Gf[])object).length) break;
                    object = object[n10];
                    n14 = n13;
                    if (object != null) {
                        n14 = CodedOutputByteBufferNano.computeMessageSize(2, (MessageNano)object) + n13;
                    }
                    ++n10;
                    n13 = n14;
                }
            }
        }
        return n14;
    }

    @Override
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        Object object = this.a;
        if (object != null) {
            codedOutputByteBufferNano.writeMessage(1, (MessageNano)object);
        }
        if ((object = this.b) != null && ((Gf[])object).length > 0) {
            for (int i14 = 0; i14 < ((Gf[])(object = this.b)).length; ++i14) {
                if ((object = object[i14]) == null) continue;
                codedOutputByteBufferNano.writeMessage(2, (MessageNano)object);
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}

