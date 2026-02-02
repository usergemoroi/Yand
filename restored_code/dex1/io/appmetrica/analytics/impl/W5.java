/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.collections.b1
 *  kotlin.collections.t
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.Bb;
import io.appmetrica.analytics.impl.d9;
import io.appmetrica.analytics.impl.k7;
import io.appmetrica.analytics.impl.q9;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.collections.b1;
import kotlin.collections.t;
import org.jetbrains.annotations.NotNull;

public final class W5
implements d9,
q9 {
    public final k7 a;
    public final Set b;
    public final AtomicLong c;

    public W5(@NotNull k7 k74) {
        Set set;
        this.a = k74;
        this.b = set = b1.j((Object[])new Integer[]{Bb.h.a(), Bb.F.a(), Bb.A.a(), Bb.d.a(), Bb.l.a(), Bb.m.a(), Bb.o.a(), Bb.k.a()});
        this.c = new AtomicLong(k74.a(set));
        k74.a(this);
    }

    @Override
    public final void a() {
        long l10 = this.a.a(this.b);
        this.c.set(l10);
    }

    public final void a(@NotNull List<Integer> object) {
        boolean bl2 = object instanceof Collection;
        int n10 = 0;
        int n13 = 0;
        if (!bl2 || !object.isEmpty()) {
            object = object.iterator();
            while (true) {
                n10 = n13;
                if (!object.hasNext()) break;
                n10 = ((Number)object.next()).intValue();
                if (!this.b.contains(n10)) continue;
                n13 = n10 = n13 + 1;
                if (n10 >= 0) continue;
                t.v();
                n13 = n10;
            }
        }
        this.c.addAndGet(n10);
    }

    public final void b(@NotNull List<Integer> object) {
        boolean bl2 = object instanceof Collection;
        int n10 = 0;
        int n13 = 0;
        if (!bl2 || !object.isEmpty()) {
            object = object.iterator();
            while (true) {
                n10 = n13;
                if (!object.hasNext()) break;
                n10 = ((Number)object.next()).intValue();
                if (!this.b.contains(n10)) continue;
                n13 = n10 = n13 + 1;
                if (n10 >= 0) continue;
                t.v();
                n13 = n10;
            }
        }
        this.c.addAndGet(-((long)n10));
    }

    @Override
    public final boolean b() {
        boolean bl2 = this.c.get() > 0L;
        return bl2;
    }
}

