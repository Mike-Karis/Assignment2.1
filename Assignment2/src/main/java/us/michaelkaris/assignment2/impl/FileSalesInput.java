package us.michaelkaris.assignment2.impl;

import us.michaelkaris.assignment2.Sale;
import us.michaelkaris.assignment2.iface.SalesInput;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FileSalesInput implements SalesInput {

    @Override
    public List<Sale> getSales() {
        List<Sale> theList = new ArrayList<>();
        try {
            File myObj = new File("C:\\Users\\mikej\\Assignment2\\src\\main\\java\\us\\michaelkaris\\assignment2\\impl\\sales.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                List<String> docList = Arrays.asList(data.split(","));
                theList.add(new Sale(docList.get(0), docList.get(1), Double.parseDouble(docList.get(2)), Double.parseDouble(docList.get(3))));
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return theList;
    }
}
