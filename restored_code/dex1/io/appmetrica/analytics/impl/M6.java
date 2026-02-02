/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import io.appmetrica.analytics.impl.Aa;
import io.appmetrica.analytics.impl.E6;
import io.appmetrica.analytics.impl.Jb;
import io.appmetrica.analytics.impl.Rh;
import io.appmetrica.analytics.impl.Vf;
import io.appmetrica.analytics.impl.X9;
import io.appmetrica.analytics.impl.ro;
import io.appmetrica.analytics.impl.za;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public final class M6 {
    public final Aa a;
    public final E6 b;
    public final Context c;
    public final za d;

    public M6(Context context) {
        this(context, new Aa(), new E6(), za.a(context));
    }

    public M6(Context context, Aa aa4, E6 e62, za za4) {
        this.c = context;
        this.a = aa4;
        this.b = e62;
        this.d = za4;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(Rh object) {
        Object object2;
        block8: {
            boolean bl2;
            block9: {
                block7: {
                    object2 = FileUtils.getCrashesDirectory(this.c);
                    this.b.getClass();
                    if (object2 == null) {
                        return;
                    }
                    if (!((File)object2).exists()) break block7;
                    if (((File)object2).isDirectory()) break block8;
                    if (!((File)object2).delete()) return;
                    bl2 = ((File)object2).mkdir();
                    break block9;
                }
                bl2 = ((File)object2).mkdir();
            }
            if (!bl2) return;
        }
        Object object3 = ((Rh)object).e.a;
        Object object4 = ((Vf)object3).a.getAsInteger("PROCESS_CFG_PROCESS_ID");
        object3 = ((Vf)object3).a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID");
        Object object5 = new StringBuilder();
        ((StringBuilder)object5).append(object4);
        ((StringBuilder)object5).append("-");
        ((StringBuilder)object5).append((String)object3);
        object4 = ((StringBuilder)object5).toString();
        object3 = this.d.b((String)object4);
        ((X9)object3).a.lock();
        ((X9)object3).b.a();
        this.a.getClass();
        object5 = new File((File)object2, (String)object4);
        FileOutputStream fileOutputStream = new FileOutputStream((File)object5);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        object2 = new PrintWriter(bufferedOutputStream);
        object5 = new Jb(((Rh)object).a, ((Rh)object).e, ((Rh)object).d);
        ((PrintWriter)object2).write(((Jb)object5).k());
        ro.a((Closeable)object2);
        ((X9)object3).c();
        object = this.d;
        synchronized (object) {
            ((za)object).b.remove(object4);
            return;
        }
        catch (IOException | Throwable throwable) {
            Object object6;
            block10: {
                object6 = null;
                break block10;
                catch (IOException | Throwable throwable2) {
                    object6 = object2;
                }
            }
            ro.a(object6);
            ((X9)object3).c();
            this.d.a((String)object4);
        }
    }
}

