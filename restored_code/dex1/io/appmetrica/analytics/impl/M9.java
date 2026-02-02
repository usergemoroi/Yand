/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

public final class M9
extends Enum {
    public static final /* enum */ M9 b;
    public static final /* enum */ M9 c;
    public static final /* enum */ M9 d;
    public static final M9[] e;
    public final int a;

    static {
        M9 m94;
        M9 m95;
        M9 m96;
        b = m96 = new M9("NATIVE", 0, 0);
        c = m95 = new M9("JS", 1, 1);
        d = m94 = new M9("SYSTEM", 2, 2);
        e = new M9[]{m96, m95, m94};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public M9() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.a = var3_2;
    }

    public static M9 valueOf(String string2) {
        return Enum.valueOf(M9.class, string2);
    }

    public static M9[] values() {
        return (M9[])e.clone();
    }
}

