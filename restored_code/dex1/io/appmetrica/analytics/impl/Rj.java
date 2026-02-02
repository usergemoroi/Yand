/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.qb;
import io.appmetrica.analytics.impl.rb;
import io.appmetrica.analytics.profile.UserProfile;

public final class Rj
implements qb {
    public final UserProfile a;

    public Rj(UserProfile userProfile) {
        this.a = userProfile;
    }

    @Override
    public final void a(rb rb2) {
        rb2.reportUserProfile(this.a);
    }
}

