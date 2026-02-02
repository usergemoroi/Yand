/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  kotlin.jvm.functions.a
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.impl.F;
import io.appmetrica.analytics.impl.I;
import io.appmetrica.analytics.impl.J;
import io.appmetrica.analytics.impl.M;
import io.appmetrica.analytics.impl.P;
import io.appmetrica.analytics.impl.Q;
import io.appmetrica.analytics.impl.S;
import io.appmetrica.analytics.impl.Vg;
import io.appmetrica.analytics.impl.ab;
import io.appmetrica.analytics.impl.cj;
import io.appmetrica.analytics.impl.om;
import io.appmetrica.analytics.impl.se;
import io.appmetrica.analytics.impl.up;
import io.appmetrica.analytics.impl.vp;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import kotlin.jvm.functions.a;
import kotlin.jvm.internal.y;
import kotlin.r;
import org.jetbrains.annotations.NotNull;

public final class T
implements ab {
    public final Context a;
    public final ICommonExecutor b;
    public final String c;
    public final String d;
    public final String e;
    public final M f;
    public final M g;
    public final M h;
    public FutureTask i;
    public final I j;
    public volatile AdvertisingIdsHolder k;
    public F l;
    public boolean m;

    public T(@NotNull Context context, @NotNull ICommonExecutor iCommonExecutor, @NotNull om om3) {
        this.a = context;
        this.b = iCommonExecutor;
        this.c = "advertising identifiers collecting is forbidden by client configuration";
        this.d = "advertising identifiers collecting is forbidden by startup";
        this.e = "advertising identifiers collecting is forbidden by unknown reason";
        this.f = new M(new Vg("google"));
        this.g = new M(new Vg("huawei"));
        this.h = new M(new Vg("yandex"));
        this.j = new I(om3);
        this.k = new AdvertisingIdsHolder();
        this.l = new F(4, 4, 4);
    }

    public static final /* synthetic */ Context a(T t13) {
        return t13.a;
    }

    public static final Void a(boolean bl2, F object, T t13, cj object2) {
        if (bl2 || !y.e(object, t13.l)) {
            Object object3 = t13.k;
            Object object4 = t13.a(((F)object).a, new P(t13));
            Object object5 = ((AdvertisingIdsHolder)object3).getGoogle();
            Object object6 = object4.mStatus;
            IdentifierStatus identifierStatus = IdentifierStatus.UNKNOWN;
            AdTrackingInfoResult adTrackingInfoResult = object4;
            if (object6 == identifierStatus) {
                adTrackingInfoResult = new AdTrackingInfoResult(object5.mAdTrackingInfo, (IdentifierStatus)((Object)object6), object4.mErrorExplanation);
            }
            object6 = t13.a(((F)object).b, new Q(t13));
            AdTrackingInfoResult adTrackingInfoResult2 = ((AdvertisingIdsHolder)object3).getHuawei();
            object5 = ((AdTrackingInfoResult)object6).mStatus;
            object4 = object6;
            if (object5 == identifierStatus) {
                object4 = new AdTrackingInfoResult(adTrackingInfoResult2.mAdTrackingInfo, (IdentifierStatus)((Object)object5), ((AdTrackingInfoResult)object6).mErrorExplanation);
            }
            object2 = t13.a(((F)object).c, new S(t13, (cj)object2));
            object3 = ((AdvertisingIdsHolder)object3).getYandex();
            object6 = ((AdTrackingInfoResult)object2).mStatus;
            object = object2;
            if (object6 == identifierStatus) {
                object = new AdTrackingInfoResult(((AdTrackingInfoResult)object3).mAdTrackingInfo, (IdentifierStatus)((Object)object6), ((AdTrackingInfoResult)object2).mErrorExplanation);
            }
            t13.k = new AdvertisingIdsHolder(adTrackingInfoResult, (AdTrackingInfoResult)object4, (AdTrackingInfoResult)object);
        }
        return null;
    }

    public static final /* synthetic */ J b(T t13) {
        return t13.f;
    }

    public static final /* synthetic */ J c(T t13) {
        return t13.g;
    }

    public static final /* synthetic */ J d(T t13) {
        return t13.h;
    }

    public static final Void e(T t13) {
        t13.k = new AdvertisingIdsHolder(t13.a(t13.l.a, new P(t13)), t13.a(t13.l.b, new Q(t13)), t13.a(t13.l.c, new S(t13, new se())));
        return null;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final AdTrackingInfoResult a(int n10, a object) {
        void var2_7;
        if (n10 == 0) throw null;
        if (--n10 != 0) {
            if (n10 != 1) {
                if (n10 != 2) {
                    if (n10 != 3) throw new r();
                    AdTrackingInfoResult adTrackingInfoResult = new AdTrackingInfoResult(null, IdentifierStatus.UNKNOWN, this.e);
                    return var2_7;
                } else {
                    AdTrackingInfoResult adTrackingInfoResult = new AdTrackingInfoResult(null, IdentifierStatus.FEATURE_DISABLED, this.d);
                }
                return var2_7;
            } else {
                AdTrackingInfoResult adTrackingInfoResult = new AdTrackingInfoResult(null, IdentifierStatus.FORBIDDEN_BY_CLIENT_CONFIG, this.c);
            }
            return var2_7;
        } else {
            AdTrackingInfoResult adTrackingInfoResult = (AdTrackingInfoResult)object.invoke();
        }
        return var2_7;
    }

    @Override
    @NotNull
    public final AdvertisingIdsHolder a() {
        synchronized (this) {
            Object object = new se();
            object = this.a((cj)object);
            return object;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    @NotNull
    public final AdvertisingIdsHolder a(@NotNull cj object) {
        synchronized (this) {
            try {
                object = this.a((cj)object, true);
                try {
                    ((FutureTask)object).get();
                    return this.k;
                }
                catch (InterruptedException | ExecutionException exception) {}
                return this.k;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final FutureTask a(cj object, boolean bl2) {
        this.i = object = new FutureTask(new vp(bl2, this.j.a(), this, (cj)object));
        this.b.execute((Runnable)object);
        FutureTask futureTask = this.i;
        object = futureTask;
        if (futureTask == null) {
            y.B("refresh");
            object = null;
        }
        return object;
    }

    @Override
    public final void a(@NotNull om object) {
        synchronized (this) {
            this.j.a((om)object);
            object = new se();
            this.a((cj)object, false);
            return;
        }
    }

    @Override
    public final void b(boolean bl2) {
        synchronized (this) {
            this.m = true;
            this.j.b.update(bl2);
            se se3 = new se();
            this.a(se3, false);
            return;
        }
    }

    @Override
    public final void c(boolean bl2) {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        if (this.m) break block3;
                        this.b(bl2);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    @NotNull
    public final AdvertisingIdsHolder getIdentifiers() {
        synchronized (this) {
            Throwable throwable2;
            block7: {
                Object object;
                block6: {
                    try {
                        FutureTask futureTask = this.i;
                        object = futureTask;
                        if (futureTask != null) break block6;
                        y.B("refresh");
                        object = null;
                    }
                    catch (Throwable throwable2) {
                        break block7;
                    }
                }
                try {
                    ((FutureTask)object).get();
                    return this.k;
                }
                catch (InterruptedException | ExecutionException exception) {
                    return this.k;
                }
            }
            throw throwable2;
        }
    }

    @Override
    @NotNull
    public final AdvertisingIdsHolder getIdentifiers(@NotNull Context object) {
        synchronized (this) {
            object = this.getIdentifiers();
            return object;
        }
    }

    @Override
    public final void init() {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        FutureTask futureTask;
                        if (this.i != null) break block3;
                        this.l = this.j.a();
                        up up3 = new up(this);
                        this.i = futureTask = new FutureTask(up3);
                        this.b.execute(futureTask);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }
}

