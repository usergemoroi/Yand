/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Process
 */
package io.appmetrica.analytics.impl;

import android.os.Process;
import io.appmetrica.analytics.impl.Jb;
import io.appmetrica.analytics.impl.jl;
import org.jetbrains.annotations.NotNull;

public final class Mb
implements jl {
    public final boolean a(@NotNull Jb object) {
        object = ((Jb)object).f;
        int n10 = Process.myPid();
        boolean bl2 = object == null || (Integer)object != n10;
        return bl2;
    }
}

