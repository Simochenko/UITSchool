package OOP.Mission_2.Motocyclist;

import java.util.Comparator;

public class ComparatorMotocyclist implements Comparator<Ammunition> {
    @Override
    public int compare(Ammunition a1, Ammunition a2) {
        return Double.compare(a1.getWeight(), a2.getWeight());
    }
}
