package us.michaelkaris.assignment2.iface;

import us.michaelkaris.assignment2.Sale;
import java.util.List;

public interface SalesReport {
    void generateReport(List<Sale> salesList);
}