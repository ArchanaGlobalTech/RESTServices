package org.archanasweets.online.Domain;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Pricing {
    private int pricingId;
    private int menuItemId;
    private String packSize;
    private Integer menuItemPackPrice;
    private String menuPackAvailabilityInd;
}
