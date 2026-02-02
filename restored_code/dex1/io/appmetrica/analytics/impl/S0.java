/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.r1;
import io.appmetrica.analytics.profile.UserProfile;

public final class S0
implements Runnable {
    public final UserProfile a;
    public final r1 b;

    public S0(r1 r14, UserProfile userProfile) {
        this.b = r14;
        this.a = userProfile;
    }

    @Override
    public final void run() {
        r1.a(this.b).reportUserProfile(this.a);
    }
}

