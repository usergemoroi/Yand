/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

public final class L
extends MessageNano {
    public static volatile L[] d;
    public boolean a;
    public long b;
    public String[] c;

    public L() {
        this.a();
    }

    public static L a(byte[] byArray) throws InvalidProtocolBufferNanoException {
        return MessageNano.mergeFrom(new L(), byArray);
    }

    public static L b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new L().a(codedInputByteBufferNano);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static L[] b() {
        if (d != null) return d;
        Object object = InternalNano.LAZY_INIT_LOCK;
        synchronized (object) {
            try {
                if (d != null) return d;
                d = new L[0];
                return d;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final L a() {
        this.a = true;
        this.b = 5L;
        this.c = WireFormatNano.EMPTY_STRING_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    public final L a(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        int n10;
        while ((n10 = codedInputByteBufferNano.readTag()) != 0) {
            if (n10 != 8) {
                if (n10 != 16) {
                    if (n10 != 26) {
                        if (WireFormatNano.parseUnknownField(codedInputByteBufferNano, n10)) continue;
                        return this;
                    }
                    int n13 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                    String[] stringArray = this.c;
                    n10 = stringArray == null ? 0 : stringArray.length;
                    int n14 = n13 + n10;
                    String[] stringArray2 = new String[n14];
                    n13 = n10;
                    if (n10 != 0) {
                        System.arraycopy(stringArray, 0, stringArray2, 0, n10);
                        n13 = n10;
                    }
                    while (n13 < n14 - 1) {
                        stringArray2[n13] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        ++n13;
                    }
                    stringArray2[n13] = codedInputByteBufferNano.readString();
                    this.c = stringArray2;
                    continue;
                }
                this.b = codedInputByteBufferNano.readInt64();
                continue;
            }
            this.a = codedInputByteBufferNano.readBool();
        }
        return this;
    }

    @Override
    public final int computeSerializedSize() {
        int n10 = super.computeSerializedSize();
        boolean bl2 = this.a;
        int n13 = n10;
        if (!bl2) {
            n13 = n10 + CodedOutputByteBufferNano.computeBoolSize(1, bl2);
        }
        long l10 = this.b;
        n10 = n13;
        if (l10 != 5L) {
            n10 = n13 + CodedOutputByteBufferNano.computeInt64Size(2, l10);
        }
        Object object = this.c;
        n13 = n10;
        if (object != null) {
            n13 = n10;
            if (((String[])object).length > 0) {
                n13 = 0;
                int n14 = 0;
                for (int i14 = 0; i14 < ((String[])(object = this.c)).length; ++i14) {
                    object = object[i14];
                    int n15 = n13;
                    int n16 = n14;
                    if (object != null) {
                        n16 = n14 + 1;
                        n15 = CodedOutputByteBufferNano.computeStringSizeNoTag((String)object) + n13;
                    }
                    n13 = n15;
                    n14 = n16;
                }
                n13 = n10 + n13 + n14;
            }
        }
        return n13;
    }

    @Override
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        Object object;
        long l10;
        boolean bl2 = this.a;
        if (!bl2) {
            codedOutputByteBufferNano.writeBool(1, bl2);
        }
        if ((l10 = this.b) != 5L) {
            codedOutputByteBufferNano.writeInt64(2, l10);
        }
        if ((object = this.c) != null && ((String[])object).length > 0) {
            for (int i14 = 0; i14 < ((String[])(object = this.c)).length; ++i14) {
                if ((object = object[i14]) == null) continue;
                codedOutputByteBufferNano.writeString(3, (String)object);
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}

