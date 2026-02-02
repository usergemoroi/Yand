/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.collection.a
 */
package io.appmetrica.analytics.impl;

import androidx.collection.a;
import io.appmetrica.analytics.impl.E0;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashSource;
import kotlin.jvm.internal.y;

public final class D0 {
    public final NativeCrashSource a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;
    public final E0 f;

    public D0(NativeCrashSource nativeCrashSource, String string2, String string3, String string4, long l10, E0 e03) {
        this.a = nativeCrashSource;
        this.b = string2;
        this.c = string3;
        this.d = string4;
        this.e = l10;
        this.f = e03;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof D0)) {
            return false;
        }
        object = (D0)object;
        if (this.a != ((D0)object).a) {
            return false;
        }
        if (!y.e(this.b, ((D0)object).b)) {
            return false;
        }
        if (!y.e(this.c, ((D0)object).c)) {
            return false;
        }
        if (!y.e(this.d, ((D0)object).d)) {
            return false;
        }
        if (this.e != ((D0)object).e) {
            return false;
        }
        return y.e(this.f, ((D0)object).f);
    }

    public final int hashCode() {
        int n10 = ((Object)((Object)this.a)).hashCode();
        int n13 = this.b.hashCode();
        int n14 = this.c.hashCode();
        int n15 = this.d.hashCode();
        int n16 = androidx.collection.a.a((long)this.e);
        return this.f.hashCode() + (n16 + (n15 + (n14 + (n13 + n10 * 31) * 31) * 31) * 31) * 31;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("AppMetricaNativeCrash(source=");
        stringBuilder.append((Object)this.a);
        stringBuilder.append(", handlerVersion=");
        stringBuilder.append(this.b);
        stringBuilder.append(", uuid=");
        stringBuilder.append(this.c);
        stringBuilder.append(", dumpFile=");
        stringBuilder.append(this.d);
        stringBuilder.append(", creationTime=");
        stringBuilder.append(this.e);
        stringBuilder.append(", metadata=");
        stringBuilder.append(this.f);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

