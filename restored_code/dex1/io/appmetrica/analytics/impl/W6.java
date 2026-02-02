/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.collections.s0
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.impl.Gb;
import io.appmetrica.analytics.impl.cm;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.s0;

public final class W6 {
    public final cm a = new cm();
    public Map b = s0.j();
    public Map c = s0.j();
    public IdentifiersResult d;

    /*
     * Exception decompiling
     */
    public final void a(IdentifiersResult var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 2[TRYBLOCK] [2 : 29->44)] java.lang.Throwable
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
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(List object, HashMap hashMap) {
        synchronized (this) {
            IdentifiersResult identifiersResult;
            String string2;
            Object object2;
            Object object3;
            Object object4;
            block7: {
                block6: {
                    try {
                        object4 = new Object();
                        object = object.iterator();
                    }
                    catch (Throwable throwable) {}
                    throw throwable;
                    while (object.hasNext()) {
                        object3 = (String)object.next();
                        object2 = (List)this.b.get(object3);
                        if (object2 == null || object2.isEmpty()) continue;
                        object4.put(object3, object2);
                    }
                    object3 = this.a;
                    string2 = Gb.a(object4);
                    identifiersResult = this.d;
                    if (identifiersResult == null) break block6;
                    object = object4 = identifiersResult.status;
                    if (object4 != null) break block7;
                }
                object = IdentifierStatus.UNKNOWN;
            }
            object4 = identifiersResult != null ? identifiersResult.errorExplanation : null;
            object2 = new IdentifiersResult(string2, (IdentifierStatus)((Object)object), (String)object4);
            hashMap.put("appmetrica_custom_sdk_hosts", ((cm)object3).a((IdentifiersResult)object2));
            return;
        }
    }
}

