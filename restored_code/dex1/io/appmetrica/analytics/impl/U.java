/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.impl.Cn;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class U {
    public final Cn a;
    public final List b;
    public final String c;

    public U(Cn list, ArrayList arrayList, String string2) {
        this.a = list;
        list = arrayList == null ? Collections.emptyList() : CollectionUtils.unmodifiableListCopy(arrayList);
        this.b = list;
        this.c = string2;
    }
}

