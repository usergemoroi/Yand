/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.collection.a
 */
package io.appmetrica.analytics.impl;

import androidx.collection.a;
import io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage;
import java.util.Arrays;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class An
implements TempCacheStorage.Entry {
    public final long a;
    public final String b;
    public final long c;
    public final byte[] d;

    public An(long l10, @NotNull String string2, long l11, @NotNull byte[] byArray) {
        this.a = l10;
        this.b = string2;
        this.c = l11;
        this.d = byArray;
    }

    public final boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        Class<?> clazz = object != null ? object.getClass() : null;
        if (!y.e(An.class, clazz)) {
            return false;
        }
        if (object != null) {
            object = (An)object;
            if (this.a != ((An)object).a) {
                return false;
            }
            if (!y.e(this.b, ((An)object).b)) {
                return false;
            }
            if (this.c != ((An)object).c) {
                return false;
            }
            return Arrays.equals(this.d, ((An)object).d);
        }
        throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.impl.db.storage.TempCacheEntry");
    }

    @Override
    @NotNull
    public final byte[] getData() {
        return this.d;
    }

    @Override
    public final long getId() {
        return this.a;
    }

    @Override
    @NotNull
    public final String getScope() {
        return this.b;
    }

    @Override
    public final long getTimestamp() {
        return this.c;
    }

    public final int hashCode() {
        int n10 = androidx.collection.a.a((long)this.a);
        int n13 = this.b.hashCode();
        int n14 = androidx.collection.a.a((long)this.c);
        return Arrays.hashCode(this.d) + (n14 + (n13 + n10 * 31) * 31) * 31;
    }

    @NotNull
    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("TempCacheEntry(id=");
        stringBuilder.append(this.a);
        stringBuilder.append(", scope='");
        stringBuilder.append(this.b);
        stringBuilder.append("', timestamp=");
        stringBuilder.append(this.c);
        stringBuilder.append(", data=array[");
        stringBuilder.append(this.d.length);
        stringBuilder.append("])");
        return stringBuilder.toString();
    }
}

