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
import io.appmetrica.analytics.screenshot.impl.C;
import io.appmetrica.analytics.screenshot.impl.F;
import io.appmetrica.analytics.screenshot.impl.e0;
import io.appmetrica.analytics.screenshot.impl.f0;
import io.appmetrica.analytics.screenshot.impl.h0;
import io.appmetrica.analytics.screenshot.impl.i0;
import io.appmetrica.analytics.screenshot.impl.x;
import io.appmetrica.analytics.screenshot.impl.z;
import org.jetbrains.annotations.NotNull;

public final class D
implements Parcelable {
    @NotNull
    public static final C CREATOR = new C();
    public final x a;
    public final F b;
    public final z c;

    public D(h0 object) {
        Object object2 = ((h0)object).a();
        Object var4_3 = null;
        object2 = object2 != null ? new x((e0)object2) : null;
        Object object3 = ((h0)object).c();
        object3 = object3 != null ? new F((i0)object3) : null;
        f0 f04 = ((h0)object).b();
        object = var4_3;
        if (f04 != null) {
            object = new z(f04);
        }
        this((x)object2, (F)object3, (z)object);
    }

    public D(x x10, F f11, z z13) {
        this.a = x10;
        this.b = f11;
        this.c = z13;
    }

    public final x a() {
        return this.a;
    }

    public final z b() {
        return this.c;
    }

    public final F c() {
        return this.b;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ParcelableScreenshotConfig(apiCaptorConfig=");
        stringBuilder.append(this.a);
        stringBuilder.append(", serviceCaptorConfig=");
        stringBuilder.append(this.b);
        stringBuilder.append(", contentObserverCaptorConfig=");
        stringBuilder.append(this.c);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n10) {
        parcel.writeParcelable((Parcelable)this.a, n10);
        parcel.writeParcelable((Parcelable)this.b, n10);
        parcel.writeParcelable((Parcelable)this.c, n10);
    }
}

