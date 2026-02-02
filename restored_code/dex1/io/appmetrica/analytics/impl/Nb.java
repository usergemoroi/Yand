/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.backport.Function;
import io.appmetrica.analytics.impl.Jb;
import io.appmetrica.analytics.impl.jb;
import java.io.File;

public final class Nb
implements Function,
Consumer {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Nullable
    public final Jb a(@NonNull File object) {
        if (!TextUtils.isEmpty((CharSequence)(object = jb.a((File)object)))) {
            try {
                return new Jb((String)object);
            }
            catch (Throwable throwable) {}
        }
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void b(@NonNull File file) {
        try {
            file.delete();
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }
}

