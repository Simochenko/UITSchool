package OOP.Mission_2.HomeDevice;

import java.util.ArrayList;
import java.util.Collections;

public class ApartmentDevice {
    private double power;

    public double getPower() {
        return power;
    }

    private ArrayList<HomeDevice> homeDevices = new ArrayList<HomeDevice>();

    public ApartmentDevice addHomeDevice(HomeDevice homeDevice) {
        homeDevices.add(homeDevice);
        power += homeDevice.getPower();
        return this;
    }

    public void sortHomeDevice() {

        Collections.sort(homeDevices, new ComparatorHomeDevice());

        for (int i = 0; i < homeDevices.size(); i++) {
            System.out.println(homeDevices.get(i).toString());
        }
    }

    public void findHomeDevice(int d1, int d2) {
        int flg = 0;
        for (int i = 0; i < homeDevices.size(); i++) {
            if ((homeDevices.get(i).getVoltage() >= d1) & (homeDevices.get(i).getVoltage() <= d2)) {
                System.out.println(homeDevices.get(i).toString());
                flg = 1;
            }

        }
        if (flg == 0) {
            System.out.println("Нет такого прибора");
        }
    }
}
