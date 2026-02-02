/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import java.security.MessageDigest;

public abstract class Cj {
    public static byte[] a(String string2) {
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        messageDigest.reset();
        messageDigest.update(string2.getBytes("UTF-8"));
        return messageDigest.digest();
    }
}

