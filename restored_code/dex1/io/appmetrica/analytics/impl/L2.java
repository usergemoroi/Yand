/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

public final class L2
extends Enum {
    public static final /* enum */ L2 a;
    public static final /* enum */ L2 b;
    public static final /* enum */ L2 c;
    public static final /* enum */ L2 d;
    public static final /* enum */ L2 e;
    public static final /* enum */ L2 f;
    public static final /* enum */ L2 g;
    public static final L2[] h;

    static {
        L2 l22;
        L2 l24;
        L2 l25;
        L2 l26;
        L2 l27;
        L2 l28;
        L2 l29;
        a = l29 = new L2("EXEMPTED", 0);
        b = l28 = new L2("ACTIVE", 1);
        c = l27 = new L2("WORKING_SET", 2);
        d = l26 = new L2("FREQUENT", 3);
        e = l25 = new L2("RARE", 4);
        f = l24 = new L2("RESTRICTED", 5);
        g = l22 = new L2("UNKNOWN", 6);
        h = new L2[]{l29, l28, l27, l26, l25, l24, l22};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public L2() {
        void var2_-1;
        void var1_-1;
    }

    public static L2 valueOf(String string2) {
        return Enum.valueOf(L2.class, string2);
    }

    public static L2[] values() {
        return (L2[])h.clone();
    }
}

