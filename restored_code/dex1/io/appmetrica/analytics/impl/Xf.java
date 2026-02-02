/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 */
package io.appmetrica.analytics.impl;

import android.annotation.SuppressLint;
import io.appmetrica.analytics.coreapi.internal.annotations.DoNotInline;
import io.appmetrica.analytics.impl.Wf;
import kotlin.Metadata;
import kotlin.k0;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0003J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0004\u0010\u0005\u00a8\u0006\t"}, d2={"Lio/appmetrica/analytics/impl/Xf;", "Lio/appmetrica/analytics/impl/Wf;", "", "b", "a", "Ljava/lang/String;", "mProcessName", "<init>", "()V", "analytics_binaryProdRelease"}, k=1, mv={1, 6, 0})
@DoNotInline
public final class Xf
implements Wf {
    @Nullable
    private volatile String a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @SuppressLint(value={"PrivateApi"})
    private final String b() {
        Object object;
        try {
            Class<?> clazz = Class.forName("android.app.ActivityThread");
            object = clazz.getMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
            object = clazz.getMethod("getProcessName", new Class[0]).invoke(object, new Object[0]);
            if (object != null) {
                return (String)object;
            }
        }
        catch (Throwable throwable) {
            throw new RuntimeException(throwable);
        }
        object = new NullPointerException("null cannot be cast to non-null type kotlin.String");
        throw object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    @Nullable
    public String a() {
        if (this.a != null) {
            return this.a;
        }
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        if (this.a != null) break block4;
                        this.a = this.b();
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                k0 k02 = k0.a;
                return this.a;
            }
            throw throwable2;
        }
    }
}

