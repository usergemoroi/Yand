/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.Ig;
import io.appmetrica.analytics.impl.Kg;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

public final class Jg {
    public final String a;
    public final long b;
    public final long c;
    public final Ig d;

    public Jg(String string2, long l10, long l11, Ig ig3) {
        this.a = string2;
        this.b = l10;
        this.c = l11;
        this.d = ig3;
    }

    public Jg(byte[] object) {
        object = Kg.a(object);
        this.a = object.a;
        this.b = object.c;
        this.c = object.b;
        this.d = Jg.a(object.d);
    }

    public static Ig a(int n10) {
        if (n10 != 1) {
            if (n10 != 2) {
                return Ig.b;
            }
            return Ig.d;
        }
        return Ig.c;
    }

    public final byte[] a() {
        Kg kg2 = new Kg();
        kg2.a = this.a;
        kg2.c = this.b;
        kg2.b = this.c;
        int n10 = this.d.ordinal();
        int n13 = 1;
        if (n10 != 1) {
            n13 = 2;
            if (n10 != 2) {
                n13 = 0;
            }
        }
        kg2.d = n13;
        return MessageNano.toByteArray(kg2);
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return true;
        }
        if (object != null && Jg.class == object.getClass()) {
            object = (Jg)object;
            if (this.b != ((Jg)object).b) {
                return false;
            }
            if (this.c != ((Jg)object).c) {
                return false;
            }
            if (!this.a.equals(((Jg)object).a)) {
                return false;
            }
            if (this.d != ((Jg)object).d) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        int n10 = this.a.hashCode();
        long l10 = this.b;
        int n13 = (int)(l10 ^ l10 >>> 32);
        l10 = this.c;
        int n14 = (int)(l10 ^ l10 >>> 32);
        return ((Object)((Object)this.d)).hashCode() + ((n10 * 31 + n13) * 31 + n14) * 31;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ReferrerInfo{installReferrer='");
        stringBuilder.append(this.a);
        stringBuilder.append("', referrerClickTimestampSeconds=");
        stringBuilder.append(this.b);
        stringBuilder.append(", installBeginTimestampSeconds=");
        stringBuilder.append(this.c);
        stringBuilder.append(", source=");
        stringBuilder.append((Object)this.d);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

