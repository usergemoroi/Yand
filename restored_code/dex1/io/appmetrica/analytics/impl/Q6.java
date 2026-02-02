/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.text.p
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.P6;
import io.appmetrica.analytics.impl.Wf;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class Q6
implements Wf {
    @NotNull
    public static final P6 b = new P6();
    public final Wf a;

    public Q6() {
        this(null, 1, null);
    }

    public Q6(@NotNull Wf wf3) {
        this.a = wf3;
    }

    public /* synthetic */ Q6(Wf wf3, int n10, p p14) {
        if ((n10 & 1) != 0) {
            b.getClass();
            wf3 = P6.a();
        }
        this(wf3);
    }

    @Override
    @Nullable
    public final String a() {
        return this.a.a();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean a(@NotNull String string2) {
        boolean bl2;
        String string3;
        boolean bl3 = false;
        try {
            string3 = this.a.a();
            if (string3 == null) {
                return false;
            }
            bl2 = bl3;
        }
        catch (Throwable throwable) {
            return bl3;
        }
        if (string3.length() <= 0) return bl2;
        StringBuilder stringBuilder = new StringBuilder(":");
        stringBuilder.append(string2);
        boolean bl4 = kotlin.text.p.y((String)string3, (String)stringBuilder.toString(), (boolean)false, (int)2, null);
        bl2 = bl3;
        if (!bl4) return bl2;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean b() {
        boolean bl2;
        String string2;
        boolean bl3 = false;
        try {
            string2 = this.a.a();
            if (string2 == null) {
                return false;
            }
            bl2 = bl3;
        }
        catch (Throwable throwable) {
            return bl3;
        }
        if (string2.length() <= 0) return bl2;
        boolean bl4 = kotlin.text.p.R((CharSequence)string2, (CharSequence)":", (boolean)false, (int)2, null);
        bl2 = bl3;
        if (bl4) return bl2;
        return true;
    }
}

