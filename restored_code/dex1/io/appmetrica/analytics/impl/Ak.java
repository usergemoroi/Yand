/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 */
package io.appmetrica.analytics.impl;

import android.os.Handler;
import android.os.Looper;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.impl.Cb;
import io.appmetrica.analytics.impl.Z9;
import io.appmetrica.analytics.impl.yk;
import io.appmetrica.analytics.impl.zk;
import java.util.HashMap;
import java.util.concurrent.Executor;

public final class Ak {
    public final zk a;
    public volatile Z9 b;
    public volatile Z9 c;
    public volatile Z9 d;
    public volatile Z9 e;
    public volatile Z9 f;
    public volatile Z9 g;
    public volatile yk h;

    public Ak() {
        this(new zk());
    }

    public Ak(zk zk2) {
        new HashMap();
        this.a = zk2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final IHandlerExecutor a() {
        if (this.g != null) return this.g;
        synchronized (this) {
            try {
                Z9 z94;
                if (this.g != null) return this.g;
                this.a.getClass();
                Cb cb2 = Z9.a("IAA-SDE");
                Looper looper = cb2.getLooper();
                Handler handler = new Handler(cb2.getLooper());
                this.g = z94 = new Z9(cb2, looper, handler);
                return this.g;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final IHandlerExecutor b() {
        if (this.b != null) return this.b;
        synchronized (this) {
            try {
                Z9 z94;
                if (this.b != null) return this.b;
                this.a.getClass();
                Cb cb2 = Z9.a("IAA-SC");
                Looper looper = cb2.getLooper();
                Handler handler = new Handler(cb2.getLooper());
                this.b = z94 = new Z9(cb2, looper, handler);
                return this.b;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final IHandlerExecutor c() {
        if (this.d != null) return this.d;
        synchronized (this) {
            try {
                Z9 z94;
                if (this.d != null) return this.d;
                this.a.getClass();
                Cb cb2 = Z9.a("IAA-SMH-1");
                Looper looper = cb2.getLooper();
                Handler handler = new Handler(cb2.getLooper());
                this.d = z94 = new Z9(cb2, looper, handler);
                return this.d;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final IHandlerExecutor d() {
        if (this.e != null) return this.e;
        synchronized (this) {
            try {
                Z9 z94;
                if (this.e != null) return this.e;
                this.a.getClass();
                Cb cb2 = Z9.a("IAA-SNTPE");
                Looper looper = cb2.getLooper();
                Handler handler = new Handler(cb2.getLooper());
                this.e = z94 = new Z9(cb2, looper, handler);
                return this.e;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final IHandlerExecutor e() {
        if (this.c != null) return this.c;
        synchronized (this) {
            try {
                Z9 z94;
                if (this.c != null) return this.c;
                this.a.getClass();
                Cb cb2 = Z9.a("IAA-STE");
                Looper looper = cb2.getLooper();
                Handler handler = new Handler(cb2.getLooper());
                this.c = z94 = new Z9(cb2, looper, handler);
                return this.c;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Executor f() {
        if (this.h != null) return this.h;
        synchronized (this) {
            try {
                yk yk2;
                if (this.h != null) return this.h;
                this.a.getClass();
                Handler handler = new Handler(Looper.getMainLooper());
                this.h = yk2 = new yk(handler);
                return this.h;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

