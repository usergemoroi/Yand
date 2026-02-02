/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.B2;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

public final class C2
extends MessageNano {
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static volatile C2[] f;
    public B2[] a;
    public boolean b;

    public C2() {
        this.a();
    }

    public static C2 a(byte[] byArray) throws InvalidProtocolBufferNanoException {
        return MessageNano.mergeFrom(new C2(), byArray);
    }

    public static C2 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C2().a(codedInputByteBufferNano);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static C2[] b() {
        if (f != null) return f;
        Object object = InternalNano.LAZY_INIT_LOCK;
        synchronized (object) {
            try {
                if (f != null) return f;
                f = new C2[0];
                return f;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final C2 a() {
        this.a = B2.b();
        this.b = false;
        this.cachedSize = -1;
        return this;
    }

    public final C2 a(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        int n10;
        while ((n10 = codedInputByteBufferNano.readTag()) != 0) {
            if (n10 != 10) {
                if (n10 != 16) {
                    if (WireFormatNano.parseUnknownField(codedInputByteBufferNano, n10)) continue;
                    return this;
                }
                this.b = codedInputByteBufferNano.readBool();
                continue;
            }
            int n13 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
            Object object = this.a;
            n10 = object == null ? 0 : ((B2[])object).length;
            int n14 = n13 + n10;
            B2[] b2Array = new B2[n14];
            n13 = n10;
            if (n10 != 0) {
                System.arraycopy(object, 0, b2Array, 0, n10);
                n13 = n10;
            }
            while (n13 < n14 - 1) {
                b2Array[n13] = object = new B2();
                codedInputByteBufferNano.readMessage((MessageNano)object);
                codedInputByteBufferNano.readTag();
                ++n13;
            }
            b2Array[n13] = object = new B2();
            codedInputByteBufferNano.readMessage((MessageNano)object);
            this.a = b2Array;
        }
        return this;
    }

    @Override
    public final int computeSerializedSize() {
        int n10 = super.computeSerializedSize();
        Object object = this.a;
        int n13 = n10;
        if (object != null) {
            n13 = n10;
            if (((B2[])object).length > 0) {
                int n14 = 0;
                while (true) {
                    object = this.a;
                    n13 = n10;
                    if (n14 >= ((B2[])object).length) break;
                    object = object[n14];
                    n13 = n10;
                    if (object != null) {
                        n13 = CodedOutputByteBufferNano.computeMessageSize(1, (MessageNano)object) + n10;
                    }
                    ++n14;
                    n10 = n13;
                }
            }
        }
        return CodedOutputByteBufferNano.computeBoolSize(2, this.b) + n13;
    }

    @Override
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        Object object = this.a;
        if (object != null && ((B2[])object).length > 0) {
            for (int i14 = 0; i14 < ((B2[])(object = this.a)).length; ++i14) {
                if ((object = object[i14]) == null) continue;
                codedOutputByteBufferNano.writeMessage(1, (MessageNano)object);
            }
        }
        codedOutputByteBufferNano.writeBool(2, this.b);
        super.writeTo(codedOutputByteBufferNano);
    }
}

