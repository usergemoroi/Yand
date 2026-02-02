/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.B9;
import io.appmetrica.analytics.impl.G9;
import io.appmetrica.analytics.impl.H9;
import io.appmetrica.analytics.impl.y9;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

public final class J9
extends MessageNano {
    public static final int g = -1;
    public static final int h = 0;
    public static final int i = 1;
    public static volatile J9[] j;
    public G9[] a;
    public B9 b;
    public y9[] c;
    public H9[] d;
    public String[] e;
    public byte[][] f;

    public J9() {
        this.a();
    }

    public static J9 a(byte[] byArray) throws InvalidProtocolBufferNanoException {
        return MessageNano.mergeFrom(new J9(), byArray);
    }

    public static J9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new J9().a(codedInputByteBufferNano);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static J9[] b() {
        if (j != null) return j;
        Object object = InternalNano.LAZY_INIT_LOCK;
        synchronized (object) {
            try {
                if (j != null) return j;
                j = new J9[0];
                return j;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final J9 a() {
        this.a = G9.b();
        this.b = null;
        this.c = y9.b();
        this.d = H9.b();
        this.e = WireFormatNano.EMPTY_STRING_ARRAY;
        this.f = WireFormatNano.EMPTY_BYTES_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    public final J9 a(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        int n10;
        while ((n10 = codedInputByteBufferNano.readTag()) != 0) {
            Object object;
            int n13;
            Object object2;
            int n14;
            if (n10 != 26) {
                if (n10 != 34) {
                    if (n10 != 58) {
                        if (n10 != 82) {
                            if (n10 != 90) {
                                if (n10 != 98) {
                                    if (WireFormatNano.parseUnknownField(codedInputByteBufferNano, n10)) continue;
                                    return this;
                                }
                                n14 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 98);
                                object2 = this.f;
                                n10 = object2 == null ? 0 : ((Object[])object2).length;
                                n13 = n14 + n10;
                                object = new byte[n13][];
                                n14 = n10;
                                if (n10 != 0) {
                                    System.arraycopy(object2, 0, object, 0, n10);
                                    n14 = n10;
                                }
                                while (n14 < n13 - 1) {
                                    object[n14] = codedInputByteBufferNano.readBytes();
                                    codedInputByteBufferNano.readTag();
                                    ++n14;
                                }
                                object[n14] = codedInputByteBufferNano.readBytes();
                                this.f = (byte[][])object;
                                continue;
                            }
                            n14 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 90);
                            object2 = this.e;
                            n10 = object2 == null ? 0 : ((Object[])object2).length;
                            n13 = n14 + n10;
                            object = new String[n13];
                            n14 = n10;
                            if (n10 != 0) {
                                System.arraycopy(object2, 0, object, 0, n10);
                                n14 = n10;
                            }
                            while (n14 < n13 - 1) {
                                object[n14] = codedInputByteBufferNano.readString();
                                codedInputByteBufferNano.readTag();
                                ++n14;
                            }
                            object[n14] = codedInputByteBufferNano.readString();
                            this.e = object;
                            continue;
                        }
                        n14 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 82);
                        object = this.d;
                        n10 = object == null ? 0 : ((MessageNano[])object).length;
                        n13 = n14 + n10;
                        object2 = new H9[n13];
                        n14 = n10;
                        if (n10 != 0) {
                            System.arraycopy(object, 0, object2, 0, n10);
                            n14 = n10;
                        }
                        while (n14 < n13 - 1) {
                            object2[n14] = object = new H9();
                            codedInputByteBufferNano.readMessage((MessageNano)object);
                            codedInputByteBufferNano.readTag();
                            ++n14;
                        }
                        object2[n14] = object = new H9();
                        codedInputByteBufferNano.readMessage((MessageNano)object);
                        this.d = object2;
                        continue;
                    }
                    n14 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 58);
                    object = this.c;
                    n10 = object == null ? 0 : ((MessageNano[])object).length;
                    n13 = n14 + n10;
                    object2 = new y9[n13];
                    n14 = n10;
                    if (n10 != 0) {
                        System.arraycopy(object, 0, object2, 0, n10);
                        n14 = n10;
                    }
                    while (n14 < n13 - 1) {
                        object2[n14] = object = new y9();
                        codedInputByteBufferNano.readMessage((MessageNano)object);
                        codedInputByteBufferNano.readTag();
                        ++n14;
                    }
                    object2[n14] = object = new y9();
                    codedInputByteBufferNano.readMessage((MessageNano)object);
                    this.c = object2;
                    continue;
                }
                if (this.b == null) {
                    this.b = new B9();
                }
                codedInputByteBufferNano.readMessage(this.b);
                continue;
            }
            n14 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
            object = this.a;
            n10 = object == null ? 0 : ((G9[])object).length;
            n13 = n14 + n10;
            object2 = new G9[n13];
            n14 = n10;
            if (n10 != 0) {
                System.arraycopy(object, 0, object2, 0, n10);
                n14 = n10;
            }
            while (n14 < n13 - 1) {
                object2[n14] = object = new G9();
                codedInputByteBufferNano.readMessage((MessageNano)object);
                codedInputByteBufferNano.readTag();
                ++n14;
            }
            object2[n14] = object = new G9();
            codedInputByteBufferNano.readMessage((MessageNano)object);
            this.a = object2;
        }
        return this;
    }

    @Override
    public final int computeSerializedSize() {
        int n10;
        int n13;
        int n14;
        int n15;
        int n16 = super.computeSerializedSize();
        Object object = this.a;
        int n17 = 0;
        int n18 = n16;
        if (object != null) {
            n18 = n16;
            if (((G9[])object).length > 0) {
                n15 = 0;
                while (true) {
                    object = this.a;
                    n18 = n16;
                    if (n15 >= ((G9[])object).length) break;
                    object = object[n15];
                    n18 = n16;
                    if (object != null) {
                        n18 = CodedOutputByteBufferNano.computeMessageSize(3, (MessageNano)object) + n16;
                    }
                    ++n15;
                    n16 = n18;
                }
            }
        }
        object = this.b;
        n15 = n18;
        if (object != null) {
            n15 = n18 + CodedOutputByteBufferNano.computeMessageSize(4, (MessageNano)object);
        }
        object = this.c;
        n16 = n15;
        if (object != null) {
            n16 = n15;
            if (((G9[])object).length > 0) {
                n18 = 0;
                while (true) {
                    object = this.c;
                    n16 = n15;
                    if (n18 >= ((G9[])object).length) break;
                    object = object[n18];
                    n16 = n15;
                    if (object != null) {
                        n16 = CodedOutputByteBufferNano.computeMessageSize(7, (MessageNano)object) + n15;
                    }
                    ++n18;
                    n15 = n16;
                }
            }
        }
        object = this.d;
        n15 = n16;
        if (object != null) {
            n15 = n16;
            if (((G9[])object).length > 0) {
                n18 = 0;
                while (true) {
                    object = this.d;
                    n15 = n16;
                    if (n18 >= ((G9[])object).length) break;
                    object = object[n18];
                    n15 = n16;
                    if (object != null) {
                        n15 = CodedOutputByteBufferNano.computeMessageSize(10, (MessageNano)object) + n16;
                    }
                    ++n18;
                    n16 = n15;
                }
            }
        }
        object = this.e;
        n16 = n15;
        if (object != null) {
            n16 = n15;
            if (((G9[])object).length > 0) {
                n14 = n18 = 0;
                for (n13 = 0; n13 < ((G9[])(object = this.e)).length; ++n13) {
                    object = object[n13];
                    n10 = n18;
                    n16 = n14;
                    if (object != null) {
                        n16 = n14 + 1;
                        n10 = n18 + CodedOutputByteBufferNano.computeStringSizeNoTag((String)object);
                    }
                    n18 = n10;
                    n14 = n16;
                }
                n16 = n15 + n18 + n14;
            }
        }
        object = this.f;
        n15 = n16;
        if (object != null) {
            n15 = n16;
            if (((G9[])object).length > 0) {
                n13 = 0;
                n14 = 0;
                for (n15 = n17; n15 < ((G9[])(object = (Object)this.f)).length; ++n15) {
                    object = object[n15];
                    n10 = n13;
                    n18 = n14;
                    if (object != null) {
                        n18 = n14 + 1;
                        n10 = CodedOutputByteBufferNano.computeBytesSizeNoTag((byte[])object) + n13;
                    }
                    n13 = n10;
                    n14 = n18;
                }
                n15 = n16 + n13 + n14;
            }
        }
        return n15;
    }

    @Override
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int n10;
        Object object = this.a;
        int n13 = 0;
        if (object != null && ((G9[])object).length > 0) {
            for (n10 = 0; n10 < ((G9[])(object = this.a)).length; ++n10) {
                if ((object = object[n10]) == null) continue;
                codedOutputByteBufferNano.writeMessage(3, (MessageNano)object);
            }
        }
        if ((object = this.b) != null) {
            codedOutputByteBufferNano.writeMessage(4, (MessageNano)object);
        }
        if ((object = this.c) != null && ((G9[])object).length > 0) {
            for (n10 = 0; n10 < ((G9[])(object = this.c)).length; ++n10) {
                if ((object = object[n10]) == null) continue;
                codedOutputByteBufferNano.writeMessage(7, (MessageNano)object);
            }
        }
        if ((object = this.d) != null && ((G9[])object).length > 0) {
            for (n10 = 0; n10 < ((G9[])(object = this.d)).length; ++n10) {
                if ((object = object[n10]) == null) continue;
                codedOutputByteBufferNano.writeMessage(10, (MessageNano)object);
            }
        }
        if ((object = this.e) != null && ((G9[])object).length > 0) {
            for (n10 = 0; n10 < ((G9[])(object = this.e)).length; ++n10) {
                if ((object = object[n10]) == null) continue;
                codedOutputByteBufferNano.writeString(11, (String)object);
            }
        }
        if ((object = (Object)this.f) != null && ((G9[])object).length > 0) {
            for (n10 = n13; n10 < ((G9[])(object = (Object)this.f)).length; ++n10) {
                if ((object = object[n10]) == null) continue;
                codedOutputByteBufferNano.writeBytes(12, (byte[])object);
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}

