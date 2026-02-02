/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Comparator;
import java.util.Map;

public final class Ua
implements Comparator {
    public final int compare(Object object, Object object2) {
        int n10;
        object = (Map.Entry)object;
        object2 = (Map.Entry)object2;
        object = (String)object.getValue();
        object2 = (String)object2.getValue();
        int n13 = StringUtils.getUtf8BytesLength((String)object);
        n10 = n13 < (n10 = StringUtils.getUtf8BytesLength((String)object2)) ? -1 : (n13 == n10 ? 0 : 1);
        return n10;
    }
}

