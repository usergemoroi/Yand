/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.screenshot.impl.X;
import io.appmetrica.analytics.screenshot.impl.e;
import io.appmetrica.analytics.screenshot.impl.o;

public final class T {
    public final e a;
    public final X b;
    public final o c;

    public T() {
        this(new e(), new X(), new o());
    }

    public T(e e11, X x10, o o11) {
        this.a = e11;
        this.b = x10;
        this.c = o11;
    }

    public final e a() {
        return this.a;
    }

    public final o b() {
        return this.c;
    }

    public final X c() {
        return this.b;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ScreenshotConfig(apiCaptorConfig=");
        stringBuilder.append(this.a);
        stringBuilder.append(", serviceCaptorConfig=");
        stringBuilder.append(this.b);
        stringBuilder.append(", contentObserverCaptorConfig=");
        stringBuilder.append(this.c);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

