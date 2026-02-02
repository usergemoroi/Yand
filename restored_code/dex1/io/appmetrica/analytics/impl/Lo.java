/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

public final class Lo
implements Consumer {
    public final Throwable a;
    public final String b;

    public Lo(Throwable throwable) {
        this.a = throwable;
        this.b = "WebView interface setup failed because of an exception.";
    }

    public final void consume(Object object) {
        ((PublicLogger)object).error(this.a, this.b, new Object[0]);
    }
}

