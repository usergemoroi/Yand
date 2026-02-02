/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 */
package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.impl.Y7;
import io.appmetrica.analytics.impl.r1;

public final class J0
implements Runnable {
    public final Intent a;
    public final r1 b;

    public J0(r1 r14, Intent intent) {
        this.b = r14;
        this.a = intent;
    }

    @Override
    public final void run() {
        Y7 y74 = this.b.d().b;
        Intent intent = this.a;
        y74.getClass();
        if (intent != null) {
            y74.a(intent.getDataString(), false);
        }
    }
}

