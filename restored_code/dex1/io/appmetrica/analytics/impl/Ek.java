/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.database.Cursor
 *  android.database.sqlite.SQLiteDatabase
 *  android.text.TextUtils
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import io.appmetrica.analytics.coreutils.internal.io.CloseableUtilsKt;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.impl.Co;
import io.appmetrica.analytics.impl.H4;
import io.appmetrica.analytics.impl.J4;
import io.appmetrica.analytics.impl.Na;
import io.appmetrica.analytics.impl.Zm;
import io.appmetrica.analytics.impl.a;
import io.appmetrica.analytics.impl.ac;
import io.appmetrica.analytics.impl.an;
import io.appmetrica.analytics.impl.id;
import io.appmetrica.analytics.impl.rm;
import io.appmetrica.analytics.impl.sm;
import io.appmetrica.analytics.impl.y7;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import org.jetbrains.annotations.NotNull;

public final class Ek
implements id {
    public final Co a;
    public final String b;
    public final AESEncrypter c;

    public Ek(@NotNull Co object) {
        this.a = object;
        this.b = "startup_state";
        object = new a(Na.j().f());
        this.c = new AESEncrypter("AES/CBC/PKCS5Padding", ((a)object).b(), ((a)object).a());
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public static void a(Co co3, rm rm3, ac ac2) {
        void var2_2;
        // MONITORENTER : co3
        String string2 = JsonUtils.optStringOrNull(co3.a.a(), "device_id");
        // MONITOREXIT : co3
        if (!TextUtils.isEmpty((CharSequence)string2)) return;
        if (!TextUtils.isEmpty((CharSequence)var2_2.d)) {
            co3.a(var2_2.d);
        }
        if (!TextUtils.isEmpty((CharSequence)var2_2.e)) {
            co3.b(var2_2.e);
        }
        if (TextUtils.isEmpty((CharSequence)var2_2.a)) return;
        rm3.a = var2_2.a;
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ac a(SQLiteDatabase object) {
        void var1_9;
        block7: {
            String string2;
            block6: {
                ac ac2;
                string2 = this.b;
                string2 = object.query("binary_data", new String[]{"value"}, "data_key = ?", new String[]{string2}, null, null, null);
                if (string2 == null) break block6;
                try {
                    if (string2.getCount() != 1 || !string2.moveToFirst()) break block6;
                    byte[] byArray = string2.getBlob(string2.getColumnIndexOrThrow("value"));
                    byte[] byArray2 = this.c.decrypt(byArray);
                    ac ac2 = new ac();
                    ac2 = MessageNano.mergeFrom(ac2, byArray2);
                }
                catch (Throwable throwable) {}
                CloseableUtilsKt.closeSafely((Cursor)string2);
                return ac2;
            }
            String string3 = string2;
            if (string2 == null) break block7;
            string2.getCount();
            catch (Throwable throwable) {
                Object var1_8 = null;
            }
            break block7;
            finally {
                String string4 = string2;
            }
        }
        CloseableUtilsKt.closeSafely((Cursor)var1_9);
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void a(@NotNull Context context) {
        Object object = y7.a(context).h().getReadableDatabase();
        if (object == null) return;
        try {
            ac ac2 = this.a((SQLiteDatabase)object);
            H4 h43 = new H4();
            Object object2 = new J4(h43);
            object = new rm((J4)object2);
            if (ac2 != null) {
                Ek.a(this.a, (rm)object, ac2);
                ((rm)object).p = ac2.c;
                ((rm)object).r = ac2.b;
            }
            object2 = new sm((rm)object);
            object = Zm.a(sm.class);
            ((an)object).a(context, ((an)object).d(context)).save(object2);
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }
}

