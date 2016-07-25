package OOP.Mission_2.Taxes;

import java.util.ArrayList;
import java.util.Collections;

public class Individual {
    private double amount;

    public double getAmount() {
        return amount ;
    }
    private ArrayList<Tax> taxs = new ArrayList<Tax>();

    public Individual addTax(Tax tax) {
        amount += tax.getPrice();
        taxs.add(tax);
        return this;
    }
    public int getQuantity() {
        return taxs.size();
    }


    public void sortTax() {

        Collections.sort(taxs, new ComparatorTax());

        for (int i = 0; i < taxs.size(); i++) {
            System.out.println(taxs.get(i).toString());
        }
    }
}
