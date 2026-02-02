/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.collections.t
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.coreutils.internal.toggle.ConjunctiveCompositeThreadSafeToggle;
import io.appmetrica.analytics.impl.Bo;
import io.appmetrica.analytics.impl.Io;
import io.appmetrica.analytics.impl.Na;
import io.appmetrica.analytics.impl.d4;
import kotlin.collections.t;

public final class Qn {
    public final d4 a;
    public final Io b;
    public final ConjunctiveCompositeThreadSafeToggle c;

    public Qn(Toggle toggle) {
        Io io3;
        d4 d44;
        this.a = d44 = new d4(Na.j().x());
        this.b = io3 = new Io();
        Toggle toggle2 = toggle;
        if (toggle == null) {
            toggle2 = new Bo();
        }
        this.c = new ConjunctiveCompositeThreadSafeToggle(t.p((Object[])new Toggle[]{d44, io3, toggle2}), "loc-def");
    }
}

