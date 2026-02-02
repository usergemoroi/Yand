/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.Ql;
import io.appmetrica.analytics.impl.Sl;
import io.appmetrica.analytics.impl.Zl;
import io.appmetrica.analytics.impl.om;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public final class Ol {
    public final Ql a;

    public Ol(Ql ql3) {
        this.a = ql3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void a(String object, Sl sl3, om om3) {
        HashMap hashMap = this.a.b;
        // MONITORENTER : hashMap
        object = (Collection)this.a.a.a.get(object);
        object = object == null ? new ArrayList() : new ArrayList(object);
        object = ((ArrayList)object).iterator();
        while (object.hasNext()) {
            ((Zl)object.next()).a(sl3, om3);
        }
    }
}

