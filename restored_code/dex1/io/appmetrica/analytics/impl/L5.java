/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

public final class L5 {
    public final PublicLogger a;

    public L5(String string2) {
        this.a = LoggerStorage.getOrCreatePublicLogger(string2);
    }

    public final int a(int n10) {
        if (n10 < 100) {
            PublicLogger publicLogger = this.a;
            StringBuilder stringBuilder = new StringBuilder("Value passed as maxReportsInDatabaseCount is invalid. Should be greater than or equal to 100, but was: ");
            stringBuilder.append(n10);
            stringBuilder.append(". Default value (100) will be used");
            publicLogger.warning(stringBuilder.toString(), new Object[0]);
            return 100;
        }
        if (n10 > 10000) {
            PublicLogger publicLogger = this.a;
            StringBuilder stringBuilder = new StringBuilder("Value passed as maxReportsInDatabaseCount is invalid. Should be less than or equal to 10000, but was: ");
            stringBuilder.append(n10);
            stringBuilder.append(". Default value (10000) will be used");
            publicLogger.warning(stringBuilder.toString(), new Object[0]);
            return 10000;
        }
        return n10;
    }
}

