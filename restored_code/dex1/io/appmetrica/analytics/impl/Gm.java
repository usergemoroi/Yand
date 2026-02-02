/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.Am;
import io.appmetrica.analytics.impl.Bm;
import io.appmetrica.analytics.impl.Cm;
import io.appmetrica.analytics.impl.Dm;
import io.appmetrica.analytics.impl.Em;
import io.appmetrica.analytics.impl.Fm;
import io.appmetrica.analytics.impl.wm;
import io.appmetrica.analytics.impl.xm;
import io.appmetrica.analytics.impl.ym;
import io.appmetrica.analytics.impl.zm;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

public final class Gm
extends MessageNano {
    public static final int E = -1;
    public static final int F = 0;
    public static final int G = 1;
    public static volatile Gm[] H;
    public wm A;
    public Em B;
    public Cm[] C;
    public Am D;
    public String a;
    public long b;
    public String[] c;
    public String d;
    public String e;
    public String[] f;
    public String[] g;
    public zm[] h;
    public Bm i;
    public String j;
    public String k;
    public String l;
    public boolean m;
    public String n;
    public String[] o;
    public Fm p;
    public boolean q;
    public String r;
    public long s;
    public long t;
    public boolean u;
    public Dm v;
    public int w;
    public int x;
    public ym y;
    public xm z;

    public Gm() {
        this.a();
    }

    public static Gm a(byte[] byArray) throws InvalidProtocolBufferNanoException {
        return MessageNano.mergeFrom(new Gm(), byArray);
    }

    public static Gm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Gm().a(codedInputByteBufferNano);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Gm[] b() {
        if (H != null) return H;
        Object object = InternalNano.LAZY_INIT_LOCK;
        synchronized (object) {
            try {
                if (H != null) return H;
                H = new Gm[0];
                return H;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final Gm a() {
        this.a = "";
        this.b = 0L;
        String[] stringArray = WireFormatNano.EMPTY_STRING_ARRAY;
        this.c = stringArray;
        this.d = "";
        this.e = "";
        this.f = stringArray;
        this.g = stringArray;
        this.h = zm.b();
        this.i = null;
        this.j = "";
        this.k = "";
        this.l = "";
        this.m = false;
        this.n = "";
        this.o = stringArray;
        this.p = null;
        this.q = false;
        this.r = "";
        this.s = 0L;
        this.t = 0L;
        this.u = false;
        this.v = null;
        this.w = 600;
        this.x = 1;
        this.y = null;
        this.z = null;
        this.A = null;
        this.B = null;
        this.C = Cm.b();
        this.D = null;
        this.cachedSize = -1;
        return this;
    }

    public final Gm a(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        block33: while (true) {
            int n10 = codedInputByteBufferNano.readTag();
            switch (n10) {
                default: {
                    if (WireFormatNano.parseUnknownField(codedInputByteBufferNano, n10)) continue block33;
                    return this;
                }
                case 258: {
                    if (this.D == null) {
                        this.D = new Am();
                    }
                    codedInputByteBufferNano.readMessage(this.D);
                    continue block33;
                }
                case 250: {
                    int n13 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 250);
                    Object object = this.C;
                    n10 = object == null ? 0 : ((Object[])object).length;
                    int n14 = n13 + n10;
                    Object[] objectArray = new Cm[n14];
                    n13 = n10;
                    if (n10 != 0) {
                        System.arraycopy(object, 0, objectArray, 0, n10);
                        n13 = n10;
                    }
                    while (n13 < n14 - 1) {
                        objectArray[n13] = object = new Cm();
                        codedInputByteBufferNano.readMessage((MessageNano)object);
                        codedInputByteBufferNano.readTag();
                        ++n13;
                    }
                    objectArray[n13] = object = new Cm();
                    codedInputByteBufferNano.readMessage((MessageNano)object);
                    this.C = objectArray;
                    continue block33;
                }
                case 242: {
                    if (this.B == null) {
                        this.B = new Em();
                    }
                    codedInputByteBufferNano.readMessage(this.B);
                    continue block33;
                }
                case 234: {
                    if (this.A == null) {
                        this.A = new wm();
                    }
                    codedInputByteBufferNano.readMessage(this.A);
                    continue block33;
                }
                case 226: {
                    if (this.z == null) {
                        this.z = new xm();
                    }
                    codedInputByteBufferNano.readMessage(this.z);
                    continue block33;
                }
                case 218: {
                    if (this.y == null) {
                        this.y = new ym();
                    }
                    codedInputByteBufferNano.readMessage(this.y);
                    continue block33;
                }
                case 208: {
                    this.x = codedInputByteBufferNano.readInt32();
                    continue block33;
                }
                case 200: {
                    this.w = codedInputByteBufferNano.readInt32();
                    continue block33;
                }
                case 194: {
                    if (this.v == null) {
                        this.v = new Dm();
                    }
                    codedInputByteBufferNano.readMessage(this.v);
                    continue block33;
                }
                case 184: {
                    this.u = codedInputByteBufferNano.readBool();
                    continue block33;
                }
                case 176: {
                    this.t = codedInputByteBufferNano.readInt64();
                    continue block33;
                }
                case 168: {
                    this.s = codedInputByteBufferNano.readInt64();
                    continue block33;
                }
                case 162: {
                    this.r = codedInputByteBufferNano.readString();
                    continue block33;
                }
                case 136: {
                    this.q = codedInputByteBufferNano.readBool();
                    continue block33;
                }
                case 130: {
                    if (this.p == null) {
                        this.p = new Fm();
                    }
                    codedInputByteBufferNano.readMessage(this.p);
                    continue block33;
                }
                case 122: {
                    int n13 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 122);
                    Object object = this.o;
                    n10 = object == null ? 0 : ((Object[])object).length;
                    int n14 = n13 + n10;
                    Object[] objectArray = new String[n14];
                    n13 = n10;
                    if (n10 != 0) {
                        System.arraycopy(object, 0, objectArray, 0, n10);
                        n13 = n10;
                    }
                    while (n13 < n14 - 1) {
                        objectArray[n13] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        ++n13;
                    }
                    objectArray[n13] = codedInputByteBufferNano.readString();
                    this.o = objectArray;
                    continue block33;
                }
                case 114: {
                    this.n = codedInputByteBufferNano.readString();
                    continue block33;
                }
                case 104: {
                    this.m = codedInputByteBufferNano.readBool();
                    continue block33;
                }
                case 98: {
                    this.l = codedInputByteBufferNano.readString();
                    continue block33;
                }
                case 90: {
                    this.k = codedInputByteBufferNano.readString();
                    continue block33;
                }
                case 82: {
                    this.j = codedInputByteBufferNano.readString();
                    continue block33;
                }
                case 74: {
                    if (this.i == null) {
                        this.i = new Bm();
                    }
                    codedInputByteBufferNano.readMessage(this.i);
                    continue block33;
                }
                case 66: {
                    int n13 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 66);
                    Object object = this.h;
                    n10 = object == null ? 0 : ((Object[])object).length;
                    int n14 = n13 + n10;
                    Object[] objectArray = new zm[n14];
                    n13 = n10;
                    if (n10 != 0) {
                        System.arraycopy(object, 0, objectArray, 0, n10);
                        n13 = n10;
                    }
                    while (n13 < n14 - 1) {
                        objectArray[n13] = object = new zm();
                        codedInputByteBufferNano.readMessage((MessageNano)object);
                        codedInputByteBufferNano.readTag();
                        ++n13;
                    }
                    objectArray[n13] = object = new zm();
                    codedInputByteBufferNano.readMessage((MessageNano)object);
                    this.h = objectArray;
                    continue block33;
                }
                case 58: {
                    int n13 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 58);
                    Object[] objectArray = this.g;
                    n10 = objectArray == null ? 0 : objectArray.length;
                    int n14 = n13 + n10;
                    Object object = new String[n14];
                    n13 = n10;
                    if (n10 != 0) {
                        System.arraycopy(objectArray, 0, object, 0, n10);
                        n13 = n10;
                    }
                    while (n13 < n14 - 1) {
                        object[n13] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        ++n13;
                    }
                    object[n13] = codedInputByteBufferNano.readString();
                    this.g = object;
                    continue block33;
                }
                case 50: {
                    int n13 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 50);
                    Object[] objectArray = this.f;
                    n10 = objectArray == null ? 0 : objectArray.length;
                    int n14 = n13 + n10;
                    Object object = new String[n14];
                    n13 = n10;
                    if (n10 != 0) {
                        System.arraycopy(objectArray, 0, object, 0, n10);
                        n13 = n10;
                    }
                    while (n13 < n14 - 1) {
                        object[n13] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        ++n13;
                    }
                    object[n13] = codedInputByteBufferNano.readString();
                    this.f = object;
                    continue block33;
                }
                case 42: {
                    this.e = codedInputByteBufferNano.readString();
                    continue block33;
                }
                case 34: {
                    this.d = codedInputByteBufferNano.readString();
                    continue block33;
                }
                case 26: {
                    int n13 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                    Object object = this.c;
                    n10 = object == null ? 0 : ((Object[])object).length;
                    int n14 = n13 + n10;
                    Object[] objectArray = new String[n14];
                    n13 = n10;
                    if (n10 != 0) {
                        System.arraycopy(object, 0, objectArray, 0, n10);
                        n13 = n10;
                    }
                    while (n13 < n14 - 1) {
                        objectArray[n13] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        ++n13;
                    }
                    objectArray[n13] = codedInputByteBufferNano.readString();
                    this.c = objectArray;
                    continue block33;
                }
                case 16: {
                    this.b = codedInputByteBufferNano.readInt64();
                    continue block33;
                }
                case 10: {
                    this.a = codedInputByteBufferNano.readString();
                    continue block33;
                }
                case 0: 
            }
            break;
        }
        return this;
    }

    @Override
    public final int computeSerializedSize() {
        int n10;
        int n13;
        int n14;
        int n15;
        int n16 = n15 = super.computeSerializedSize();
        if (!this.a.equals("")) {
            n16 = n15 + CodedOutputByteBufferNano.computeStringSize(1, this.a);
        }
        int n17 = CodedOutputByteBufferNano.computeInt64Size(2, this.b) + n16;
        Object object = this.c;
        int n18 = 0;
        n16 = n17;
        if (object != null) {
            n16 = n17;
            if (((String[])object).length > 0) {
                n14 = n15 = 0;
                for (n13 = 0; n13 < ((String[])(object = this.c)).length; ++n13) {
                    object = object[n13];
                    n10 = n15;
                    n16 = n14;
                    if (object != null) {
                        n16 = n14 + 1;
                        n10 = n15 + CodedOutputByteBufferNano.computeStringSizeNoTag((String)object);
                    }
                    n15 = n10;
                    n14 = n16;
                }
                n16 = n17 + n15 + n14;
            }
        }
        n15 = n16;
        if (!this.d.equals("")) {
            n15 = n16 + CodedOutputByteBufferNano.computeStringSize(4, this.d);
        }
        n16 = n15;
        if (!this.e.equals("")) {
            n16 = n15 + CodedOutputByteBufferNano.computeStringSize(5, this.e);
        }
        object = this.f;
        n15 = n16;
        if (object != null) {
            n15 = n16;
            if (((String[])object).length > 0) {
                n13 = n15 = 0;
                for (n14 = 0; n14 < ((String[])(object = this.f)).length; ++n14) {
                    object = object[n14];
                    n17 = n15;
                    n10 = n13;
                    if (object != null) {
                        n10 = n13 + 1;
                        n17 = n15 + CodedOutputByteBufferNano.computeStringSizeNoTag((String)object);
                    }
                    n15 = n17;
                    n13 = n10;
                }
                n15 = n16 + n15 + n13;
            }
        }
        object = this.g;
        n16 = n15;
        if (object != null) {
            n16 = n15;
            if (((String[])object).length > 0) {
                n10 = n13 = 0;
                for (n16 = 0; n16 < ((String[])(object = this.g)).length; ++n16) {
                    object = object[n16];
                    n17 = n13;
                    n14 = n10;
                    if (object != null) {
                        n14 = n10 + 1;
                        n17 = n13 + CodedOutputByteBufferNano.computeStringSizeNoTag((String)object);
                    }
                    n13 = n17;
                    n10 = n14;
                }
                n16 = n15 + n13 + n10;
            }
        }
        object = this.h;
        n15 = n16;
        if (object != null) {
            n15 = n16;
            if (((String[])object).length > 0) {
                n14 = 0;
                while (true) {
                    object = this.h;
                    n15 = n16;
                    if (n14 >= ((String[])object).length) break;
                    object = object[n14];
                    n15 = n16;
                    if (object != null) {
                        n15 = CodedOutputByteBufferNano.computeMessageSize(8, (MessageNano)object) + n16;
                    }
                    ++n14;
                    n16 = n15;
                }
            }
        }
        object = this.i;
        n14 = n15;
        if (object != null) {
            n14 = n15 + CodedOutputByteBufferNano.computeMessageSize(9, (MessageNano)object);
        }
        n16 = n14;
        if (!this.j.equals("")) {
            n16 = n14 + CodedOutputByteBufferNano.computeStringSize(10, this.j);
        }
        n15 = n16;
        if (!this.k.equals("")) {
            n15 = n16 + CodedOutputByteBufferNano.computeStringSize(11, this.k);
        }
        n16 = n15;
        if (!this.l.equals("")) {
            n16 = n15 + CodedOutputByteBufferNano.computeStringSize(12, this.l);
        }
        n16 = n15 = CodedOutputByteBufferNano.computeBoolSize(13, this.m) + n16;
        if (!this.n.equals("")) {
            n16 = n15 + CodedOutputByteBufferNano.computeStringSize(14, this.n);
        }
        object = this.o;
        n15 = n16;
        if (object != null) {
            n15 = n16;
            if (((String[])object).length > 0) {
                n14 = n10 = 0;
                for (n13 = 0; n13 < ((String[])(object = this.o)).length; ++n13) {
                    object = object[n13];
                    n17 = n10;
                    n15 = n14;
                    if (object != null) {
                        n15 = n14 + 1;
                        n17 = n10 + CodedOutputByteBufferNano.computeStringSizeNoTag((String)object);
                    }
                    n10 = n17;
                    n14 = n15;
                }
                n15 = n16 + n10 + n14;
            }
        }
        object = this.p;
        n14 = n15;
        if (object != null) {
            n14 = n15 + CodedOutputByteBufferNano.computeMessageSize(16, (MessageNano)object);
        }
        boolean bl2 = this.q;
        n16 = n14;
        if (bl2) {
            n16 = n14 + CodedOutputByteBufferNano.computeBoolSize(17, bl2);
        }
        n15 = n16;
        if (!this.r.equals("")) {
            n15 = n16 + CodedOutputByteBufferNano.computeStringSize(20, this.r);
        }
        n16 = CodedOutputByteBufferNano.computeInt64Size(21, this.s);
        n15 = CodedOutputByteBufferNano.computeInt64Size(22, this.t) + (n16 + n15);
        bl2 = this.u;
        n16 = n15;
        if (bl2) {
            n16 = n15 + CodedOutputByteBufferNano.computeBoolSize(23, bl2);
        }
        object = this.v;
        n15 = n16;
        if (object != null) {
            n15 = n16 + CodedOutputByteBufferNano.computeMessageSize(24, (MessageNano)object);
        }
        n16 = CodedOutputByteBufferNano.computeInt32Size(25, this.w);
        n15 = CodedOutputByteBufferNano.computeInt32Size(26, this.x) + (n16 + n15);
        object = this.y;
        n16 = n15;
        if (object != null) {
            n16 = n15 + CodedOutputByteBufferNano.computeMessageSize(27, (MessageNano)object);
        }
        object = this.z;
        n14 = n16;
        if (object != null) {
            n14 = n16 + CodedOutputByteBufferNano.computeMessageSize(28, (MessageNano)object);
        }
        object = this.A;
        n15 = n14;
        if (object != null) {
            n15 = n14 + CodedOutputByteBufferNano.computeMessageSize(29, (MessageNano)object);
        }
        object = this.B;
        n16 = n15;
        if (object != null) {
            n16 = n15 + CodedOutputByteBufferNano.computeMessageSize(30, (MessageNano)object);
        }
        object = this.C;
        n15 = n16;
        if (object != null) {
            n15 = n16;
            if (((String[])object).length > 0) {
                n14 = n18;
                while (true) {
                    object = this.C;
                    n15 = n16;
                    if (n14 >= ((String[])object).length) break;
                    object = object[n14];
                    n15 = n16;
                    if (object != null) {
                        n15 = CodedOutputByteBufferNano.computeMessageSize(31, (MessageNano)object) + n16;
                    }
                    ++n14;
                    n16 = n15;
                }
            }
        }
        object = this.D;
        n16 = n15;
        if (object != null) {
            n16 = n15 + CodedOutputByteBufferNano.computeMessageSize(32, (MessageNano)object);
        }
        return n16;
    }

    @Override
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        boolean bl2;
        int n10;
        if (!this.a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.a);
        }
        codedOutputByteBufferNano.writeInt64(2, this.b);
        Object object = this.c;
        int n13 = 0;
        if (object != null && ((String[])object).length > 0) {
            for (n10 = 0; n10 < ((String[])(object = this.c)).length; ++n10) {
                if ((object = object[n10]) == null) continue;
                codedOutputByteBufferNano.writeString(3, (String)object);
            }
        }
        if (!this.d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.d);
        }
        if (!this.e.equals("")) {
            codedOutputByteBufferNano.writeString(5, this.e);
        }
        if ((object = this.f) != null && ((String[])object).length > 0) {
            for (n10 = 0; n10 < ((String[])(object = this.f)).length; ++n10) {
                if ((object = object[n10]) == null) continue;
                codedOutputByteBufferNano.writeString(6, (String)object);
            }
        }
        if ((object = this.g) != null && ((String[])object).length > 0) {
            for (n10 = 0; n10 < ((String[])(object = this.g)).length; ++n10) {
                if ((object = object[n10]) == null) continue;
                codedOutputByteBufferNano.writeString(7, (String)object);
            }
        }
        if ((object = this.h) != null && ((String[])object).length > 0) {
            for (n10 = 0; n10 < ((String[])(object = this.h)).length; ++n10) {
                if ((object = object[n10]) == null) continue;
                codedOutputByteBufferNano.writeMessage(8, (MessageNano)object);
            }
        }
        if ((object = this.i) != null) {
            codedOutputByteBufferNano.writeMessage(9, (MessageNano)object);
        }
        if (!this.j.equals("")) {
            codedOutputByteBufferNano.writeString(10, this.j);
        }
        if (!this.k.equals("")) {
            codedOutputByteBufferNano.writeString(11, this.k);
        }
        if (!this.l.equals("")) {
            codedOutputByteBufferNano.writeString(12, this.l);
        }
        codedOutputByteBufferNano.writeBool(13, this.m);
        if (!this.n.equals("")) {
            codedOutputByteBufferNano.writeString(14, this.n);
        }
        if ((object = this.o) != null && ((String[])object).length > 0) {
            for (n10 = 0; n10 < ((String[])(object = this.o)).length; ++n10) {
                if ((object = object[n10]) == null) continue;
                codedOutputByteBufferNano.writeString(15, (String)object);
            }
        }
        if ((object = this.p) != null) {
            codedOutputByteBufferNano.writeMessage(16, (MessageNano)object);
        }
        if (bl2 = this.q) {
            codedOutputByteBufferNano.writeBool(17, bl2);
        }
        if (!this.r.equals("")) {
            codedOutputByteBufferNano.writeString(20, this.r);
        }
        codedOutputByteBufferNano.writeInt64(21, this.s);
        codedOutputByteBufferNano.writeInt64(22, this.t);
        bl2 = this.u;
        if (bl2) {
            codedOutputByteBufferNano.writeBool(23, bl2);
        }
        if ((object = this.v) != null) {
            codedOutputByteBufferNano.writeMessage(24, (MessageNano)object);
        }
        codedOutputByteBufferNano.writeInt32(25, this.w);
        codedOutputByteBufferNano.writeInt32(26, this.x);
        object = this.y;
        if (object != null) {
            codedOutputByteBufferNano.writeMessage(27, (MessageNano)object);
        }
        if ((object = this.z) != null) {
            codedOutputByteBufferNano.writeMessage(28, (MessageNano)object);
        }
        if ((object = this.A) != null) {
            codedOutputByteBufferNano.writeMessage(29, (MessageNano)object);
        }
        if ((object = this.B) != null) {
            codedOutputByteBufferNano.writeMessage(30, (MessageNano)object);
        }
        if ((object = this.C) != null && ((String[])object).length > 0) {
            for (n10 = n13; n10 < ((String[])(object = this.C)).length; ++n10) {
                if ((object = object[n10]) == null) continue;
                codedOutputByteBufferNano.writeMessage(31, (MessageNano)object);
            }
        }
        if ((object = this.D) != null) {
            codedOutputByteBufferNano.writeMessage(32, (MessageNano)object);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}

