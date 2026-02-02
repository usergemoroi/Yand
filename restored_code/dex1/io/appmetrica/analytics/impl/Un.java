/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseArray
 */
package io.appmetrica.analytics.impl;

import android.util.SparseArray;

public abstract class Un {
    public static final SparseArray a;

    static {
        SparseArray sparseArray;
        a = sparseArray = new SparseArray();
        sparseArray.put(0, (Object)"String");
        sparseArray.put(1, (Object)"Number");
        sparseArray.put(2, (Object)"Counter");
    }
}

