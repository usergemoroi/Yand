/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.bd;
import io.appmetrica.analytics.impl.cd;
import io.appmetrica.analytics.impl.fd;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.AbstractMap;

public final class Al {
    public final cd a;
    public final bd b;

    public Al(cd cd3, bd bd3) {
        this.a = cd3;
        this.b = bd3;
    }

    public Al(PublicLogger publicLogger, String string2) {
        this(new cd(string2, publicLogger), new bd(string2, publicLogger));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean a(fd object, String string2, String string3) {
        synchronized (this) {
            Throwable throwable2;
            block10: {
                block11: {
                    int n10;
                    int n13;
                    block9: {
                        block8: {
                            try {
                                n13 = ((AbstractMap)object).size();
                                n10 = this.a.c.a;
                                if (n13 >= n10 && (n10 != ((AbstractMap)object).size() || !((AbstractMap)object).containsKey(string2))) break block8;
                                break block9;
                            }
                            catch (Throwable throwable2) {
                                break block10;
                            }
                        }
                        object = this.a;
                        ((cd)object).d.warning("The %s has reached the limit of %d items. Item with key %s will be ignored", ((cd)object).e, ((cd)object).c.a, string2);
                        break block11;
                    }
                    this.b.getClass();
                    n10 = n13 = ((fd)object).a;
                    if (string3 != null) {
                        n10 = n13 + string3.length();
                    }
                    if (((AbstractMap)object).containsKey(string2)) {
                        String string4 = (String)((AbstractMap)object).get(string2);
                        n13 = n10;
                        if (string4 != null) {
                            n13 = n10 - string4.length();
                        }
                    } else {
                        n13 = n10 + string2.length();
                    }
                    if (n13 <= 4500) {
                        ((fd)object).a(string2, string3);
                        return true;
                    }
                    object = this.b;
                    ((bd)object).b.warning("The %s has reached the total size limit that equals %d symbols. Item with key %s will be ignored", ((bd)object).a, 4500, string2);
                }
                return false;
            }
            throw throwable2;
        }
    }

    public final boolean b(fd fd3, String string2, String string3) {
        if (fd3 != null) {
            string2 = this.a.a.a(string2);
            String string4 = this.a.b.a(string3);
            if (((AbstractMap)fd3).containsKey(string2)) {
                string3 = (String)((AbstractMap)fd3).get(string2);
                if (string4 == null || !string4.equals(string3)) {
                    return this.a(fd3, string2, string4);
                }
            } else if (string4 != null) {
                return this.a(fd3, string2, string4);
            }
        }
        return false;
    }
}

