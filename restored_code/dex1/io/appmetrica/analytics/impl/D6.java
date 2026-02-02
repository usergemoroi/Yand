/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.FileObserver
 *  android.text.TextUtils
 */
package io.appmetrica.analytics.impl;

import android.os.FileObserver;
import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.impl.Aa;
import io.appmetrica.analytics.impl.F6;
import java.io.File;

public final class D6
extends FileObserver {
    public final Consumer a;
    public final File b;
    public final Aa c;

    public D6(File file, F6 f62, Aa aa4) {
        super(file.getAbsolutePath(), 8);
        this.a = f62;
        this.b = file;
        this.c = aa4;
    }

    public final void onEvent(int n10, String string2) {
        if (n10 == 8 && !TextUtils.isEmpty((CharSequence)string2)) {
            Consumer consumer = this.a;
            Aa aa4 = this.c;
            File file = this.b;
            aa4.getClass();
            consumer.consume(new File(file, string2));
        }
    }
}

