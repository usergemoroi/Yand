/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.impl.Zm;
import io.appmetrica.analytics.impl.an;
import io.appmetrica.analytics.impl.id;
import io.appmetrica.analytics.impl.rm;
import io.appmetrica.analytics.impl.sm;
import org.jetbrains.annotations.NotNull;

public final class Fk
implements id {
    @Override
    public final void a(@NotNull Context object) {
        Object object2 = Zm.a(sm.class);
        object = ((an)object2).a((Context)object, ((an)object2).d((Context)object));
        object2 = (sm)object.read();
        object2 = ((sm)object2).a(((sm)object2).m);
        ((rm)object2).o = 0L;
        object.save(new sm((rm)object2));
    }
}

