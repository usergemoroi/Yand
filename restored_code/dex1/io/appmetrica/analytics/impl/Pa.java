/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.HashMap;

public final class Pa {
    public final HashMap a = new HashMap();
    public final boolean b;

    public Pa() {
        this(false);
    }

    public Pa(boolean bl2) {
        this.b = bl2;
    }

    public final void a(Object object, Object object2) {
        ArrayList<Object> arrayList = (ArrayList<Object>)this.a.get(object);
        arrayList = arrayList == null ? new ArrayList<Object>() : new ArrayList(arrayList);
        arrayList.add(object2);
        object = this.a.put(object, arrayList);
    }

    public final String toString() {
        return ((Object)this.a).toString();
    }
}

