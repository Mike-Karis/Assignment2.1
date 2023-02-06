package us.michaelkaris.assignment2.impl;

import us.michaelkaris.assignment2.Sale;
import us.michaelkaris.assignment2.iface.SalesReport;

import java.util.List;

public class DetailSalesReport implements SalesReport {
    @Override
    public void generateReport(List<Sale> salesList) {
        System.out.println("SALES SUMMARY REPORT");
        System.out.format("%8s %8s %8s %8s %8s\n","Name","Country","Amount","Tax","Shipping");
        for (Sale sale: salesList){
            System.out.format("%8s %8s %8.2f %8.2f %8.2f\n", sale.getName(), sale.getCountry(), sale.getPrice(), sale.getTax(), sale.getShippingCost());
        }
    }
}
