/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 *  android.database.sqlite.SQLiteDatabase
 *  android.text.TextUtils
 */
package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.parsing.ParseUtils;
import io.appmetrica.analytics.impl.Rb;
import io.appmetrica.analytics.impl.Ud;
import io.appmetrica.analytics.impl.X6;
import io.appmetrica.analytics.impl.hb;
import io.appmetrica.analytics.impl.ro;
import java.io.Closeable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public final class Sb
implements hb,
Closeable {
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final String c;
    public final Rb d;
    public volatile boolean e;
    public final X6 f;

    public Sb(X6 object) {
        this.f = object;
        this.c = "preferences";
        this.d = object = new Rb(this, String.format(Locale.US, "IAA-DW-%s", Ud.a()));
        ((Thread)object).start();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(Sb var0) {
        block12: {
            block11: {
                var0.getClass();
                var3_1 = var0.f.a();
                if (var3_1 == null) break block11;
                try {
                    var4_2 = var3_1.query(var0.c, new String[]{"key", "value", "type"}, null, null, null, null, null);
                }
                catch (Throwable var2_5) {}
                try {}
                catch (Throwable var2_7) {}
                ** GOTO lbl-1000
                catch (Throwable var2_6) {
                    var2_4 /* !! */  = null;
                    var3_1 = null;
                }
                break block12;
            }
            var2_4 /* !! */  = null;
            break block12;
lbl-1000:
            // 4 sources

            {
                while (var4_2.moveToNext()) {
                    block16: {
                        block13: {
                            block14: {
                                block15: {
                                    var6_9 = var4_2.getString(var4_2.getColumnIndexOrThrow("key"));
                                    var5_8 = var4_2.getString(var4_2.getColumnIndexOrThrow("value"));
                                    var1_3 = var4_2.getInt(var4_2.getColumnIndexOrThrow("type"));
                                    if (TextUtils.isEmpty((CharSequence)var6_9)) continue;
                                    if (var1_3 == 1) break block13;
                                    if (var1_3 == 2) break block14;
                                    if (var1_3 == 3) break block15;
                                    var2_4 /* !! */  = var5_8;
                                    if (var1_3 == 4) break block16;
                                    if (var1_3 != 5) ** GOTO lbl-1000
                                    var2_4 /* !! */  = ParseUtils.parseFloat(var5_8);
                                    break block16;
                                }
                                var2_4 /* !! */  = ParseUtils.parseLong(var5_8);
                                break block16;
                            }
                            var2_4 /* !! */  = ParseUtils.parseInt(var5_8);
                            break block16;
                        }
                        if ("true".equals(var5_8)) {
                            var2_4 /* !! */  = Boolean.TRUE;
                        } else if ("false".equals(var5_8)) {
                            var2_4 /* !! */  = Boolean.FALSE;
                        } else lbl-1000:
                        // 2 sources

                        {
                            var2_4 /* !! */  = null;
                        }
                    }
                    if (var2_4 /* !! */  == null) continue;
                    var0.a.put(var6_9, var2_4 /* !! */ );
                }
            }
            var2_4 /* !! */  = var4_2;
        }
        ro.a(var2_4 /* !! */ );
        var0.f.a(var3_1);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(Sb sb3, HashMap object) {
        Object object2;
        block29: {
            block28: {
                block27: {
                    block25: {
                        int n10;
                        ContentValues[] contentValuesArray;
                        int n13;
                        block26: {
                            sb3.getClass();
                            n13 = ((HashMap)object).size();
                            contentValuesArray = new ContentValues[n13];
                            object2 = ((HashMap)object).entrySet().iterator();
                            int n14 = 0;
                            n10 = 0;
                            while (object2.hasNext()) {
                                Map.Entry entry = object2.next();
                                ContentValues contentValues = new ContentValues();
                                object = (String)entry.getKey();
                                Object v14 = entry.getValue();
                                contentValues.put("key", (String)object);
                                if (v14 == sb3) {
                                    contentValues.putNull("value");
                                } else if (v14 instanceof String) {
                                    contentValues.put("value", (String)v14);
                                    contentValues.put("type", Integer.valueOf(4));
                                } else if (v14 instanceof Long) {
                                    contentValues.put("value", (Long)v14);
                                    contentValues.put("type", Integer.valueOf(3));
                                } else if (v14 instanceof Integer) {
                                    contentValues.put("value", (Integer)v14);
                                    contentValues.put("type", Integer.valueOf(2));
                                } else if (v14 instanceof Boolean) {
                                    contentValues.put("value", String.valueOf((Boolean)v14));
                                    contentValues.put("type", Integer.valueOf(1));
                                } else if (v14 instanceof Float) {
                                    contentValues.put("value", (Float)v14);
                                    contentValues.put("type", Integer.valueOf(5));
                                }
                                contentValuesArray[n10] = contentValues;
                                ++n10;
                            }
                            object2 = null;
                            object = sb3.f.a();
                            if (object == null) break block25;
                            object.beginTransaction();
                            break block26;
                            catch (Throwable throwable) {
                                object = object2;
                            }
                            break block27;
                        }
                        for (n10 = n14; n10 < n13; ++n10) {
                            object2 = contentValuesArray[n10];
                            if (object2.getAsString("value") == null) {
                                object2 = object2.getAsString("key");
                                object.delete(sb3.c, "key = ?", new String[]{object2});
                                continue;
                            }
                            object.insertWithOnConflict(sb3.c, null, (ContentValues)object2, 5);
                            continue;
                        }
                        try {
                            object.setTransactionSuccessful();
                        }
                        catch (Throwable throwable) {
                            break block27;
                        }
                    }
                    object2 = object;
                    if (object == null) break block29;
                    object.endTransaction();
                }
                if (object == null) break block28;
                try {
                    object.endTransaction();
                }
                catch (Throwable throwable) {}
                finally {
                    object2 = object;
                    break block29;
                }
            }
            object2 = object;
        }
        sb3.f.a((SQLiteDatabase)object2);
    }

    @Override
    public final hb a(int n10, String string2) {
        synchronized (this) {
            this.a(string2, (Object)n10);
            return this;
        }
    }

    @Override
    public final hb a(String string2, float f11) {
        this.a(string2, Float.valueOf(f11));
        return this;
    }

    @Override
    public final hb a(String string2, long l10) {
        this.a(string2, (Object)l10);
        return this;
    }

    @Override
    public final hb a(String string2, String string3) {
        synchronized (this) {
            this.a(string2, (Object)string3);
            return this;
        }
    }

    @Override
    public final hb a(String string2, boolean bl2) {
        this.a(string2, (Object)bl2);
        return this;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final Set a() {
        HashMap hashMap = this.a;
        synchronized (hashMap) {
            return new HashSet(this.a.keySet());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(String string2, Object object) {
        Object object2 = this.a;
        synchronized (object2) {
            this.c();
            this.a.put(string2, object);
        }
        object2 = this.d;
        synchronized (object2) {
            this.b.put(string2, object);
            this.d.notifyAll();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final boolean a(String string2) {
        HashMap hashMap = this.a;
        synchronized (hashMap) {
            this.c();
            return this.a.containsKey(string2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object b(String string2) {
        HashMap hashMap = this.a;
        synchronized (hashMap) {
            this.c();
            return this.a.get(string2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void b() {
        Rb rb2 = this.d;
        synchronized (rb2) {
            this.d.notifyAll();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c() {
        if (this.e) return;
        try {
            this.a.wait();
            return;
        }
        catch (InterruptedException interruptedException) {
            return;
        }
    }

    @Override
    public final void close() {
        if (this.d.isRunning()) {
            this.d.stopRunning();
        }
    }

    @Override
    public final boolean getBoolean(String object, boolean bl2) {
        if ((object = this.b((String)object)) instanceof Boolean) {
            return (Boolean)object;
        }
        return bl2;
    }

    @Override
    public final int getInt(String object, int n10) {
        if ((object = this.b((String)object)) instanceof Integer) {
            return (Integer)object;
        }
        return n10;
    }

    @Override
    public final long getLong(String object, long l10) {
        if ((object = this.b((String)object)) instanceof Long) {
            return (Long)object;
        }
        return l10;
    }

    @Override
    public final String getString(String object, String string2) {
        if ((object = this.b((String)object)) instanceof String) {
            return (String)object;
        }
        return string2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final hb remove(String string2) {
        Object object = this.a;
        synchronized (object) {
            this.c();
            this.a.remove(string2);
        }
        object = this.d;
        synchronized (object) {
            this.b.put(string2, this);
            this.d.notifyAll();
            return this;
        }
    }
}

