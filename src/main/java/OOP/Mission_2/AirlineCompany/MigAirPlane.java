package OOP.Mission_2.AirlineCompany;

public class MigAirPlane extends AirPlane {
    private final static String name = "Антонов";
    MigAirPlane(int capacity, double numberGruz, int rangeFlight, int amountFuel) {
        super(name,capacity, numberGruz, rangeFlight, amountFuel);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
