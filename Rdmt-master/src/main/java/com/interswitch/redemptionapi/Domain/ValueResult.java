package com.interswitch.redemptionapi.Domain;

import lombok.Data;

@Data
public class ValueResult {
    private long id;
    private String code;
    private String merchantId;
    private String voucherType;
    private String metadata;
    private String description;
    private long valueAmount;
}
