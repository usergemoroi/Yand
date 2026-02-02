/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.collections.l
 *  kotlin.jvm.functions.l
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;
import io.appmetrica.analytics.impl.C5;
import kotlin.jvm.functions.l;
import org.jetbrains.annotations.NotNull;

public final class D5
implements IExecutionPolicy {
    public final IExecutionPolicy[] a;
    public final String b;

    public D5(IExecutionPolicy ... iExecutionPolicyArray) {
        this.a = iExecutionPolicyArray;
        StringBuilder stringBuilder = new StringBuilder("Composite of {");
        stringBuilder.append(kotlin.collections.l.F0((Object[])iExecutionPolicyArray, (CharSequence)", ", null, null, (int)0, null, (l)C5.a, (int)30, null));
        stringBuilder.append('}');
        this.b = stringBuilder.toString();
    }

    @Override
    public final boolean canBeExecuted() {
        IExecutionPolicy iExecutionPolicy2;
        block3: {
            IExecutionPolicy[] iExecutionPolicyArray = this.a;
            if (iExecutionPolicyArray.length == 0) {
                return false;
            }
            for (IExecutionPolicy iExecutionPolicy2 : iExecutionPolicyArray) {
                if (!(iExecutionPolicy2.canBeExecuted() ^ true)) {
                    continue;
                }
                break block3;
            }
            iExecutionPolicy2 = null;
        }
        return iExecutionPolicy2 == null;
    }

    @Override
    @NotNull
    public final String description() {
        return this.b;
    }
}

