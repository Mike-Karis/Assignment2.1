package us.michaelkaris.assignment2.impl;

import us.michaelkaris.assignment2.Sale;
import us.michaelkaris.assignment2.iface.SalesReport;

import java.util.List;

public class SummarySalesReport implements SalesReport {
    @Override
    public void generateReport(List<Sale> salesList) {
        double priceTotal = 0;
        double taxTotal = 0;
        double shippingFeeTotal = 0;
        for (Sale sale: salesList){
            priceTotal += sale.getPrice();
            taxTotal += sale.getTax();
            shippingFeeTotal += sale.getShippingCost();
        }
        System.out.println("SALES SUMMARY REPORT");
        System.out.println("Amount     Tax     Shipping");
        System.out.format("%8.2f %8.2f %8.2f\n", priceTotal, taxTotal, shippingFeeTotal);
    }
}
