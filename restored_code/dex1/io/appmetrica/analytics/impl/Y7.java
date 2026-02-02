/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.ib;
import kotlin.jvm.internal.y;

public final class Y7 {
    public final ib a;
    public String b;

    public Y7(ib ib4) {
        this.a = ib4;
        this.b = "";
    }

    public final void a(String string2, boolean bl2) {
        String string3;
        if (string2 != null && (string3 = string2.length() > 0 ? string2 : null) != null && !y.e(this.b, string2)) {
            this.b = string2;
            this.a.a(string2, bl2);
        }
    }
}

