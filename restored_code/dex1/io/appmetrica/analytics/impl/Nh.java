/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.impl.H9;
import io.appmetrica.analytics.impl.J9;
import io.appmetrica.analytics.impl.Qh;
import io.appmetrica.analytics.impl.lg;
import io.appmetrica.analytics.impl.rl;
import io.appmetrica.analytics.impl.ro;
import io.appmetrica.analytics.impl.vn;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Collection;
import java.util.List;

public final class Nh
implements vn {
    public final J9 a;
    public final Qh b;

    public Nh(Qh qh3, J9 j94) {
        this.b = qh3;
        this.a = j94;
    }

    @Override
    public final void a(Object object) {
        object = (List)object;
        J9 j94 = this.a;
        if (!ro.a((Collection)object)) {
            j94.d = new H9[object.size()];
            for (int i14 = 0; i14 < object.size(); ++i14) {
                Object object2 = (rl)object.get(i14);
                H9[] h9Array = j94.d;
                Object object3 = lg.a;
                object3 = new H9();
                Integer n10 = ((rl)object2).a;
                if (n10 != null) {
                    ((H9)object3).a = n10;
                }
                if ((n10 = ((rl)object2).b) != null) {
                    ((H9)object3).b = n10;
                }
                if (!TextUtils.isEmpty((CharSequence)((rl)object2).d)) {
                    ((H9)object3).c = ((rl)object2).d;
                }
                ((H9)object3).d = ((rl)object2).c;
                h9Array[i14] = object3;
                object2 = this.b;
                int n13 = CodedOutputByteBufferNano.computeMessageSizeNoTag(j94.d[i14]);
                ((Qh)object2).g += n13;
                object2 = this.b;
                n13 = CodedOutputByteBufferNano.computeTagSize(10);
                ((Qh)object2).g += n13;
            }
        }
    }
}

