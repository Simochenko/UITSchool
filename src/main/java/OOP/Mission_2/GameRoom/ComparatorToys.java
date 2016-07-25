package OOP.Mission_2.GameRoom;

import java.util.Comparator;

public class ComparatorToys implements Comparator<Toy> {
    @Override
    public int compare(Toy toys1, Toy toys2) {
        return Integer.compare(toys1.getAgeGroup(),toys1.getAgeGroup());

    }
}
