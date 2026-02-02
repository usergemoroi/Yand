/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.Configuration
 *  android.net.Uri
 *  android.os.Bundle
 *  android.text.TextUtils
 *  androidx.annotation.MainThread
 *  androidx.annotation.NonNull
 *  androidx.annotation.WorkerThread
 *  kotlin.collections.t
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;
import io.appmetrica.analytics.coreutils.internal.executors.BlockingExecutor;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import io.appmetrica.analytics.impl.Aa;
import io.appmetrica.analytics.impl.Ad;
import io.appmetrica.analytics.impl.B5;
import io.appmetrica.analytics.impl.Bb;
import io.appmetrica.analytics.impl.Bk;
import io.appmetrica.analytics.impl.C6;
import io.appmetrica.analytics.impl.D5;
import io.appmetrica.analytics.impl.D6;
import io.appmetrica.analytics.impl.Ea;
import io.appmetrica.analytics.impl.F6;
import io.appmetrica.analytics.impl.Gb;
import io.appmetrica.analytics.impl.Hk;
import io.appmetrica.analytics.impl.Jl;
import io.appmetrica.analytics.impl.Li;
import io.appmetrica.analytics.impl.M1;
import io.appmetrica.analytics.impl.Mb;
import io.appmetrica.analytics.impl.N5;
import io.appmetrica.analytics.impl.Na;
import io.appmetrica.analytics.impl.Q1;
import io.appmetrica.analytics.impl.R1;
import io.appmetrica.analytics.impl.S1;
import io.appmetrica.analytics.impl.Vf;
import io.appmetrica.analytics.impl.W;
import io.appmetrica.analytics.impl.ee;
import io.appmetrica.analytics.impl.fc;
import io.appmetrica.analytics.impl.h6;
import io.appmetrica.analytics.impl.je;
import io.appmetrica.analytics.impl.o2;
import io.appmetrica.analytics.impl.o6;
import io.appmetrica.analytics.impl.oh;
import io.appmetrica.analytics.impl.om;
import io.appmetrica.analytics.impl.pk;
import io.appmetrica.analytics.impl.po;
import io.appmetrica.analytics.impl.pp;
import io.appmetrica.analytics.impl.qg;
import io.appmetrica.analytics.impl.qm;
import io.appmetrica.analytics.impl.r0;
import io.appmetrica.analytics.impl.s1;
import io.appmetrica.analytics.impl.tk;
import io.appmetrica.analytics.impl.tm;
import io.appmetrica.analytics.impl.uh;
import io.appmetrica.analytics.impl.uk;
import io.appmetrica.analytics.impl.w1;
import io.appmetrica.analytics.impl.y1;
import io.appmetrica.analytics.impl.z1;
import io.appmetrica.analytics.impl.z4;
import io.appmetrica.analytics.impl.zh;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrash;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashServiceConfig;
import io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import kotlin.collections.t;

public final class L1
implements z1,
r0 {
    public boolean a = false;
    public final Context b;
    public volatile y1 c;
    public final z4 d;
    public final S1 e;
    public oh f;
    public final Ea g;
    public final o2 h;
    public final M1 i;
    public final zh j;

    @MainThread
    public L1(@NonNull Context context, @NonNull y1 y14) {
        this(context, y14, new B5(context));
    }

    public L1(Context context, y1 y14, B5 b54) {
        this(context, y14, new z4(context, b54), new S1(), Ea.d, Na.j().d(), new M1());
    }

    public L1(Context context, y1 y14, z4 z42, S1 s13, Ea ea3, o2 o23, M1 m12) {
        this.b = context;
        this.c = y14;
        this.d = z42;
        this.e = s13;
        this.g = ea3;
        this.h = o23;
        this.i = m12;
        this.j = new zh();
    }

    public final void a() {
        this.e.c(new pp(this));
    }

    @Override
    @WorkerThread
    public final void a(Intent intent) {
        Object object = this.e;
        if (intent != null) {
            object.getClass();
            String string2 = intent.getAction();
            if (!TextUtils.isEmpty((CharSequence)string2)) {
                ((S1)object).a.a(string2, S1.a(intent));
            }
            for (Map.Entry entry : ((S1)object).b.entrySet()) {
                object = (R1)entry.getKey();
                if (!((Q1)entry.getValue()).a(intent)) continue;
                object.a(intent);
            }
        } else {
            object.getClass();
        }
    }

    @Override
    @WorkerThread
    public final void a(Intent intent, int n10) {
        ((w1)this.c).a.stopSelfResult(n10);
    }

    @Override
    @WorkerThread
    public final void a(Intent intent, int n10, int n13) {
        ((w1)this.c).a.stopSelfResult(n13);
    }

    @WorkerThread
    public final void a(Bundle bundle) {
        bundle.setClassLoader(CounterConfiguration.class.getClassLoader());
        o6.b(bundle);
        oh oh3 = this.f;
        if (oh3 != null) {
            oh3.a(o6.b(bundle), bundle);
        }
    }

    @Override
    public final void a(@NonNull y1 y14) {
        this.c = y14;
    }

    @Override
    @WorkerThread
    public final void b(Intent object) {
        this.e.d((Intent)object);
        if (object != null) {
            String string2 = object.getAction();
            Uri uri = object.getData();
            object = uri == null ? null : uri.getEncodedAuthority();
            if ("io.appmetrica.analytics.IAppMetricaService".equals(string2) && object != null && uri != null && Objects.equals(uri.getPath(), "/client")) {
                int n10 = Integer.parseInt(uri.getQueryParameter("pid"));
                string2 = uri.getQueryParameter("psid");
                this.d.a((String)object, n10, string2);
                this.h.a(n10);
            }
        }
    }

    @Override
    @WorkerThread
    public final void c(Intent intent) {
        S1 object3 = this.e;
        if (intent != null) {
            object3.getClass();
            Object object = intent.getAction();
            if (!TextUtils.isEmpty((CharSequence)object)) {
                object3.a.a(object, S1.a(intent));
            }
            for (Map.Entry entry : object3.b.entrySet()) {
                object = (R1)entry.getKey();
                if (!((Q1)entry.getValue()).a(intent)) continue;
                object.a(intent);
            }
        } else {
            object3.getClass();
        }
    }

    public final void d(Intent intent) {
        Na.F.u().a(Gb.e(intent.getStringExtra("screen_size")));
    }

    @Override
    @WorkerThread
    public final void onConfigurationChanged(@NonNull Configuration configuration) {
        Na.F.u().a(configuration);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    @WorkerThread
    public final void onCreate() {
        if (!this.a) {
            Object object;
            Object object2;
            Object object3;
            this.g.b(this.b);
            Object object4 = Na.F;
            synchronized (object4) {
                ((Na)object4).B.initAsync();
                ((Na)object4).u.a(((Na)object4).a);
                object3 = ((Na)object4).u;
                object2 = new po(((Na)object4).B);
                ((qm)object3).a((tm)object2);
                object2 = new Li(((Na)object4).g());
                object3 = new N5(((Na)object4).a);
                object = new D5(new IExecutionPolicy[]{object2, object3});
                NetworkServiceLocator.init((IExecutionPolicy)object);
                ((Na)object4).k().a(((Na)object4).q);
                ((Na)object4).C();
            }
            pk.a.e();
            object4 = Na.F.u;
            ((qm)object4).b();
            object2 = ((qm)object4).b();
            object3 = Na.F.o();
            ((Hk)object3).a(new tk(new Ad(this.e)), (om)object2);
            ((qm)object4).a((tm)object3);
            ((Jl)Na.F.y()).getClass();
            this.a();
            Na.F.l().init();
            Na.F.b().init();
            object3 = this.i;
            object2 = this.b;
            object4 = this.d;
            object3.getClass();
            this.f = new oh((Context)object2, (z4)object4);
            object4 = this.b;
            s1.a.b((Context)object4);
            AppMetrica.getReporter((Context)object4, "20799a27-fa80-4b36-b2db-0f8141f24180");
            object2 = this.b;
            object3 = this.f;
            object = Na.j().q();
            object4 = Na.j().w().e();
            Iterator iterator = new F6((Context)object2, (C6)object3, Bb.s, new W(), new BlockingExecutor(), "previous");
            Object object5 = new F6((Context)object2, (C6)object3, Bb.r, new Mb(), (Executor)object4, "actual");
            File file = FileUtils.getCrashesDirectory((Context)object2);
            if (file != null) {
                object5 = new D6(file, (F6)object5, new Aa());
                object4.execute(new qg(file, (F6)((Object)iterator)));
                if (file.exists()) {
                    if (!file.isDirectory() && file.delete()) {
                        file.mkdir();
                    }
                } else {
                    file.mkdir();
                }
                object5.startWatching();
                Na.F.E.storeReference(object5);
            }
            object.getClass();
            object4 = FileUtils.getNativeCrashDirectory((Context)object2);
            object4 = object4 != null ? ((File)object4).getAbsolutePath() : null;
            if (object4 != null) {
                ((je)object).a.init((Context)object2, new NativeCrashServiceConfig((String)object4));
                iterator = ((je)object).a.getAllCrashes();
                if (iterator.isEmpty() ^ true) {
                    object4 = ((je)object).b.b((Context)object2, (oh)object3);
                    iterator = iterator.iterator();
                    while (iterator.hasNext()) {
                        ((ee)object4).newCrash((NativeCrash)iterator.next());
                    }
                }
                ((je)object).a.setDefaultCrashHandler(((je)object).b.a((Context)object2, (oh)object3));
            }
            new h6(t.e((Object)new uh())).run();
            this.a = true;
        } else {
            Configuration configuration = this.b.getResources().getConfiguration();
            Na.F.u().a(configuration);
        }
        Na.F.k().a();
    }

    @Override
    @MainThread
    public final void onDestroy() {
        fc fc3 = Na.F.k();
        synchronized (fc3) {
            Throwable throwable2;
            block4: {
                try {
                    Iterator iterator = fc3.c.iterator();
                    while (iterator.hasNext()) {
                        ((Bk)iterator.next()).onDestroy();
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                return;
            }
            throw throwable2;
        }
    }

    @Override
    @WorkerThread
    public final void pauseUserSession(@NonNull Bundle object) {
        object.setClassLoader(Vf.class.getClassLoader());
        String string2 = Vf.c;
        string2 = null;
        try {
            object = (Vf)object.getParcelable("PROCESS_CFG_OBJ");
        }
        catch (Throwable throwable) {
            object = null;
        }
        object = object == null ? string2 : ((Vf)object).a.getAsInteger("PROCESS_CFG_PROCESS_ID");
        if (object != null) {
            this.h.b((Integer)object);
        }
    }

    @Override
    @WorkerThread
    public final void reportData(int n10, Bundle bundle) {
        this.j.getClass();
        List list = (List)Na.F.v.a.get(n10);
        Object object = list;
        if (list == null) {
            object = t.m();
        }
        if (!object.isEmpty()) {
            object = object.iterator();
            while (object.hasNext()) {
                ((uk)object.next()).reportData(n10, bundle);
            }
        }
    }

    @Override
    @WorkerThread
    public final void resumeUserSession(@NonNull Bundle object) {
        object.setClassLoader(Vf.class.getClassLoader());
        String string2 = Vf.c;
        string2 = null;
        try {
            object = (Vf)object.getParcelable("PROCESS_CFG_OBJ");
        }
        catch (Throwable throwable) {
            object = null;
        }
        object = object == null ? string2 : ((Vf)object).a.getAsInteger("PROCESS_CFG_PROCESS_ID");
        if (object != null) {
            this.h.c((Integer)object);
        }
    }
}

