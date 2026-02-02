/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.StateSerializer;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import java.io.IOException;

public class Z8
implements StateSerializer {
    public final StateSerializer a;
    public final AESEncrypter b;

    public Z8(@NonNull StateSerializer<Object> stateSerializer, @NonNull AESEncrypter aESEncrypter) {
        this.a = stateSerializer;
        this.b = aESEncrypter;
    }

    @NonNull
    public final Object defaultValue() {
        return this.a.defaultValue();
    }

    @NonNull
    public final byte[] toByteArray(@NonNull Object object) {
        try {
            object = this.b.encrypt(this.a.toByteArray(object));
            return object;
        }
        catch (Throwable throwable) {
            return new byte[0];
        }
    }

    @NonNull
    public final Object toState(@NonNull byte[] byArray) throws IOException {
        try {
            byArray = this.b.decrypt(byArray);
        }
        catch (Throwable throwable) {
            throw new IOException(throwable);
        }
        return this.a.toState(byArray);
    }
}

