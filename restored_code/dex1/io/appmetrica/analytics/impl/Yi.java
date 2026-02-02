/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public abstract class Yi {
    @NonNull
    protected final Context a;
    public final String b;
    public final String c;

    public Yi(Context context, String string2, String string3) {
        this.a = context;
        this.b = string2;
        this.c = string3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Nullable
    public final Object a() {
        int n10 = this.a.getResources().getIdentifier(this.b, this.c, this.a.getPackageName());
        if (n10 == 0) return null;
        try {
            return this.a(n10);
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    public abstract Object a(int var1);
}

