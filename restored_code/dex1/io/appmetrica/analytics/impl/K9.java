/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import io.appmetrica.analytics.impl.Bb;
import io.appmetrica.analytics.impl.Do;
import io.appmetrica.analytics.impl.E7;
import io.appmetrica.analytics.impl.Gh;
import io.appmetrica.analytics.impl.H7;
import io.appmetrica.analytics.impl.Tk;
import io.appmetrica.analytics.impl.W9;
import io.appmetrica.analytics.impl.X8;
import io.appmetrica.analytics.impl.bl;
import io.appmetrica.analytics.impl.dl;
import io.appmetrica.analytics.impl.e9;
import io.appmetrica.analytics.impl.f9;
import io.appmetrica.analytics.impl.fl;
import io.appmetrica.analytics.impl.h0;
import io.appmetrica.analytics.impl.i0;
import io.appmetrica.analytics.impl.k7;
import io.appmetrica.analytics.impl.o6;
import io.appmetrica.analytics.impl.qf;
import io.appmetrica.analytics.impl.r9;
import io.appmetrica.analytics.impl.x5;
import java.util.HashMap;

public final class K9 {
    public final qf a;
    public final Do b;
    public final bl c;
    public final k7 d;
    public final f9 e;
    public final Tk f;
    public final i0 g;
    public final r9 h;
    public final x5 i;
    public final TimeProvider j;
    public final int k;
    public long l;
    public int m;

    public K9(qf qf3, Do do_, bl bl2, k7 k74, i0 i04, f9 f94, Tk tk3, int n10, x5 x54, r9 r92, SystemTimeProvider systemTimeProvider) {
        this.a = qf3;
        this.b = do_;
        this.c = bl2;
        this.d = k74;
        this.g = i04;
        this.e = f94;
        this.f = tk3;
        this.k = n10;
        this.h = r92;
        this.j = systemTimeProvider;
        this.i = x54;
        this.l = qf3.i();
        this.m = qf3.h();
    }

    public final void a(o6 object, dl dl2) {
        Object object2 = ((o6)object).p;
        Object object3 = this.f;
        object3.getClass();
        object2.putAll(new HashMap(((Tk)object3).b));
        ((o6)object).c(this.a.j());
        ((o6)object).o = this.b.b();
        object2 = this.g.a();
        Object object4 = this.e;
        object4.getClass();
        object3 = Bb.a(((o6)object).d);
        object4 = (e9)((f9)object4).b.a(object3);
        object3 = this.d;
        object4 = object4.a((o6)object);
        int n10 = ((o6)object).d;
        object = this.h;
        H7 h74 = new H7(((k7)object3).g, dl2, n10, (r9)object, (X8)object4, (Gh)((k7)object3).h.k.a(), (h0)object2);
        long l10 = dl2.a;
        fl fl3 = dl2.d;
        long l11 = dl2.b;
        object4 = Bb.a(h74.h.d);
        boolean bl2 = W9.g.contains((Object)Bb.a(n10));
        long l13 = 0L;
        if (bl2 ^ true) {
            object2 = ((r9)object).b;
            synchronized (object2) {
                l13 = ((Do)object2).a.a().optLong("global_number", 0L);
                // MONITOREXIT @DISABLED, blocks:[0, 1, 3] lbl30 : MonitorExitStatement: MONITOREXIT : var12_4
                ((r9)object).b.b(1L + l13);
            }
        }
        object = new E7(l10, fl3, l11, (Bb)((Object)object4), l13, dl2.c, h74.a());
        ((k7)object3).a(((k7)object3).l.a((E7)object));
        this.i.a.h();
    }
}

