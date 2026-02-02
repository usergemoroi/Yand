/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.backport.BiFunction;
import io.appmetrica.analytics.impl.Cn;
import java.util.Arrays;
import java.util.List;

public final class La
implements BiFunction {
    @NonNull
    public final Cn a(@NonNull Thread object, @Nullable StackTraceElement[] stackTraceElementArray) {
        String string2 = ((Thread)object).getName();
        int n10 = ((Thread)object).getPriority();
        long l10 = ((Thread)object).getId();
        Object object2 = ((Thread)object).getThreadGroup();
        object2 = object2 != null ? ((ThreadGroup)object2).getName() : "";
        int n13 = ((Thread)object).getState().ordinal();
        object = stackTraceElementArray == null ? null : Arrays.asList(stackTraceElementArray);
        return new Cn(string2, n10, l10, (String)object2, n13, (List)object);
    }
}

