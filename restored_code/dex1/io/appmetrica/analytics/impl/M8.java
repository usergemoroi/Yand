/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.E8;
import io.appmetrica.analytics.impl.K8;
import io.appmetrica.analytics.impl.L8;
import io.appmetrica.analytics.impl.N8;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

public final class M8
extends MessageNano {
    public static volatile M8[] h;
    public byte[] a;
    public byte[] b;
    public E8 c;
    public K8 d;
    public L8 e;
    public L8 f;
    public N8[] g;

    public M8() {
        this.a();
    }

    public static M8 a(byte[] byArray) throws InvalidProtocolBufferNanoException {
        return MessageNano.mergeFrom(new M8(), byArray);
    }

    public static M8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new M8().a(codedInputByteBufferNano);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static M8[] b() {
        if (h != null) return h;
        Object object = InternalNano.LAZY_INIT_LOCK;
        synchronized (object) {
            try {
                if (h != null) return h;
                h = new M8[0];
                return h;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final M8 a() {
        byte[] byArray = WireFormatNano.EMPTY_BYTES;
        this.a = byArray;
        this.b = byArray;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = N8.b();
        this.cachedSize = -1;
        return this;
    }

    public final M8 a(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        int n10;
        while ((n10 = codedInputByteBufferNano.readTag()) != 0) {
            if (n10 != 10) {
                if (n10 != 18) {
                    if (n10 != 26) {
                        if (n10 != 34) {
                            if (n10 != 42) {
                                if (n10 != 50) {
                                    if (n10 != 58) {
                                        if (WireFormatNano.parseUnknownField(codedInputByteBufferNano, n10)) continue;
                                        return this;
                                    }
                                    int n13 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 58);
                                    Object object = this.g;
                                    n10 = object == null ? 0 : ((N8[])object).length;
                                    int n14 = n13 + n10;
                                    N8[] n8Array = new N8[n14];
                                    n13 = n10;
                                    if (n10 != 0) {
                                        System.arraycopy(object, 0, n8Array, 0, n10);
                                        n13 = n10;
                                    }
                                    while (n13 < n14 - 1) {
                                        n8Array[n13] = object = new N8();
                                        codedInputByteBufferNano.readMessage((MessageNano)object);
                                        codedInputByteBufferNano.readTag();
                                        ++n13;
                                    }
                                    n8Array[n13] = object = new N8();
                                    codedInputByteBufferNano.readMessage((MessageNano)object);
                                    this.g = n8Array;
                                    continue;
                                }
                                if (this.f == null) {
                                    this.f = new L8();
                                }
                                codedInputByteBufferNano.readMessage(this.f);
                                continue;
                            }
                            if (this.e == null) {
                                this.e = new L8();
                            }
                            codedInputByteBufferNano.readMessage(this.e);
                            continue;
                        }
                        if (this.d == null) {
                            this.d = new K8();
                        }
                        codedInputByteBufferNano.readMessage(this.d);
                        continue;
                    }
                    if (this.c == null) {
                        this.c = new E8();
                    }
                    codedInputByteBufferNano.readMessage(this.c);
                    continue;
                }
                this.b = codedInputByteBufferNano.readBytes();
                continue;
            }
            this.a = codedInputByteBufferNano.readBytes();
        }
        return this;
    }

    @Override
    public final int computeSerializedSize() {
        int n10 = super.computeSerializedSize();
        Object object = this.a;
        byte[] byArray = WireFormatNano.EMPTY_BYTES;
        int n13 = n10;
        if (!Arrays.equals(object, byArray)) {
            n13 = n10 + CodedOutputByteBufferNano.computeBytesSize(1, this.a);
        }
        n10 = n13;
        if (!Arrays.equals(this.b, byArray)) {
            n10 = n13 + CodedOutputByteBufferNano.computeBytesSize(2, this.b);
        }
        object = this.c;
        n13 = n10;
        if (object != null) {
            n13 = n10 + CodedOutputByteBufferNano.computeMessageSize(3, (MessageNano)object);
        }
        object = this.d;
        n10 = n13;
        if (object != null) {
            n10 = n13 + CodedOutputByteBufferNano.computeMessageSize(4, (MessageNano)object);
        }
        object = this.e;
        n13 = n10;
        if (object != null) {
            n13 = n10 + CodedOutputByteBufferNano.computeMessageSize(5, (MessageNano)object);
        }
        object = this.f;
        n10 = n13;
        if (object != null) {
            n10 = n13 + CodedOutputByteBufferNano.computeMessageSize(6, (MessageNano)object);
        }
        object = this.g;
        int n14 = n10;
        if (object != null) {
            n14 = n10;
            if (((byte[])object).length > 0) {
                n13 = 0;
                while (true) {
                    object = this.g;
                    n14 = n10;
                    if (n13 >= ((byte[])object).length) break;
                    object = object[n13];
                    n14 = n10;
                    if (object != null) {
                        n14 = CodedOutputByteBufferNano.computeMessageSize(7, (MessageNano)object) + n10;
                    }
                    ++n13;
                    n10 = n14;
                }
            }
        }
        return n14;
    }

    @Override
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        Object object = this.a;
        byte[] byArray = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(object, byArray)) {
            codedOutputByteBufferNano.writeBytes(1, this.a);
        }
        if (!Arrays.equals(this.b, byArray)) {
            codedOutputByteBufferNano.writeBytes(2, this.b);
        }
        if ((object = (Object)this.c) != null) {
            codedOutputByteBufferNano.writeMessage(3, (MessageNano)object);
        }
        if ((object = (Object)this.d) != null) {
            codedOutputByteBufferNano.writeMessage(4, (MessageNano)object);
        }
        if ((object = (Object)this.e) != null) {
            codedOutputByteBufferNano.writeMessage(5, (MessageNano)object);
        }
        if ((object = (Object)this.f) != null) {
            codedOutputByteBufferNano.writeMessage(6, (MessageNano)object);
        }
        if ((object = (Object)this.g) != null && ((byte[])object).length > 0) {
            for (int i14 = 0; i14 < ((byte[])(object = (Object)this.g)).length; ++i14) {
                if ((object = (Object)object[i14]) == null) continue;
                codedOutputByteBufferNano.writeMessage(7, (MessageNano)object);
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}

