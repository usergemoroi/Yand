/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import io.appmetrica.analytics.impl.Rd;
import io.appmetrica.analytics.impl.Ue;
import io.appmetrica.analytics.impl.X9;
import io.appmetrica.analytics.impl.jb;
import io.appmetrica.analytics.impl.kb;
import io.appmetrica.analytics.impl.vo;
import io.appmetrica.analytics.internal.IdentifiersResult;

public final class Qd {
    public final Context a;
    public final kb b;
    public final X9 c;
    public final Ue d;
    public final vo e;
    public volatile IdentifiersResult f;

    public Qd(Context context, kb kb4) {
        this(context, kb4, Rd.a(context), new Ue(context), new vo());
    }

    public Qd(Context context, kb kb4, X9 x94, Ue ue2, vo vo3) {
        this.a = context;
        this.b = kb4;
        this.c = x94;
        this.d = ue2;
        this.e = vo3;
        try {
            x94.a();
            ue2.a();
            x94.b();
        }
        catch (Throwable throwable) {
            this.c.b();
        }
    }

    /*
     * Unable to fully structure code
     */
    public final IdentifiersResult a() {
        block27: {
            block26: {
                block25: {
                    var1_1 = this.f;
                    if (var1_1 != null && var1_1.status == IdentifierStatus.OK) {
                        var2_3 = this.e;
                        var3_5 = var1_1.id;
                        var2_3.getClass();
                        if (vo.a((String)var3_5)) {
                            return var1_1;
                        }
                    }
                    var2_3 = var1_1;
                    var3_5 = this.c;
                    var2_3 = var1_1;
                    var3_5.a.lock();
                    var2_3 = var1_1;
                    var3_5.b.a();
                    var2_3 = var1_1;
                    var3_5 = this.f;
                    if (var3_5 == null) break block25;
                    var2_3 = var3_5;
                    if (var3_5.status != IdentifierStatus.OK) break block25;
                    var2_3 = var3_5;
                    var1_1 = this.e;
                    var2_3 = var3_5;
                    var4_6 = var3_5.id;
                    var2_3 = var3_5;
                    var1_1.getClass();
                    var2_3 = var3_5;
                    if (!vo.a((String)var4_6)) break block25;
                    var1_1 = var3_5;
                }
                var2_3 = var3_5;
                var1_1 = jb.a(FileUtils.getFileFromSdkStorage(this.d.a, "uuid.dat"));
                var2_3 = var3_5;
                this.e.getClass();
                var4_6 = var1_1;
                var2_3 = var3_5;
                if (vo.a((String)var1_1)) break block26;
                var2_3 = var3_5;
                var1_1 = this.b.a(this.a);
                var2_3 = var3_5;
                var4_6 = this.d.a((String)var1_1);
            }
            var2_3 = var3_5;
            this.e.getClass();
            var1_1 = var3_5;
            var2_3 = var3_5;
            if (!vo.a((String)var4_6)) break block27;
            var2_3 = var3_5;
            var2_3 = var3_5;
            var1_1 = new IdentifiersResult((String)var4_6, IdentifierStatus.OK, null);
            try {
                this.f = var1_1;
            }
            catch (Throwable var2_4) {
                ** continue;
            }
        }
lbl74:
        // 3 sources

        while (true) {
            var2_3 = this.c;
            var2_3.b.b();
            var2_3.a.unlock();
            if (var1_1 == null) {
                var1_1 = new IdentifiersResult(null, IdentifierStatus.UNKNOWN, "Uuid must be obtained via async API AppMetrica#requestStartupParams(Context, StartupParamsCallback, List<String>)");
            }
            return var1_1;
        }
        catch (Throwable var1_2) {
            var1_1 = var2_3;
        }
        ** GOTO lbl74
    }
}

