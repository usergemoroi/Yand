/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

public final class Jo
implements Consumer {
    public final String a;

    public Jo() {
        this.a = "WebView interface setup is successful.";
    }

    public final void consume(Object object) {
        ((PublicLogger)object).info(this.a, new Object[0]);
    }
}

