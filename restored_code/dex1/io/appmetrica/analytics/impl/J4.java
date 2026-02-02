/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.H4;

public final class J4 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final Boolean f;

    public J4(H4 h43) {
        this.a = H4.a(h43);
        this.b = H4.b(h43);
        this.c = H4.c(h43);
        this.d = H4.d(h43);
        this.e = H4.e(h43);
        this.f = H4.f(h43);
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return true;
        }
        if (object != null && J4.class == object.getClass()) {
            Object object2 = (J4)object;
            if (this.a != ((J4)object2).a) {
                return false;
            }
            if (this.b != ((J4)object2).b) {
                return false;
            }
            if (this.c != ((J4)object2).c) {
                return false;
            }
            if (this.d != ((J4)object2).d) {
                return false;
            }
            if (this.e != ((J4)object2).e) {
                return false;
            }
            object = this.f;
            object2 = ((J4)object2).f;
            if (object != null) {
                bl2 = ((Boolean)object).equals(object2);
            } else if (object2 != null) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        int n10 = this.a;
        int n13 = this.b;
        int n14 = this.c;
        int n15 = this.d;
        int n16 = this.e;
        Boolean bl2 = this.f;
        int n17 = bl2 != null ? bl2.hashCode() : 0;
        return ((((n10 * 31 + n13) * 31 + n14) * 31 + n15) * 31 + n16) * 31 + n17;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("CollectingFlags{permissionsCollectingEnabled=");
        stringBuilder.append(this.a);
        stringBuilder.append(", featuresCollectingEnabled=");
        stringBuilder.append(this.b);
        stringBuilder.append(", googleAid=");
        stringBuilder.append(this.c);
        stringBuilder.append(", simInfo=");
        stringBuilder.append(this.d);
        stringBuilder.append(", huaweiOaid=");
        stringBuilder.append(this.e);
        stringBuilder.append(", sslPinning=");
        stringBuilder.append(this.f);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

