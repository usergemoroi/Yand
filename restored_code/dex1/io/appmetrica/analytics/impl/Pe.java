/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import org.jetbrains.annotations.NotNull;

public final class Pe
implements PermissionExtractor {
    @Override
    public final boolean hasPermission(@NotNull Context context, @NotNull String string2) {
        return false;
    }
}

