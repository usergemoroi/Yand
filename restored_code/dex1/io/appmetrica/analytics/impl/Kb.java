/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  kotlin.collections.t
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.impl.A4;
import io.appmetrica.analytics.impl.En;
import io.appmetrica.analytics.impl.Fn;
import io.appmetrica.analytics.impl.J6;
import io.appmetrica.analytics.impl.W1;
import io.appmetrica.analytics.impl.fb;
import io.appmetrica.analytics.impl.n2;
import io.appmetrica.analytics.impl.tb;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.collections.t;

public final class Kb {
    public final n2 a = new n2();
    public final J6 b = new J6();
    public Fn c;
    public boolean d;
    public boolean e;

    public final void a() {
        synchronized (this) {
            this.b.a.clear();
            this.d = false;
            this.e = false;
            return;
        }
    }

    public final void a(Context object, AppMetricaConfig appMetricaConfig, tb tb3) {
        synchronized (this) {
            block4: {
                boolean bl2 = this.e;
                if (!bl2) break block4;
                return;
            }
            J6 j63 = this.b;
            object = this.a.a((Context)object, appMetricaConfig, tb3);
            t.G((Collection)j63.a, (Object[])new fb[]{object});
            this.e = true;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b() {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                block5: {
                    try {
                        boolean bl2 = this.d;
                        if (!bl2) break block5;
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                    return;
                }
                Object object = this.b;
                Object object2 = A4.l().i.a;
                ArrayList arrayList = new ArrayList(t.x((Iterable)object2, (int)10));
                if (!(object2 = ((ArrayList)object2).iterator()).hasNext()) {
                    ((J6)object).a.addAll(arrayList);
                    this.d = true;
                    return;
                }
                object2.next().getClass();
                object = new ClassCastException();
                throw object;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c() {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                Object object;
                block5: {
                    try {
                        object = this.c;
                        if (object == null) break block5;
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                    return;
                }
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = new W1(this.b);
                object = new Fn((W1)uncaughtExceptionHandler);
                this.c = object;
                object = new En();
                ((En)object).a.add(uncaughtExceptionHandler);
                uncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                if (uncaughtExceptionHandler != null) {
                    ((En)object).a.add(uncaughtExceptionHandler);
                }
                Thread.setDefaultUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)object);
                return;
            }
            throw throwable2;
        }
    }
}

