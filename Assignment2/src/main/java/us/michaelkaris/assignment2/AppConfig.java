package us.michaelkaris.assignment2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;
import us.michaelkaris.assignment2.iface.SalesInput;
import us.michaelkaris.assignment2.iface.SalesReport;
import us.michaelkaris.assignment2.iface.ShippingPolicy;
import us.michaelkaris.assignment2.impl.*;

@Configuration
@ComponentScan("us.michaelkaris.assignment2")
public class AppConfig {
    @Bean
    public SalesInput salesInput(){
//        return new FakeSalesInput();
//        return new ConsoleSalesInput();
        return new FileSalesInput();
    }

    @Bean
    public SalesReport salesReport(){
//        return new FakeSalesReport();
//        return new SummarySalesReport();
        return new DetailSalesReport();
    }

    @Bean
    public ShippingPolicy shippingPolicy(){
        return new FakeShippingPolicy();
    }


}
