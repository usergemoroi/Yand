/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 */
package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.impl.Bb;
import io.appmetrica.analytics.impl.C7;
import io.appmetrica.analytics.impl.D7;
import io.appmetrica.analytics.impl.E7;
import io.appmetrica.analytics.impl.fl;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;

public final class F7
implements Converter {
    public final C7 a;

    public F7() {
        this(null, 1, null);
    }

    public F7(@NotNull C7 c74) {
        this.a = c74;
    }

    public /* synthetic */ F7(C7 c74, int n10, p p14) {
        if ((n10 & 1) != 0) {
            c74 = new C7(null, 1, null);
        }
        this(c74);
    }

    @NotNull
    public final ContentValues a(@NotNull E7 object) {
        ContentValues contentValues = new ContentValues();
        Object object2 = ((E7)object).a;
        if (object2 != null) {
            contentValues.put("session_id", Long.valueOf(((Number)object2).longValue()));
        }
        if ((object2 = ((E7)object).b) != null) {
            contentValues.put("session_type", Integer.valueOf(((fl)((Object)object2)).a));
        }
        if ((object2 = ((E7)object).c) != null) {
            contentValues.put("number_in_session", Long.valueOf(((Number)object2).longValue()));
        }
        if ((object2 = ((E7)object).d) != null) {
            contentValues.put("type", Integer.valueOf(((Bb)((Object)object2)).a));
        }
        if ((object2 = ((E7)object).e) != null) {
            contentValues.put("global_number", Long.valueOf(((Number)object2).longValue()));
        }
        if ((object2 = ((E7)object).f) != null) {
            contentValues.put("time", Long.valueOf(((Number)object2).longValue()));
        }
        object2 = this.a;
        object = ((E7)object).g;
        contentValues.put("event_description", MessageNano.toByteArray(((C7)object2).a.a((D7)object)));
        return contentValues;
    }

    @NotNull
    public final E7 a(@NotNull ContentValues contentValues) {
        Object object;
        Long l10 = contentValues.getAsLong("session_id");
        Object object2 = contentValues.getAsInteger("session_type");
        if (object2 != null) {
            int n10 = object2;
            object = fl.b;
            object2 = object;
            if (n10 != 0) {
                object2 = n10 != 1 ? object : fl.c;
            }
        } else {
            object2 = null;
        }
        Long l11 = contentValues.getAsLong("number_in_session");
        object = contentValues.getAsInteger("type");
        object = object != null ? Bb.a(((Number)object).intValue()) : null;
        return new E7(l10, (fl)((Object)object2), l11, (Bb)((Object)object), contentValues.getAsLong("global_number"), contentValues.getAsLong("time"), this.a.a(contentValues.getAsByteArray("event_description")));
    }
}

