/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 */
package io.appmetrica.analytics.screenshot.impl;

import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.screenshot.impl.E;
import io.appmetrica.analytics.screenshot.impl.i0;
import org.jetbrains.annotations.NotNull;

public final class F
implements Parcelable {
    @NotNull
    public static final E CREATOR = new E();
    public final boolean a;
    public final long b;

    public F(i0 i04) {
        this(i04.b(), i04.a());
    }

    public F(boolean bl2, long l10) {
        this.a = bl2;
        this.b = l10;
    }

    public final long a() {
        return this.b;
    }

    public final boolean b() {
        return this.a;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ParcelableServiceCaptorConfig(enabled=");
        stringBuilder.append(this.a);
        stringBuilder.append(", delaySeconds=");
        stringBuilder.append(this.b);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n10) {
        parcel.writeByte((byte)(this.a ? 1 : 0));
        parcel.writeLong(this.b);
    }
}

