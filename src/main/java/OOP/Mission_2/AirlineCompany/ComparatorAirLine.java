package OOP.Mission_2.AirlineCompany;

import java.util.Comparator;

public class ComparatorAirLine implements Comparator<AirPlane> {
    @Override
    public int compare(AirPlane airPlane1, AirPlane airPlane2) {
        return Integer.compare(airPlane1.getRangeFlight(),airPlane2.getRangeFlight());
    }
}
