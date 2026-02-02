/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import java.util.HashMap;

public final class Bb
extends Enum {
    public static final /* enum */ Bb A;
    public static final /* enum */ Bb B;
    public static final /* enum */ Bb C;
    public static final /* enum */ Bb D;
    public static final /* enum */ Bb E;
    public static final /* enum */ Bb F;
    public static final /* enum */ Bb G;
    public static final /* enum */ Bb H;
    public static final /* enum */ Bb I;
    public static final /* enum */ Bb J;
    public static final HashMap K;
    public static final Bb[] L;
    public static final /* enum */ Bb c;
    public static final /* enum */ Bb d;
    public static final /* enum */ Bb e;
    public static final /* enum */ Bb f;
    public static final /* enum */ Bb g;
    public static final /* enum */ Bb h;
    public static final /* enum */ Bb i;
    public static final /* enum */ Bb j;
    public static final /* enum */ Bb k;
    public static final /* enum */ Bb l;
    public static final /* enum */ Bb m;
    public static final /* enum */ Bb n;
    public static final /* enum */ Bb o;
    public static final /* enum */ Bb p;
    public static final /* enum */ Bb q;
    public static final /* enum */ Bb r;
    public static final /* enum */ Bb s;
    public static final /* enum */ Bb t;
    public static final /* enum */ Bb u;
    public static final /* enum */ Bb v;
    public static final /* enum */ Bb w;
    public static final /* enum */ Bb x;
    public static final /* enum */ Bb y;
    public static final /* enum */ Bb z;
    public final int a;
    public final String b;

    static {
        Bb bb42;
        Bb bb5;
        Bb bb6;
        Bb bb7;
        Bb bb8;
        Bb bb9;
        Bb bb10;
        Bb bb11;
        Bb bb12;
        Bb bb13;
        Bb bb14;
        Bb bb15;
        Bb bb16;
        Bb bb17;
        Bb bb18;
        Bb bb19;
        Bb bb20;
        Bb bb21;
        Bb bb22;
        Bb bb23;
        Bb bb24;
        Bb bb25;
        Bb bb26;
        Bb bb27;
        Bb bb28;
        Bb bb29;
        Bb bb30;
        Bb bb31;
        Bb bb32;
        Bb bb33;
        Bb bb34;
        Bb bb35;
        Bb bb36;
        c = bb36 = new Bb("EVENT_TYPE_UNDEFINED", 0, -1, "Unrecognized action");
        d = bb35 = new Bb("EVENT_TYPE_INIT", 1, 0, "First initialization event");
        e = bb34 = new Bb("EVENT_TYPE_REGULAR", 2, 1, "Regular event");
        f = bb33 = new Bb("EVENT_TYPE_UPDATE_FOREGROUND_TIME", 3, 3, "Update foreground time");
        g = bb32 = new Bb("EVENT_TYPE_ALIVE", 4, 7, "App is still alive");
        h = bb31 = new Bb("EVENT_CLIENT_EXTERNAL_ATTRIBUTION", 5, 42, "External attribution event");
        i = bb30 = new Bb("EVENT_TYPE_SEND_USER_PROFILE", 6, 40961, "Send user profile");
        j = bb29 = new Bb("EVENT_TYPE_SET_USER_PROFILE_ID", 7, 40962, "Set user profile ID");
        k = bb28 = new Bb("EVENT_TYPE_SEND_REVENUE_EVENT", 8, 40976, "Send revenue event");
        l = bb27 = new Bb("EVENT_TYPE_SEND_AD_REVENUE_EVENT", 9, 40977, "Send ad revenue event");
        m = bb26 = new Bb("EVENT_TYPE_SEND_ECOMMERCE_EVENT", 10, 41000, "Send e-commerce event");
        n = bb25 = new Bb("EVENT_TYPE_PURGE_BUFFER", 11, 256, "Forcible buffer clearing");
        Bb bb37 = new Bb("EVENT_TYPE_STARTUP", 12, 1536, "Sending the startup due to lack of data");
        Bb[] bbArray = new Bb("EVENT_TYPE_SEND_REFERRER", 13, 4097, "Send referrer");
        o = bbArray;
        Bb bb38 = new Bb("EVENT_TYPE_REQUEST_REFERRER", 14, 4098, "Request referrer");
        p = bb24 = new Bb("EVENT_TYPE_APP_ENVIRONMENT_UPDATED", 15, 5376, "App Environment Updated");
        q = bb23 = new Bb("EVENT_TYPE_APP_ENVIRONMENT_CLEARED", 16, 5632, "App Environment Cleared");
        r = bb22 = new Bb("EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE", 17, 5889, "Crash of App, read from file");
        s = bb21 = new Bb("EVENT_TYPE_PREV_SESSION_EXCEPTION_UNHANDLED_FROM_FILE", 18, 5890, "Crash of App, read from file from prev session");
        t = bb20 = new Bb("EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF", 19, 5891, "Crash of App");
        u = bb19 = new Bb("EVENT_TYPE_EXCEPTION_USER_PROTOBUF", 20, 5892, "Error from developer");
        v = bb18 = new Bb("EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF", 21, 5896, "Error from developer with payload");
        w = bb17 = new Bb("EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF", 22, 5897, "Native crash of app from socket");
        x = bb16 = new Bb("EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF", 23, 5898, "Native crash from prev session");
        y = bb15 = new Bb("EVENT_TYPE_ANR", 24, 5968, "ANR");
        z = bb14 = new Bb("EVENT_TYPE_ACTIVATION", 25, 6144, "Activation of metrica");
        A = bb13 = new Bb("EVENT_TYPE_FIRST_ACTIVATION", 26, 6145, "First activation of metrica");
        B = bb12 = new Bb("EVENT_TYPE_START", 27, 6400, "Start of new session");
        C = bb11 = new Bb("EVENT_TYPE_CUSTOM_EVENT", 28, 8192, "Custom event");
        D = bb10 = new Bb("EVENT_TYPE_SET_SESSION_EXTRA", 29, 8193, "Set session extra");
        E = bb9 = new Bb("EVENT_TYPE_APP_OPEN", 30, 8208, "App open event");
        F = bb8 = new Bb("EVENT_TYPE_APP_UPDATE", 31, 8224, "App update event");
        G = bb7 = new Bb("EVENT_TYPE_PERMISSIONS", 32, 12288, "Permissions changed event");
        H = bb6 = new Bb("EVENT_TYPE_APP_FEATURES", 33, 12289, "Features, required by application");
        Bb bb39 = new Bb("EVENT_TYPE_UPDATE_PRE_ACTIVATION_CONFIG", 34, 16384, "Update pre-activation config");
        I = bb5 = new Bb("EVENT_TYPE_CLEANUP", 35, 12290, "Cleanup database");
        J = bb42 = new Bb("EVENT_TYPE_WEBVIEW_SYNC", 36, 12320, "Counter init event");
        L = new Bb[]{bb36, bb35, bb34, bb33, bb32, bb31, bb30, bb29, bb28, bb27, bb26, bb25, bb37, bbArray, bb38, bb24, bb23, bb22, bb21, bb20, bb19, bb18, bb17, bb16, bb15, bb14, bb13, bb12, bb11, bb10, bb9, bb8, bb7, bb6, bb39, bb5, bb42};
        K = new HashMap();
        for (Bb bb42 : Bb.values()) {
            K.put(bb42.a, bb42);
        }
    }

    /*
     * WARNING - void declaration
     */
    public Bb() {
        void var4_1;
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.a = var3_2;
        this.b = var4_1;
    }

    public static Bb a(int n10) {
        Bb bb4;
        Bb bb5 = bb4 = (Bb)((Object)K.get(n10));
        if (bb4 == null) {
            bb5 = c;
        }
        return bb5;
    }

    public static Bb valueOf(String string2) {
        return Enum.valueOf(Bb.class, string2);
    }

    public static Bb[] values() {
        return (Bb[])L.clone();
    }

    public final int a() {
        return this.a;
    }
}

