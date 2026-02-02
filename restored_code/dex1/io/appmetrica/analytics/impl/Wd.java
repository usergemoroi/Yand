/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.impl.E0;
import io.appmetrica.analytics.impl.F0;
import io.appmetrica.analytics.impl.Vf;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashClientModule;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashClientModuleDummy;

public final class Wd {
    public final Vf a;
    public final NativeCrashClientModule b;
    public final F0 c;
    public E0 d;

    public Wd(Vf object) {
        this.a = object;
        NativeCrashClientModule nativeCrashClientModule = ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor("io.appmetrica.analytics.ndkcrashes.NativeCrashClientModuleImpl", NativeCrashClientModule.class);
        object = nativeCrashClientModule;
        if (nativeCrashClientModule == null) {
            object = new NativeCrashClientModuleDummy();
        }
        this.b = object;
        this.c = new F0();
    }
}

