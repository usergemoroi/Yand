/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

public abstract class R5 {
    public static final List a = CollectionUtils.createSortedListWithoutRepetitions("id", "session_id", "session_type", "number_in_session", "type", "global_number", "time", "event_description");
}

