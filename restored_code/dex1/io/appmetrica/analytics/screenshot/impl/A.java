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
import io.appmetrica.analytics.screenshot.impl.B;
import io.appmetrica.analytics.screenshot.impl.D;

public final class A
implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        boolean bl2 = parcel.readByte() != 0;
        return new B(bl2, (D)parcel.readParcelable(D.class.getClassLoader()));
    }

    public final Object[] newArray(int n10) {
        return new B[n10];
    }
}

