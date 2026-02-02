/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.impl.L4;
import io.appmetrica.analytics.impl.R2;
import io.appmetrica.analytics.impl.Sa;
import io.appmetrica.analytics.impl.Sn;
import io.appmetrica.analytics.impl.Ua;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public final class Va
extends R2 {
    public final Sa b;
    public final Sa c;
    public final Ua d = new Ua();

    public Va(int n10, int n13, int n14) {
        this(n10, new Sa(n13), new Sa(n14));
    }

    public Va(int n10, @NonNull Sa sa2, @NonNull Sa sa4) {
        super(n10);
        this.b = sa2;
        this.c = sa4;
    }

    @NonNull
    public final Sn a(@Nullable Map<String, String> object) {
        int n10;
        int n13 = 0;
        if (object != null) {
            HashMap<String, String> hashMap = new HashMap<String, String>();
            object = object.entrySet();
            Map.Entry[] entryArray = object.toArray(new Map.Entry[object.size()]);
            Arrays.sort(entryArray, this.d);
            int n14 = entryArray.length;
            int n15 = 0;
            int n16 = n13 = (n10 = 0);
            int n17 = n13;
            n13 = n10;
            n10 = n15;
            for (int i14 = 0; i14 < n14; ++i14) {
                object = entryArray[i14];
                Sn sn3 = this.b.a((String)object.getKey());
                Sn sn4 = this.c.a((String)object.getValue());
                int n18 = StringUtils.getUtf8BytesLength((String)object.getKey());
                n15 = StringUtils.getUtf8BytesLength((String)object.getValue());
                int n19 = StringUtils.getUtf8BytesLength((String)sn3.a);
                int n23 = StringUtils.getUtf8BytesLength((String)sn4.a);
                if (n17 == 0 && n23 + n19 + n16 <= this.a) {
                    n15 = sn3.b.getBytesTruncated();
                    n10 = sn4.b.getBytesTruncated() + (n15 + n10);
                    n18 = StringUtils.getUtf8BytesLength((String)sn3.a);
                    n15 = StringUtils.getUtf8BytesLength((String)sn4.a);
                    hashMap.put((String)sn3.a, (String)sn4.a);
                    n16 = n15 + n18 + n16;
                    continue;
                }
                ++n13;
                n10 += n15 + n18;
                n17 = 1;
            }
            object = hashMap;
        } else {
            object = null;
            n10 = 0;
        }
        return new Sn(object, new L4(n13, n10));
    }
}

