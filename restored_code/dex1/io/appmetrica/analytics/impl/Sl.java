/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

public final class Sl
extends Enum {
    public static final /* enum */ Sl b;
    public static final /* enum */ Sl c;
    public static final /* enum */ Sl d;
    public static final Sl[] e;
    public final int a;

    static {
        Sl sl3;
        Sl sl4;
        Sl sl5;
        b = sl5 = new Sl("UNKNOWN", 0, 0);
        c = sl4 = new Sl("NETWORK", 1, 1);
        d = sl3 = new Sl("PARSE", 2, 2);
        e = new Sl[]{sl5, sl4, sl3};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public Sl() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.a = var3_2;
    }

    public static Sl valueOf(String string2) {
        return Enum.valueOf(Sl.class, string2);
    }

    public static Sl[] values() {
        return (Sl[])e.clone();
    }
}

