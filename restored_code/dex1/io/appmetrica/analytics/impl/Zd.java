/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.collections.s0
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.impl.Yd;
import io.appmetrica.analytics.impl.fe;
import io.appmetrica.analytics.impl.t6;
import io.appmetrica.analytics.impl.u6;
import io.appmetrica.analytics.impl.x6;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashSource;
import java.util.Map;
import kotlin.collections.s0;
import kotlin.t;
import kotlin.z;
import org.jetbrains.annotations.NotNull;

public final class Zd
implements ProtobufConverter {
    @NotNull
    public static final Yd a = new Yd();
    public static final Map b = s0.m((t[])new t[]{z.a(NativeCrashSource.UNKNOWN, 0), z.a(NativeCrashSource.CRASHPAD, 3)});

    @NotNull
    public final fe a(@NotNull u6 u63) {
        throw new UnsupportedOperationException();
    }

    @NotNull
    public final u6 a(@NotNull fe object) {
        u6 u63 = new u6();
        u63.f = 1;
        t6 t64 = new t6();
        t64.a = ((fe)object).a;
        x6 x64 = new x6();
        Object object2 = (Integer)b.get((Object)((fe)object).b.a);
        if (object2 != null) {
            x64.a = ((Number)object2).intValue();
        }
        object = object2 = ((fe)object).b.b;
        if (object2 == null) {
            object = "";
        }
        x64.b = object;
        t64.b = x64;
        u63.g = t64;
        return u63;
    }

    @Override
    public final Object toModel(Object object) {
        object = (u6)object;
        throw new UnsupportedOperationException();
    }
}

