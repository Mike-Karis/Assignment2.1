package us.michaelkaris.assignment2.impl;

import us.michaelkaris.assignment2.Sale;
import us.michaelkaris.assignment2.iface.ShippingPolicy;
//import us.michaelkaris.assingment2.iface.ShippingPolicy;

import java.util.List;

public class FlateRateDomesticShippingPolicy implements ShippingPolicy {

    @Override
    public void applyShipping(List<Sale> sales){
        for(Sale sale: sales){
            sale.setShippingCost(0D);
        }
    }
}
