package com.interswitch.redemptionapi.Domain;

import lombok.Data;

@Data
public class DiscountResult {
    private long id;
    private String code;
    private String merchantId;
    private String voucherType;
    private String metadata;
    private String description;
    private long discountAmount;
    private long discountUnit;
    private float discountPercent;
    //private long redemptionCount;
}
