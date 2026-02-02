/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
package io.appmetrica.analytics.impl;

import android.app.Activity;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;

public final class Y1
implements FunctionWithThrowable {
    public final Object apply(Object object) {
        return ((Activity)object).getIntent();
    }
}

