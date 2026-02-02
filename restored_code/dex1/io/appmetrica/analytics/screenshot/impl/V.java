/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.screenshot.impl.K;
import io.appmetrica.analytics.screenshot.impl.L;
import io.appmetrica.analytics.screenshot.impl.M;
import io.appmetrica.analytics.screenshot.impl.N;
import io.appmetrica.analytics.screenshot.impl.T;
import io.appmetrica.analytics.screenshot.impl.X;
import io.appmetrica.analytics.screenshot.impl.Z;
import io.appmetrica.analytics.screenshot.impl.e;
import io.appmetrica.analytics.screenshot.impl.g;
import io.appmetrica.analytics.screenshot.impl.o;
import io.appmetrica.analytics.screenshot.impl.q;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;

public final class V
implements Converter {
    public final g a;
    public final Z b;
    public final q c;

    public V() {
        this(null, null, null, 7, null);
    }

    public V(@NotNull g g11, @NotNull Z z13, @NotNull q q12) {
        this.a = g11;
        this.b = z13;
        this.c = q12;
    }

    public /* synthetic */ V(g g11, Z z13, q q12, int n10, p p14) {
        if ((n10 & 1) != 0) {
            g11 = new g();
        }
        if ((n10 & 2) != 0) {
            z13 = new Z();
        }
        if ((n10 & 4) != 0) {
            q12 = new q();
        }
        this(g11, z13, q12);
    }

    @NotNull
    public final N a(@NotNull T object) {
        N n10 = new N();
        Object object2 = ((T)object).a;
        Object var3_4 = null;
        object2 = object2 != null ? this.a.a((e)object2) : null;
        n10.a = object2;
        object2 = ((T)object).b;
        object2 = object2 != null ? this.b.a((X)object2) : null;
        n10.b = object2;
        object2 = ((T)object).c;
        object = var3_4;
        if (object2 != null) {
            object = this.c.a((o)object2);
        }
        n10.c = object;
        return n10;
    }

    @NotNull
    public final T a(@NotNull N object) {
        Object object2 = ((N)object).a;
        Object var4_3 = null;
        if (object2 != null) {
            this.a.getClass();
            object2 = new e(((K)object2).a);
        } else {
            object2 = null;
        }
        Object object3 = ((N)object).b;
        if (object3 != null) {
            this.b.getClass();
            object3 = new X(((M)object3).a, ((M)object3).b);
        } else {
            object3 = null;
        }
        L l10 = ((N)object).c;
        object = var4_3;
        if (l10 != null) {
            object = this.c.a(l10);
        }
        return new T((e)object2, (X)object3, (o)object);
    }
}

