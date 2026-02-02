/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.impl.Bb;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public abstract class W9 {
    public static final Set a;
    public static final EnumSet b;
    public static final EnumSet c;
    public static final EnumSet d;
    public static final EnumSet e;
    public static final EnumSet f;
    public static final EnumSet g;
    public static final EnumSet h;
    public static final List i;
    public static final List j;

    static {
        Bb bb4 = Bb.r;
        Bb bb5 = Bb.s;
        a = CollectionUtils.unmodifiableSetOf(5892, 5896, 5891, 5889, 5890, 5968);
        Bb bb6 = Bb.c;
        Bb bb7 = Bb.n;
        Bb bb8 = Bb.o;
        Bb bb9 = Bb.p;
        Bb bb10 = Bb.q;
        Bb bb11 = Bb.x;
        Bb bb12 = Bb.D;
        b = EnumSet.of(bb6, new Bb[]{bb7, bb8, bb9, bb10, Bb.z, bb11, bb5, bb12});
        Bb bb13 = Bb.f;
        bb6 = Bb.w;
        c = EnumSet.of(bb13, bb4, bb5, bb11, bb6);
        bb13 = Bb.e;
        d = EnumSet.of(bb4, new Bb[]{bb5, Bb.t, Bb.u, Bb.v, bb6, bb11, bb13, Bb.h, Bb.m, Bb.k, Bb.l, bb7, Bb.d, Bb.i, Bb.j, bb8, bb9, bb10, Bb.A, Bb.B, Bb.E, Bb.F, Bb.y});
        e = EnumSet.of(bb13);
        f = EnumSet.of(bb13);
        g = EnumSet.of(bb11);
        h = EnumSet.of(Bb.g, bb7, bb12, bb5, bb11);
        i = Arrays.asList(0, 6145, 4097, 8224);
        j = Arrays.asList(12290);
    }
}

