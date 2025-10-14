package com.softuai.SofIA.core.enums;

import com.softuai.SofIA.core.exception.InvalidAccountStatusException;
import lombok.Getter;

@Getter
public enum AccountStatus {
    ACTIVE("A"),
    TEMPORARILY_BLOCKED("TB"),
    BLOCKED("B");

    private final String code;

    AccountStatus(String code) {
        this.code = code;
    }

    public static AccountStatus getByCode(String code) {
        for (AccountStatus accountStatus : values()) {
            if (accountStatus.code.equalsIgnoreCase(code)) {
                return accountStatus;
            }
        }
        throw new InvalidAccountStatusException(code);
    }
}
