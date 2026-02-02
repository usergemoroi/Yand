/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseArray
 */
package io.appmetrica.analytics.impl;

import android.util.SparseArray;
import io.appmetrica.analytics.impl.Co;
import io.appmetrica.analytics.impl.Ek;
import io.appmetrica.analytics.impl.Eo;
import io.appmetrica.analytics.impl.Fk;
import io.appmetrica.analytics.impl.Na;
import io.appmetrica.analytics.impl.id;
import io.appmetrica.analytics.impl.jd;

public final class Dk
extends jd {
    public final Co a;

    public Dk() {
        this(Na.j().B().b());
    }

    public Dk(Co co3) {
        this.a = co3;
    }

    @Override
    public final void a(int n10) {
        Co co3 = this.a;
        synchronized (co3) {
            Eo eo3 = co3.a;
            eo3.a(eo3.a().put("last_migration_api_level", n10));
            return;
        }
    }

    @Override
    public final int b() {
        Co co3 = this.a;
        synchronized (co3) {
            int n10 = co3.a.a().optInt("last_migration_api_level", -1);
            return n10;
        }
    }

    public final SparseArray<id> c() {
        SparseArray sparseArray = new SparseArray(1);
        sparseArray.put(112, (Object)new Ek(this.a));
        sparseArray.put(115, (Object)new Fk());
        return sparseArray;
    }
}

