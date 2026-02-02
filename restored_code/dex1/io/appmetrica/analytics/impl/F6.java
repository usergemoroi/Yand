/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.impl.Bb;
import io.appmetrica.analytics.impl.C6;
import io.appmetrica.analytics.impl.Nb;
import io.appmetrica.analytics.impl.jl;
import io.appmetrica.analytics.impl.pg;
import io.appmetrica.analytics.impl.qh;
import io.appmetrica.analytics.impl.za;
import java.io.File;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.v0;
import kotlin.jvm.internal.y;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class F6
implements Consumer {
    public final Executor a;
    public final qh b;

    public F6(@NotNull Context context, @NotNull C6 c64, @NotNull Bb bb4, @NotNull jl jl2, @NotNull Executor executor, @NotNull String string2) {
        this.a = executor;
        this.b = new qh(context, c64, bb4, jl2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(@Nullable File file) {
        Object object;
        Object object2;
        Consumer consumer;
        Nb nb3;
        qh qh3;
        Executor executor;
        block8: {
            if (file == null) {
                return;
            }
            executor = this.a;
            qh3 = this.b;
            nb3 = qh3.c;
            consumer = qh3.e;
            Context context = qh3.a;
            if (za.c == null) {
                object2 = v0.b(za.class);
                synchronized (object2) {
                    Throwable throwable2;
                    block7: {
                        block6: {
                            try {
                                if (za.c != null) break block6;
                                za.c = object = new za(context);
                            }
                            catch (Throwable throwable2) {
                                break block7;
                            }
                        }
                        object = k0.a;
                        break block8;
                    }
                    throw throwable2;
                }
            }
        }
        object = za.c;
        object2 = object;
        if (object == null) {
            y.B("INSTANCE");
            object2 = null;
        }
        executor.execute(new pg(file, nb3, nb3, consumer, (za)object2, qh3.b));
    }
}

