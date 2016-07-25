package OOP.Mission_2.Transport;

import java.util.ArrayList;
import java.util.Collections;

public class PassengerTrain {
    private int numberSeats;
    private int numberBagage;

    public int getNumberSeats() {
        return numberSeats;
    }
    public int getNumberBagage() {
        return numberBagage;
    }
    private ArrayList<RailwayTransport> railwayTransports = new ArrayList<RailwayTransport>();

    public PassengerTrain addCarriage(RailwayTransport railwayTransport) {
        railwayTransports.add(railwayTransport);
        numberSeats   += railwayTransport.getNumberSeats();
        numberBagage  += railwayTransport.getNumberBagage();
        return this;
    }

    public void sortRailwayTransport() {

        Collections.sort(railwayTransports, new ComparatorTransport());

        for (int i = 0; i < railwayTransports.size(); i++) {
            System.out.println(railwayTransports.get(i).toString());
        }
    }

    public void findRailwayTransport(int d1, int d2) {
        int flg = 0;
        for (int i = 0; i < railwayTransports.size(); i++) {
            if ((railwayTransports.get(i).getNumberSeats()>= d1) & (railwayTransports.get(i).getNumberSeats() <= d2)) {
                System.out.println(railwayTransports.get(i).toString());
                flg = 1;
            }

        }
        if (flg == 0) {
            System.out.println("Нет таких вагонов");
        }
    }
}
