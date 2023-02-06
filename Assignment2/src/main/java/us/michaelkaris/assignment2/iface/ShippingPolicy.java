package us.michaelkaris.assignment2.iface;

import us.michaelkaris.assignment2.Sale;

import java.util.List;

public interface ShippingPolicy {
    void applyShipping(List<Sale> saleList);
}
