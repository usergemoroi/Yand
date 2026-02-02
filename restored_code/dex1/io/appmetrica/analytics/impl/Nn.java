/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.Ml;
import io.appmetrica.analytics.impl.Mn;
import java.util.ArrayList;

public abstract class Nn {
    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static Mn a(Throwable var0, int var1_1, int var2_2) {
        var9_3 = var0.getClass().getName();
        var8_4 = var0.getMessage();
        var4_5 = 0;
        try {
            var6_6 /* !! */  = var0.getStackTrace();
        }
        catch (Throwable var6_7) {
            var6_6 /* !! */  = new StackTraceElement[]{};
        }
        var10_8 = new ArrayList<Ml>(var6_6 /* !! */ .length);
        var5_9 = var6_6 /* !! */ .length;
        for (var3_10 = 0; var3_10 < var5_9; ++var3_10) {
            var10_8.add(new Ml(var6_6 /* !! */ [var3_10]));
        }
        var6_6 /* !! */  = var0.getCause();
        if (var6_6 /* !! */  == null) ** GOTO lbl-1000
        if (var2_2 >= var1_1) {
            var6_6 /* !! */  = null;
        }
        if (var6_6 /* !! */  != null) {
            var6_6 /* !! */  = Nn.a((Throwable)var6_6 /* !! */ , 30, var2_2 + 1);
        } else lbl-1000:
        // 2 sources

        {
            var6_6 /* !! */  = null;
        }
        if (var2_2 < var1_1) {
            var11_11 = var0.getSuppressed();
            var7_12 = new ArrayList<Mn>(var11_11.length);
            var3_10 = var11_11.length;
            var1_1 = var4_5;
            while (true) {
                var0 = var7_12;
                if (var1_1 < var3_10) {
                    var7_12.add(Nn.a(var11_11[var1_1], 1, var2_2));
                    ++var1_1;
                    continue;
                }
                break;
            }
        } else {
            var0 = null;
        }
        return new Mn(var9_3, var8_4, var10_8, (Mn)var6_6 /* !! */ , (ArrayList)var0);
    }
}

