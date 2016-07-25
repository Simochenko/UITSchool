package OOP.Mission_2.Сhief;

import java.util.Comparator;

public class ComparatorChief implements Comparator<Vegetable> {

    @Override
    public int compare(Vegetable v1, Vegetable v2) {
        return Double.compare(v1.getProtein(), v2.getProtein());
    }
}
