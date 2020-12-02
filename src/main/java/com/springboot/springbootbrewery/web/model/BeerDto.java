package com.springboot.springbootbrewery.web.model;

import lombok.*;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BeerDto {
    private UUID id;
    private Integer version;

    private OffsetDateTime createdDate;
    private OffsetDateTime lastModifiedDate;

    private String beerName;

    private BeerStyleEnum beerStyle;
    private long upc;

    private BigDecimal price;

    private Integer quantityOnHand;

}
