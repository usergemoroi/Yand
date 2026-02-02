/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.os.Process
 *  android.os.ResultReceiver
 *  android.text.TextUtils
 *  org.json.JSONArray
 */
package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.ResultReceiver;
import android.text.TextUtils;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.impl.Gb;
import io.appmetrica.analytics.impl.Pm;
import io.appmetrica.analytics.impl.Uf;
import io.appmetrica.analytics.impl.ro;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;

public final class Vf
implements Parcelable {
    public static final Parcelable.Creator<Vf> CREATOR;
    public static final String c;
    public final ContentValues a;
    public final ResultReceiver b;

    static {
        c = UUID.randomUUID().toString();
        CREATOR = new Uf();
    }

    public Vf(ContentValues contentValues, ResultReceiver resultReceiver) {
        ContentValues contentValues2 = contentValues;
        if (contentValues == null) {
            contentValues2 = new ContentValues();
        }
        this.a = contentValues2;
        this.b = resultReceiver;
    }

    public Vf(Context context, ResultReceiver resultReceiver) {
        ContentValues contentValues;
        this.a = contentValues = new ContentValues();
        contentValues.put("PROCESS_CFG_PROCESS_ID", Integer.valueOf(Process.myPid()));
        contentValues.put("PROCESS_CFG_PROCESS_SESSION_ID", c);
        contentValues.put("PROCESS_CFG_SDK_API_LEVEL", Integer.valueOf(AppMetrica.getLibraryApiLevel()));
        contentValues.put("PROCESS_CFG_PACKAGE_NAME", context.getPackageName());
        this.b = resultReceiver;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Vf(Vf vf3) {
        synchronized (vf3) {
            ContentValues contentValues;
            this.a = contentValues = new ContentValues(vf3.a);
            this.b = vf3.b;
            return;
        }
    }

    public final HashMap a() {
        return Gb.c(this.a.getAsString("PROCESS_CFG_CLIDS"));
    }

    public final void a(AppMetricaConfig object) {
        object = ((AppMetricaConfig)object).additionalConfig.get("YMM_clids");
        object = object instanceof Map ? (Map)object : null;
        if (object != null) {
            object = Pm.b((Map)object);
            synchronized (this) {
                this.a.put("PROCESS_CFG_CLIDS", Gb.b((Map)object));
            }
        }
    }

    public final ArrayList b() {
        Object object = this.a.getAsString("PROCESS_CFG_CUSTOM_HOSTS");
        object = TextUtils.isEmpty((CharSequence)object) ? null : Gb.b((String)object);
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(AppMetricaConfig object) {
        List<String> list = ((AppMetricaConfig)object).customHosts;
        if (list == null) return;
        synchronized (this) {
            ContentValues contentValues = this.a;
            if (ro.a(list)) {
                object = null;
            } else {
                object = new JSONArray(list);
                object = object.toString();
            }
            contentValues.put("PROCESS_CFG_CUSTOM_HOSTS", (String)object);
            return;
        }
    }

    public final String c() {
        return this.a.getAsString("PROCESS_CFG_DISTRIBUTION_REFERRER");
    }

    public final void c(AppMetricaConfig object) {
        object = (String)((AppMetricaConfig)object).additionalConfig.get("YMM_distributionReferrer");
        if (object != null) {
            synchronized (this) {
                this.a.put("PROCESS_CFG_DISTRIBUTION_REFERRER", (String)object);
                // MONITOREXIT @DISABLED, blocks:[0, 1, 3] lbl6 : MonitorExitStatement: MONITOREXIT : this
                this.i();
            }
        }
    }

    public final String d() {
        return this.a.getAsString("PROCESS_CFG_INSTALL_REFERRER_SOURCE");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void d(AppMetricaConfig appMetricaConfig) {
        if (appMetricaConfig == null) return;
        synchronized (this) {
            this.b(appMetricaConfig);
            this.a(appMetricaConfig);
            this.c(appMetricaConfig);
            return;
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.a.getAsString("PROCESS_CFG_PACKAGE_NAME");
    }

    public final Integer f() {
        return this.a.getAsInteger("PROCESS_CFG_PROCESS_ID");
    }

    public final String g() {
        return this.a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID");
    }

    public final boolean h() {
        return this.a.containsKey("PROCESS_CFG_CUSTOM_HOSTS");
    }

    public final void i() {
        synchronized (this) {
            this.a.put("PROCESS_CFG_INSTALL_REFERRER_SOURCE", "api");
            return;
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ProcessConfiguration{mParamsMapping=");
        stringBuilder.append(this.a);
        stringBuilder.append(", mDataResultReceiver=");
        stringBuilder.append(this.b);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n10) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("CFG_KEY_PROCESS_ENVIRONMENT", (Parcelable)this.a);
        bundle.putParcelable("CFG_KEY_PROCESS_ENVIRONMENT_RECEIVER", (Parcelable)this.b);
        parcel.writeBundle(bundle);
    }
}

