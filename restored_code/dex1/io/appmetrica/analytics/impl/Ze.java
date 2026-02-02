/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

public final class Ze
extends Enum {
    public static final /* enum */ Ze a;
    public static final /* enum */ Ze b;
    public static final /* enum */ Ze c;
    public static final /* enum */ Ze d;
    public static final /* enum */ Ze e;
    public static final /* enum */ Ze f;
    public static final /* enum */ Ze g;
    public static final /* enum */ Ze h;
    public static final /* enum */ Ze i;
    public static final /* enum */ Ze j;
    public static final /* enum */ Ze k;
    public static final /* enum */ Ze l;
    public static final /* enum */ Ze m;
    public static final /* enum */ Ze n;
    public static final Ze[] o;

    static {
        Ze ze3;
        Ze ze4;
        Ze ze5;
        Ze ze6;
        Ze ze7;
        Ze ze8;
        Ze ze9;
        Ze ze10;
        Ze ze11;
        Ze ze12;
        Ze ze13;
        Ze ze14;
        Ze ze15;
        Ze ze16;
        a = ze16 = new Ze("WIFI", 0);
        b = ze15 = new Ze("CELL", 1);
        c = ze14 = new Ze("ETHERNET", 2);
        d = ze13 = new Ze("BLUETOOTH", 3);
        e = ze12 = new Ze("VPN", 4);
        f = ze11 = new Ze("LOWPAN", 5);
        g = ze10 = new Ze("WIFI_AWARE", 6);
        h = ze9 = new Ze("MOBILE_DUN", 7);
        i = ze8 = new Ze("MOBILE_HIPRI", 8);
        j = ze7 = new Ze("MOBILE_MMS", 9);
        k = ze6 = new Ze("MOBILE_SUPL", 10);
        l = ze5 = new Ze("WIMAX", 11);
        m = ze4 = new Ze("OFFLINE", 12);
        n = ze3 = new Ze("UNDEFINED", 13);
        o = new Ze[]{ze16, ze15, ze14, ze13, ze12, ze11, ze10, ze9, ze8, ze7, ze6, ze5, ze4, ze3};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public Ze() {
        void var2_-1;
        void var1_-1;
    }

    public static Ze valueOf(String string2) {
        return Enum.valueOf(Ze.class, string2);
    }

    public static Ze[] values() {
        return (Ze[])o.clone();
    }
}

