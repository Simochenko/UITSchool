package OOP.Mission_2.Flora;


import java.util.Comparator;

public class ComparatorFlower implements Comparator<Flower> {
    @Override
    public int compare(Flower f1, Flower f2) {
        return Integer.compare(f1.getLevelFresh(), f2.getLevelFresh());
    }
}
