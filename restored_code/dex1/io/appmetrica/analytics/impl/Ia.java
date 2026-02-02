/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.collections.t
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.C9;
import io.appmetrica.analytics.impl.h9;
import io.appmetrica.analytics.impl.na;
import java.util.Map;
import kotlin.collections.t;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class Ia
implements na {
    public final h9 a = new h9();

    @NotNull
    public final C9[] a(@Nullable byte[] objectArray) {
        int n10 = 0;
        if (objectArray != null) {
            Map<String, byte[]> map2 = this.a.a((byte[])objectArray);
            objectArray = new C9[map2.size()];
            for (Object e11 : map2.entrySet()) {
                if (n10 < 0) {
                    t.w();
                }
                Map.Entry entry = (Map.Entry)e11;
                C9 object = new C9();
                object.a = ((String)entry.getKey()).getBytes(d.b);
                object.b = (byte[])entry.getValue();
                objectArray[n10] = object;
                ++n10;
            }
            return objectArray;
        }
        return new C9[0];
    }
}

