/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.location.Location
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.impl;

import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.networktasks.internal.ArgumentsMerger;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public final class M4
implements ArgumentsMerger {
    @Nullable
    public final String a;
    @Nullable
    public final Boolean b;
    @Nullable
    public final Location c;
    @Nullable
    public final Boolean d;
    @Nullable
    public final Integer e;
    @Nullable
    public final Integer f;
    @Nullable
    public final Integer g;
    @Nullable
    public final Boolean h;
    @Nullable
    public final Boolean i;
    @Nullable
    public final Map<String, String> j;
    @Nullable
    public final Integer k;
    @Nullable
    public final Boolean l;
    @Nullable
    public final Boolean m;
    @Nullable
    public final Boolean n;
    @NonNull
    public final Set<String> o;

    public M4() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, new HashSet());
    }

    public M4(@NonNull CounterConfiguration counterConfiguration, @Nullable Map<String, String> map2) {
        this(counterConfiguration.getApiKey(), counterConfiguration.isLocationTrackingEnabled(), counterConfiguration.getManualLocation(), counterConfiguration.isFirstActivationAsUpdate(), counterConfiguration.getSessionTimeout(), counterConfiguration.getMaxReportsCount(), counterConfiguration.getDispatchPeriod(), counterConfiguration.isLogEnabled(), counterConfiguration.getDataSendingEnabled(), map2, counterConfiguration.getMaxReportsInDbCount(), counterConfiguration.getReportNativeCrashesEnabled(), counterConfiguration.isRevenueAutoTrackingEnabled(), counterConfiguration.isAdvIdentifiersTrackingEnabled(), new HashSet<String>(counterConfiguration.getAutoCollectedDataSubscribers()));
    }

    public M4(String string2, Boolean bl2, Location location, Boolean bl3, Integer n10, Integer n13, Integer n14, Boolean bl4, Boolean bl5, Map map2, Integer n15, Boolean bl6, Boolean bl7, Boolean bl8, Set set) {
        this.a = string2;
        this.b = bl2;
        this.c = location;
        this.d = bl3;
        this.e = n10;
        this.f = n13;
        this.g = n14;
        this.h = bl4;
        this.i = bl5;
        this.j = map2;
        this.k = n15;
        this.l = bl6;
        this.m = bl7;
        this.n = bl8;
        this.o = set;
    }

    public final boolean a(@NonNull M4 m44) {
        return this.equals(m44);
    }

    @NonNull
    public final M4 b(@NonNull M4 m44) {
        return new M4(WrapUtils.getOrDefaultNullable(this.a, m44.a), WrapUtils.getOrDefaultNullable(this.b, m44.b), WrapUtils.getOrDefaultNullable(this.c, m44.c), WrapUtils.getOrDefaultNullable(this.d, m44.d), WrapUtils.getOrDefaultNullable(this.e, m44.e), WrapUtils.getOrDefaultNullable(this.f, m44.f), WrapUtils.getOrDefaultNullable(this.g, m44.g), WrapUtils.getOrDefaultNullable(this.h, m44.h), WrapUtils.getOrDefaultNullable(this.i, m44.i), WrapUtils.getOrDefaultNullable(this.j, m44.j), WrapUtils.getOrDefaultNullable(this.k, m44.k), WrapUtils.getOrDefaultNullable(this.l, m44.l), WrapUtils.getOrDefaultNullable(this.m, m44.m), WrapUtils.getOrDefaultNullable(this.n, m44.n), CollectionUtils.merge(this.o, m44.o));
    }

    public final boolean compareWithOtherArguments(@NonNull Object object) {
        return this.equals((M4)object);
    }

    public final boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = bl2 = false;
        if (object != null) {
            if (M4.class != object.getClass()) {
                bl3 = bl2;
            } else {
                object = (M4)object;
                bl3 = bl2;
                if (Objects.equals(this.a, ((M4)object).a)) {
                    bl3 = bl2;
                    if (Objects.equals(this.b, ((M4)object).b)) {
                        bl3 = bl2;
                        if (Objects.equals(this.c, ((M4)object).c)) {
                            bl3 = bl2;
                            if (Objects.equals(this.d, ((M4)object).d)) {
                                bl3 = bl2;
                                if (Objects.equals(this.e, ((M4)object).e)) {
                                    bl3 = bl2;
                                    if (Objects.equals(this.f, ((M4)object).f)) {
                                        bl3 = bl2;
                                        if (Objects.equals(this.g, ((M4)object).g)) {
                                            bl3 = bl2;
                                            if (Objects.equals(this.h, ((M4)object).h)) {
                                                bl3 = bl2;
                                                if (Objects.equals(this.i, ((M4)object).i)) {
                                                    bl3 = bl2;
                                                    if (Objects.equals(this.j, ((M4)object).j)) {
                                                        bl3 = bl2;
                                                        if (Objects.equals(this.k, ((M4)object).k)) {
                                                            bl3 = bl2;
                                                            if (Objects.equals(this.l, ((M4)object).l)) {
                                                                bl3 = bl2;
                                                                if (Objects.equals(this.m, ((M4)object).m)) {
                                                                    bl3 = bl2;
                                                                    if (Objects.equals(this.n, ((M4)object).n)) {
                                                                        bl3 = bl2;
                                                                        if (Objects.equals(this.o, ((M4)object).o)) {
                                                                            bl3 = true;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return bl3;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ReporterArguments{apiKey='");
        stringBuilder.append(this.a);
        stringBuilder.append("', locationTracking=");
        stringBuilder.append(this.b);
        stringBuilder.append(", manualLocation=");
        stringBuilder.append(this.c);
        stringBuilder.append(", firstActivationAsUpdate=");
        stringBuilder.append(this.d);
        stringBuilder.append(", sessionTimeout=");
        stringBuilder.append(this.e);
        stringBuilder.append(", maxReportsCount=");
        stringBuilder.append(this.f);
        stringBuilder.append(", dispatchPeriod=");
        stringBuilder.append(this.g);
        stringBuilder.append(", logEnabled=");
        stringBuilder.append(this.h);
        stringBuilder.append(", dataSendingEnabled=");
        stringBuilder.append(this.i);
        stringBuilder.append(", clidsFromClient=");
        stringBuilder.append(this.j);
        stringBuilder.append(", maxReportsInDbCount=");
        stringBuilder.append(this.k);
        stringBuilder.append(", nativeCrashesEnabled=");
        stringBuilder.append(this.l);
        stringBuilder.append(", revenueAutoTrackingEnabled=");
        stringBuilder.append(this.m);
        stringBuilder.append(", advIdentifiersTrackingEnabled=");
        stringBuilder.append(this.n);
        stringBuilder.append(", autoCollectedDataSubscribers=");
        stringBuilder.append(this.o);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

