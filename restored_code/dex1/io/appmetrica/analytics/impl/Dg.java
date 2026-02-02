/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.android.installreferrer.api.InstallReferrerStateListener
 */
package io.appmetrica.analytics.impl;

import com.android.installreferrer.api.InstallReferrerStateListener;
import io.appmetrica.analytics.impl.Eg;
import io.appmetrica.analytics.impl.Ig;
import io.appmetrica.analytics.impl.Jg;
import io.appmetrica.analytics.impl.Og;
import io.appmetrica.analytics.impl.ep;

public final class Dg
implements InstallReferrerStateListener {
    public final Eg a;
    public final Og b;

    public Dg(Eg eg3, Og og2) {
        this.a = eg3;
        this.b = og2;
    }

    /*
     * Unable to fully structure code
     */
    public static final void a(Eg var0, Og var1_3) {
        try {
            var2_5 = var0.b.getInstallReferrer();
            var3_7 = new Jg(var2_5.getInstallReferrer(), var2_5.getReferrerClickTimestampSeconds(), var2_5.getInstallBeginTimestampSeconds(), Ig.c);
            var1_3.a(var3_7);
        }
        catch (Throwable var2_6) {
            var1_3.a(var2_6);
            var0 = var0.b;
lbl10:
            // 2 sources

            var0.endConnection();
lbl11:
            // 2 sources

            return;
            catch (Throwable var1_4) {
                var0.b.endConnection();
lbl16:
                // 2 sources

                throw var1_4;
            }
            catch (Throwable var0_1) {
                ** continue;
            }
            {
                catch (Throwable var0_2) {
                    ** continue;
                }
            }
        }
        var0 = var0.b;
        ** GOTO lbl10
    }

    public final void onInstallReferrerServiceDisconnected() {
    }

    public final void onInstallReferrerSetupFinished(int n10) {
        if (n10 == 0) {
            Eg eg3 = this.a;
            eg3.a.execute(new ep(eg3, this.b));
        } else {
            Eg eg4 = this.a;
            Og og2 = this.b;
            StringBuilder stringBuilder = new StringBuilder("Referrer check failed with error ");
            stringBuilder.append(n10);
            eg4.a(og2, new IllegalStateException(stringBuilder.toString()));
        }
    }
}

