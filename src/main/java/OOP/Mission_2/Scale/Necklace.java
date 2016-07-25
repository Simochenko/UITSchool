package OOP.Mission_2.Scale;

import java.util.ArrayList;
import java.util.Collections;

public class Necklace {
    private double weight;
    private double price;

    public double getWeight() {
        return weight;
    }
    public double getPrice() {
        return price;
    }

    private ArrayList<Scale> scales = new ArrayList<Scale>();

    public Necklace addStone(Scale stone) {
        scales.add(stone);
        weight += stone.getWeight();
        price  += stone.getPrice();
        return this;
    }

    public void sortScale() {

        Collections.sort(scales, new ComparatorScale());

        for (int i = 0; i < scales.size(); i++) {
            System.out.println(scales.get(i).toString());
        }
    }

    public void findScale(int d1, int d2) {
        int flg = 0;
        for (int i = 0; i < scales.size(); i++) {
            if ((scales.get(i).getTransparency()>= d1) & (scales.get(i).getTransparency() <= d2)) {
                System.out.println(scales.get(i).toString());
                flg = 1;
            }

        }
        if (flg == 0) {
            System.out.println("Нет такого камня");
        }
    }
}
