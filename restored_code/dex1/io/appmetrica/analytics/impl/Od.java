/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.impl.A4;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint;
import java.util.Iterator;

public final class Od {
    public static void a() {
        Iterator iterator = A4.l().m.a().iterator();
        while (iterator.hasNext()) {
            ModuleClientEntryPoint moduleClientEntryPoint = ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor((String)iterator.next(), ModuleClientEntryPoint.class);
            if (moduleClientEntryPoint == null) continue;
            A4.l().m().b.add(moduleClientEntryPoint);
        }
    }
}

