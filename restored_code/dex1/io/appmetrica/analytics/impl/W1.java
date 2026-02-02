/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.impl.A4;
import io.appmetrica.analytics.impl.Cn;
import io.appmetrica.analytics.impl.J6;
import io.appmetrica.analytics.impl.Jn;
import io.appmetrica.analytics.impl.N6;
import io.appmetrica.analytics.impl.Q6;
import io.appmetrica.analytics.impl.U;
import io.appmetrica.analytics.impl.fb;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public final class W1
implements Thread.UncaughtExceptionHandler {
    public static final AtomicBoolean e = new AtomicBoolean();
    public final fb a;
    public final Q6 b;
    public final N6 c;
    public final Jn d;

    public W1(J6 j63) {
        this.a = j63;
        this.b = A4.l().n();
        this.c = new N6();
        this.d = new Jn();
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void uncaughtException(Thread stackTraceElementArray, Throwable throwable) {
        ArrayList arrayList;
        Cn cn3;
        fb fb2;
        block7: {
            Thread thread;
            Jn jn3;
            block8: {
                Throwable throwable2222;
                StackTraceElement[] stackTraceElementArray2;
                block9: {
                    try {
                        e.set(true);
                        fb2 = this.a;
                        cn3 = this.c.a((Thread)stackTraceElementArray);
                        jn3 = this.d;
                        thread = jn3.a.a();
                        arrayList = jn3.a(thread, (Thread)stackTraceElementArray);
                        if (stackTraceElementArray == thread) break block7;
                        stackTraceElementArray = stackTraceElementArray2 = jn3.a.b();
                        if (stackTraceElementArray2 != null) break block8;
                        stackTraceElementArray = thread.getStackTrace();
                        break block8;
                    }
                    catch (Throwable throwable2222) {
                        break block9;
                    }
                    catch (SecurityException securityException) {
                        stackTraceElementArray = null;
                        break block8;
                    }
                }
                LoggerStorage.getMainPublicOrAnonymousLogger().error(throwable2222, throwable2222.getMessage(), new Object[0]);
                return;
                catch (SecurityException securityException) {
                    stackTraceElementArray = stackTraceElementArray2;
                }
            }
            arrayList.add(0, (Cn)jn3.b.apply(thread, stackTraceElementArray));
        }
        U u11 = new U(cn3, arrayList, this.b.a.a());
        fb2.a(throwable, u11);
    }
}

