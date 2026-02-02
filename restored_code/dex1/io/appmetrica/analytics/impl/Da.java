/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

public final class Da
extends Enum {
    public static final /* enum */ Da b;
    public static final /* enum */ Da c;
    public static final /* enum */ Da d;
    public static final Da[] e;
    public final int a;

    static {
        Da da3;
        Da da4;
        Da da5;
        b = da5 = new Da("UNKNOWN", 0, 0);
        c = da4 = new Da("FIRST_OCCURRENCE", 1, 1);
        d = da3 = new Da("NON_FIRST_OCCURENCE", 2, 2);
        e = new Da[]{da5, da4, da3};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public Da() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.a = var3_2;
    }

    public static Da a(Integer n10) {
        if (n10 != null) {
            for (Da da3 : Da.values()) {
                if (da3.a != n10) continue;
                return da3;
            }
        }
        return b;
    }

    public static Da valueOf(String string2) {
        return Enum.valueOf(Da.class, string2);
    }

    public static Da[] values() {
        return (Da[])e.clone();
    }
}

