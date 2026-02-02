/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.I7;
import io.appmetrica.analytics.impl.vc;
import io.appmetrica.analytics.impl.z9;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.Nullable;

public final class Ja
implements vc {
    @Override
    @Nullable
    public final z9 a(@Nullable I7 object) {
        Integer n10 = null;
        Object object2 = object != null ? ((I7)object).b : null;
        Object object3 = n10;
        if (object2 != null) {
            object3 = n10;
            if (((I7)object).c != null) {
                object2 = new z9();
                ((z9)object2).b = ((I7)object).b;
                ((z9)object2).a = ((I7)object).c;
                object3 = ((I7)object).d;
                if (object3 != null) {
                    ((z9)object2).g = ((Number)object3).intValue();
                }
                if ((object3 = ((I7)object).e) != null) {
                    ((z9)object2).e = ((Number)object3).intValue();
                }
                if ((object3 = ((I7)object).f) != null) {
                    ((z9)object2).d = ((Number)object3).intValue();
                }
                if ((object3 = ((I7)object).g) != null) {
                    ((z9)object2).f = ((Number)object3).intValue();
                }
                if ((object3 = ((I7)object).h) != null) {
                    long l10 = ((Number)object3).longValue();
                    ((z9)object2).c = TimeUnit.MILLISECONDS.toSeconds(l10);
                }
                if ((object3 = ((I7)object).i) != null) {
                    if (y.e(object3, "gps")) {
                        ((z9)object2).h = 1;
                    } else if (y.e(object3, "network")) {
                        ((z9)object2).h = 2;
                    }
                }
                object = ((I7)object).j;
                object3 = object2;
                if (object != null) {
                    ((z9)object2).i = object;
                    object3 = object2;
                }
            }
        }
        return object3;
    }
}

