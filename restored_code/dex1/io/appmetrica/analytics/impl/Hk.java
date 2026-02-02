/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.location.Location
 *  android.os.Bundle
 *  kotlin.collections.s0
 *  kotlin.collections.t
 *  kotlin.f
 */
package io.appmetrica.analytics.impl;

import android.location.Location;
import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import io.appmetrica.analytics.impl.Gk;
import io.appmetrica.analytics.impl.Kj;
import io.appmetrica.analytics.impl.Na;
import io.appmetrica.analytics.impl.a8;
import io.appmetrica.analytics.impl.gh;
import io.appmetrica.analytics.impl.kk;
import io.appmetrica.analytics.impl.lk;
import io.appmetrica.analytics.impl.om;
import io.appmetrica.analytics.impl.pd;
import io.appmetrica.analytics.impl.tm;
import io.appmetrica.analytics.impl.ud;
import io.appmetrica.analytics.impl.yd;
import io.appmetrica.analytics.modulesapi.internal.common.AskForPermissionStrategyModuleProvider;
import io.appmetrica.analytics.modulesapi.internal.service.ClientConfigProvider;
import io.appmetrica.analytics.modulesapi.internal.service.LocationServiceExtension;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleLocationSourcesServiceController;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServicesDatabase;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.s0;
import kotlin.collections.t;
import kotlin.f;
import kotlin.jvm.internal.y;
import kotlin.k0;
import kotlin.z;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class Hk
implements pd,
tm,
AskForPermissionStrategyModuleProvider {
    public final String a;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public volatile AskForPermissionStrategyModuleProvider c = new a8();

    public Hk() {
        this.a = "rp";
    }

    @Override
    public final void a(@NotNull om om3) {
        SdkIdentifiers sdkIdentifiers = new SdkIdentifiers(om3.e(), om3.a(), om3.b());
        gh gh3 = new gh(om3.c(), om3.d());
        for (Object object : this.b) {
            RemoteConfigExtensionConfiguration remoteConfigExtensionConfiguration2 = ((ModuleServiceEntryPoint)object).getRemoteConfigExtensionConfiguration();
            if (remoteConfigExtensionConfiguration2 == null) continue;
            object = ((ModuleServiceEntryPoint)object).getIdentifier();
            object = new Gk(sdkIdentifiers, gh3, om3.B.get(object));
            remoteConfigExtensionConfiguration2.getRemoteConfigUpdateListener().onRemoteConfigUpdated(object);
        }
    }

    public final void a(@NotNull ModuleServiceEntryPoint<Object> moduleServiceEntryPoint) {
        this.b.add(moduleServiceEntryPoint);
        if (y.e(this.a, moduleServiceEntryPoint.getIdentifier()) && moduleServiceEntryPoint instanceof AskForPermissionStrategyModuleProvider) {
            this.c = (AskForPermissionStrategyModuleProvider)((Object)moduleServiceEntryPoint);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(@NotNull ServiceContext serviceContext, @NotNull om om3) {
        HashSet<ModuleServiceEntryPoint> hashSet = new HashSet<ModuleServiceEntryPoint>();
        Iterator iterator = this.b.iterator();
        while (true) {
            Object object;
            Object object2;
            if (!iterator.hasNext()) {
                this.b.removeAll(hashSet);
                return;
            }
            ModuleServiceEntryPoint moduleServiceEntryPoint = (ModuleServiceEntryPoint)iterator.next();
            try {
                object2 = new SdkIdentifiers(om3.d, om3.a, om3.b);
                Object object3 = new gh(om3.v, om3.u);
                object = moduleServiceEntryPoint.getIdentifier();
                Gk gk3 = new Gk((SdkIdentifiers)object2, (RemoteConfigMetaInfo)object3, om3.B.get(object));
                moduleServiceEntryPoint.initServiceSide(serviceContext, gk3);
                object3 = moduleServiceEntryPoint.getModuleEventServiceHandlerFactory();
                if (object3 == null) continue;
                object = Na.F.t;
                object2 = moduleServiceEntryPoint.getIdentifier();
                synchronized (object) {
                    ((ud)object).a.put(object2, object3);
                }
            }
            catch (Throwable throwable) {
                object2 = moduleServiceEntryPoint.getIdentifier();
                object = Kj.a;
                object2 = s0.g(z.a(object2, s0.g(z.a("init", f.b((Throwable)throwable)))));
                object.getClass();
                ((lk)object).a(new kk("service_module_errors", (Map)object2));
                hashSet.add(moduleServiceEntryPoint);
            }
        }
    }

    @Override
    @NotNull
    public final List<ModuleServicesDatabase> b() {
        HashSet<ModuleServiceEntryPoint> hashSet = new HashSet<ModuleServiceEntryPoint>();
        ArrayList<ModuleServicesDatabase> arrayList = new ArrayList<ModuleServicesDatabase>();
        Object object = this.b;
        ArrayList<Object> arrayList2 = new ArrayList<Object>();
        Iterator iterator = ((CopyOnWriteArrayList)object).iterator();
        while (iterator.hasNext()) {
            block5: {
                Throwable throwable2;
                Object object2;
                block6: {
                    block4: {
                        object2 = (ModuleServiceEntryPoint)iterator.next();
                        try {
                            object = ((ModuleServiceEntryPoint)object2).getModuleServicesDatabase();
                            if (object == null) break block4;
                        }
                        catch (Throwable throwable2) {
                            break block6;
                        }
                        object = arrayList.add((ModuleServicesDatabase)object);
                        break block5;
                    }
                    object = null;
                    break block5;
                }
                hashSet.add((ModuleServiceEntryPoint)object2);
                object2 = ((ModuleServiceEntryPoint)object2).getIdentifier();
                object = Kj.a;
                Map map2 = s0.g(z.a(object2, s0.g(z.a("db", f.b((Throwable)throwable2)))));
                object.getClass();
                ((lk)object).a(new kk("service_module_errors", map2));
                object = k0.a;
            }
            if (object == null) continue;
            arrayList2.add(object);
        }
        this.b.removeAll(hashSet);
        return arrayList;
    }

    @Override
    @NotNull
    public final Map<String, yd> c() {
        Object object = this.b;
        ArrayList<kotlin.t<String, yd>> arrayList = new ArrayList<kotlin.t<String, yd>>();
        Iterator iterator = object.iterator();
        while (iterator.hasNext()) {
            object = (ModuleServiceEntryPoint)iterator.next();
            RemoteConfigExtensionConfiguration<Object> remoteConfigExtensionConfiguration2 = ((ModuleServiceEntryPoint)object).getRemoteConfigExtensionConfiguration();
            object = remoteConfigExtensionConfiguration2 != null ? z.a(((ModuleServiceEntryPoint)object).getIdentifier(), new yd(remoteConfigExtensionConfiguration2)) : null;
            if (object == null) continue;
            arrayList.add((kotlin.t<String, yd>)object);
        }
        return s0.v(arrayList);
    }

    @Override
    @NotNull
    public final Map<String, Integer> d() {
        RemoteConfigExtensionConfiguration remoteConfigExtensionConfiguration2 = this.b;
        ArrayList arrayList = new ArrayList();
        Iterator iterator = remoteConfigExtensionConfiguration2.iterator();
        while (iterator.hasNext()) {
            block4: {
                block3: {
                    remoteConfigExtensionConfiguration2 = ((ModuleServiceEntryPoint)iterator.next()).getRemoteConfigExtensionConfiguration();
                    if (remoteConfigExtensionConfiguration2 == null || (remoteConfigExtensionConfiguration2 = remoteConfigExtensionConfiguration2.getBlocks()) == null) break block3;
                    List list = s0.E(remoteConfigExtensionConfiguration2);
                    remoteConfigExtensionConfiguration2 = list;
                    if (list != null) break block4;
                }
                remoteConfigExtensionConfiguration2 = t.m();
            }
            t.E(arrayList, remoteConfigExtensionConfiguration2);
        }
        return s0.v(arrayList);
    }

    @Override
    @NotNull
    public final List<Consumer<Location>> e() {
        Object object = this.b;
        ArrayList<Consumer<Location>> arrayList = new ArrayList<Consumer<Location>>();
        Iterator iterator = object.iterator();
        while (iterator.hasNext()) {
            object = ((ModuleServiceEntryPoint)iterator.next()).getLocationServiceExtension();
            object = object != null ? ((LocationServiceExtension)object).getLocationConsumer() : null;
            if (object == null) continue;
            arrayList.add((Consumer<Location>)object);
        }
        return arrayList;
    }

    @Override
    @Nullable
    public final ModuleLocationSourcesServiceController f() {
        ModuleLocationSourcesServiceController moduleLocationSourcesServiceController;
        Iterator iterator = this.b.iterator();
        do {
            boolean bl2 = iterator.hasNext();
            moduleLocationSourcesServiceController = null;
            ModuleLocationSourcesServiceController moduleLocationSourcesServiceController2 = null;
            if (!bl2) break;
            LocationServiceExtension locationServiceExtension = ((ModuleServiceEntryPoint)iterator.next()).getLocationServiceExtension();
            moduleLocationSourcesServiceController = moduleLocationSourcesServiceController2;
            if (locationServiceExtension == null) continue;
            moduleLocationSourcesServiceController = locationServiceExtension.getLocationSourcesController();
        } while (moduleLocationSourcesServiceController == null);
        return moduleLocationSourcesServiceController;
    }

    @Override
    @Nullable
    public final Toggle g() {
        Toggle toggle;
        Iterator iterator = this.b.iterator();
        do {
            boolean bl2 = iterator.hasNext();
            toggle = null;
            Toggle toggle2 = null;
            if (!bl2) break;
            LocationServiceExtension locationServiceExtension = ((ModuleServiceEntryPoint)iterator.next()).getLocationServiceExtension();
            toggle = toggle2;
            if (locationServiceExtension == null) continue;
            toggle = locationServiceExtension.getLocationControllerAppStateToggle();
        } while (toggle == null);
        return toggle;
    }

    @Override
    @NotNull
    public final PermissionStrategy getAskForPermissionStrategy() {
        return this.c.getAskForPermissionStrategy();
    }

    @Override
    @NotNull
    public final List<String> h() {
        Object object = this.b;
        ArrayList<String> arrayList = new ArrayList<String>();
        Iterator iterator = object.iterator();
        while (iterator.hasNext()) {
            block4: {
                block3: {
                    List<String> list;
                    object = ((ModuleServiceEntryPoint)iterator.next()).getRemoteConfigExtensionConfiguration();
                    if (object == null) break block3;
                    object = list = ((RemoteConfigExtensionConfiguration)object).getFeatures();
                    if (list != null) break block4;
                }
                object = t.m();
            }
            t.E(arrayList, object);
        }
        return arrayList;
    }

    @NotNull
    public final Bundle i() {
        Bundle bundle = new Bundle();
        for (ModuleServiceEntryPoint moduleServiceEntryPoint : this.b) {
            ClientConfigProvider clientConfigProvider2 = moduleServiceEntryPoint.getClientConfigProvider();
            clientConfigProvider2 = clientConfigProvider2 != null ? clientConfigProvider2.getConfigBundleForClient() : null;
            if (clientConfigProvider2 == null) continue;
            bundle.putBundle(moduleServiceEntryPoint.getIdentifier(), (Bundle)clientConfigProvider2);
        }
        return bundle;
    }
}

