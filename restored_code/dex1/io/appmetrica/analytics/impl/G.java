/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

public abstract class G {
    public static /* synthetic */ String a(int n10) {
        if (n10 != 1) {
            if (n10 != 2) {
                if (n10 != 3) {
                    if (n10 != 4) {
                        return "null";
                    }
                    return "UNKNOWN";
                }
                return "FORBIDDEN_BY_REMOTE_CONFIG";
            }
            return "FORBIDDEN_BY_CLIENT_CONFIG";
        }
        return "ALLOWED";
    }
}

