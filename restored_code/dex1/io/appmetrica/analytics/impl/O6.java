/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.crypto.CryptoProvider;
import io.appmetrica.analytics.coreapi.internal.crypto.Encrypter;
import io.appmetrica.analytics.coreutils.internal.encryption.AESRSAEncrypter;
import org.jetbrains.annotations.NotNull;

public final class O6
implements CryptoProvider {
    public final AESRSAEncrypter a = new AESRSAEncrypter();

    @Override
    @NotNull
    public final Encrypter getAesRsaEncrypter() {
        return this.a;
    }
}

