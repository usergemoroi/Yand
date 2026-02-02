/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.y6;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

public final class A6
extends MessageNano {
    public static volatile A6[] f;
    public String a;
    public String b;
    public y6[] c;
    public A6 d;
    public A6[] e;

    public A6() {
        this.a();
    }

    public static A6 a(byte[] byArray) throws InvalidProtocolBufferNanoException {
        return MessageNano.mergeFrom(new A6(), byArray);
    }

    public static A6 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new A6().a(codedInputByteBufferNano);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static A6[] b() {
        if (f != null) return f;
        Object object = InternalNano.LAZY_INIT_LOCK;
        synchronized (object) {
            try {
                if (f != null) return f;
                f = new A6[0];
                return f;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final A6 a() {
        this.a = "";
        this.b = "";
        this.c = y6.b();
        this.d = null;
        this.e = A6.b();
        this.cachedSize = -1;
        return this;
    }

    public final A6 a(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        int n10;
        while ((n10 = codedInputByteBufferNano.readTag()) != 0) {
            if (n10 != 10) {
                if (n10 != 18) {
                    MessageNano[] messageNanoArray;
                    int n13;
                    Object object;
                    int n14;
                    if (n10 != 26) {
                        if (n10 != 34) {
                            if (n10 != 42) {
                                if (WireFormatNano.parseUnknownField(codedInputByteBufferNano, n10)) continue;
                                return this;
                            }
                            n14 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 42);
                            object = this.e;
                            n10 = object == null ? 0 : ((MessageNano[])object).length;
                            n13 = n14 + n10;
                            messageNanoArray = new A6[n13];
                            n14 = n10;
                            if (n10 != 0) {
                                System.arraycopy(object, 0, messageNanoArray, 0, n10);
                                n14 = n10;
                            }
                            while (n14 < n13 - 1) {
                                messageNanoArray[n14] = object = new A6();
                                codedInputByteBufferNano.readMessage((MessageNano)object);
                                codedInputByteBufferNano.readTag();
                                ++n14;
                            }
                            messageNanoArray[n14] = object = new A6();
                            codedInputByteBufferNano.readMessage((MessageNano)object);
                            this.e = messageNanoArray;
                            continue;
                        }
                        if (this.d == null) {
                            this.d = new A6();
                        }
                        codedInputByteBufferNano.readMessage(this.d);
                        continue;
                    }
                    n14 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                    object = this.c;
                    n10 = object == null ? 0 : ((y6[])object).length;
                    n13 = n14 + n10;
                    messageNanoArray = new y6[n13];
                    n14 = n10;
                    if (n10 != 0) {
                        System.arraycopy(object, 0, messageNanoArray, 0, n10);
                        n14 = n10;
                    }
                    while (n14 < n13 - 1) {
                        messageNanoArray[n14] = object = new y6();
                        codedInputByteBufferNano.readMessage((MessageNano)object);
                        codedInputByteBufferNano.readTag();
                        ++n14;
                    }
                    messageNanoArray[n14] = object = new y6();
                    codedInputByteBufferNano.readMessage((MessageNano)object);
                    this.c = messageNanoArray;
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
        int n13;
        int n14 = super.computeSerializedSize();
        n14 = n13 = CodedOutputByteBufferNano.computeStringSize(1, this.a) + n14;
        if (!this.b.equals("")) {
            n14 = n13 + CodedOutputByteBufferNano.computeStringSize(2, this.b);
        }
        Object object = this.c;
        int n15 = 0;
        n13 = n14;
        if (object != null) {
            n13 = n14;
            if (((y6[])object).length > 0) {
                n10 = 0;
                while (true) {
                    object = this.c;
                    n13 = n14;
                    if (n10 >= ((y6[])object).length) break;
                    object = object[n10];
                    n13 = n14;
                    if (object != null) {
                        n13 = CodedOutputByteBufferNano.computeMessageSize(3, (MessageNano)object) + n14;
                    }
                    ++n10;
                    n14 = n13;
                }
            }
        }
        object = this.d;
        n14 = n13;
        if (object != null) {
            n14 = n13 + CodedOutputByteBufferNano.computeMessageSize(4, (MessageNano)object);
        }
        object = this.e;
        n10 = n14;
        if (object != null) {
            n10 = n14;
            if (((y6[])object).length > 0) {
                n13 = n15;
                while (true) {
                    object = this.e;
                    n10 = n14;
                    if (n13 >= ((y6[])object).length) break;
                    object = object[n13];
                    n10 = n14;
                    if (object != null) {
                        n10 = CodedOutputByteBufferNano.computeMessageSize(5, (MessageNano)object) + n14;
                    }
                    ++n13;
                    n14 = n10;
                }
            }
        }
        return n10;
    }

    @Override
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int n10;
        codedOutputByteBufferNano.writeString(1, this.a);
        if (!this.b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.b);
        }
        Object object = this.c;
        int n13 = 0;
        if (object != null && ((y6[])object).length > 0) {
            for (n10 = 0; n10 < ((y6[])(object = this.c)).length; ++n10) {
                if ((object = object[n10]) == null) continue;
                codedOutputByteBufferNano.writeMessage(3, (MessageNano)object);
            }
        }
        if ((object = this.d) != null) {
            codedOutputByteBufferNano.writeMessage(4, (MessageNano)object);
        }
        if ((object = this.e) != null && ((y6[])object).length > 0) {
            for (n10 = n13; n10 < ((y6[])(object = this.e)).length; ++n10) {
                if ((object = object[n10]) == null) continue;
                codedOutputByteBufferNano.writeMessage(5, (MessageNano)object);
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}

