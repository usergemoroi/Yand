/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.Dl;
import io.appmetrica.analytics.impl.xd;
import io.appmetrica.analytics.modulesapi.internal.client.ClientStorageProvider;
import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;
import org.jetbrains.annotations.NotNull;

public final class B4
implements ClientStorageProvider {
    public final Dl a;

    public B4(@NotNull Dl dl2) {
        this.a = dl2;
    }

    @Override
    @NotNull
    public final ModulePreferences modulePreferences(@NotNull String string2) {
        return new xd(string2, this.a);
    }
}

