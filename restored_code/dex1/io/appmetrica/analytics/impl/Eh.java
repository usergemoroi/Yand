/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.Bh;
import io.appmetrica.analytics.impl.Dh;
import io.appmetrica.analytics.impl.Gh;
import io.appmetrica.analytics.impl.J4;
import io.appmetrica.analytics.impl.Na;
import io.appmetrica.analytics.impl.Re;
import io.appmetrica.analytics.impl.Y3;
import io.appmetrica.analytics.impl.b4;
import io.appmetrica.analytics.impl.k6;
import io.appmetrica.analytics.impl.l6;
import io.appmetrica.analytics.impl.om;
import io.appmetrica.analytics.impl.v5;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.util.Map;

public final class Eh
extends l6 {
    public final v5 b;
    public final Dh c;
    public final b4 d;

    public Eh(@NonNull v5 v54, @NonNull Dh dh3) {
        this(v54, dh3, new b4());
    }

    public Eh(v5 v54, Dh dh3, b4 b44) {
        super(v54.getContext(), v54.b().c());
        this.b = v54;
        this.c = dh3;
        this.d = b44;
    }

    @NonNull
    public final Gh a() {
        return new Gh(this.b);
    }

    @NonNull
    public final Gh b(@NonNull k6 object) {
        Gh gh3 = (Gh)super.a((k6)object);
        gh3.m = ((Bh)((BaseRequestConfig.DataSource)object).componentArguments).a;
        gh3.r = this.b.t.a();
        gh3.w = this.b.q.a();
        Map<String, String> map2 = (Bh)((BaseRequestConfig.DataSource)object).componentArguments;
        gh3.d = ((Bh)((Object)map2)).b;
        gh3.e = ((Bh)((Object)map2)).c;
        gh3.f = ((Bh)((Object)map2)).d;
        gh3.i = ((Bh)((Object)map2)).e;
        gh3.g = ((Bh)((Object)map2)).f;
        gh3.h = ((Bh)((Object)map2)).g;
        boolean bl2 = ((Bh)((Object)map2)).h;
        map2 = this.c;
        gh3.j = bl2;
        gh3.k = map2;
        map2 = (Bh)((BaseRequestConfig.DataSource)object).componentArguments;
        gh3.v = ((Bh)((Object)map2)).j;
        object = ((k6)object).a;
        Object object2 = ((om)object).n;
        gh3.n = ((J4)object2).a;
        Object object3 = ((om)object).s;
        if (object3 != null) {
            gh3.s = ((Re)object3).a;
            gh3.t = ((Re)object3).b;
        }
        gh3.o = ((J4)object2).b;
        gh3.q = ((om)object).e;
        gh3.p = ((om)object).k;
        object2 = this.d;
        map2 = ((Bh)((Object)map2)).i;
        object3 = Na.F.e();
        object2.getClass();
        gh3.u = b4.a(map2, (om)object, (Y3)object3);
        gh3.x = this.b.v.e.keySet();
        return gh3;
    }

    @NonNull
    public final BaseRequestConfig createBlankConfig() {
        return new Gh(this.b);
    }
}

