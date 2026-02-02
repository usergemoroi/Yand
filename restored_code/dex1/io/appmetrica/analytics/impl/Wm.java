/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import io.appmetrica.analytics.impl.A2;
import io.appmetrica.analytics.impl.Cj;
import io.appmetrica.analytics.impl.D2;
import io.appmetrica.analytics.impl.Y8;
import io.appmetrica.analytics.impl.an;
import io.appmetrica.analytics.impl.ig;
import io.appmetrica.analytics.impl.j3;
import io.appmetrica.analytics.impl.s3;
import io.appmetrica.analytics.impl.y7;

public final class Wm
extends an {
    public final ProtobufStateStorage a(Context object, IBinaryDataHelper iBinaryDataHelper) {
        byte[] byArray;
        D2 d24 = new D2();
        try {
            byArray = Cj.a(object.getPackageName());
        }
        catch (Throwable throwable) {
            byArray = new byte[16];
        }
        try {
            StringBuilder stringBuilder = new StringBuilder(object.getPackageName());
            object = Cj.a(stringBuilder.reverse().toString());
        }
        catch (Throwable throwable) {
            object = new byte[16];
        }
        return new ig("auto_inapp_collecting_info_data", iBinaryDataHelper, new Y8(d24, new AESEncrypter("AES/CBC/PKCS5Padding", byArray, (byte[])object)), new A2(new j3()));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final IBinaryDataHelper c(Context object) {
        object = y7.a((Context)object);
        synchronized (object) {
            try {
                s3 s33;
                if (((y7)object).k != null) return ((y7)object).k;
                ((y7)object).k = s33 = new s3(((y7)object).e());
                return ((y7)object).k;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    @Override
    public final IBinaryDataHelper d(Context object) {
        object = y7.a((Context)object);
        synchronized (object) {
            IBinaryDataHelper iBinaryDataHelper = ((y7)object).e();
            return iBinaryDataHelper;
        }
    }
}

