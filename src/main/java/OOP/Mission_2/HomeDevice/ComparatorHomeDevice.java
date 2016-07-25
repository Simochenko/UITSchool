package OOP.Mission_2.HomeDevice;

import java.util.Comparator;

public class ComparatorHomeDevice  implements Comparator<HomeDevice> {

    @Override
    public int compare(HomeDevice h1, HomeDevice h2) {
        return Double.compare(h1.getPower(), h2.getPower());
    }
}
