package com.green.acamatch.academyCost.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GetAcademyCostInfoRes {
    private String tId;
    private long userId;
    private long productId;
    private Integer costId;
    private int amount;
    private String partnerOrderId;
}
