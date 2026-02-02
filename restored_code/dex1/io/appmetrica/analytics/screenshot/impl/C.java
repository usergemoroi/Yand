/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package io.appmetrica.analytics.screenshot.impl;

import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.screenshot.impl.D;
import io.appmetrica.analytics.screenshot.impl.F;
import io.appmetrica.analytics.screenshot.impl.x;
import io.appmetrica.analytics.screenshot.impl.z;

public final class C
implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        return new D((x)parcel.readParcelable(x.class.getClassLoader()), (F)parcel.readParcelable(F.class.getClassLoader()), (z)parcel.readParcelable(z.class.getClassLoader()));
    }

    public final Object[] newArray(int n10) {
        return new D[n10];
    }
}

