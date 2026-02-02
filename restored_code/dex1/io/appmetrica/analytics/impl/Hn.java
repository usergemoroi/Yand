/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Comparator;

public final class Hn
implements Comparator {
    public final int compare(Object object, Object object2) {
        int n10 = (object = (Thread)object) == (object2 = (Thread)object2) ? 0 : StringUtils.compare(((Thread)object).getName(), ((Thread)object2).getName());
        return n10;
    }
}

