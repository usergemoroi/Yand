/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.screenshot.impl.O;
import io.appmetrica.analytics.screenshot.impl.T;

public final class G {
    public final boolean a;
    public final T b;

    public G() {
        this(new O().a, new T());
    }

    public G(boolean bl2, T t13) {
        this.a = bl2;
        this.b = t13;
    }

    public final T a() {
        return this.b;
    }

    public final boolean b() {
        return this.a;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("RemoteScreenshotConfig(enabled=");
        stringBuilder.append(this.a);
        stringBuilder.append(", config=");
        stringBuilder.append(this.b);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

