/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.impl.Dh;
import io.appmetrica.analytics.impl.Fh;
import io.appmetrica.analytics.impl.m6;
import io.appmetrica.analytics.impl.ro;
import io.appmetrica.analytics.impl.v5;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class Gh
extends m6 {
    public boolean d;
    public boolean e;
    public int f;
    public int g;
    public boolean h;
    public int i;
    public Boolean j;
    public Dh k;
    public final Fh l;
    public String m;
    public boolean n;
    public boolean o;
    public String p;
    public List q;
    public int r;
    public long s;
    public long t;
    public boolean u;
    public long v;
    public List w;
    public Set x = new HashSet();

    public Gh(v5 v54) {
        this.l = v54;
    }

    public final void a(int n10) {
        this.r = n10;
    }

    public final void a(long l10) {
        this.v = l10;
    }

    public final void a(@Nullable Boolean bl2, @NonNull Dh dh3) {
        this.j = bl2;
        this.k = dh3;
    }

    public final void a(@NonNull List<String> list) {
        this.w = list;
    }

    public final void a(@NonNull Set<String> set) {
        this.x = set;
    }

    public final void a(boolean bl2) {
        this.u = bl2;
    }

    public final void b(int n10) {
        this.g = n10;
    }

    public final void b(long l10) {
        this.s = l10;
    }

    public final void b(List<String> list) {
        this.q = list;
    }

    public final void b(boolean bl2) {
        this.o = bl2;
    }

    public final String c() {
        return this.m;
    }

    public final void c(int n10) {
        this.i = n10;
    }

    public final void c(long l10) {
        this.t = l10;
    }

    public final void c(boolean bl2) {
        this.e = bl2;
    }

    public final int d() {
        return this.r;
    }

    public final void d(int n10) {
        this.f = n10;
    }

    public final void d(boolean bl2) {
        this.d = bl2;
    }

    @NonNull
    public final Set<String> e() {
        return this.x;
    }

    public final void e(boolean bl2) {
        this.h = bl2;
    }

    @Nullable
    public final List<String> f() {
        return this.w;
    }

    public final void f(boolean bl2) {
        this.n = bl2;
    }

    public final boolean g() {
        return this.u;
    }

    @NonNull
    public final String h() {
        return WrapUtils.getOrDefault(this.p, "");
    }

    public final boolean i() {
        return this.k.a(this.j);
    }

    public final int j() {
        return this.g;
    }

    public final long k() {
        return this.v;
    }

    public final int l() {
        return this.i;
    }

    public final long m() {
        return this.s;
    }

    public final long n() {
        return this.t;
    }

    public final List<String> o() {
        return this.q;
    }

    public final int p() {
        return this.f;
    }

    public final boolean q() {
        return this.o;
    }

    public final boolean r() {
        return this.e;
    }

    public final boolean s() {
        return this.d;
    }

    public final boolean t() {
        return this.n;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ReportRequestConfig{mLocationTracking=");
        stringBuilder.append(this.d);
        stringBuilder.append(", mFirstActivationAsUpdate=");
        stringBuilder.append(this.e);
        stringBuilder.append(", mSessionTimeout=");
        stringBuilder.append(this.f);
        stringBuilder.append(", mDispatchPeriod=");
        stringBuilder.append(this.g);
        stringBuilder.append(", mLogEnabled=");
        stringBuilder.append(this.h);
        stringBuilder.append(", mMaxReportsCount=");
        stringBuilder.append(this.i);
        stringBuilder.append(", dataSendingEnabledFromArguments=");
        stringBuilder.append(this.j);
        stringBuilder.append(", dataSendingStrategy=");
        stringBuilder.append(this.k);
        stringBuilder.append(", mPreloadInfoSendingStrategy=");
        stringBuilder.append(this.l);
        stringBuilder.append(", mApiKey='");
        stringBuilder.append(this.m);
        stringBuilder.append("', mPermissionsCollectingEnabled=");
        stringBuilder.append(this.n);
        stringBuilder.append(", mFeaturesCollectingEnabled=");
        stringBuilder.append(this.o);
        stringBuilder.append(", mClidsFromStartupResponse='");
        stringBuilder.append(this.p);
        stringBuilder.append("', mReportHosts=");
        stringBuilder.append(this.q);
        stringBuilder.append(", mAttributionId=");
        stringBuilder.append(this.r);
        stringBuilder.append(", mPermissionsCollectingIntervalSeconds=");
        stringBuilder.append(this.s);
        stringBuilder.append(", mPermissionsForceSendIntervalSeconds=");
        stringBuilder.append(this.t);
        stringBuilder.append(", mClidsFromClientMatchClidsFromStartupRequest=");
        stringBuilder.append(this.u);
        stringBuilder.append(", mMaxReportsInDbCount=");
        stringBuilder.append(this.v);
        stringBuilder.append(", mCertificates=");
        stringBuilder.append(this.w);
        stringBuilder.append("} ");
        stringBuilder.append(super.toString());
        return stringBuilder.toString();
    }

    public final boolean u() {
        boolean bl2 = this.isIdentifiersValid() && !ro.a(this.q) && this.u;
        return bl2;
    }

    public final boolean v() {
        return ((v5)this.l).B();
    }
}

