package OOP.Mission_2.TaxiStation;

import java.util.Comparator;

public class ComparatorTaxi implements Comparator<Car> {
    @Override
    public int compare(Car car1, Car car2) {
        return Integer.compare(car1.getAmountFuel(),car2.getAmountFuel());
    }
}
