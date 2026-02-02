/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  kotlin.collections.s0
 *  kotlin.collections.t
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.ModulesFacade;
import io.appmetrica.analytics.impl.A4;
import io.appmetrica.analytics.impl.Oo;
import io.appmetrica.analytics.impl.Z9;
import io.appmetrica.analytics.impl.bc;
import io.appmetrica.analytics.impl.cc;
import io.appmetrica.analytics.impl.cp;
import io.appmetrica.analytics.impl.ec;
import io.appmetrica.analytics.impl.nn;
import io.appmetrica.analytics.impl.s;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.logger.common.BaseReleaseLogger;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.s0;
import kotlin.collections.t;
import kotlin.z;

public final class C0 {
    public final bc a = new bc(A4.l().d());
    public final cc b = new cc();
    public final ec c = new ec();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public static final void a(C0 object, String object2, String iterator, String object3) {
        Object object4;
        ec ec3 = ((C0)object).c;
        ec3.getClass();
        object = object2;
        if (object2 == null) {
            object = "null";
        }
        object2 = z.a("sender", object);
        object = iterator;
        if (iterator == null) {
            object = "null";
        }
        iterator = z.a("event", object);
        object = object3;
        if (object3 == null) {
            object = "null";
        }
        object = s0.o((kotlin.t[])new kotlin.t[]{object2, iterator, z.a("payload", object)});
        object2 = ModuleEvent.newBuilder(4).withName("appmetrica_system_event_42");
        // MONITORENTER : ec3
        if (ec3.a == null && (object4 = A4.l().g.a()) != null) {
            iterator = new Iterator();
            object3 = new nn((Context)object4);
            object4 = new Oo();
            ec3.a = t.p((Object[])new s[]{iterator, object3, object4});
        }
        iterator = ec3.a;
        // MONITOREXIT : ec3
        if (iterator != null) {
            iterator = iterator.iterator();
            while (iterator.hasNext()) {
                ((s)iterator.next()).a((Map)object);
            }
        }
        ModulesFacade.reportEvent(((ModuleEvent.Builder)object2).withAttributes((Map<String, Object>)object).build());
    }

    public final void a(String object, String charSequence, String string2) {
        Object object2 = this.a;
        if (((bc)object2).c.a(null).a && ((bc)object2).d.a((Object)object).a && ((bc)object2).e.a((Object)charSequence).a && ((bc)object2).f.a((Object)string2).a) {
            this.b.getClass();
            object2 = A4.l().c.a();
            object = new cp(this, (String)object, (String)charSequence, string2);
            ((Z9)object2).b.post((Runnable)object);
        } else {
            object2 = new StringBuilder("Failed report event from sender: ");
            ((StringBuilder)object2).append((String)object);
            ((StringBuilder)object2).append(" with name = ");
            ((StringBuilder)object2).append((String)charSequence);
            ((StringBuilder)object2).append(" and payload = ");
            ((StringBuilder)object2).append(string2);
            string2 = ((StringBuilder)object2).toString();
            object = PublicLogger.Companion.getAnonymousInstance();
            charSequence = new StringBuilder("[AppMetricaLibraryAdapterProxy]");
            ((StringBuilder)charSequence).append(string2);
            ((BaseReleaseLogger)object).warning(((StringBuilder)charSequence).toString(), new Object[0]);
        }
    }
}

