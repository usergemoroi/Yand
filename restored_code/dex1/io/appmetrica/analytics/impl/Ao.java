/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  androidx.annotation.NonNull
 *  org.json.JSONObject
 */
package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.Gh;
import io.appmetrica.analytics.impl.a9;
import io.appmetrica.analytics.impl.l9;
import io.appmetrica.analytics.impl.v5;
import io.appmetrica.analytics.impl.zo;
import org.json.JSONObject;

public final class Ao
implements zo {
    public final a9 a;

    public Ao() {
        this(new a9());
    }

    public Ao(a9 a92) {
        this.a = a92;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    @NonNull
    public final byte[] a(@NonNull l9 l94, @NonNull Gh gh3) {
        if (((v5)gh3.l).B()) return this.a.a(l94, gh3);
        if (TextUtils.isEmpty((CharSequence)l94.b)) return this.a.a(l94, gh3);
        try {
            JSONObject jSONObject = new JSONObject(l94.b);
            jSONObject.remove("preloadInfo");
            l94.b = jSONObject.toString();
        }
        finally {
            return this.a.a(l94, gh3);
        }
    }
}

