package OOP.Mission_2.СoffeeVan;

import java.util.Comparator;

public class ComparatorCoffee implements Comparator<Coffee> {
    @Override
    public int compare(Coffee coffee1, Coffee coffee2) {
        return Double.compare(coffee1.getRatio(),coffee2.getRatio());

    }
}
