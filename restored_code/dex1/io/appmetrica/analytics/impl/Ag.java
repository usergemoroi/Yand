/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  kotlin.jvm.functions.a
 *  kotlin.n
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.impl.Hg;
import io.appmetrica.analytics.impl.Jg;
import io.appmetrica.analytics.impl.Rg;
import io.appmetrica.analytics.impl.Sg;
import io.appmetrica.analytics.impl.Za;
import io.appmetrica.analytics.impl.sg;
import io.appmetrica.analytics.impl.vg;
import io.appmetrica.analytics.impl.xg;
import io.appmetrica.analytics.impl.zg;
import java.util.ArrayList;
import kotlin.jvm.functions.a;
import kotlin.jvm.internal.y;
import kotlin.m;
import kotlin.n;

public final class Ag {
    public final Hg a;
    public final Za b;
    public final Sg c;
    public final m d;
    public final m e;
    public final m f;
    public final ArrayList g;

    public Ag(Hg hg3, Rg rg3, Za za4, Sg sg2) {
        this.a = hg3;
        this.b = za4;
        this.c = sg2;
        this.d = n.b((a)new xg(this));
        this.e = n.b((a)new vg(this));
        this.f = n.b((a)new zg(this));
        this.g = new ArrayList();
    }

    public static final sg a(Ag ag2) {
        return (sg)ag2.d.getValue();
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final void a(Ag ag2, Jg jg3, sg sg2) {
        block2: {
            boolean bl2;
            block4: {
                String string2;
                Sg sg3;
                block3: {
                    block1: {
                        ag2.g.add(jg3);
                        sg3 = ag2.c;
                        if (jg3 != null) break block1;
                        sg3.getClass();
                        break block2;
                    }
                    SafePackageManager safePackageManager = sg3.b;
                    Context context = sg3.a;
                    string2 = safePackageManager.getInstallerPackageName(context, context.getPackageName());
                    int n10 = jg3.d.ordinal();
                    if (n10 == 1) break block3;
                    if (n10 != 2) break block2;
                    bl2 = y.e(sg3.g, string2);
                    break block4;
                }
                bl2 = y.e(sg3.f, string2);
            }
            if (bl2) {
                ag2.a(jg3);
                return;
            }
        }
        sg2.a();
    }

    public final void a(Jg jg3) {
        Hg hg3 = this.a;
        synchronized (hg3) {
            hg3.b = jg3;
            hg3.c = true;
            hg3.d.a(jg3);
            hg3.d.d();
            hg3.a(hg3.b);
            return;
        }
    }
}

