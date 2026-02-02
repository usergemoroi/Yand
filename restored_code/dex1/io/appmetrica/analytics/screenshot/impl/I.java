/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.collections.o0
 *  kotlin.collections.t
 *  kotlin.ranges.j
 *  org.json.JSONObject
 */
package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.coreutils.internal.parsing.RemoteConfigJsonUtils;
import io.appmetrica.analytics.screenshot.impl.G;
import io.appmetrica.analytics.screenshot.impl.K;
import io.appmetrica.analytics.screenshot.impl.L;
import io.appmetrica.analytics.screenshot.impl.M;
import io.appmetrica.analytics.screenshot.impl.N;
import io.appmetrica.analytics.screenshot.impl.U;
import io.appmetrica.analytics.screenshot.impl.V;
import io.appmetrica.analytics.screenshot.impl.n;
import java.util.ArrayList;
import kotlin.collections.o0;
import kotlin.collections.t;
import kotlin.jvm.internal.p;
import kotlin.ranges.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

public final class I
implements JsonParser {
    public final V a;
    public final U b;

    public I() {
        this(null, null, 3, null);
    }

    public I(@NotNull V v14, @NotNull U u11) {
        this.a = v14;
        this.b = u11;
    }

    public /* synthetic */ I(V v14, U u11, int n10, p p14) {
        if ((n10 & 1) != 0) {
            v14 = new V(null, null, null, 7, null);
        }
        if ((n10 & 2) != 0) {
            u11 = new U();
        }
        this(v14, u11);
    }

    @NotNull
    public final G a(@NotNull JSONObject object) {
        boolean bl2 = RemoteConfigJsonUtils.extractFeature((JSONObject)object, "screenshot", n.a);
        V v14 = this.a;
        Object object2 = this.b;
        object2.getClass();
        Object object3 = object.optJSONObject("screenshot");
        if (object3 == null) {
            object = new N();
            ((N)object).a = new K();
            ((N)object).b = new M();
            L l10 = new L();
            l10.c = n.b;
            ((N)object).c = l10;
        } else {
            Comparable<Boolean> comparable;
            Object object4;
            N n10 = new N();
            ((U)object2).a.getClass();
            object = object3.optJSONObject("api_captor_config");
            L l11 = null;
            if (object == null) {
                object = null;
            } else {
                object4 = new K();
                comparable = JsonUtils.optBooleanOrNull((JSONObject)object, "enabled");
                object = object4;
                if (comparable != null) {
                    object4.a = (Boolean)comparable;
                    object = object4;
                }
            }
            if (object != null) {
                n10.a = object;
            }
            ((U)object2).b.getClass();
            comparable = object3.optJSONObject("service_captor_config");
            if (comparable == null) {
                object = null;
            } else {
                object4 = new M();
                object = JsonUtils.optBooleanOrNull((JSONObject)comparable, "enabled");
                if (object != null) {
                    object4.a = (Boolean)object;
                }
                comparable = JsonUtils.optLongOrNull((JSONObject)comparable, "delay_seconds");
                object = object4;
                if (comparable != null) {
                    object4.b = ((Number)((Object)comparable)).longValue();
                    object = object4;
                }
            }
            if (object != null) {
                n10.b = object;
            }
            ((U)object2).c.getClass();
            object = object3.optJSONObject("content_observer_captor_config");
            if (object == null) {
                object = l11;
            } else {
                l11 = new L();
                object4 = JsonUtils.optBooleanOrNull((JSONObject)object, "enabled");
                if (object4 != null) {
                    l11.a = object4.booleanValue();
                }
                if ((object4 = object.optJSONArray("media_store_column_names")) != null) {
                    object3 = j.v((int)0, (int)object4.length());
                    object2 = new ArrayList(t.x((Iterable)object3, (int)10));
                    object3 = object3.iterator();
                    while (object3.hasNext()) {
                        ((ArrayList)object2).add(object4.getString(((o0)object3).nextInt()));
                    }
                    object4 = ((ArrayList)object2).toArray(new String[0]);
                    if (object4 != null) {
                        l11.c = object4;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    }
                }
                object4 = JsonUtils.optLongOrNull((JSONObject)object, "detect_window_seconds");
                object = l11;
                if (object4 != null) {
                    l11.b = object4.longValue();
                    object = l11;
                }
            }
            if (object != null) {
                n10.c = object;
            }
            object = n10;
        }
        return new G(bl2, v14.a((N)object));
    }

    @Nullable
    public final G b(@NotNull JSONObject jSONObject) {
        return (G)JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }

    @Override
    public final Object parseOrNull(Object object) {
        return (G)JsonParser.DefaultImpls.parseOrNull(this, (JSONObject)object);
    }
}

