/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.content.res.Configuration
 *  android.net.Uri
 *  android.text.TextUtils
 */
package io.appmetrica.analytics.impl;

import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.text.TextUtils;
import io.appmetrica.analytics.impl.Pa;
import io.appmetrica.analytics.impl.Q1;
import io.appmetrica.analytics.impl.R1;
import io.appmetrica.analytics.impl.qp;
import io.appmetrica.analytics.impl.rp;
import io.appmetrica.analytics.impl.sp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class S1 {
    public final Pa a = new Pa();
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap c = new LinkedHashMap();

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int a(Intent object) {
        Uri uri = object.getData();
        if (uri == null) return -1;
        if (!y.e(uri.getPath(), "/client")) return -1;
        try {
            String string2 = uri.getQueryParameter("pid");
            y.g(string2);
            return Integer.parseInt(string2);
        }
        catch (Throwable throwable) {
            return -1;
        }
    }

    public static final boolean a(S1 object, Intent intent) {
        object.getClass();
        boolean bl2 = y.e("io.appmetrica.analytics.IAppMetricaService", intent.getAction()) && ((object = (Collection)((S1)object).a.a.get("io.appmetrica.analytics.IAppMetricaService")) == null || object.size() == 0);
        return bl2;
    }

    public static final boolean b(S1 object, Intent intent) {
        boolean bl2;
        block3: {
            block2: {
                object.getClass();
                if (!y.e("io.appmetrica.analytics.IAppMetricaService", intent.getAction()) || (object = (Collection)((S1)object).a.a.get("io.appmetrica.analytics.IAppMetricaService")) == null) break block2;
                int n10 = object.size();
                bl2 = true;
                if (n10 == 1) break block3;
            }
            bl2 = false;
        }
        return bl2;
    }

    public static final boolean c(S1 s13, Intent intent) {
        s13.getClass();
        return y.e("io.appmetrica.analytics.IAppMetricaService", intent.getAction());
    }

    public final void a() {
    }

    public final void a(@NotNull Intent intent, int n10) {
    }

    public final void a(@NotNull Intent intent, int n10, int n13) {
    }

    public final void a(@NotNull Configuration configuration) {
    }

    public final void a(@NotNull R1 r14) {
        this.c.put(r14, new sp(this));
    }

    public final void b() {
    }

    public final void b(@Nullable Intent intent) {
        if (intent != null) {
            Object object = intent.getAction();
            if (!TextUtils.isEmpty((CharSequence)object)) {
                this.a.a(object, S1.a(intent));
            }
            for (Map.Entry entry : this.b.entrySet()) {
                object = (R1)entry.getKey();
                if (!((Q1)entry.getValue()).a(intent)) continue;
                object.a(intent);
            }
        }
    }

    public final void b(@NotNull R1 r14) {
        this.b.put(r14, new qp(this));
    }

    public final void c(@Nullable Intent intent) {
        if (intent != null) {
            String object2 = intent.getAction();
            if (!TextUtils.isEmpty((CharSequence)object2)) {
                this.a.a(object2, S1.a(intent));
            }
            for (Map.Entry entry : this.b.entrySet()) {
                R1 r14 = (R1)entry.getKey();
                if (!((Q1)entry.getValue()).a(intent)) continue;
                r14.a(intent);
            }
        }
    }

    public final void c(@NotNull R1 r14) {
        this.b.put(r14, new rp(this));
    }

    public final void d(@Nullable Intent intent) {
        if (intent != null) {
            Object object;
            String object22 = intent.getAction();
            if (!TextUtils.isEmpty((CharSequence)object22)) {
                Pa pa4 = this.a;
                int n10 = S1.a(intent);
                object = (Collection)pa4.a.get(object22);
                if (object != null && object.remove(n10)) {
                    if (object.isEmpty() && pa4.b) {
                        pa4.a.remove(object22);
                    }
                    new ArrayList(object);
                }
            }
            for (Map.Entry entry : this.c.entrySet()) {
                object = (R1)entry.getKey();
                if (!((Q1)entry.getValue()).a(intent)) continue;
                object.a(intent);
            }
        }
    }
}

