/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ExternalAttribution;
import io.appmetrica.analytics.impl.aa;
import io.appmetrica.analytics.impl.ka;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;

public class Q2
implements ExternalAttribution {
    public final aa a;

    public Q2(@NotNull aa aa4) {
        this.a = aa4;
    }

    @Override
    @NotNull
    public final byte[] toBytes() {
        return MessageNano.toByteArray(this.a);
    }

    @NotNull
    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ExternalAttribution(type=`");
        stringBuilder.append(ka.a(this.a.a));
        stringBuilder.append("`value=`");
        stringBuilder.append(new String(this.a.b, d.b));
        stringBuilder.append("`)");
        return stringBuilder.toString();
    }
}

