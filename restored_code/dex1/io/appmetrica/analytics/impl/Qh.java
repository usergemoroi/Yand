/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 *  android.database.Cursor
 *  android.database.DatabaseUtils
 *  android.database.sqlite.SQLiteDatabase
 *  android.text.TextUtils
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  org.json.JSONObject
 */
package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.db.DBUtils;
import io.appmetrica.analytics.coreutils.internal.io.GZIPCompressor;
import io.appmetrica.analytics.impl.B9;
import io.appmetrica.analytics.impl.Do;
import io.appmetrica.analytics.impl.E9;
import io.appmetrica.analytics.impl.F7;
import io.appmetrica.analytics.impl.F9;
import io.appmetrica.analytics.impl.Fb;
import io.appmetrica.analytics.impl.G9;
import io.appmetrica.analytics.impl.Gh;
import io.appmetrica.analytics.impl.I5;
import io.appmetrica.analytics.impl.J9;
import io.appmetrica.analytics.impl.Jl;
import io.appmetrica.analytics.impl.L7;
import io.appmetrica.analytics.impl.Na;
import io.appmetrica.analytics.impl.Nh;
import io.appmetrica.analytics.impl.Oh;
import io.appmetrica.analytics.impl.Ph;
import io.appmetrica.analytics.impl.R7;
import io.appmetrica.analytics.impl.S7;
import io.appmetrica.analytics.impl.T5;
import io.appmetrica.analytics.impl.T7;
import io.appmetrica.analytics.impl.V5;
import io.appmetrica.analytics.impl.Yb;
import io.appmetrica.analytics.impl.fl;
import io.appmetrica.analytics.impl.h0;
import io.appmetrica.analytics.impl.k7;
import io.appmetrica.analytics.impl.lg;
import io.appmetrica.analytics.impl.lk;
import io.appmetrica.analytics.impl.mg;
import io.appmetrica.analytics.impl.rb;
import io.appmetrica.analytics.impl.ro;
import io.appmetrica.analytics.impl.un;
import io.appmetrica.analytics.impl.v1;
import io.appmetrica.analytics.impl.v5;
import io.appmetrica.analytics.impl.vh;
import io.appmetrica.analytics.impl.y3;
import io.appmetrica.analytics.impl.y9;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import io.appmetrica.analytics.networktasks.internal.DefaultNetworkResponseHandler;
import io.appmetrica.analytics.networktasks.internal.FullUrlFormer;
import io.appmetrica.analytics.networktasks.internal.RequestBodyEncrypter;
import io.appmetrica.analytics.networktasks.internal.RequestDataHolder;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import io.appmetrica.analytics.networktasks.internal.SendingDataTaskHelper;
import io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;
import org.json.JSONObject;

public final class Qh
implements UnderlyingNetworkTask {
    public final v5 a;
    public final LinkedHashMap b = new LinkedHashMap();
    public L7 c;
    public J9 d;
    public final k7 e;
    public List f;
    public int g = 0;
    public int h = 0;
    public int i = -1;
    public Ph j;
    public final y3 k;
    public final PublicLogger l;
    public final Do m;
    public final rb n;
    public final vh o;
    public final FullUrlFormer p;
    public final Yb q;
    public final RequestDataHolder r;
    public final ResponseDataHolder s;
    public final SendingDataTaskHelper t;
    public int u;
    public boolean v = false;

    public Qh(v5 v54, vh vh3, Yb yb3, FullUrlFormer fullUrlFormer, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, k7 k74, PublicLogger publicLogger, Do do_, RequestBodyEncrypter requestBodyEncrypter) {
        this(v54, publicLogger, k74, vh3, do_, yb3, new y3(1024000, "event value in ReportTask", publicLogger), v1.a(), fullUrlFormer, requestDataHolder, responseDataHolder, requestBodyEncrypter);
    }

    public Qh(@NonNull v5 v54, @NonNull vh vh3, @NonNull Yb yb3, @NonNull FullUrlFormer<Gh> fullUrlFormer, @NonNull RequestDataHolder requestDataHolder, @NonNull ResponseDataHolder responseDataHolder, @NonNull RequestBodyEncrypter requestBodyEncrypter) {
        this(v54, vh3, yb3, fullUrlFormer, requestDataHolder, responseDataHolder, v54.i(), v54.p(), v54.u(), requestBodyEncrypter);
    }

    public Qh(v5 v54, PublicLogger publicLogger, k7 k74, vh vh3, Do do_, Yb yb3, y3 y34, lk lk3, FullUrlFormer fullUrlFormer, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, RequestBodyEncrypter requestBodyEncrypter) {
        this.t = new SendingDataTaskHelper(requestBodyEncrypter, new GZIPCompressor(), requestDataHolder, responseDataHolder, new DefaultNetworkResponseHandler());
        this.o = vh3;
        this.a = v54;
        this.e = k74;
        this.l = publicLogger;
        this.k = y34;
        this.m = do_;
        this.q = yb3;
        this.n = lk3;
        this.r = requestDataHolder;
        this.s = responseDataHolder;
        this.p = fullUrlFormer;
    }

    public static h0 a(ContentValues object) {
        object = new F7(null, 1, null).a((ContentValues)object);
        return new h0(WrapUtils.getOrDefault(object.g.g, ""), WrapUtils.getOrDefault(object.g.h, 0L));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static y9[] a(JSONObject jSONObject) {
        int n10 = jSONObject.length();
        if (n10 <= 0) {
            return null;
        }
        y9[] y9Array = new y9[n10];
        Iterator iterator = jSONObject.keys();
        n10 = 0;
        while (iterator.hasNext()) {
            String string2 = (String)iterator.next();
            try {
                y9 y94 = new y9();
                y94.a = string2;
                y94.b = jSONObject.getString(string2);
                y9Array[n10] = y94;
            }
            catch (Throwable throwable) {}
            ++n10;
        }
        return y9Array;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Cursor a() {
        SQLiteDatabase sQLiteDatabase;
        k7 k74;
        block2: {
            k74 = this.e;
            LinkedHashMap linkedHashMap = this.b;
            k74.a.lock();
            try {
                sQLiteDatabase = k74.c.getReadableDatabase();
                if (sQLiteDatabase == null) break block2;
                sQLiteDatabase = sQLiteDatabase.query("sessions", null, k7.a(linkedHashMap), k7.a(new String[]{Long.toString(0L)}, linkedHashMap), null, null, "id ASC", null);
            }
            catch (Throwable throwable) {}
        }
        sQLiteDatabase = null;
        k74.a.unlock();
        return sQLiteDatabase;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Cursor a(long l10, fl fl3) {
        k7 k74;
        block2: {
            k74 = this.e;
            k74.a.lock();
            try {
                SQLiteDatabase sQLiteDatabase = k74.c.getReadableDatabase();
                if (sQLiteDatabase == null) break block2;
                fl3 = sQLiteDatabase.query("events", null, "session_id = ? AND session_type = ?", new String[]{Long.toString(l10), Integer.toString(fl3.a)}, null, null, "number_in_session ASC", null);
            }
            catch (Throwable throwable) {}
        }
        fl3 = null;
        k74.a.unlock();
        return fl3;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final J9 a(Ph object, List stringArray, Gh gh3) {
        String[] stringArray2;
        void var3_3;
        J9 j94 = new J9();
        Object object2 = new B9();
        ((B9)object2).a = WrapUtils.getOrDefaultIfEmpty(this.c.b, var3_3.getUuid());
        ((B9)object2).b = WrapUtils.getOrDefaultIfEmpty(this.c.a, var3_3.getDeviceId());
        int n10 = this.g;
        this.g = CodedOutputByteBufferNano.computeMessageSize(4, (MessageNano)object2) + n10;
        j94.b = object2;
        object2 = Na.F.A();
        Nh nh3 = new Nh(this, j94);
        synchronized (object2) {
            ((un)object2).a.a(nh3);
        }
        object2 = ((Ph)object).a;
        n10 = 0;
        j94.a = object2.toArray(new G9[0]);
        j94.c = Qh.a(((Ph)object).c);
        j94.e = stringArray2.toArray(new String[0]);
        object = var3_3.x;
        stringArray2 = object.toArray(new String[0]);
        j94.f = new byte[stringArray2.length][];
        while (n10 < object.size()) {
            j94.f[n10] = StringUtils.getUTF8Bytes(stringArray2[n10]);
            ++n10;
        }
        return j94;
    }

    /*
     * Exception decompiling
     */
    public final Oh a(long var1_1, F9 var3_2, Gh var4_4, ArrayList var5_9, int var6_10) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 6[TRYBLOCK] [6 : 181->186)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @NonNull
    public final Ph a(@NonNull Gh object) {
        Object object2;
        ArrayList<JSONObject> arrayList;
        Object object3;
        ArrayList<Object> arrayList2;
        ArrayList<G9> arrayList3;
        block23: {
            block21: {
                Cursor cursor;
                Object object4;
                block20: {
                    Object object5;
                    arrayList3 = new ArrayList<G9>();
                    arrayList2 = new ArrayList<Object>();
                    object3 = new JSONObject();
                    arrayList = new ArrayList<JSONObject>();
                    object4 = null;
                    try {
                        cursor = this.a();
                        object2 = object3;
                        if (cursor == null) break block20;
                        object5 = null;
                    }
                    catch (Throwable throwable) {
                        object = object4;
                        break block21;
                    }
                    while (true) {
                        boolean bl2;
                        Object object6;
                        Object object7;
                        block22: {
                            int n10;
                            object4 = object3;
                            object2 = object3;
                            if (!cursor.moveToNext()) break;
                            object4 = object3;
                            object2 = object3;
                            if (this.h >= 100) break;
                            object4 = object3;
                            object4 = object3;
                            object2 = new ContentValues();
                            object4 = object3;
                            DBUtils.cursorRowToContentValues(cursor, (ContentValues)object2);
                            object4 = object3;
                            object4 = object3;
                            object7 = new T7(null, 1, null);
                            object4 = object3;
                            object7 = ((T7)object7).a((ContentValues)object2);
                            object4 = object3;
                            object2 = ((S7)object7).a;
                            if (object2 == null) continue;
                            object4 = object3;
                            object6 = ((S7)object7).d;
                            object4 = object3;
                            object6 = lg.a(((R7)object6).a, ((R7)object6).b, ((R7)object6).c);
                            object4 = object3;
                            String string2 = ((BaseRequestConfig)object).getLocale();
                            object4 = object3;
                            fl fl3 = ((S7)object7).b;
                            object4 = object3;
                            object4 = object3;
                            object7 = new F9();
                            object4 = object3;
                            ((F9)object7).a = object6;
                            object4 = object3;
                            ((F9)object7).b = string2;
                            if (fl3 != null) {
                                object4 = object3;
                                object6 = (Integer)lg.a.get((Object)fl3);
                                if (object6 != null) {
                                    object4 = object3;
                                    n10 = (Integer)object6;
                                } else {
                                    n10 = 0;
                                }
                                object4 = object3;
                                ((F9)object7).c = n10;
                            }
                            object4 = object3;
                            n10 = this.g + CodedOutputByteBufferNano.computeUInt64Size(1, Long.MAX_VALUE);
                            object4 = object3;
                            this.g = n10;
                            object4 = object3;
                            object4 = object3;
                            this.g = n10 += CodedOutputByteBufferNano.computeMessageSize(2, (MessageNano)object7);
                            if (n10 >= 250880) {
                                object2 = object3;
                                break;
                            }
                            object4 = object3;
                            object6 = this.a((Long)object2, (F9)object7, (Gh)object, arrayList, arrayList3.size());
                            if (object6 == null) continue;
                            if (object5 == null) {
                                object4 = object3;
                                object7 = ((Oh)object6).b;
                            } else {
                                object4 = object3;
                                object7 = object5;
                                if (!((h0)object5).equals(((Oh)object6).b)) {
                                    object2 = object3;
                                    break;
                                }
                            }
                            object4 = object3;
                            arrayList2.add(object2);
                            object4 = object3;
                            arrayList3.add(((Oh)object6).a);
                            object4 = object3;
                            bl2 = TextUtils.isEmpty((CharSequence)((Oh)object6).b.a);
                            object2 = object3;
                            if (bl2) break block22;
                            try {
                                object2 = new JSONObject(((Oh)object6).b.a);
                            }
                            catch (Throwable throwable) {
                                object2 = object3;
                            }
                        }
                        object4 = object2;
                        bl2 = ((Oh)object6).c;
                        object5 = object7;
                        object3 = object2;
                        if (bl2) break;
                        continue;
                        break;
                    }
                }
                ro.a(cursor);
                object3 = object2;
                break block23;
                catch (Throwable throwable) {
                    object = cursor;
                    object3 = object4;
                }
            }
            arrayList.add((JSONObject)object2);
        }
        object = arrayList.iterator();
        while (true) {
            if (!object.hasNext()) {
                return new Ph(arrayList3, arrayList2, (JSONObject)object3);
            }
            object2 = (Throwable)object.next();
            this.n.reportError("protobuf_serialization_error", (Throwable)object2);
        }
        finally {
            ro.a((Cursor)object);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void a(boolean var1_1) {
        block13: {
            var6_2 /* !! */  = this.m;
            var2_4 = this.u;
            synchronized (var6_2 /* !! */ ) {
                var7_5 /* !! */  = var6_2 /* !! */ .a;
                var7_5 /* !! */ .a(var7_5 /* !! */ .a().put("report_request_id", var2_4));
                // MONITOREXIT @DISABLED, blocks:[0, 5] lbl7 : MonitorExitStatement: MONITOREXIT : var6_2 /* !! */ 
                var8_8 = this.d.a;
            }
            block9: for (var2_4 = 0; var2_4 < var8_8.length; ++var2_4) {
                var9_11 = var8_8[var2_4];
                var4_10 = (Long)this.f.get(var2_4);
                var3_9 = var9_11.b.c;
                var7_5 /* !! */  = (fl)lg.b.get(var3_9);
                var6_2 /* !! */  = var7_5 /* !! */ ;
                if (var7_5 /* !! */  != null) ** GOTO lbl19
                var6_2 /* !! */  = fl.b;
lbl19:
                // 2 sources

                this.e.a(var4_10, var6_2 /* !! */ .a, var9_11.c.length, var1_1);
                lg.a(var9_11);
lbl21:
                // 2 sources

                continue block9;
            }
            var6_2 /* !! */  = this.e;
            var4_10 = this.a.j.a();
            var6_2 /* !! */ .b.lock();
            try {
                if (V5.a.booleanValue()) {
                    var6_2 /* !! */ .d();
                }
                if ((var7_5 /* !! */  = var6_2 /* !! */ .c.getWritableDatabase()) == null) break block13;
            }
            catch (Throwable var7_7) {
                ** continue;
            }
            var7_5 /* !! */ .delete("sessions", T5.c, new String[]{String.valueOf(var4_10)});
        }
lbl36:
        // 2 sources

        while (true) {
            var6_2 /* !! */ .b.unlock();
            return;
        }
        {
            catch (Throwable var7_6) {
                throw var7_6;
            }
        }
        catch (Throwable var6_3) {
            ** continue;
        }
    }

    @Override
    @NonNull
    public final String description() {
        StringBuilder stringBuilder = new StringBuilder("ReportTask_");
        stringBuilder.append(ApiKeyUtils.createPartialApiKey(this.a.b.b));
        return stringBuilder.toString();
    }

    @Override
    @NonNull
    public final FullUrlFormer<?> getFullUrlFormer() {
        return this.p;
    }

    @Override
    @NonNull
    public final RequestDataHolder getRequestDataHolder() {
        return this.r;
    }

    @Override
    @NonNull
    public final ResponseDataHolder getResponseDataHolder() {
        return this.s;
    }

    @Override
    @Nullable
    public final RetryPolicyConfig getRetryPolicyConfig() {
        return ((Gh)this.a.k.a()).getRetryPolicyConfig();
    }

    @Override
    @Nullable
    public final SSLSocketFactory getSslSocketFactory() {
        ((Jl)Na.F.y()).getClass();
        return null;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final boolean onCreateTask() {
        block24: {
            block23: {
                block22: {
                    var5_1 = this.a.e;
                    var5_1.getClass();
                    var4_2 = new ArrayList<SQLiteDatabase>();
                    var5_1.a.lock();
                    try {
                        var2_3 /* !! */  = var5_1.c.getReadableDatabase();
                        if (var2_3 /* !! */  == null) break block22;
                        var2_3 /* !! */  = var2_3 /* !! */ .rawQuery(T5.b, null);
                    }
                    catch (Throwable var2_4) {
                        var2_3 /* !! */  = null;
lbl13:
                        // 2 sources

                        while (true) {
                            try {
                                var3_6 = new ArrayList();
                                var2_3 /* !! */  = var3_6;
                                break block23;
                            }
                            finally {
                                ro.a((Cursor)var2_3 /* !! */ );
                                var5_1.a.unlock();
                            }
                            break;
                        }
                    }
                    while (true) {
                        var3_6 = var2_3 /* !! */ ;
                        if (var2_3 /* !! */ .moveToNext()) {
                            var3_6 = new ContentValues();
                            DatabaseUtils.cursorRowToContentValues((Cursor)var2_3 /* !! */ , (ContentValues)var3_6);
                            var4_2.add(var3_6);
                            continue;
                        }
                        break;
                    }
                }
                var3_6 = null;
                break block24;
            }
lbl36:
            // 2 sources

            while (true) {
                if (var2_3 /* !! */ .isEmpty()) {
                    return false;
                }
                var3_6 = (ContentValues)var2_3 /* !! */ .get(0);
                this.b.clear();
                var4_2 = var3_6.valueSet().iterator();
                while (var4_2.hasNext()) {
                    var2_3 /* !! */  = (Map.Entry)var4_2.next();
                    this.b.put((String)var2_3 /* !! */ .getKey(), var2_3 /* !! */ .getValue().toString());
                }
                if (!TextUtils.isEmpty((CharSequence)(var3_6 = var3_6.getAsString("report_request_parameters")))) {
                    try {
                        var2_3 /* !! */  = new Fb((String)var3_6);
                        var3_6 = new L7((Fb)var2_3 /* !! */ );
                        this.c = var3_6;
                        this.o.c = var3_6;
                    }
                    catch (Throwable var2_5) {
                        var2_3 /* !! */  = new L7();
                        this.c = var2_3 /* !! */ ;
                        this.o.c = var2_3 /* !! */ ;
                    }
                } else {
                    var2_3 /* !! */  = new L7();
                    this.c = var2_3 /* !! */ ;
                    this.o.c = var2_3 /* !! */ ;
                }
                var3_6 = this.q.a();
                var2_3 /* !! */  = var3_6.w;
                if (ro.a((Collection)var2_3 /* !! */ )) {
                    return false;
                }
                this.p.setHosts(var3_6.q);
                if (var3_6.u() && !ro.a(this.p.getAllHosts())) {
                    this.f = null;
                    this.j = var4_2 = this.a((Gh)var3_6);
                    if (var4_2.a.isEmpty()) {
                        return false;
                    }
                    var4_2 = this.m;
                    synchronized (var4_2) {
                        var1_9 = var4_2.a.a().optInt("report_request_id", -1);
                    }
                    this.u = ++var1_9;
                    this.o.e = var1_9;
                    var2_3 /* !! */  = this.a(this.j, (List)var2_3 /* !! */ , (Gh)var3_6);
                    this.d = var2_3 /* !! */ ;
                    this.f = this.j.b;
                    this.t.prepareAndSetPostData(MessageNano.toByteArray((MessageNano)var2_3 /* !! */ ));
                    return true;
                }
                this.v = true;
                return false;
            }
            catch (Throwable var3_7) {
                ** continue;
            }
        }
        ro.a(var3_6);
        var5_1.a.unlock();
        var2_3 /* !! */  = var4_2;
        ** while (true)
    }

    @Override
    public final void onPerformRequest() {
        this.t.onPerformRequest();
    }

    @Override
    public final void onPostRequestComplete(boolean bl2) {
        if (bl2) {
            this.a(false);
        } else if (this.s.getResponseCode() == 400) {
            this.a(true);
        }
        if (bl2) {
            for (int i14 = 0; i14 < this.j.a.size(); ++i14) {
                for (E9 e94 : ((G9)this.j.a.get((int)i14)).c) {
                    String string2;
                    if (e94 == null || (string2 = mg.a(e94)) == null) continue;
                    this.l.info(string2, new Object[0]);
                }
            }
        }
    }

    @Override
    public final boolean onRequestComplete() {
        return this.t.isResponseValid();
    }

    @Override
    public final void onRequestError(@Nullable Throwable throwable) {
    }

    @Override
    public final void onShouldNotExecute() {
        this.v = true;
        this.a.e.a();
    }

    @Override
    public final void onSuccessfulTaskFinished() {
        this.v = true;
    }

    @Override
    public final void onTaskAdded() {
        ((I5)this.a.p).d.set(false);
    }

    @Override
    public final void onTaskFinished() {
        this.a.e.a();
    }

    @Override
    public final void onTaskRemoved() {
        ((I5)this.a.p).d.set(true);
        if (this.v) {
            ((I5)this.a.p).f();
        }
    }

    @Override
    public final void onUnsuccessfulTaskFinished() {
    }
}

