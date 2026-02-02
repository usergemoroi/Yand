/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

public final class H5
implements PermissionStrategy {
    public final PermissionStrategy[] a;

    public H5(PermissionStrategy ... permissionStrategyArray) {
        this.a = permissionStrategyArray;
    }

    @Override
    public final boolean forbidUsePermission(@NotNull String string2) {
        boolean bl2;
        PermissionStrategy[] permissionStrategyArray = this.a;
        int n10 = permissionStrategyArray.length;
        boolean bl3 = false;
        int n13 = 0;
        while (true) {
            bl2 = bl3;
            if (n13 >= n10) break;
            if (permissionStrategyArray[n13].forbidUsePermission(string2)) {
                bl2 = true;
                break;
            }
            ++n13;
        }
        return bl2;
    }

    @NotNull
    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("CompositePermissionStrategy(strategies=");
        stringBuilder.append(Arrays.toString(this.a));
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

