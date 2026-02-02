/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

public final class Ig
extends Enum {
    public static final /* enum */ Ig b;
    public static final /* enum */ Ig c;
    public static final /* enum */ Ig d;
    public static final Ig[] e;
    public final String a;

    static {
        Ig ig3;
        Ig ig4;
        Ig ig5;
        b = ig5 = new Ig(0, "UNKNOWN", "unknown");
        c = ig4 = new Ig(1, "GP", "gpl");
        d = ig3 = new Ig(2, "HMS", "hms-content-provider");
        e = new Ig[]{ig5, ig4, ig3};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public Ig() {
        void var3_2;
        void var1_-1;
        void var2_-1;
        this.a = var3_2;
    }

    public static Ig valueOf(String string2) {
        return Enum.valueOf(Ig.class, string2);
    }

    public static Ig[] values() {
        return (Ig[])e.clone();
    }
}

