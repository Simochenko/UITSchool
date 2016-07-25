package OOP.Mission_2.Taxes;

import java.util.Comparator;

public class ComparatorTax implements Comparator<Tax> {
    @Override
    public int compare(Tax taxs1, Tax taxs2) {
        return Double.compare(taxs1.getPrice(),taxs2.getPrice());

    }
}
