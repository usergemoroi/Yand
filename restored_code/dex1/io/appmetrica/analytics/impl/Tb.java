/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.hb;
import java.util.Set;

public final class Tb
implements hb {
    public final hb a;

    public Tb(hb hb4) {
        this.a = hb4;
    }

    @Override
    public final hb a(int n10, String string2) {
        this.a.a(n10, string2);
        return this;
    }

    @Override
    public final hb a(String string2, float f11) {
        this.a.a(string2, f11);
        return this;
    }

    @Override
    public final hb a(String string2, long l10) {
        this.a.a(string2, l10);
        return this;
    }

    @Override
    public final hb a(String string2, String string3) {
        this.a.a(string2, string3);
        return this;
    }

    @Override
    public final hb a(String string2, boolean bl2) {
        this.a.a(string2, bl2);
        return this;
    }

    @Override
    public final Set a() {
        return this.a.a();
    }

    @Override
    public final boolean a(String string2) {
        return this.a.a(string2);
    }

    @Override
    public final void b() {
        this.a.b();
    }

    @Override
    public final boolean getBoolean(String string2, boolean bl2) {
        return this.a.getBoolean(string2, bl2);
    }

    @Override
    public final int getInt(String string2, int n10) {
        return this.a.getInt(string2, n10);
    }

    @Override
    public final long getLong(String string2, long l10) {
        return this.a.getLong(string2, l10);
    }

    @Override
    public final String getString(String string2, String string3) {
        return this.a.getString(string2, string3);
    }

    @Override
    public final hb remove(String string2) {
        this.a.remove(string2);
        return this;
    }
}

