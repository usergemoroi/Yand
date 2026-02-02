/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class Gk
implements ModuleRemoteConfig {
    public final SdkIdentifiers a;
    public final RemoteConfigMetaInfo b;
    public final Object c;

    public Gk(@NotNull SdkIdentifiers sdkIdentifiers, @NotNull RemoteConfigMetaInfo remoteConfigMetaInfo, Object object) {
        this.a = sdkIdentifiers;
        this.b = remoteConfigMetaInfo;
        this.c = object;
    }

    public static Gk a(Gk gk3, SdkIdentifiers sdkIdentifiers, RemoteConfigMetaInfo remoteConfigMetaInfo, Object object, int n10, Object object2) {
        if ((n10 & 1) != 0) {
            sdkIdentifiers = gk3.a;
        }
        if ((n10 & 2) != 0) {
            remoteConfigMetaInfo = gk3.b;
        }
        if ((n10 & 4) != 0) {
            object = gk3.c;
        }
        gk3.getClass();
        return new Gk(sdkIdentifiers, remoteConfigMetaInfo, object);
    }

    @NotNull
    public final SdkIdentifiers a() {
        return this.a;
    }

    @NotNull
    public final Gk a(@NotNull SdkIdentifiers sdkIdentifiers, @NotNull RemoteConfigMetaInfo remoteConfigMetaInfo, Object object) {
        return new Gk(sdkIdentifiers, remoteConfigMetaInfo, object);
    }

    @NotNull
    public final RemoteConfigMetaInfo b() {
        return this.b;
    }

    public final Object c() {
        return this.c;
    }

    public final boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof Gk)) {
            return false;
        }
        object = (Gk)object;
        if (!y.e(this.a, ((Gk)object).a)) {
            return false;
        }
        if (!y.e(this.b, ((Gk)object).b)) {
            return false;
        }
        return y.e(this.c, ((Gk)object).c);
    }

    public final Object getFeaturesConfig() {
        return this.c;
    }

    @Override
    @NotNull
    public final SdkIdentifiers getIdentifiers() {
        return this.a;
    }

    @Override
    @NotNull
    public final RemoteConfigMetaInfo getRemoteConfigMetaInfo() {
        return this.b;
    }

    public final int hashCode() {
        int n10 = this.a.hashCode();
        int n13 = this.b.hashCode();
        Object object = this.c;
        int n14 = object == null ? 0 : object.hashCode();
        return (n13 + n10 * 31) * 31 + n14;
    }

    @NotNull
    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ServiceModuleRemoteConfigModel(identifiers=");
        stringBuilder.append(this.a);
        stringBuilder.append(", remoteConfigMetaInfo=");
        stringBuilder.append(this.b);
        stringBuilder.append(", featuresConfig=");
        stringBuilder.append(this.c);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

