/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.Dl;
import io.appmetrica.analytics.impl.hb;
import io.appmetrica.analytics.impl.rf;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class Td
extends rf
implements Dl {
    public Td(@NotNull hb hb4) {
        this(hb4, null);
    }

    public Td(@NotNull hb hb4, @Nullable String string2) {
        super(hb4, string2);
    }

    public final int c(@NotNull String string2, int n10) {
        string2 = this.f(string2);
        return this.a.getInt(string2, n10);
    }

    public final long c(@NotNull String string2, long l10) {
        string2 = this.f(string2);
        return this.a.getLong(string2, l10);
    }

    @Nullable
    public final String c(@NotNull String string2, @Nullable String string3) {
        string2 = this.f(string2);
        return this.a.getString(string2, string3);
    }

    public final boolean c(@NotNull String string2, boolean bl2) {
        string2 = this.f(string2);
        return this.a.getBoolean(string2, bl2);
    }

    @NotNull
    public final Dl d(@NotNull String string2, int n10) {
        return (Dl)this.b(this.f(string2), n10);
    }

    @NotNull
    public final Dl d(@NotNull String string2, long l10) {
        return (Dl)this.b(this.f(string2), l10);
    }

    @NotNull
    public final Dl d(@NotNull String string2, @Nullable String string3) {
        return (Dl)this.b(this.f(string2), string3);
    }

    @NotNull
    public final Dl d(@NotNull String string2, boolean bl2) {
        return (Dl)this.b(this.f(string2), bl2);
    }

    public final boolean e(@NotNull String string2) {
        string2 = this.f(string2);
        return this.a.a(string2);
    }

    @NotNull
    public abstract String f(@NotNull String var1);

    @NotNull
    public Dl g(@NotNull String string2) {
        return (Dl)this.d(this.f(string2));
    }
}

