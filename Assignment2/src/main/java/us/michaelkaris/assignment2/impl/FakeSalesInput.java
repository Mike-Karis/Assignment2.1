package us.michaelkaris.assignment2.impl;

import us.michaelkaris.assignment2.Sale;
import us.michaelkaris.assignment2.iface.SalesInput;

import java.util.ArrayList;
import java.util.List;

public class FakeSalesInput implements SalesInput {

    @Override
    public List<Sale> getSales() {
       System.out.println("Got a sale");
       List<Sale> theList = new ArrayList<>();
       theList.add(new Sale("Bob", "Texas", 4335.56, 23.32));
       theList.add(new Sale("Sue", "Wisconsin",2345.45, 65.21));
       return theList;
    }
}
