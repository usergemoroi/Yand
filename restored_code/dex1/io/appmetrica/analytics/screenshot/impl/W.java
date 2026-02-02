/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.database.ContentObserver
 *  android.net.Uri
 *  android.provider.MediaStore$Images$Media
 *  kotlin.collections.l
 *  kotlin.jvm.functions.a
 *  kotlin.text.p
 */
package io.appmetrica.analytics.screenshot.impl;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.provider.MediaStore;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.screenshot.impl.j;
import io.appmetrica.analytics.screenshot.impl.r;
import java.io.Closeable;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import kotlin.collections.l;
import kotlin.io.c;
import kotlin.jvm.functions.a;
import kotlin.k0;
import kotlin.text.p;

public final class W
extends ContentObserver {
    public static final String d = MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString();
    public final ClientContext a;
    public final a b;
    public volatile j c;

    public W(ClientContext clientContext, r r14) {
        super(clientContext.getClientExecutorProvider().getDefaultExecutor().getHandler());
        this.a = clientContext;
        this.b = r14;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onChange(boolean bl2, Uri object) {
        Throwable throwable222;
        List list;
        block13: {
            block12: {
                super.onChange(bl2, (Uri)object);
                if (!p.M((String)String.valueOf(object), (String)d, (boolean)false, (int)2, null)) return;
                object = this.c;
                if (object == null) {
                    return;
                }
                list = ((j)object).b;
                String[] stringArray = (String[])l.I((Object[])new String[]{"date_added"}, (Collection)list);
                ContentResolver contentResolver = this.a.getContext().getContentResolver();
                list = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                Object object2222 = new SystemTimeProvider();
                list = contentResolver.query((Uri)list, stringArray, "date_added >= ?", new String[]{String.valueOf(((SystemTimeProvider)object2222).currentTimeSeconds() - ((j)object).c)}, "date_added DESC");
                if (list == null) break block12;
                if (!list.moveToFirst()) break block12;
                for (Object object2222 : stringArray) {
                }
                try {
                    object = ((j)object).b.iterator();
                    while (object.hasNext()) {
                        if (!p.R((CharSequence)list.getString(list.getColumnIndexOrThrow((String)object.next())).toLowerCase(Locale.ROOT), (CharSequence)"screenshot", (boolean)false, (int)2, null)) continue;
                        this.b.invoke();
                    }
                }
                catch (Throwable throwable222) {
                    break block13;
                }
            }
            object = k0.a;
            kotlin.io.c.a((Closeable)((Object)list), null);
            return;
            {
                catch (Exception exception) {
                    return;
                }
            }
        }
        try {
            throw throwable222;
        }
        catch (Throwable throwable3) {
            kotlin.io.c.a((Closeable)((Object)list), throwable222);
            throw throwable3;
        }
    }
}

