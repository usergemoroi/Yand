/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package io.appmetrica.analytics.impl;

import org.json.JSONObject;

public final class Fb
extends JSONObject {
    public Fb() {
    }

    public Fb(String string2) {
        super(string2);
    }

    public final Long a(String string2) {
        long l10;
        try {
            l10 = this.getLong(string2);
        }
        catch (Throwable throwable) {
            return null;
        }
        return l10;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final String b(String string2) {
        if (!this.has(string2)) return "";
        try {
            return this.getString(string2);
        }
        catch (Throwable throwable) {
            return "";
        }
    }
}

