/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.collections.t
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.U;
import io.appmetrica.analytics.impl.fb;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.t;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class J6
implements fb {
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    public final void a() {
        this.a.clear();
    }

    @Override
    public final void a(@Nullable Throwable throwable, @NotNull U u11) {
        Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((fb)iterator.next()).a(throwable, u11);
        }
    }

    public final void a(@NotNull List<? extends fb> list) {
        this.a.addAll(list);
    }

    public final void a(fb ... fbArray) {
        t.G((Collection)this.a, (Object[])fbArray);
    }
}

