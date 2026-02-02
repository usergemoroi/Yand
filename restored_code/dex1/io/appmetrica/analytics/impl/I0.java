/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.impl.A4;
import io.appmetrica.analytics.impl.Jc;
import io.appmetrica.analytics.impl.Kn;
import io.appmetrica.analytics.impl.hp;
import io.appmetrica.analytics.impl.ip;
import io.appmetrica.analytics.impl.jp;
import io.appmetrica.analytics.impl.kf;
import io.appmetrica.analytics.impl.nf;
import io.appmetrica.analytics.impl.te;
import io.appmetrica.analytics.impl.v0;
import io.appmetrica.analytics.impl.w0;
import io.appmetrica.analytics.impl.yo;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import kotlin.jvm.internal.y;

public final class I0 {
    public final IHandlerExecutor a = A4.l().g().a();
    public final w0 b;
    public final kf c;
    public final nf d;

    public I0() {
        w0 w04;
        this.b = w04 = new w0();
        this.c = new kf(w04);
        this.d = new nf();
    }

    public static final void a(I0 object, PluginErrorDetails pluginErrorDetails) {
        ((I0)object).b.getClass();
        object = v0.e;
        y.g(object);
        object = ((v0)object).f().i();
        y.g(object);
        ((Jc)object).a.getPluginExtension().reportUnhandledException(pluginErrorDetails);
    }

    public static final void a(I0 object, PluginErrorDetails pluginErrorDetails, String string2) {
        ((I0)object).b.getClass();
        object = v0.e;
        y.g(object);
        object = ((v0)object).f().i();
        y.g(object);
        ((Jc)object).a.getPluginExtension().reportError(pluginErrorDetails, string2);
    }

    public static final void a(I0 object, String string2, String string3, PluginErrorDetails pluginErrorDetails) {
        ((I0)object).b.getClass();
        object = v0.e;
        y.g(object);
        object = ((v0)object).f().i();
        y.g(object);
        ((Jc)object).a.getPluginExtension().reportError(string2, string3, pluginErrorDetails);
    }

    public final void a(PluginErrorDetails pluginErrorDetails) {
        Object object = this.c;
        ((kf)object).a.a(null);
        ((kf)object).b.a(pluginErrorDetails);
        object = this.d;
        y.g(pluginErrorDetails);
        object.getClass();
        this.a.execute(new jp(this, pluginErrorDetails));
    }

    public final void a(PluginErrorDetails pluginErrorDetails, String string2) {
        kf kf3 = this.c;
        yo yo3 = kf3.a;
        Object object = null;
        ((Kn)yo3).a(null);
        kf3.b.a(pluginErrorDetails);
        yo3 = kf3.d;
        if (pluginErrorDetails != null) {
            object = pluginErrorDetails.getStacktrace();
        }
        if (!((te)yo3).a(object).a) {
            return;
        }
        object = this.d;
        y.g(pluginErrorDetails);
        object.getClass();
        this.a.execute(new ip(this, pluginErrorDetails, string2));
    }

    public final void a(String string2, String string3, PluginErrorDetails pluginErrorDetails) {
        Object object = this.c;
        ((kf)object).a.a(null);
        ((kf)object).c.a(string2);
        object = this.d;
        y.g(string2);
        object.getClass();
        this.a.execute(new hp(this, string2, string3, pluginErrorDetails));
    }
}

