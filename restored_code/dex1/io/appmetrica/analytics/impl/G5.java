/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.collections.t
 *  kotlin.jvm.functions.l
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.impl.F5;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.logger.common.BaseReleaseLogger;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessorsHolder;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.collections.t;
import kotlin.jvm.functions.l;
import org.jetbrains.annotations.NotNull;

public final class G5
implements ModuleAdRevenueProcessor,
ModuleAdRevenueProcessorsHolder {
    public final ArrayList a = new ArrayList();

    @Override
    @NotNull
    public final String getDescription() {
        ArrayList arrayList = this.a;
        StringBuilder stringBuilder = new StringBuilder("Composite processor with ");
        stringBuilder.append(this.a.size());
        stringBuilder.append(" children: [");
        return t.B0((Iterable)arrayList, null, (CharSequence)stringBuilder.toString(), (CharSequence)"]", (int)0, null, (l)F5.a, (int)25, null);
    }

    @Override
    public final boolean process(Object ... objectArray) {
        boolean bl2;
        Object object;
        PublicLogger publicLogger2;
        block7: {
            publicLogger2 = LoggerStorage.getMainPublicOrAnonymousLogger();
            object = new StringBuilder("Processing Ad Revenue for ");
            ((StringBuilder)object).append(Arrays.toString(objectArray));
            publicLogger2.info(((StringBuilder)object).toString(), new Object[0]);
            for (PublicLogger publicLogger2 : this.a) {
                Object object2;
                Object object3;
                Throwable throwable2;
                block6: {
                    block5: {
                        object = (ModuleAdRevenueProcessor)((Object)publicLogger2);
                        try {
                            bl2 = object.process(Arrays.copyOf(objectArray, objectArray.length));
                            if (bl2) break block5;
                        }
                        catch (Throwable throwable2) {
                            break block6;
                        }
                        object3 = LoggerStorage.getMainPublicOrAnonymousLogger();
                        object2 = new StringBuilder();
                        ((StringBuilder)object2).append("Ad Revenue was not processed by ");
                        ((StringBuilder)object2).append(object.getDescription());
                        ((BaseReleaseLogger)object3).info(((StringBuilder)object2).toString(), new Object[0]);
                    }
                    if (!bl2) continue;
                    break block7;
                }
                object2 = LoggerStorage.getMainPublicOrAnonymousLogger();
                object3 = new StringBuilder("Got exception from processor ");
                ((StringBuilder)object3).append(object.getDescription());
                ((BaseReleaseLogger)object2).error(throwable2, ((StringBuilder)object3).toString(), new Object[0]);
            }
            publicLogger2 = null;
        }
        bl2 = (ModuleAdRevenueProcessor)((Object)publicLogger2) != null;
        if (!bl2) {
            publicLogger2 = LoggerStorage.getMainPublicOrAnonymousLogger();
            object = new StringBuilder("Ad Revenue was not processed by ");
            ((StringBuilder)object).append(this.getDescription());
            ((StringBuilder)object).append(" since processor for ");
            ((StringBuilder)object).append(Arrays.toString(objectArray));
            ((StringBuilder)object).append(" was not found");
            publicLogger2.info(((StringBuilder)object).toString(), new Object[0]);
        }
        return bl2;
    }

    @Override
    public final void register(@NotNull ModuleAdRevenueProcessor moduleAdRevenueProcessor) {
        this.a.add(moduleAdRevenueProcessor);
    }
}

