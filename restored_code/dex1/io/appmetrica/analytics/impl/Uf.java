/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 *  android.os.ResultReceiver
 */
package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import io.appmetrica.analytics.impl.Vf;
import io.appmetrica.analytics.impl.a7;

public final class Uf
implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        parcel = parcel.readBundle(a7.class.getClassLoader());
        return new Vf((ContentValues)parcel.getParcelable("CFG_KEY_PROCESS_ENVIRONMENT"), (ResultReceiver)parcel.getParcelable("CFG_KEY_PROCESS_ENVIRONMENT_RECEIVER"));
    }

    public final Object[] newArray(int n10) {
        return new Vf[n10];
    }
}

