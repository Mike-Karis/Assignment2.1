package us.michaelkaris.assignment2.impl;

import us.michaelkaris.assignment2.Sale;
import us.michaelkaris.assignment2.iface.ShippingPolicy;

import java.util.List;

public class FreeShippingOverShippingPolicy implements ShippingPolicy {

    double threshold = Double.MAX_VALUE;

    public FreeShippingOverShippingPolicy(Double minLimit){
        this.threshold = minLimit;
    }
    @Override
    public void applyShipping(List<Sale> saleList) {
        new FlateRateDomesticShippingPolicy().applyShipping(saleList);

        if(this.threshold < 0){
            throw new IllegalArgumentException("The min limit is too low");
        }
        for(Sale sale: saleList){
            if(sale.getPrice() > this.threshold)
                sale.setShippingCost(0D);
        }
    }
}
