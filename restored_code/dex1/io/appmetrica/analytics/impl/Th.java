/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.content.ServiceConnection
 *  android.os.RemoteException
 */
package io.appmetrica.analytics.impl;

import android.content.Intent;
import android.content.ServiceConnection;
import android.os.RemoteException;
import io.appmetrica.analytics.impl.Ei;
import io.appmetrica.analytics.impl.Jk;
import io.appmetrica.analytics.impl.Sh;
import io.appmetrica.analytics.impl.W1;
import io.appmetrica.analytics.impl.il;
import io.appmetrica.analytics.impl.o0;
import io.appmetrica.analytics.internal.IAppMetricaService;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class Th
implements Callable {
    @NotNull
    public static final Sh d = new Sh();
    public final o0 a;
    public final il b;
    public boolean c;

    public Th(o0 o02, il il3) {
        this.a = o02;
        this.b = il3;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a() {
        block12: {
            if (this.c) {
                return;
            }
            this.c = true;
            var1_1 = 0;
            while (true) {
                var4_4 = this.a;
                synchronized (var4_4) {
                    var5_7 = var4_4.d;
                }
                break;
            }
            {
                catch (Throwable var4_5) {
                    break block12;
                }
                {
                    // MONITOREXIT @DISABLED, blocks:[3, 4] lbl13 : MonitorExitStatement: MONITOREXIT : var4_4
                    if (var5_7 != null) {
                        ** try [egrp 3[TRYBLOCK] [5 : 39->83)] { 
lbl16:
                        // 1 sources

                        this.a(var5_7);
                        var4_4 = this.b;
                        if (var4_4 != null) {
                            if (((Ei)var4_4).a() == false) return;
                        }
                        this.a.c();
                        return;
                    }
lbl22:
                    // 3 sources

                    while (true) {
                        var3_3 = this.c();
                        var2_2 = var1_1 + 1;
                        if (var3_3 == false) return;
                        if (W1.e.get() != false) return;
                        var1_1 = var2_2;
                        if (var2_2 < 3) ** continue;
                        return;
                    }
                }
            }
lbl30:
            // 1 sources

            catch (RemoteException var4_6) {
                ** continue;
            }
        }
        this.a(var4_5);
    }

    public abstract void a(IAppMetricaService var1);

    public void a(@Nullable Throwable throwable) {
    }

    public final void a(boolean bl2) {
        this.c = bl2;
    }

    @NotNull
    public final o0 b() {
        return this.a;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public boolean c() {
        block7: {
            CountDownLatch countDownLatch;
            o0 o02;
            block6: {
                o02 = this.a;
                // MONITORENTER : o02
                if (o02.d == null) break block6;
                // MONITOREXIT : o02
                break block7;
            }
            o02.e = countDownLatch = new CountDownLatch(1);
            // MONITOREXIT : o02
            countDownLatch = Jk.a(o02.a);
            try {
                o02.g.b(o02.a);
                o02.a.bindService((Intent)countDownLatch, (ServiceConnection)o02.i, 1);
            }
            catch (Throwable throwable) {}
        }
        this.a.a(5000L);
        return true;
    }

    public final boolean d() {
        return this.c;
    }
}

