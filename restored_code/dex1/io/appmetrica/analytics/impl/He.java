/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import kotlin.jvm.internal.y;
import kotlin.r;
import org.jetbrains.annotations.Nullable;

public abstract class He {
    public final int a;
    public final int b;
    public final int c;

    public He() {
        this.a = -1;
        this.b = 0;
        this.c = 1;
    }

    public final int a(@Nullable Boolean bl2) {
        block5: {
            int n10;
            block3: {
                block4: {
                    block2: {
                        if (bl2 != null) break block2;
                        n10 = this.a;
                        break block3;
                    }
                    if (!y.e(bl2, Boolean.FALSE)) break block4;
                    n10 = this.b;
                    break block3;
                }
                if (!y.e(bl2, Boolean.TRUE)) break block5;
                n10 = this.c;
            }
            return n10;
        }
        throw new r();
    }

    @Nullable
    public final Boolean a(int n10) {
        Boolean bl2 = n10 == this.b ? Boolean.FALSE : (n10 == this.c ? Boolean.TRUE : null);
        return bl2;
    }
}

