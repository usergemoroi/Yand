/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.net.Uri
 *  android.text.TextUtils
 */
package io.appmetrica.analytics.impl;

import android.content.ContentResolver;
import android.net.Uri;
import android.text.TextUtils;
import io.appmetrica.analytics.impl.Ig;
import io.appmetrica.analytics.impl.Jg;
import io.appmetrica.analytics.impl.Za;
import java.util.concurrent.Callable;

public final class Ya
implements Callable {
    public final Za a;

    public Ya(Za za4) {
        this.a = za4;
    }

    public final Object call() {
        Object object = Uri.parse((String)"content://com.huawei.appmarket.commondata/item/5");
        ContentResolver contentResolver = this.a.a.getContentResolver();
        Za za4 = this.a;
        za4.b = contentResolver.query(object, null, null, new String[]{za4.a.getPackageName()}, null);
        object = this.a.b;
        object = object != null && object.moveToFirst() && !TextUtils.isEmpty((CharSequence)(object = this.a.b.getString(0))) ? new Jg((String)object, this.a.b.getLong(1), this.a.b.getLong(2), Ig.d) : null;
        return object;
    }
}

