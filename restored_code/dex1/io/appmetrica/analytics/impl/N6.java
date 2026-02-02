/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.backport.Function;
import io.appmetrica.analytics.impl.Cn;

public final class N6
implements Function {
    @NonNull
    public final Cn a(Thread object) {
        String string2 = ((Thread)object).getName();
        int n10 = ((Thread)object).getPriority();
        long l10 = ((Thread)object).getId();
        object = (object = ((Thread)object).getThreadGroup()) != null ? ((ThreadGroup)object).getName() : "";
        return new Cn(string2, n10, l10, (String)object, null, null);
    }
}

