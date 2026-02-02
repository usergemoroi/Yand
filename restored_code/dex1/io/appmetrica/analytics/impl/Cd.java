/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.Na;
import io.appmetrica.analytics.impl.nh;
import io.appmetrica.analytics.impl.o6;
import io.appmetrica.analytics.impl.td;
import io.appmetrica.analytics.impl.v5;
import io.appmetrica.analytics.impl.vd;
import io.appmetrica.analytics.impl.wd;
import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleServiceEventHandler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.z0;
import kotlin.t;
import kotlin.z;
import org.jetbrains.annotations.NotNull;

public final class Cd
extends nh {
    public final ArrayList b;

    public Cd(@NotNull v5 v54) {
        super(v54);
        Iterator iterator = v54.b().b();
        Object object = iterator;
        if (iterator == null) {
            object = "empty";
        }
        iterator = z0.a;
        String.format("[ModulesEventHandler-%s]", Arrays.copyOf(new Object[]{object}, 1));
        iterator = Na.j().n().a((String)object);
        object = new ArrayList(iterator.size());
        for (Map.Entry entry : ((LinkedHashMap)((Object)iterator)).entrySet()) {
            ((ArrayList)object).add(z.a(entry.getValue(), new td(v54, (String)entry.getKey())));
        }
        this.b = object;
    }

    @Override
    public final boolean a(@NotNull o6 o63) {
        boolean bl2;
        block4: {
            boolean bl3;
            boolean bl4 = this.a.t.c();
            bl2 = bl3 = false;
            if (bl4) {
                Object object = this.b;
                if (object instanceof Collection && ((ArrayList)object).isEmpty()) {
                    bl2 = bl3;
                } else {
                    Object object2;
                    ModuleServiceEventHandler moduleServiceEventHandler;
                    object = ((ArrayList)object).iterator();
                    do {
                        bl2 = bl3;
                        if (!object.hasNext()) break block4;
                        object2 = (t)object.next();
                        moduleServiceEventHandler = (ModuleServiceEventHandler)((t)object2).a();
                        object2 = (td)((t)object2).b();
                    } while (!moduleServiceEventHandler.handle(new wd(((td)object2).b, ((td)object2).a, new vd(((td)object2).d, ((td)object2).c, o63)), o63));
                    bl2 = true;
                }
            }
        }
        return bl2;
    }
}

