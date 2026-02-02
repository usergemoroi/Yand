/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import kotlin.jvm.internal.y;
import kotlin.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class Ge
implements Converter {
    @Nullable
    public final Boolean a(int n10) {
        Boolean bl2;
        block2: {
            block0: {
                block1: {
                    if (n10 == -1) break block0;
                    if (n10 == 0) break block1;
                    if (n10 != 1) break block0;
                    bl2 = Boolean.TRUE;
                    break block2;
                }
                bl2 = Boolean.FALSE;
                break block2;
            }
            bl2 = null;
        }
        return bl2;
    }

    @NotNull
    public final Integer a(@Nullable Boolean bl2) {
        block5: {
            int n10;
            block3: {
                block4: {
                    block2: {
                        if (bl2 != null) break block2;
                        n10 = -1;
                        break block3;
                    }
                    if (!y.e(bl2, Boolean.TRUE)) break block4;
                    n10 = 1;
                    break block3;
                }
                if (!y.e(bl2, Boolean.FALSE)) break block5;
                n10 = 0;
            }
            return n10;
        }
        throw new r();
    }
}

