/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.Q9;
import io.appmetrica.analytics.impl.V9;
import io.appmetrica.analytics.impl.d9;
import io.appmetrica.analytics.impl.o5;
import io.appmetrica.analytics.impl.sn;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;

public final class I5
implements Q9 {
    public final V9 a;
    public final List b;
    public final List c;
    public final AtomicBoolean d;

    public I5(@NotNull V9 v94, @NotNull List<? extends d9> list, @NotNull List<? extends d9> list2, @NotNull o5 o54) {
        this.a = v94;
        this.b = list;
        this.c = list2;
        Objects.toString(o54);
        this.d = new AtomicBoolean(true);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean a() {
        Object object = this.c;
        if (!object.isEmpty() && !object.isEmpty()) {
            object = object.iterator();
            while (object.hasNext()) {
                if (((d9)object.next()).b()) continue;
                return false;
            }
        }
        object = this.b;
        boolean bl2 = object.isEmpty();
        boolean bl3 = true;
        if (!(bl2 ^ true)) return false;
        if (object.isEmpty()) return false;
        object = object.iterator();
        do {
            if (!object.hasNext()) return false;
        } while (!((d9)object.next()).b());
        return bl3;
    }

    public final void b() {
        this.d.set(false);
    }

    public final void c() {
        this.d.set(true);
    }

    public final void d() {
        if (this.d.get()) {
            Object object = this.c;
            if (!object.isEmpty() && !object.isEmpty()) {
                object = object.iterator();
                while (object.hasNext()) {
                    if (((d9)object.next()).b()) continue;
                    break;
                }
            } else {
                ((sn)this.a).c();
            }
        }
    }

    public final void e() {
        if (this.d.get() && this.a()) {
            ((sn)this.a).c();
        }
    }

    public final void f() {
        if (this.d.get() && this.a()) {
            ((sn)this.a).b();
        }
    }
}

