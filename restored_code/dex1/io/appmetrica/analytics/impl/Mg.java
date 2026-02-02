/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.impl.Bg;
import io.appmetrica.analytics.impl.Gg;
import io.appmetrica.analytics.impl.Gl;
import io.appmetrica.analytics.impl.Hg;
import io.appmetrica.analytics.impl.Jg;
import io.appmetrica.analytics.impl.Na;
import java.util.HashSet;

public final class Mg
implements Gg {
    public final HashSet a = new HashSet();
    public boolean b;
    public Jg c;

    public Mg() {
        this(Na.j().t());
    }

    public Mg(Hg hg3) {
        hg3.a(new Gl(this));
        hg3.a();
    }

    public final void a(@NonNull Bg bg3) {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        this.a.add(bg3);
                        if (!this.b) break block3;
                        bg3.a(this.c);
                        this.a.remove(bg3);
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
    public final void a(@Nullable Jg object) {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                if (object != null) {
                    try {
                        LoggerStorage.getMainPublicOrAnonymousLogger().info("Received referrer from source %s: %s", ((Jg)object).d.a, ((Jg)object).a);
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                }
                this.c = object;
                this.b = true;
                object = this.a.iterator();
                while (true) {
                    if (!object.hasNext()) {
                        this.a.clear();
                        return;
                    }
                    ((Bg)object.next()).a(this.c);
                }
            }
            throw throwable2;
        }
    }
}

