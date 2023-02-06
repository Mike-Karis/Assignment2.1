package us.michaelkaris.assignment2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import us.michaelkaris.assignment2.iface.SalesInput;
import us.michaelkaris.assignment2.iface.SalesReport;
import us.michaelkaris.assignment2.iface.ShippingPolicy;

import java.util.List;

@Component
public class Report {
    private SalesInput salesInput;
    private SalesReport salesReport;
    private ShippingPolicy shippingPolicy;

@Autowired
    public Report(SalesInput salesInput, SalesReport salesReport, ShippingPolicy shippingPolicy) {
        this.salesInput = salesInput;
        this.salesReport = salesReport;
        this.shippingPolicy = shippingPolicy;
    }

    public Report(){
        System.out.println("Cool");
    }
    public void run() {
        List<Sale> theSales = salesInput.getSales();
        shippingPolicy.applyShipping(theSales);
        salesReport.generateReport(theSales);
//        conSalesInput.generateReport(theSales);
    }
}
