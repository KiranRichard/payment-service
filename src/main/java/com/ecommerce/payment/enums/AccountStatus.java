package com.ecommerce.payment.enums;

public enum AccountStatus {
    PENDING, APPROVED, ACTIVE, INACTIVE, BLOCKED;

    public static AccountStatus findByName(String name) {
        AccountStatus accountStatus = null;
        for (AccountStatus status : values()) {
            if (status.name().equalsIgnoreCase(name)) {
                accountStatus = status;
                break;
            }
        }
        return accountStatus;
    }
}
