/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.Bb;
import io.appmetrica.analytics.impl.Ih;
import io.appmetrica.analytics.impl.Kh;
import io.appmetrica.analytics.impl.Zf;
import io.appmetrica.analytics.impl.v5;
import io.appmetrica.analytics.impl.v9;
import io.appmetrica.analytics.impl.w9;
import io.appmetrica.analytics.impl.wh;
import java.util.LinkedList;

public final class L9
extends Zf {
    public final Ih a;
    public final Kh b;
    public final wh c;

    public L9(v5 v54) {
        this.a = new Ih(v54);
        this.b = new Kh(v54);
        this.c = new wh(v54);
    }

    @Override
    public final w9 a(int n10) {
        LinkedList<Object> linkedList = new LinkedList<Object>();
        if ((n10 = Bb.a(n10).ordinal()) != 1) {
            if (n10 != 3) {
                if (n10 == 27) {
                    linkedList.add(this.b);
                    linkedList.add(this.a);
                }
            } else {
                linkedList.add(this.c);
            }
        } else {
            linkedList.add(this.a);
        }
        return new v9(linkedList);
    }
}

