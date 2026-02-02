/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.cj;

public class Pn
implements cj {
    public final int a;
    public final int b;
    public int c = 0;

    public Pn(int n10, int n13) {
        this.a = n10;
        this.b = n13;
    }

    public final int a() {
        return this.b;
    }

    public final boolean b() {
        int n10 = this.c;
        this.c = n10 + 1;
        boolean bl2 = n10 < this.a;
        return bl2;
    }

    public final void c() {
        this.c = 0;
    }
}

