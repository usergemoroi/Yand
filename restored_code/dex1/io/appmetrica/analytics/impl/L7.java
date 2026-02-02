/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.services.FrameworkDetector;
import io.appmetrica.analytics.impl.Fb;

public final class L7 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;

    public L7() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
    }

    public L7(Fb object) {
        this.a = object.b("dId");
        this.b = object.b("uId");
        this.c = object.b("analyticsSdkVersionName");
        this.d = object.b("kitBuildNumber");
        this.e = object.b("kitBuildType");
        this.f = object.b("appVer");
        this.g = object.optString("app_debuggable", "0");
        this.h = object.b("appBuild");
        this.i = object.b("osVer");
        this.k = object.b("lang");
        this.l = object.b("root");
        this.m = object.optString("app_framework", FrameworkDetector.framework());
        int n10 = object.optInt("osApiLev", -1);
        Object var4_3 = null;
        String string2 = n10 == -1 ? null : String.valueOf(n10);
        this.j = string2;
        n10 = object.optInt("attribution_id", 0);
        object = var4_3;
        if (n10 > 0) {
            object = String.valueOf(n10);
        }
        this.n = object;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("DbNetworkTaskConfig{deviceId='");
        stringBuilder.append(this.a);
        stringBuilder.append("', uuid='");
        stringBuilder.append(this.b);
        stringBuilder.append("', analyticsSdkVersionName='");
        stringBuilder.append(this.c);
        stringBuilder.append("', kitBuildNumber='");
        stringBuilder.append(this.d);
        stringBuilder.append("', kitBuildType='");
        stringBuilder.append(this.e);
        stringBuilder.append("', appVersion='");
        stringBuilder.append(this.f);
        stringBuilder.append("', appDebuggable='");
        stringBuilder.append(this.g);
        stringBuilder.append("', appBuildNumber='");
        stringBuilder.append(this.h);
        stringBuilder.append("', osVersion='");
        stringBuilder.append(this.i);
        stringBuilder.append("', osApiLevel='");
        stringBuilder.append(this.j);
        stringBuilder.append("', locale='");
        stringBuilder.append(this.k);
        stringBuilder.append("', deviceRootStatus='");
        stringBuilder.append(this.l);
        stringBuilder.append("', appFramework='");
        stringBuilder.append(this.m);
        stringBuilder.append("', attributionId='");
        stringBuilder.append(this.n);
        stringBuilder.append("'}");
        return stringBuilder.toString();
    }
}

