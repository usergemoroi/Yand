/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.Db;
import io.appmetrica.analytics.impl.Q2;
import io.appmetrica.analytics.impl.ja;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

public final class Eb
extends Q2 {
    @NotNull
    public static final Db b = new Db();

    public Eb(@NotNull ja ja4, @NotNull JSONObject jSONObject) {
        super(Db.a(b, ja4, jSONObject));
    }
}

