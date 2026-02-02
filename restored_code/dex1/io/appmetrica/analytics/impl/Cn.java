/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.Collections;
import java.util.List;

public final class Cn {
    public final String a;
    public final int b;
    public final long c;
    public final String d;
    public final Integer e;
    public final List f;

    public Cn(String list, int n10, long l10, String string2, Integer n13, List list2) {
        this.a = list;
        this.b = n10;
        this.c = l10;
        this.d = string2;
        this.e = n13;
        list = list2 == null ? Collections.emptyList() : CollectionUtils.unmodifiableListCopy(list2);
        this.f = list;
    }
}

