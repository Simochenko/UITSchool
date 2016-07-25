package OOP.Mission_2.NewYearGift;

import java.util.Comparator;

public class ComparatorNewYearGift implements Comparator<Candy> {

    @Override
    public int compare(Candy c1, Candy c2) {
        return Double.compare(c1.getPrice(), c2.getPrice());
    }
}
