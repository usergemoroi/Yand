/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.impl.Cn;
import io.appmetrica.analytics.impl.Dn;
import io.appmetrica.analytics.impl.U;
import io.appmetrica.analytics.impl.q6;
import io.appmetrica.analytics.impl.z6;
import java.util.Iterator;

public final class V
implements ProtobufConverter {
    public final Dn a;

    public V(@NonNull Dn dn3) {
        this.a = dn3;
    }

    @NonNull
    public final U a(@NonNull q6 q62) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public final q6 a(@NonNull U object) {
        q6 q62 = new q6();
        Cn cn3 = ((U)object).a;
        if (cn3 != null) {
            q62.a = this.a.a(cn3);
        }
        q62.b = new z6[((U)object).b.size()];
        Iterator iterator = ((U)object).b.iterator();
        int n10 = 0;
        while (iterator.hasNext()) {
            cn3 = (Cn)iterator.next();
            q62.b[n10] = this.a.a(cn3);
            ++n10;
        }
        object = ((U)object).c;
        if (object != null) {
            q62.c = object;
        }
        return q62;
    }

    @Override
    @NonNull
    public final Object toModel(@NonNull Object object) {
        object = (q6)object;
        throw new UnsupportedOperationException();
    }
}

