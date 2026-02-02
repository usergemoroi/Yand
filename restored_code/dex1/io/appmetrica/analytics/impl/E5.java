/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.Ho;
import java.util.Iterator;
import java.util.List;
import kotlin.t;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class E5
implements Ho {
    public final List a;

    public E5(@NotNull List<? extends t<String, ? extends Ho>> list) {
        this.a = list;
    }

    @Override
    @Nullable
    public final String a() {
        Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            String string2 = ((Ho)((t)iterator.next()).d()).a();
            if (string2 == null || string2.length() <= 0) continue;
            return string2;
        }
        return null;
    }

    @Override
    public final void a(@NotNull String string2) {
        Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((Ho)((t)iterator.next()).d()).a(string2);
        }
    }
}

