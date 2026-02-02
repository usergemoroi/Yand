/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

public final class Ko
implements Consumer {
    public final String a;

    public Ko() {
        this.a = "WebView interface setup failed because javascript is disabled for the WebView.";
    }

    public final void consume(Object object) {
        ((PublicLogger)object).warning(this.a, new Object[0]);
    }
}

