package us.michaelkaris.assignment2.impl;

import us.michaelkaris.assignment2.Sale;
import us.michaelkaris.assignment2.iface.ShippingPolicy;

import java.util.List;

public class FakeShippingPolicy implements ShippingPolicy {
    @Override
    public void applyShipping(List<Sale> saleList) {
        System.out.println("Love that policy");
    }
}
