/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.collections.t
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.toggle.ConjunctiveCompositeThreadSafeToggle;
import io.appmetrica.analytics.coreutils.internal.toggle.OuterStateToggle;
import io.appmetrica.analytics.coreutils.internal.toggle.SavableToggle;
import io.appmetrica.analytics.coreutils.internal.toggle.SimpleThreadSafeToggle;
import io.appmetrica.analytics.impl.F;
import io.appmetrica.analytics.impl.H;
import io.appmetrica.analytics.impl.Na;
import io.appmetrica.analytics.impl.om;
import io.appmetrica.analytics.impl.tf;
import kotlin.collections.t;

public final class I {
    public final tf a = Na.j().x();
    public final SavableToggle b;
    public final OuterStateToggle c;
    public final OuterStateToggle d;
    public final ConjunctiveCompositeThreadSafeToggle e;
    public final ConjunctiveCompositeThreadSafeToggle f;
    public final SavableToggle g;

    public I(om om3) {
        OuterStateToggle outerStateToggle;
        OuterStateToggle outerStateToggle2;
        SavableToggle savableToggle;
        this.b = savableToggle = new SavableToggle("advIdsFromClientApi", new H(this));
        this.c = outerStateToggle2 = new OuterStateToggle(false, "GAID-remote-config");
        this.d = outerStateToggle = new OuterStateToggle(false, "HOAID-remote-config");
        this.e = new ConjunctiveCompositeThreadSafeToggle(t.p((Object[])new SimpleThreadSafeToggle[]{savableToggle, outerStateToggle2}), "GAID");
        this.f = new ConjunctiveCompositeThreadSafeToggle(t.p((Object[])new SimpleThreadSafeToggle[]{savableToggle, outerStateToggle}), "HOAID");
        this.g = savableToggle;
        this.a(om3);
    }

    public final F a() {
        boolean bl2 = this.e.getActualState();
        int n10 = 3;
        int n13 = 4;
        int n14 = bl2 ? 1 : (!this.b.getActualState() ? 2 : (!this.c.getActualState() ? 3 : 4));
        if (this.f.getActualState()) {
            n10 = 1;
        } else if (!this.b.getActualState()) {
            n10 = 2;
        } else if (this.d.getActualState()) {
            n10 = 4;
        }
        if (this.g.getActualState()) {
            n13 = 1;
        } else if (!this.b.getActualState()) {
            n13 = 2;
        }
        return new F(n14, n10, n13);
    }

    public final void a(om om3) {
        boolean bl2 = om3.p;
        OuterStateToggle outerStateToggle = this.c;
        boolean bl3 = true;
        boolean bl4 = !bl2 || om3.n.c;
        outerStateToggle.update(bl4);
        outerStateToggle = this.d;
        bl4 = bl3;
        if (bl2) {
            bl4 = om3.n.e ? bl3 : false;
        }
        outerStateToggle.update(bl4);
    }
}

