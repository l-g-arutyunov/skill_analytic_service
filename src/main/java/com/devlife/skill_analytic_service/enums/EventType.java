package com.devlife.skill_analytic_service.enums;

import org.apache.commons.lang3.StringUtils;

public enum EventType {
    CREATE,
    DELETE,
    UPDATE;

    public static EventType getByName(String name) {
        return EventType.valueOf(StringUtils.upperCase(name));
    }
}
