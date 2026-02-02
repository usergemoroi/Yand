/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.NonNull
 *  androidx.annotation.VisibleForTesting
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.coreutils.internal.services.ContextPermissionChecker;

public final class Cl
implements PermissionExtractor {
    public static final String b = "[SimplePermissionExtractor]";
    public final PermissionStrategy a;

    public Cl(@NonNull PermissionStrategy permissionStrategy) {
        this.a = permissionStrategy;
    }

    @NonNull
    @VisibleForTesting
    public final PermissionStrategy a() {
        return this.a;
    }

    @Override
    public final boolean hasPermission(@NonNull Context context, @NonNull String string2) {
        if (this.a.forbidUsePermission(string2)) {
            return false;
        }
        return ContextPermissionChecker.hasPermission(context, string2);
    }
}

