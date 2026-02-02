/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.impl.F8;
import io.appmetrica.analytics.impl.W7;
import io.appmetrica.analytics.impl.X7;
import java.math.BigDecimal;
import java.math.BigInteger;
import kotlin.t;
import kotlin.z;

public final class V7
implements ProtobufConverter {
    @NonNull
    public final F8 a(@NonNull BigDecimal object) {
        Object object2 = X7.a;
        int n10 = -((BigDecimal)object).scale();
        object = ((BigDecimal)object).unscaledValue();
        while (true) {
            if (((BigInteger)object).compareTo(X7.a) <= 0 && ((BigInteger)object).compareTo(X7.b) >= 0) {
                object = z.a(((BigInteger)object).longValue(), n10);
                long l10 = ((Number)((t)object).c()).longValue();
                object = new W7(((Number)((t)object).d()).intValue(), l10);
                object2 = new F8();
                ((F8)object2).a = ((W7)object).a;
                ((F8)object2).b = ((W7)object).b;
                return object2;
            }
            object = ((BigInteger)object).divide(BigInteger.TEN);
            ++n10;
        }
    }

    @NonNull
    public final BigDecimal a(@NonNull F8 f84) {
        throw new UnsupportedOperationException();
    }

    @Override
    @NonNull
    public final Object toModel(@NonNull Object object) {
        object = (F8)object;
        throw new UnsupportedOperationException();
    }
}

