/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.impl.Ze;
import io.appmetrica.analytics.impl.dd;

public final class We
extends dd {
    public We() {
        super((Object)Ze.n);
        this.a(1, (Object)Ze.a);
        this.a(0, (Object)Ze.b);
        this.a(3, (Object)Ze.c);
        this.a(2, (Object)Ze.d);
        this.a(4, (Object)Ze.e);
        if (AndroidUtils.isApiAchieved(27)) {
            this.a(6, (Object)Ze.f);
        }
        if (AndroidUtils.isApiAchieved(26)) {
            this.a(5, (Object)Ze.g);
        }
    }
}

