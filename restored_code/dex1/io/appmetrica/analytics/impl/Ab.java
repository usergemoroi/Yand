/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.collections.s0
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.AdType;
import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.ModulesFacade;
import io.appmetrica.analytics.impl.nd;
import io.appmetrica.analytics.impl.od;
import io.appmetrica.analytics.impl.zb;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenue;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdType;
import io.appmetrica.analytics.modulesapi.internal.common.InternalClientModuleFacade;
import io.appmetrica.analytics.modulesapi.internal.common.InternalModuleEvent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.s0;
import kotlin.r;
import org.jetbrains.annotations.NotNull;

public final class Ab
implements InternalClientModuleFacade {
    public final od a = new od();

    @Override
    public final void reportAdRevenue(@NotNull ModuleAdRevenue moduleAdRevenue) {
        AdRevenue.Builder builder;
        Object object;
        od od3;
        block13: {
            block12: {
                od3 = this.a;
                od3.getClass();
                Object object2 = AdRevenue.newBuilder(moduleAdRevenue.getAdRevenue(), moduleAdRevenue.getCurrency());
                object = moduleAdRevenue.getAdType();
                ModuleAdType.values();
                int n10 = object == null ? -1 : nd.a[((Enum)object).ordinal()];
                switch (n10) {
                    default: {
                        throw new r();
                    }
                    case 7: {
                        object = AdType.OTHER;
                        break;
                    }
                    case 6: {
                        object = AdType.APP_OPEN;
                        break;
                    }
                    case 5: {
                        object = AdType.MREC;
                        break;
                    }
                    case 4: {
                        object = AdType.INTERSTITIAL;
                        break;
                    }
                    case 3: {
                        object = AdType.REWARDED;
                        break;
                    }
                    case 2: {
                        object = AdType.BANNER;
                        break;
                    }
                    case 1: {
                        object = AdType.NATIVE;
                        break;
                    }
                    case -1: {
                        object = null;
                    }
                }
                builder = ((AdRevenue.Builder)object2).withAdType((AdType)((Object)object)).withAdNetwork(moduleAdRevenue.getAdNetwork()).withAdUnitId(moduleAdRevenue.getAdUnitId()).withAdUnitName(moduleAdRevenue.getAdUnitName()).withAdPlacementId(moduleAdRevenue.getAdPlacementId()).withAdPlacementName(moduleAdRevenue.getAdPlacementName()).withPrecision(moduleAdRevenue.getPrecision());
                object = moduleAdRevenue.getPayload();
                if (object == null) break block12;
                object = object2 = s0.C((Map)object);
                if (object2 != null) break block13;
            }
            object = new LinkedHashMap();
        }
        od3.a.getClass();
        object.put("layer", "native");
        ModulesFacade.reportAdRevenue(builder.withPayload((Map<String, String>)object).build(), moduleAdRevenue.getAutoCollected());
    }

    @Override
    public final void reportEvent(@NotNull InternalModuleEvent internalModuleEvent) {
        ModuleEvent.Builder builder = ModuleEvent.newBuilder(internalModuleEvent.getType()).withName(internalModuleEvent.getName()).withValue(internalModuleEvent.getValue());
        Object object = internalModuleEvent.getServiceDataReporterType();
        if (object != null) {
            builder.withServiceDataReporterType((int)object);
        }
        if ((object = internalModuleEvent.getCategory()) != null) {
            int n10 = zb.a[((Enum)object).ordinal()];
            object = n10 != 1 ? (n10 != 2 ? null : ModuleEvent.Category.GENERAL) : ModuleEvent.Category.SYSTEM;
            if (object != null) {
                builder.withCategory((ModuleEvent.Category)((Object)object));
            }
        }
        ModulesFacade.reportEvent(builder.withExtras(internalModuleEvent.getExtras()).withAttributes(internalModuleEvent.getAttributes()).withEnvironment(internalModuleEvent.getEnvironment()).build());
    }
}

