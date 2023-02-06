package us.michaelkaris.assignment2.impl;

import us.michaelkaris.assignment2.Sale;
import us.michaelkaris.assignment2.iface.SalesReport;

import java.util.List;

public class FakeSalesReport implements SalesReport {
    @Override
    public void generateReport(List<Sale> salesList) {
        System.out.println("Wrote a report");
        for (Sale sale: salesList){
            System.out.println(sale);
        }
    }
}
