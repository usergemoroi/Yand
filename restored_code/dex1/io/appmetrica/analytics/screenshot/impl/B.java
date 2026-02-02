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
import io.appmetrica.analytics.screenshot.impl.A;
import io.appmetrica.analytics.screenshot.impl.D;
import io.appmetrica.analytics.screenshot.impl.g0;
import io.appmetrica.analytics.screenshot.impl.h0;
import org.jetbrains.annotations.NotNull;

public final class B
implements Parcelable {
    @NotNull
    public static final A CREATOR = new A();
    public final boolean a;
    public final D b;

    public B(g0 object) {
        boolean bl2 = ((g0)object).b();
        object = (object = ((g0)object).a()) != null ? new D((h0)object) : null;
        this(bl2, (D)object);
    }

    public B(boolean bl2, D d14) {
        this.a = bl2;
        this.b = d14;
    }

    public final D a() {
        return this.b;
    }

    public final boolean b() {
        return this.a;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ParcelableRemoteScreenshotConfig(enabled=");
        stringBuilder.append(this.a);
        stringBuilder.append(", config=");
        stringBuilder.append(this.b);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n10) {
        parcel.writeByte((byte)(this.a ? 1 : 0));
        parcel.writeParcelable((Parcelable)this.b, n10);
    }
}

