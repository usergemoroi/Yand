/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  android.text.TextUtils
 *  org.json.JSONObject
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.parsing.ParseUtils;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.impl.Bj;
import io.appmetrica.analytics.impl.Kf;
import io.appmetrica.analytics.impl.q8;
import io.appmetrica.analytics.impl.qj;
import io.appmetrica.analytics.impl.ro;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

public final class Df
implements qj {
    public final Context a;
    public final String b;
    public final String c;
    public final String d;

    public Df(@NotNull Context object) {
        this.a = object;
        object = new StringBuilder("content://");
        ((StringBuilder)object).append(this.a());
        ((StringBuilder)object).append("/preload_info");
        this.b = ((StringBuilder)object).toString();
        this.c = "tracking_id";
        this.d = "additional_parameters";
    }

    @NotNull
    public final String a() {
        return "com.yandex.preinstallsatellite.appmetrica.provider";
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Nullable
    public final Kf b() {
        block12: {
            if (!PackageManagerUtils.hasContentProvider(this.a, "com.yandex.preinstallsatellite.appmetrica.provider")) {
                Bj.a("Satellite content provider with preload info was not found.", new Object[0]);
                return null;
            }
            var2_1 = this.a.getContentResolver().query(Uri.parse((String)this.b), null, null, null, null);
            if (var2_1 == null) ** GOTO lbl38
            ** try [egrp 1[TRYBLOCK] [1 : 49->92)] { 
lbl-1000:
            // 1 sources

            {
                catch (Throwable var1_6) {
                    var1_3 = var2_1;
                    break block12;
                }
            }
lbl11:
            // 1 sources

            ** GOTO lbl15
            {
                catch (Throwable var1_5) {
                    var1_3 = null;
                }
                break block12;
lbl15:
                // 1 sources

                if (!var2_1.moveToFirst()) ** GOTO lbl-1000
                var3_2 = var2_1.getString(var2_1.getColumnIndexOrThrow(this.c));
                var1_3 = var2_1.getString(var2_1.getColumnIndexOrThrow(this.d));
                if (var1_3 == null) ** GOTO lbl-1000
                try {
                    if (var1_3.length() != 0) {
                        var1_3 = new JSONObject((String)var1_3);
                    } else lbl-1000:
                    // 2 sources

                    {
                        var1_3 = new JSONObject();
                    }
                    ** GOTO lbl27
                }
                catch (Throwable var1_4) {}
                {
                    var1_3 = new JSONObject();
lbl27:
                    // 3 sources

                    if (!TextUtils.isEmpty((CharSequence)var3_2) && ParseUtils.parseLong(var3_2) == null) {
                        Bj.a("Tracking id from Satellite is not a number.", new Object[0]);
                        var1_3 = var2_1;
                        break block12;
                    }
                    Bj.a("Preload info from Satellite: {tracking id = %s, additional parameters = %s}", new Object[]{var3_2, var1_3});
                    var1_3 = new Kf(var3_2, (JSONObject)var1_3, TextUtils.isEmpty((CharSequence)var3_2) ^ true, false, q8.d);
                }
            }
            ro.a(var2_1);
            return var1_3;
lbl-1000:
            // 1 sources

            {
                Bj.a("No Preload Info data in Satellite content provider", new Object[0]);
                var1_3 = var2_1;
                break block12;
lbl38:
                // 1 sources

                Bj.a("No Satellite content provider found", new Object[0]);
                var1_3 = var2_1;
            }
        }
        ro.a(var1_3);
        return null;
    }
}

