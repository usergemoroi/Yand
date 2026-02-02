/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.Kn;
import io.appmetrica.analytics.impl.g0;
import io.appmetrica.analytics.impl.i;
import io.appmetrica.analytics.impl.ue;
import io.appmetrica.analytics.impl.w0;
import io.appmetrica.analytics.impl.we;

public final class P2 {
    public final Kn A;
    public final i a;
    public final Kn b;
    public final Kn c;
    public final Kn d;
    public final Kn e;
    public final Kn f;
    public final Kn g;
    public final Kn h;
    public final Kn i;
    public final Kn j;
    public final Kn k;
    public final Kn l;
    public final Kn m;
    public final ue n;
    public final ue o;
    public final Kn p;
    public final Kn q;
    public final Kn r;
    public final Kn s;
    public final Kn t;
    public final Kn u;
    public final Kn v;
    public final Kn w;
    public final Kn x;
    public final Kn y;
    public final Kn z;

    public P2(w0 w04) {
        this.a = new i(w04);
        this.b = new Kn(new we("Config"));
        this.c = new Kn(new we("Activity"));
        this.d = new Kn(new we("Intent"));
        this.e = new Kn(new we("Application"));
        this.f = new Kn(new we("Context"));
        this.g = new Kn(new we("Deeplink listener"));
        this.h = new Kn(new we("Reporter Config"));
        this.i = new Kn(new ue("Deeplink"));
        this.j = new Kn(new ue("Referral url"));
        this.k = new Kn(new g0());
        this.l = new Kn(new we("Key"));
        this.m = new Kn(new we("WebView"));
        this.n = new ue("value");
        this.o = new ue("name");
        this.p = new Kn(new we("AppMetricaDeviceIdentifiers callback"));
        this.q = new Kn(new we("ANR listener"));
        this.r = new Kn(new we("External attribution"));
        this.s = new Kn(new ue("Event name"));
        this.t = new Kn(new ue("Error message"));
        this.u = new Kn(new ue("Error identifier"));
        new Kn(new we("Unhandled exception"));
        this.v = new Kn(new we("Throwable"));
        this.w = new Kn(new we("User profile"));
        this.x = new Kn(new we("Revenue"));
        this.y = new Kn(new we("AdRevenue"));
        this.z = new Kn(new we("ECommerceEvent"));
        this.A = new Kn(new we("Anr all threads"));
    }
}

