package us.michaelkaris.assignment2.impl;

import us.michaelkaris.assignment2.Sale;
import us.michaelkaris.assignment2.iface.ShippingPolicy;

import java.util.List;

public class FlatRateShippingPolicy implements ShippingPolicy {

    @Override
    public void applyShipping(List<Sale> sales){
        double shipping;
        for(Sale sale: sales){
            switch(sale.getCountry().toLowerCase()){
                case "united states","usa","us" -> shipping = 29.95;
                case "japan" -> shipping = 14.50;
                case "scotland" -> shipping = 7.56;
                case "india" -> shipping = 11.79;
                default -> {
                    throw new IllegalArgumentException("COUNTRY NAME NOT FOUND");
                }
            }
            sale.setShippingCost(shipping);
        }
    }
}
