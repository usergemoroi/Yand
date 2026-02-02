/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 */
package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.impl.Q7;
import io.appmetrica.analytics.impl.R7;
import io.appmetrica.analytics.impl.S7;
import io.appmetrica.analytics.impl.fl;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;

public final class T7
implements Converter {
    public final Q7 a;

    public T7() {
        this(null, 1, null);
    }

    public T7(@NotNull Q7 q72) {
        this.a = q72;
    }

    public /* synthetic */ T7(Q7 q72, int n10, p p14) {
        if ((n10 & 1) != 0) {
            q72 = new Q7(null, 1, null);
        }
        this(q72);
    }

    @NotNull
    public final ContentValues a(@NotNull S7 object) {
        ContentValues contentValues = new ContentValues();
        Object object2 = ((S7)object).a;
        if (object2 != null) {
            contentValues.put("id", Long.valueOf(object2));
        }
        if ((object2 = ((S7)object).b) != null) {
            contentValues.put("type", Integer.valueOf(((fl)((Object)object2)).a));
        }
        if ((object2 = ((S7)object).c) != null) {
            contentValues.put("report_request_parameters", (String)object2);
        }
        object2 = this.a;
        object = ((S7)object).d;
        contentValues.put("session_description", MessageNano.toByteArray(((Q7)object2).a.a((R7)object)));
        return contentValues;
    }

    @NotNull
    public final S7 a(@NotNull ContentValues contentValues) {
        Long l10 = contentValues.getAsLong("id");
        Object object = contentValues.getAsInteger("type");
        if (object != null) {
            int n10 = object;
            fl fl3 = fl.b;
            object = fl3;
            if (n10 != 0) {
                object = n10 != 1 ? fl3 : fl.c;
            }
        } else {
            object = null;
        }
        return new S7(l10, (fl)((Object)object), contentValues.getAsString("report_request_parameters"), this.a.a(contentValues.getAsByteArray("session_description")));
    }
}

