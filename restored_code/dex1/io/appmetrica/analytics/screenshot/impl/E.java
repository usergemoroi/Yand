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
import io.appmetrica.analytics.screenshot.impl.F;

public final class E
implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        boolean bl2 = parcel.readByte() != 0;
        return new F(bl2, parcel.readLong());
    }

    public final Object[] newArray(int n10) {
        return new F[n10];
    }
}

