package us.michaelkaris.assignment2.impl;

import us.michaelkaris.assignment2.Sale;
import us.michaelkaris.assignment2.iface.SalesInput;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ConsoleSalesInput implements SalesInput {

    @Override
    public List<Sale> getSales() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Report Enter(Type NA to end): ");
        String input="";
        String name="";
        String country="";
        String priceStr="";
        String taxStr="";
        List<Sale> theList = new ArrayList<>();
        while(!input.equals("NA")){
            System.out.println("Enter Name ");
            input = scanner.nextLine();
            if(!input.equals("NA")){
                name =input;
                System.out.println("Enter Country ");
                country = scanner.nextLine();
                System.out.println("Enter Price ");
                priceStr = scanner.nextLine();
                double price = Double.parseDouble(priceStr);
                System.out.println("Enter Tax ");
                taxStr = scanner.nextLine();
                double tax = Double.parseDouble(taxStr);
                theList.add(new Sale(name, country, price, tax));
            }
        }
        return theList;
    }
}
