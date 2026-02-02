/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.C8;
import io.appmetrica.analytics.impl.I8;
import io.appmetrica.analytics.impl.Q8;
import io.appmetrica.analytics.impl.R8;
import io.appmetrica.analytics.impl.S8;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

public final class T8
extends MessageNano {
    public static final int g = 0;
    public static final int h = 1;
    public static final int i = 2;
    public static final int j = 3;
    public static final int k = 4;
    public static final int l = 5;
    public static final int m = 6;
    public static final int n = 7;
    public static volatile T8[] o;
    public int a;
    public S8 b;
    public Q8 c;
    public R8 d;
    public C8 e;
    public I8 f;

    public T8() {
        this.a();
    }

    public static T8 a(byte[] byArray) throws InvalidProtocolBufferNanoException {
        return MessageNano.mergeFrom(new T8(), byArray);
    }

    public static T8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new T8().a(codedInputByteBufferNano);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static T8[] b() {
        if (o != null) return o;
        Object object = InternalNano.LAZY_INIT_LOCK;
        synchronized (object) {
            try {
                if (o != null) return o;
                o = new T8[0];
                return o;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final T8 a() {
        this.a = 0;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.cachedSize = -1;
        return this;
    }

    public final T8 a(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        int n10;
        block3: while ((n10 = codedInputByteBufferNano.readTag()) != 0) {
            if (n10 != 8) {
                if (n10 != 18) {
                    if (n10 != 26) {
                        if (n10 != 34) {
                            if (n10 != 42) {
                                if (n10 != 50) {
                                    if (WireFormatNano.parseUnknownField(codedInputByteBufferNano, n10)) continue;
                                    return this;
                                }
                                if (this.f == null) {
                                    this.f = new I8();
                                }
                                codedInputByteBufferNano.readMessage(this.f);
                                continue;
                            }
                            if (this.e == null) {
                                this.e = new C8();
                            }
                            codedInputByteBufferNano.readMessage(this.e);
                            continue;
                        }
                        if (this.d == null) {
                            this.d = new R8();
                        }
                        codedInputByteBufferNano.readMessage(this.d);
                        continue;
                    }
                    if (this.c == null) {
                        this.c = new Q8();
                    }
                    codedInputByteBufferNano.readMessage(this.c);
                    continue;
                }
                if (this.b == null) {
                    this.b = new S8();
                }
                codedInputByteBufferNano.readMessage(this.b);
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
        if (n13 != 0) {
            n14 = n10 + CodedOutputByteBufferNano.computeInt32Size(1, n13);
        }
        MessageNano messageNano = this.b;
        n10 = n14;
        if (messageNano != null) {
            n10 = n14 + CodedOutputByteBufferNano.computeMessageSize(2, messageNano);
        }
        messageNano = this.c;
        n14 = n10;
        if (messageNano != null) {
            n14 = n10 + CodedOutputByteBufferNano.computeMessageSize(3, messageNano);
        }
        messageNano = this.d;
        n10 = n14;
        if (messageNano != null) {
            n10 = n14 + CodedOutputByteBufferNano.computeMessageSize(4, messageNano);
        }
        messageNano = this.e;
        n14 = n10;
        if (messageNano != null) {
            n14 = n10 + CodedOutputByteBufferNano.computeMessageSize(5, messageNano);
        }
        messageNano = this.f;
        n10 = n14;
        if (messageNano != null) {
            n10 = n14 + CodedOutputByteBufferNano.computeMessageSize(6, messageNano);
        }
        return n10;
    }

    @Override
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        MessageNano messageNano;
        int n10 = this.a;
        if (n10 != 0) {
            codedOutputByteBufferNano.writeInt32(1, n10);
        }
        if ((messageNano = this.b) != null) {
            codedOutputByteBufferNano.writeMessage(2, messageNano);
        }
        if ((messageNano = this.c) != null) {
            codedOutputByteBufferNano.writeMessage(3, messageNano);
        }
        if ((messageNano = this.d) != null) {
            codedOutputByteBufferNano.writeMessage(4, messageNano);
        }
        if ((messageNano = this.e) != null) {
            codedOutputByteBufferNano.writeMessage(5, messageNano);
        }
        if ((messageNano = this.f) != null) {
            codedOutputByteBufferNano.writeMessage(6, messageNano);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}

