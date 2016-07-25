package OOP.Mission_2.Insurance;

import java.util.ArrayList;
import java.util.Collections;

public class Contract {
    private double price;

    public double getPrice() {
        return price;
    }

    private ArrayList<Liability> liabilitys = new ArrayList<Liability>();


    public Contract addLiability(Liability liability) {
        liabilitys.add(liability);
        price += liability.getPrice();
        return this;
    }

    public void sortLiability() {

        Collections.sort(liabilitys, new ComparatorContract());

        for (int i = 0; i < liabilitys.size(); i++) {
            System.out.println(liabilitys.get(i).toString());
        }
    }


    public void findСommitment(int d1, int d2) {
        int flg = 0;
        for (int i = 0; i < liabilitys.size(); i++) {
            if ((liabilitys.get(i).getAmountСontribution() >= d1) & (liabilitys.get(i).getAmountСontribution() <= d2)) {
                System.out.println(liabilitys.get(i).toString());
                flg = 1;
            }

        }
        if (flg == 0) {
            System.out.println("Нет таких обязательств");
        }
    }
}
