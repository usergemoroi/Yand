/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Parcelable
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.impl.Bb;
import io.appmetrica.analytics.impl.Bg;
import io.appmetrica.analytics.impl.Jg;
import io.appmetrica.analytics.impl.Ng;
import io.appmetrica.analytics.impl.Pg;
import io.appmetrica.analytics.impl.Si;
import io.appmetrica.analytics.impl.W9;
import io.appmetrica.analytics.impl.bi;
import io.appmetrica.analytics.impl.j8;
import io.appmetrica.analytics.impl.l4;
import io.appmetrica.analytics.impl.o6;
import io.appmetrica.analytics.impl.pf;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

public final class Fg
implements Bg {
    public final boolean a;
    public final Si b;
    public final pf c;
    public final j8 d;
    public final Ng e;
    public final Handler f;

    public Fg(Si si3, pf pf3, @NonNull Handler handler) {
        this(si3, pf3, handler, pf3.s());
    }

    public Fg(Si si3, pf pf3, Handler handler, boolean bl2) {
        this(si3, pf3, handler, bl2, new j8(bl2), new Ng());
    }

    public Fg(Si si3, pf pf3, Handler handler, boolean bl2, j8 j82, Ng ng3) {
        this.b = si3;
        this.c = pf3;
        this.a = bl2;
        this.d = j82;
        this.e = ng3;
        this.f = handler;
    }

    public final void a() {
        if (!this.a) {
            Si si3 = this.b;
            Object object = new Pg(this.f, this);
            si3.getClass();
            Object object2 = new Bundle();
            object2.putParcelable("io.appmetrica.analytics.impl.referrer.common.ReferrerResultReceiver", (Parcelable)object);
            object = PublicLogger.getAnonymousInstance();
            Object object3 = W9.a;
            object3 = Bb.c;
            object = new l4("", "", 4098, 0, (PublicLogger)object);
            ((o6)object).m = object2;
            object2 = si3.a;
            si3.a(Si.a((o6)object, (bi)object2), (bi)object2, 1, null);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(@NonNull DeferredDeeplinkListener deferredDeeplinkListener) {
        synchronized (this) {
            Throwable throwable3;
            block8: {
                Throwable throwable22;
                block7: {
                    block6: {
                        j8 j82;
                        block5: {
                            try {
                                j82 = this.d;
                                j82.b = deferredDeeplinkListener;
                                if (!j82.a) break block5;
                                j82.a(1);
                                break block6;
                            }
                            catch (Throwable throwable22) {
                                break block7;
                            }
                        }
                        j82.a();
                    }
                    try {
                        this.c.u();
                        return;
                    }
                    catch (Throwable throwable3) {}
                    break block8;
                }
                this.c.u();
                throw throwable22;
            }
            throw throwable3;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(@NonNull DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        synchronized (this) {
            Throwable throwable3;
            block8: {
                Throwable throwable22;
                block7: {
                    block6: {
                        j8 j82;
                        block5: {
                            try {
                                j82 = this.d;
                                j82.c = deferredDeeplinkParametersListener;
                                if (!j82.a) break block5;
                                j82.a(1);
                                break block6;
                            }
                            catch (Throwable throwable22) {
                                break block7;
                            }
                        }
                        j82.a();
                    }
                    try {
                        this.c.u();
                        return;
                    }
                    catch (Throwable throwable3) {}
                    break block8;
                }
                this.c.u();
                throw throwable22;
            }
            throw throwable3;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void a(@Nullable Jg object) {
        object = object == null ? null : ((Jg)object).a;
        if (!(this.a ^ true)) return;
        synchronized (this) {
            j8 j82 = this.d;
            this.e.getClass();
            j82.d = Ng.a((String)object);
            j82.a();
            return;
        }
    }
}

