/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.impl.A3;
import io.appmetrica.analytics.impl.A8;
import io.appmetrica.analytics.impl.D8;
import io.appmetrica.analytics.impl.G8;
import io.appmetrica.analytics.impl.H8;
import io.appmetrica.analytics.impl.I3;
import io.appmetrica.analytics.impl.I8;
import io.appmetrica.analytics.impl.Ie;
import io.appmetrica.analytics.impl.J3;
import io.appmetrica.analytics.impl.K8;
import io.appmetrica.analytics.impl.Ke;
import io.appmetrica.analytics.impl.Me;
import io.appmetrica.analytics.impl.Sa;
import io.appmetrica.analytics.impl.Sn;
import io.appmetrica.analytics.impl.T8;
import io.appmetrica.analytics.impl.Zi;
import io.appmetrica.analytics.impl.fg;
import io.appmetrica.analytics.impl.z3;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class Je
implements A8 {
    public final Me a;
    public final I3 b;
    public final Sa c;
    public final fg d;

    public Je() {
        this(new Me(), new I3(), new Sa(100), new fg());
    }

    public Je(Me me2, I3 i33, Sa sa2, fg fg3) {
        this.a = me2;
        this.b = i33;
        this.c = sa2;
        this.d = fg3;
    }

    @NonNull
    public final Ie a(@NonNull List<Zi> list) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public final List<Zi> a(@NonNull Ie object) {
        T8 t82 = new T8();
        t82.a = ((Ie)object).a;
        t82.f = new I8();
        Object object2 = ((Ie)object).b;
        Object object3 = new G8();
        ((G8)object3).a = StringUtils.getUTF8Bytes(((Ke)object2).a);
        ArrayList<H8> arrayList = this.c.a(((Ke)object2).b);
        ((G8)object3).b = StringUtils.getUTF8Bytes((String)((Sn)((Object)arrayList)).a);
        ((G8)object3).e = ((Ke)object2).c.size();
        object = ((Ke)object2).d;
        if (object != null) {
            object = this.a.a((Map<String, String>)object);
            ((G8)object3).c = (K8)((Zi)object).a;
        } else {
            object = null;
        }
        t82.f.a = object3;
        object3 = new z3(z3.b(new A3[]{arrayList, object}));
        List list = ((Ke)object2).c;
        ArrayList<Zi> arrayList2 = new ArrayList<Zi>();
        this.d.getClass();
        int n10 = t82.a != new T8().a ? CodedOutputByteBufferNano.computeInt32Size(1, t82.a) : 0;
        object = t82.b;
        int n13 = n10;
        if (object != null) {
            n13 = n10 + CodedOutputByteBufferNano.computeMessageSize(2, (MessageNano)object);
        }
        object = t82.c;
        n10 = n13;
        if (object != null) {
            n10 = n13 + CodedOutputByteBufferNano.computeMessageSize(3, (MessageNano)object);
        }
        object = t82.d;
        n13 = n10;
        if (object != null) {
            n13 = n10 + CodedOutputByteBufferNano.computeMessageSize(4, (MessageNano)object);
        }
        object = t82.e;
        n10 = n13;
        if (object != null) {
            n10 = n13 + CodedOutputByteBufferNano.computeMessageSize(5, (MessageNano)object);
        }
        object = t82.f;
        n13 = n10;
        if (object != null) {
            n13 = n10 + CodedOutputByteBufferNano.computeMessageSize(6, (MessageNano)object);
        }
        arrayList = new ArrayList();
        object2 = new T8();
        ((T8)object2).a = t82.a;
        ((T8)object2).f = object = new I8();
        ((I8)object).a = new G8();
        Object object4 = ((T8)object2).f.a;
        object = t82.f.a;
        ((G8)object4).b = ((G8)object).b;
        ((G8)object4).a = ((G8)object).a;
        ((G8)object4).e = ((G8)object).e;
        ((G8)object4).c = ((G8)object).c;
        object = object3;
        n10 = n13;
        for (int i14 = 0; i14 < list.size(); ++i14) {
            Object object5 = (J3)list.get(i14);
            object4 = new H8();
            ((H8)object4).a = i14;
            object5 = this.b.a((J3)object5);
            ((H8)object4).b = (D8)((Zi)object5).a;
            ((Zi)object5).b.getBytesTruncated();
            Zi zi3 = new Zi(object4, (A3)object5);
            object5 = this.d;
            object4 = (H8)zi3.a;
            object5.getClass();
            int n14 = CodedOutputByteBufferNano.computeTagSize(4);
            int n15 = CodedOutputByteBufferNano.computeMessageSizeNoTag((MessageNano)object4);
            int n16 = (n15 & 0xFFFFFF80) == 0 ? 0 : CodedOutputByteBufferNano.computeRawVarint32Size(n15);
            n14 = n14 + n15 + n16;
            ArrayList<H8> arrayList3 = arrayList;
            object5 = object2;
            object4 = object;
            n16 = n10;
            if (arrayList.size() != 0) {
                arrayList3 = arrayList;
                object5 = object2;
                object4 = object;
                n16 = n10;
                if (n10 + n14 > 204800) {
                    ((T8)object2).f.a.d = arrayList.toArray(new H8[arrayList.size()]);
                    arrayList3 = new ArrayList<H8>();
                    arrayList2.add(new Zi(object2, (A3)object));
                    object5 = new T8();
                    ((T8)object5).a = t82.a;
                    ((T8)object5).f = object = new I8();
                    ((I8)object).a = new G8();
                    object2 = ((T8)object5).f.a;
                    object = t82.f.a;
                    ((G8)object2).b = ((G8)object).b;
                    ((G8)object2).a = ((G8)object).a;
                    ((G8)object2).e = ((G8)object).e;
                    ((G8)object2).c = ((G8)object).c;
                    object4 = object3;
                    n16 = n13;
                }
            }
            arrayList3.add((H8)zi3.a);
            object = new z3(z3.b(new A3[]{object4, zi3.b}));
            n10 = n16 + n14;
            arrayList = arrayList3;
            object2 = object5;
        }
        ((T8)object2).f.a.d = arrayList.toArray(new H8[arrayList.size()]);
        arrayList2.add(new Zi(object2, (A3)object));
        return arrayList2;
    }

    @NonNull
    public final Object toModel(@NonNull Object object) {
        object = (List)object;
        throw new UnsupportedOperationException();
    }
}

