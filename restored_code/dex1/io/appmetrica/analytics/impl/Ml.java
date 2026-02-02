/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

public final class Ml {
    public final String a;
    public final String b;
    public final Integer c;
    public final Integer d;
    public final String e;
    public final Boolean f;

    public Ml(StackTraceElement stackTraceElement) {
        this(stackTraceElement.getClassName(), stackTraceElement.getFileName(), stackTraceElement.getLineNumber(), null, stackTraceElement.getMethodName(), stackTraceElement.isNativeMethod());
    }

    public Ml(String string2, String string3, Integer n10, Integer n13, String string4, Boolean bl2) {
        this.a = string2;
        this.b = string3;
        this.c = n10;
        this.d = n13;
        this.e = string4;
        this.f = bl2;
    }
}

