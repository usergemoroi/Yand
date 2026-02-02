/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  org.json.JSONObject
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import io.appmetrica.analytics.impl.Aa;
import io.appmetrica.analytics.impl.jb;
import org.json.JSONObject;

public final class P1 {
    public final Aa a;
    public boolean b = false;

    public P1() {
        this(new Aa());
    }

    public P1(Aa aa4) {
        this.a = aa4;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final long a(Context object) {
        synchronized (this) {
            try {
                this.a.getClass();
                String string2 = jb.a(FileUtils.getFileFromAppStorage(object, "metrica_service_settings.dat"));
                if (TextUtils.isEmpty((CharSequence)string2)) return 0L;
                JSONObject jSONObject = new JSONObject(string2);
                return jSONObject.optLong("delay");
            }
            catch (Throwable throwable) {
                return 0L;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void b(Context context) {
        // MONITORENTER : this
        // MONITOREXIT : this
        if (this.b) return;
        long l10 = this.a(context);
        if (l10 > 0L) {
            try {
                Thread.sleep(l10);
            }
            catch (Throwable throwable) {}
        }
        this.b = true;
    }
}

