/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentsInitializer;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.impl.Dk;
import io.appmetrica.analytics.impl.Na;
import io.appmetrica.analytics.impl.Od;
import io.appmetrica.analytics.impl.sk;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint;
import java.util.Iterator;

public final class Ea {
    public static final Ea d = new Ea();
    public final Od a = new Od();
    public final ServiceComponentsInitializer b = sk.a();
    public boolean c = false;

    public final void a(Context context) {
        Na.a(context);
        this.b.onCreate(context);
        this.a.getClass();
        Iterator iterator = Na.F.s.a().iterator();
        while (iterator.hasNext()) {
            ModuleServiceEntryPoint moduleServiceEntryPoint = ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor((String)iterator.next(), ModuleServiceEntryPoint.class);
            if (moduleServiceEntryPoint == null) continue;
            Na.F.o().a(moduleServiceEntryPoint);
        }
        new Dk(Na.j().B().b()).a(context);
        Na.F.p().a();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(Context context) {
        if (this.c) return;
        synchronized (this) {
            try {
                if (this.c) return;
                this.a(context);
                this.c = true;
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

