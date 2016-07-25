package OOP.Mission_2.AirlineCompany;

import java.util.ArrayList;
import java.util.Collections;

public class AirCompany{
        private double capacity;
        private double numberGruz;

        public double getCapacity() {
            return capacity;
        }
        public double getNumberGruz() {
            return numberGruz;
        }
        private ArrayList<AirPlane> airPlanes = new ArrayList<AirPlane>();
        //создаем авиакомпанию
        public AirCompany addAirPlane(AirPlane airPlane) {
            airPlanes.add(airPlane);
            capacity   += airPlane.getCapacity();
            numberGruz  += airPlane.getNumberGruz();
            return this;
        }

        public void sortAirPlane() {

            Collections.sort(airPlanes, new ComparatorAirLine());

            for (int i = 0; i < airPlanes.size(); i++) {
                System.out.println(airPlanes.get(i).toString());
            }
        }

        public void findAirPlane(int d1, int d2) {
            int flg = 0;
            for (int i = 0; i < airPlanes.size(); i++) {
                if ((airPlanes.get(i).getAmountFuel()>= d1) & (airPlanes.get(i).getAmountFuel() <= d2)) {
                    System.out.println(airPlanes.get(i).toString());
                    flg = 1;
                }

            }
            if (flg == 0) {
                System.out.println("Нет таких самолетов");
            }
        }
}
