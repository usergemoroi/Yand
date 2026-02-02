/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.impl.L4;
import io.appmetrica.analytics.impl.R2;
import io.appmetrica.analytics.impl.Sn;
import io.appmetrica.analytics.impl.Ta;
import io.appmetrica.analytics.impl.ro;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Qa
extends R2 {
    public final Ta b;

    public Qa(int n10) {
        this(n10, null);
    }

    public Qa(int n10, @Nullable Ta ta3) {
        super(n10);
        this.b = ta3;
    }

    @NonNull
    public final Sn a(@Nullable List<Object> object) {
        int n10;
        int n13 = 0;
        int n14 = 0;
        if (object != null && (object.size() > this.a || this.b != null)) {
            ArrayList<Object> arrayList = new ArrayList<Object>();
            Iterator<Object> iterator = object.iterator();
            n10 = 0;
            int n15 = 0;
            while (iterator.hasNext()) {
                Object object2 = iterator.next();
                if (n15 < this.a) {
                    Object object3 = this.b;
                    n13 = n10;
                    object = object2;
                    if (object3 != null) {
                        object3 = object3.a(object2);
                        object = ((Sn)object3).a;
                        n13 = n10 + ((Sn)object3).b.getBytesTruncated();
                        ro.a(object2, ((Sn)object3).a);
                    }
                    arrayList.add(object);
                    n10 = n13;
                } else {
                    n13 = this.b(object2);
                    ++n14;
                    n10 += n13;
                }
                ++n15;
            }
            object = arrayList;
        } else {
            n10 = 0;
            n14 = n13;
        }
        return new Sn(object, new L4(n14, n10));
    }

    public int b(@Nullable Object object) {
        return 0;
    }

    @Nullable
    @VisibleForTesting
    public final Ta b() {
        return this.b;
    }
}

