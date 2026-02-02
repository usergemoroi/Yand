/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.Ml;
import io.appmetrica.analytics.impl.Mn;
import io.appmetrica.analytics.impl.U;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class Wn {
    public final Mn a;
    public final U b;
    public final List c;
    public final String d;
    public final String e;
    public final Map f;
    public final String g;
    public final Boolean h;

    public Wn(Mn mn3, U u11, ArrayList arrayList, String string2, String string3, Map map2, String string4, Boolean bl2) {
        this.a = mn3;
        this.b = u11;
        this.c = arrayList;
        this.d = string2;
        this.e = string3;
        this.f = map2;
        this.g = string4;
        this.h = bl2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Object object = this.a;
        if (object != null) {
            for (Ml ml2 : ((Mn)object).c) {
                StringBuilder stringBuilder2 = new StringBuilder("at ");
                stringBuilder2.append(ml2.a);
                stringBuilder2.append(".");
                stringBuilder2.append(ml2.e);
                stringBuilder2.append("(");
                stringBuilder2.append(ml2.b);
                stringBuilder2.append(":");
                stringBuilder2.append(ml2.c);
                stringBuilder2.append(":");
                stringBuilder2.append(ml2.d);
                stringBuilder2.append(")\n");
                stringBuilder.append(stringBuilder2.toString());
            }
        }
        object = new StringBuilder("UnhandledException{exception=");
        ((StringBuilder)object).append(this.a);
        ((StringBuilder)object).append("\n");
        ((StringBuilder)object).append(stringBuilder.toString());
        ((StringBuilder)object).append('}');
        return ((StringBuilder)object).toString();
    }
}

