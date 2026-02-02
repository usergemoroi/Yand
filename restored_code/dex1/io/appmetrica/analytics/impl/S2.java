/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.Dl;
import io.appmetrica.analytics.impl.Td;
import io.appmetrica.analytics.impl.rf;
import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class S2
implements ModulePreferences {
    public final Dl a;

    public S2(@NotNull Dl dl2) {
        this.a = dl2;
    }

    @NotNull
    public abstract String a(@NotNull String var1);

    @Override
    public final boolean getBoolean(@NotNull String string2, boolean bl2) {
        return ((Td)this.a).c(string2, bl2);
    }

    @Override
    public final int getInt(@NotNull String string2, int n10) {
        return ((Td)this.a).c(string2, n10);
    }

    @Override
    public final long getLong(@NotNull String string2, long l10) {
        Dl dl2 = this.a;
        string2 = this.a(string2);
        return ((Td)dl2).c(string2, l10);
    }

    @Override
    @Nullable
    public final String getString(@NotNull String string2, @Nullable String string3) {
        Dl dl2 = this.a;
        string2 = this.a(string2);
        return ((Td)dl2).c(string2, string3);
    }

    @Override
    public final void putBoolean(@NotNull String string2, boolean bl2) {
        Dl dl2 = this.a;
        string2 = this.a(string2);
        dl2 = (Td)dl2;
        ((rf)((Object)((Dl)((rf)((Object)dl2)).b(((Td)dl2).f(string2), bl2)))).b();
    }

    @Override
    public final void putInt(@NotNull String string2, int n10) {
        Td td3 = (Td)this.a;
        ((rf)((Object)((Dl)td3.b(td3.f(string2), n10)))).b();
    }

    @Override
    public final void putLong(@NotNull String string2, long l10) {
        Dl dl2 = this.a;
        string2 = this.a(string2);
        dl2 = (Td)dl2;
        ((rf)((Object)((Dl)((rf)((Object)dl2)).b(((Td)dl2).f(string2), l10)))).b();
    }

    @Override
    public final void putString(@NotNull String string2, @Nullable String string3) {
        Dl dl2 = this.a;
        string2 = this.a(string2);
        dl2 = (Td)dl2;
        ((rf)((Object)((Dl)((rf)((Object)dl2)).b(((Td)dl2).f(string2), string3)))).b();
    }
}

